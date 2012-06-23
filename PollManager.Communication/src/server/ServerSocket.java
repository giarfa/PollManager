package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.RemoteException;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import communication.ServerSocketInterface;
import dto.CompilazioneDTO;
import dto.CompilazioneRispostaDTO;
import dto.ErroreDTO;
import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.RangeDTO;
import dto.RispostaDTO;
import dto.SondaggioDTO;
import dto.UtenteDTO;
import dto.ValoriMatriceDTO;
import enums.CommandCode;
import enums.ErrorKind;
import enums.OperationCode;
import enums.ParameterEOF;
import exception.InvalidCredentialException;

public class ServerSocket extends BaseServer implements ServerSocketInterface {

	private Socket clientSocket;
	private BufferedReader reader;
	private PrintWriter writer;
	private XStream converter;
	
	public ServerSocket(Socket clientSocket){
		this.converter=new XStream();
		this.clientSocket=clientSocket;
		try {
			this.reader = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
			this.writer = new PrintWriter(this.clientSocket.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(true){
				//Attendo 2 secondi
				Thread.sleep(2000);
				
				try{
					CommandCode command=CommandCode.valueOf(this.ReadFromSocket());
					this.WriteOnSocket(OperationCode.VALID_COMMAND.getValue());
					switch (command){
						case LOGIN:
							this.Login();
							break;
						case LOGOUT:
							this.Logout();
							break;
						case SONDAGGIO_GETBYKEY:
							this.SondaggioGetByKey();
							break;
						case SONDAGGIO_GETLIST:
							this.SondaggioGetList_internal();
							break;
						case SONDAGGIO_CREA:
							this.SondaggioCrea();
							break;
						case SONDAGGIO_MODIFICA:
							this.SondaggioModifica();
							break;
					}
				} catch (IllegalArgumentException e){
					this.WriteOnSocket(OperationCode.INVALID_COMMAND.getValue());
				}
			}
		} catch (InterruptedException e) {
			//Se ricevo un interrup gestisco la chiusura
			System.out.println("Interrupt ricevuto. Chiudo il processo");
		}
	}
	
	public void Login() {
		String user=this.getParameterFromSocket("");
		String password=this.getParameterFromSocket("");
		
		try {
			UtenteDTO utente=super.Login(user, password);
			this.sendReturnValueToSocket(this.converter.toXML(utente));
			
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		} catch (InvalidCredentialException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.INVALIDCREDENTIAL_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void Logout() {
		String xml=this.getParameterFromSocket(ParameterEOF.UTENTE_DTO.getValue());
		UtenteDTO utente=(UtenteDTO)this.converter.fromXML(xml);
		try {
			super.Logout(utente);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioGetByKey() {
		try {
			int idSondaggio=Integer.parseInt(this.getParameterFromSocket(""));
			SondaggioDTO sondaggio=super.SondaggioGetByKey(idSondaggio);
			this.sendReturnValueToSocket(this.converter.toXML(sondaggio));
			
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioGetList_internal() {
		try {
			List<SondaggioDTO> sondaggi= super.SondaggioGetList();
			this.sendReturnValueToSocket(this.converter.toXML(sondaggi));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioCrea() {
		
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.SONDAGGIO_DTO.getValue());
			SondaggioDTO dto=(SondaggioDTO)this.converter.fromXML(xml);
			SondaggioDTO returnDto=super.SondaggioCrea(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioModifica() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.SONDAGGIO_DTO.getValue());
			SondaggioDTO dto=(SondaggioDTO)this.converter.fromXML(xml);
			SondaggioDTO returnDto=super.SondaggioModifica(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiDomandaMultipla() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.MULTIPLA_DTO.getValue());
			MultiplaDTO dto=(MultiplaDTO)this.converter.fromXML(xml);
			super.SondaggioAggiungiDomandaMultipla(dto);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiDomandaLibera() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.LIBERA_DTO.getValue());
			LiberaDTO dto=(LiberaDTO)this.converter.fromXML(xml);
			super.SondaggioAggiungiDomandaLibera(dto);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiDomandaRange() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.RANGE_DTO.getValue());
			RangeDTO dto=(RangeDTO)this.converter.fromXML(xml);
			super.SondaggioAggiungiDomandaRange(dto);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiDomandaMatrice() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.MATRICE_DTO.getValue());
			MatriceDTO dto=(MatriceDTO)this.converter.fromXML(xml);
			super.SondaggioAggiungiDomandaMatrice(dto);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiCompilazione() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.COMPILAZIONE_DTO.getValue());
			CompilazioneDTO dto=(CompilazioneDTO)this.converter.fromXML(xml);
			CompilazioneDTO returnDto= super.SondaggioAggiungiCompilazione(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioSetEnable() {
		try {
			int idSondaggio=Integer.parseInt(this.getParameterFromSocket(""));
			super.SondaggioSetEnable(idSondaggio);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioSetDisable() {
		try {
			int idSondaggio=Integer.parseInt(this.getParameterFromSocket(""));
			super.SondaggioSetDisable(idSondaggio);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	public void DomandaModifica() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.COMPILAZIONE_DTO.getValue());
			MultiplaDTO dto=(MultiplaDTO)this.converter.fromXML(xml);
			super.DomandaModifica(dto);
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	@Override
	public void DomandaModifica(LiberaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaModifica(dto);
	}

	@Override
	public void DomandaModifica(RangeDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaModifica(dto);
	}

	@Override
	public void DomandaModifica(MatriceDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaModifica(dto);
	}

	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaModifica(dto);
	}

	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaAggiungiValoriMatrice(dto);
	}

	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaAggiungiRisposta(dto);
	}

	@Override
	public void DomandaSetEnable(int idDomanda) throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaSetEnable(idDomanda);
	}

	@Override
	public void DomandaSetDisable(int idDomanda) throws RemoteException {
		// TODO Auto-generated method stub
		super.DomandaSetDisable(idDomanda);
	}

	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return super.RispostaModifica(dto);
	}

	@Override
	public void RispostaSetEnable(int idRisposta) throws RemoteException {
		// TODO Auto-generated method stub
		super.RispostaSetEnable(idRisposta);
	}

	@Override
	public void RispostaSetDisable(int idRisposta) throws RemoteException {
		// TODO Auto-generated method stub
		super.RispostaSetDisable(idRisposta);
	}

	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub
		return super.CompilazioneModifica(dto);
	}

	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(
			CompilazioneRispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		super.CompilazioneAggiungiCompilazioneRisposta(dto);
	}

	@Override
	public void CompilazioneSetEnable(int idCompilazione)
			throws RemoteException {
		// TODO Auto-generated method stub
		super.CompilazioneSetEnable(idCompilazione);
	}

	@Override
	public void CompilazioneSetDisable(int idCompilazione)
			throws RemoteException {
		// TODO Auto-generated method stub
		super.CompilazioneSetDisable(idCompilazione);
	}

	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(
			CompilazioneRispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return super.CompilazioneRispostaModifica(dto);
	}

	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta)
			throws RemoteException {
		// TODO Auto-generated method stub
		super.CompilazioneRispostaElimina(idCompilazioneRisposta);
	}

	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException {
		// TODO Auto-generated method stub
		return super.UtenteGetByKey(idUtente);
	}

	@Override
	public List<UtenteDTO> UtenteGetList() throws RemoteException {
		// TODO Auto-generated method stub
		return super.UtenteGetList();
	}

	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return super.UtenteCrea(dto);
	}

	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return super.UtenteModifica(dto);
	}

