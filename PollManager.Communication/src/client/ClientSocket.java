package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.util.List;

import com.thoughtworks.xstream.XStream;

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

public class ClientSocket implements ClientSocketInterface {

	private String host;
	private int port = 4445;
	private Socket socket;
	private PrintWriter writer;
    private BufferedReader reader;
    private XStream converter;
	
	public ClientSocket(String host){
		this.host=host;
		this.converter=new XStream();
	}
	
	@Override
	public void OpenChannel(String clientName) {
		try {
			socket = new Socket(host , port);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        writer = new PrintWriter(socket.getOutputStream(), true);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void CloseChannel(String clientName) {
		// TODO Auto-generated method stub

	}

	@Override
	public UtenteDTO Login(String user, String password) throws RemoteException, InvalidCredentialException {
		this.sendCommandToSocket(CommandCode.LOGIN.getValue());
		this.sendParameterToSocket(user);
		this.sendParameterToSocket(password);
		String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.UTENTE_DTO.getValue());
		return (UtenteDTO)this.converter.fromXML(xml);
	}

	@Override
	public void Logout(UtenteDTO utente) throws RemoteException {
		this.sendCommandToSocket(CommandCode.LOGOUT.getValue());
		this.sendParameterToSocket(this.converter.toXML(utente));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_GETBYKEY.getValue());
		this.sendParameterToSocket(Integer.toString(idSondaggio));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.SONDAGGIO_DTO.getValue());
			return (SondaggioDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_GETLIST.getValue());
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.LIST_DTO.getValue());
			return (List<SondaggioDTO>)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_CREA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.SONDAGGIO_DTO.getValue());
			return (SondaggioDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_MODIFICA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.SONDAGGIO_DTO.getValue());
			return (SondaggioDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_AGGIUNGIDOMANDA_MULTIPLA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void SondaggioAggiungiDomandaLibera(LiberaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_AGGIUNGIDOMANDA_LIBERA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void SondaggioAggiungiDomandaRange(RangeDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_AGGIUNGIDOMANDA_RANGE.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void SondaggioAggiungiDomandaMatrice(MatriceDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_AGGIUNGIDOMANDA_MATRICE.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_AGGIUNGICOMPILAZIONE.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.COMPILAZIONE_DTO.getValue());
			return (CompilazioneDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_SETENABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idSondaggio));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException {
		this.sendCommandToSocket(CommandCode.SONDAGGIO_SETDISABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idSondaggio));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_MODIFICA_MULTIPLA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaModifica(LiberaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_MODIFICA_LIBERA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaModifica(RangeDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_MODIFICA_RANGE.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaModifica(MatriceDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_MODIFICA_MATRICE.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_MODIFICA_VALORIMATRICE.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_AGGIUNGI_VALORIMATRICE.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_AGGIUNGI_RISPOSTA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaSetEnable(int idDomanda) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_SETENABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idDomanda));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void DomandaSetDisable(int idDomanda) throws RemoteException {
		this.sendCommandToSocket(CommandCode.DOMANDA_SETDISABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idDomanda));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.RISPOSTA_MODIFICA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.RISPOSTA_DTO.getValue());
			return (RispostaDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void RispostaSetEnable(int idRisposta) throws RemoteException {
		this.sendCommandToSocket(CommandCode.RISPOSTA_SETENABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idRisposta));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void RispostaSetDisable(int idRisposta) throws RemoteException {
		this.sendCommandToSocket(CommandCode.RISPOSTA_SETDISABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idRisposta));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.COMPILAZIONE_MODIFICA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.COMPILAZIONE_DTO.getValue());
			return (CompilazioneDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.COMPILAZIONE_AGGIUNGI_COMPILAZIONERISPOSTA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void CompilazioneSetEnable(int idCompilazione) throws RemoteException {
		this.sendCommandToSocket(CommandCode.COMPILAZIONE_SETENABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idCompilazione));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void CompilazioneSetDisable(int idCompilazione) throws RemoteException {
		this.sendCommandToSocket(CommandCode.COMPILAZIONE_SETDISABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idCompilazione));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.COMPILAZIONERISPOSTA_MODIFICA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.COMPILAZIONERISPOSTA_DTO.getValue());
			return (CompilazioneRispostaDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) throws RemoteException {
		this.sendCommandToSocket(CommandCode.COMPILAZIONERISPOSTA_ELIMINA.getValue());
		this.sendParameterToSocket(Integer.toString(idCompilazioneRisposta));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException {
		this.sendCommandToSocket(CommandCode.UTENTE_GETBYKEY.getValue());
		this.sendParameterToSocket(Integer.toString(idUtente));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.UTENTE_DTO.getValue());
			return (UtenteDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UtenteDTO> UtenteGetList() throws RemoteException {
		this.sendCommandToSocket(CommandCode.UTENTE_GETLIST.getValue());
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.LIST_DTO.getValue());
			return (List<UtenteDTO>)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.UTENTE_CREA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.UTENTE_DTO.getValue());
			return (UtenteDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException {
		this.sendCommandToSocket(CommandCode.UTENTE_MODIFICA.getValue());
		this.sendParameterToSocket(this.converter.toXML(dto));
		try {
			String xml=this.getReturnValueOrErrorFromSocket(ParameterEOF.UTENTE_DTO.getValue());
			return (UtenteDTO)this.converter.fromXML(xml);
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void UtenteSetEnable(int idUtente) throws RemoteException {
		this.sendCommandToSocket(CommandCode.UTENTE_SETENABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idUtente));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}

	@Override
	public void UtenteSetDisable(int idUtente) throws RemoteException {
		this.sendCommandToSocket(CommandCode.UTENTE_SETDISABLE.getValue());
		this.sendParameterToSocket(Integer.toString(idUtente));
		try {
			this.getReturnValueOrErrorFromSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (InvalidCredentialException e) { throw new RemoteException(e.getMessage()); }
	}
	
	private void sendCommandToSocket(String command){
		String xml=command.replace("\n", "");
		this.WriteOnSocket(xml);
		String clientResponse=this.ReadFromSocket();
		
		while(!clientResponse.contains(OperationCode.VALID_COMMAND.getValue())){
			this.WriteOnSocket(xml);
			clientResponse=this.ReadFromSocket();
		}
	}
	
	private void sendParameterToSocket(String parameter){
		String xml=parameter.replace("\n", "");
		this.WriteOnSocket(xml);
		String clientResponse=this.ReadFromSocket();
		
		while(!clientResponse.contains(OperationCode.VALID_PARAMETER.getValue())){
			this.WriteOnSocket(xml);
			clientResponse=this.ReadFromSocket();
		}
	}
	
	private String getReturnValueOrErrorFromSocket(String returnValueCheckCode) throws RemoteException, InvalidCredentialException{
		String xml=this.ReadFromSocket();
		while (!xml.contains(returnValueCheckCode) || !xml.contains(ParameterEOF.ERRORE_DTO.getValue())){
			this.WriteOnSocket(OperationCode.INVALID_RETURN_VALUE.getValue() + OperationCode.INVALID_ERROR_MESSAGE.getValue());
			xml=this.ReadFromSocket();
		}
		this.WriteOnSocket(OperationCode.VALID_RETURN_VALUE.getValue() + OperationCode.VALID_ERROR_MESSAGE.getValue());
		
		if (xml.contains(ParameterEOF.ERRORE_DTO.getValue())){
			ErroreDTO e=(ErroreDTO)this.converter.fromXML(xml);
			ErrorKind kind=ErrorKind.valueOf(e.getKind());
			switch (kind){
				case REMOTE_EXCEPTION:
					throw new RemoteException(e.getMessage());
				case INVALIDCREDENTIAL_EXCEPTION:
					throw new InvalidCredentialException(e.getMessage());
			}
		}
		
		return xml;
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