	@Override
	public void UtenteSetEnable(int idUtente) throws RemoteException {
		// TODO Auto-generated method stub
		super.UtenteSetEnable(idUtente);
	}

	@Override
	public void UtenteSetDisable(int idUtente) throws RemoteException {
		// TODO Auto-generated method stub
		super.UtenteSetDisable(idUtente);
	}
	
	private String getParameterFromSocket(String paramCheckValue){
		String xml=this.ReadFromSocket();
		while (!xml.contains(paramCheckValue)){
			this.WriteOnSocket(OperationCode.INVALID_PARAMETER.getValue());
			xml=this.ReadFromSocket();
		}
		this.WriteOnSocket(OperationCode.VALID_PARAMETER.getValue());
		return xml;
	}
	
	private void sendReturnValueToSocket(String returnValue){
		this.WriteOnSocket(returnValue);
		String clientResponse=this.ReadFromSocket();
		
		while(!clientResponse.equalsIgnoreCase(OperationCode.VALID_RETURN_VALUE.getValue())){
			this.WriteOnSocket(returnValue);
			clientResponse=this.ReadFromSocket();
		}
	}
	
	private void sendErrorToSocket(ErroreDTO error){
		String errorMessage=this.converter.toXML(error);
		this.WriteOnSocket(errorMessage);
		String clientResponse=this.ReadFromSocket();
		
		while(!clientResponse.equalsIgnoreCase(OperationCode.VALID_RETURN_VALUE.getValue())){
			this.WriteOnSocket(errorMessage);
			clientResponse=this.ReadFromSocket();
		}
	}

	private String ReadFromSocket(){
		try {
			while(!reader.ready()){
				Thread.sleep(500);
			}
			return reader.readLine();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private void WriteOnSocket(String message){
		this.writer.write(message);
		this.writer.flush();
	}
}
