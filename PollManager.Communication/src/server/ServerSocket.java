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
						case SONDAGGIO_AGGIUNGIDOMANDA_MULTIPLA:
							this.SondaggioAggiungiDomandaMultipla();
							break;
						case SONDAGGIO_AGGIUNGIDOMANDA_LIBERA:
							this.SondaggioAggiungiDomandaLibera();
							break;
						case SONDAGGIO_AGGIUNGIDOMANDA_RANGE:
							this.SondaggioAggiungiDomandaRange();
							break;
						case SONDAGGIO_AGGIUNGIDOMANDA_MATRICE:
							this.SondaggioAggiungiDomandaMatrice();
							break;
						case SONDAGGIO_AGGIUNGICOMPILAZIONE:
							this.SondaggioAggiungiCompilazione();
							break;
						case SONDAGGIO_SETENABLE:
							this.SondaggioSetEnable();
							break;
						case SONDAGGIO_SETDISABLE:
							this.SondaggioSetDisable();
							break;
						case DOMANDA_MODIFICA_MULTIPLA:
							this.DomandaModifica_multipla();
							break;
						case DOMANDA_MODIFICA_LIBERA:
							this.DomandaModifica_libera();
							break;
						case DOMANDA_MODIFICA_RANGE:
							this.DomandaModifica_range();
							break;
						case DOMANDA_MODIFICA_MATRICE:
							this.DomandaModifica_matrice();
							break;
						case DOMANDA_MODIFICA_VALORIMATRICE:
							this.DomandaModifica_valoriMatrice();
							break;
						case DOMANDA_AGGIUNGI_VALORIMATRICE:
							this.DomandaAggiungiValoriMatrice();
							break;
						case DOMANDA_AGGIUNGI_RISPOSTA:
							this.DomandaAggiungiRisposta();
							break;
						case DOMANDA_SETENABLE:
							this.DomandaSetEnable();
							break;
						case DOMANDA_SETDISABLE:
							this.DomandaSetDisable();
							break;
						case RISPOSTA_MODIFICA:
							this.RispostaModifica();
							break;
						case RISPOSTA_SETENABLE:
							this.RispostaSetEnable();
							break;
						case RISPOSTA_SETDISABLE:
							this.RispostaSetDisable();
							break;
						case COMPILAZIONE_MODIFICA:
							this.CompilazioneModifica();
							break;
						case COMPILAZIONE_AGGIUNGI_COMPILAZIONERISPOSTA:
							this.CompilazioneAggiungiCompilazioneRisposta();
							break;
						case COMPILAZIONE_SETENABLE:
							this.CompilazioneSetEnable();
							break;
						case COMPILAZIONE_SETDISABLE:
							this.CompilazioneSetDisable();
							break;
						case COMPILAZIONERISPOSTA_MODIFICA:
							this.CompilazioneRispostaModifica();
							break;
						case COMPILAZIONERISPOSTA_ELIMINA:
							this.CompilazioneRispostaElimina();
							break;
						case UTENTE_GETBYKEY:
							this.UtenteGetByKey();
							break;
						case UTENTE_GETLIST:
							this.UtenteGetList_internal();
							break;
						case UTENTE_CREA:
							this.UtenteCrea();
							break;
						case UTENTE_MODIFICA:
							this.UtenteModifica();
							break;
						case UTENTE_SETENABLE:
							this.UtenteSetEnable();
							break;
						case UTENTE_SETDISABLE:
							this.UtenteSetDisable();
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
		try {
			String user=this.getParameterFromSocket("");
			String password=this.getParameterFromSocket("");
			UtenteDTO utente=super.Login(user, password);
			this.sendReturnValueToSocket(this.converter.toXML(utente));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		} catch (InvalidCredentialException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.INVALIDCREDENTIAL_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void Logout() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.UTENTE_DTO.getValue());
			UtenteDTO utente=(UtenteDTO)this.converter.fromXML(xml);
			super.Logout(utente);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
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
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiDomandaLibera() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.LIBERA_DTO.getValue());
			LiberaDTO dto=(LiberaDTO)this.converter.fromXML(xml);
			super.SondaggioAggiungiDomandaLibera(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiDomandaRange() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.RANGE_DTO.getValue());
			RangeDTO dto=(RangeDTO)this.converter.fromXML(xml);
			super.SondaggioAggiungiDomandaRange(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioAggiungiDomandaMatrice() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.MATRICE_DTO.getValue());
			MatriceDTO dto=(MatriceDTO)this.converter.fromXML(xml);
			super.SondaggioAggiungiDomandaMatrice(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
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
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void SondaggioSetDisable() {
		try {
			int idSondaggio=Integer.parseInt(this.getParameterFromSocket(""));
			super.SondaggioSetDisable(idSondaggio);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaModifica_multipla() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.MULTIPLA_DTO.getValue());
			MultiplaDTO dto=(MultiplaDTO)this.converter.fromXML(xml);
			super.DomandaModifica(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaModifica_libera() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.LIBERA_DTO.getValue());
			LiberaDTO dto=(LiberaDTO)this.converter.fromXML(xml);
			super.DomandaModifica(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaModifica_range() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.RANGE_DTO.getValue());
			RangeDTO dto=(RangeDTO)this.converter.fromXML(xml);
			super.DomandaModifica(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaModifica_matrice() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.MATRICE_DTO.getValue());
			MatriceDTO dto=(MatriceDTO)this.converter.fromXML(xml);
			super.DomandaModifica(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaModifica_valoriMatrice() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.VALORIMATRICE_DTO.getValue());
			ValoriMatriceDTO dto=(ValoriMatriceDTO)this.converter.fromXML(xml);
			super.DomandaModifica(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaAggiungiValoriMatrice() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.VALORIMATRICE_DTO.getValue());
			ValoriMatriceDTO dto=(ValoriMatriceDTO)this.converter.fromXML(xml);
			super.DomandaAggiungiValoriMatrice(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaAggiungiRisposta() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.RISPOSTA_DTO.getValue());
			RispostaDTO dto=(RispostaDTO)this.converter.fromXML(xml);
			super.DomandaAggiungiRisposta(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaSetEnable() {
		try {
			int idDomanda=Integer.parseInt(this.getParameterFromSocket(""));
			super.DomandaSetEnable(idDomanda);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void DomandaSetDisable() {
		try {
			int idDomanda=Integer.parseInt(this.getParameterFromSocket(""));
			super.DomandaSetDisable(idDomanda);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void RispostaModifica() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.RISPOSTA_DTO.getValue());
			RispostaDTO dto=(RispostaDTO)this.converter.fromXML(xml);
			RispostaDTO returnDto=super.RispostaModifica(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void RispostaSetEnable() {
		try {
			int idRisposta=Integer.parseInt(this.getParameterFromSocket(""));
			super.RispostaSetEnable(idRisposta);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void RispostaSetDisable() {
		try {
			int idRisposta=Integer.parseInt(this.getParameterFromSocket(""));
			super.RispostaSetDisable(idRisposta);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void CompilazioneModifica() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.COMPILAZIONE_DTO.getValue());
			CompilazioneDTO dto=(CompilazioneDTO)this.converter.fromXML(xml);
			CompilazioneDTO returnDto=super.CompilazioneModifica(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void CompilazioneAggiungiCompilazioneRisposta() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.COMPILAZIONERISPOSTA_DTO.getValue());
			CompilazioneRispostaDTO dto=(CompilazioneRispostaDTO)this.converter.fromXML(xml);
			super.CompilazioneAggiungiCompilazioneRisposta(dto);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
		
	}

	private void CompilazioneSetEnable() {
		try {
			int idCompilazione=Integer.parseInt(this.getParameterFromSocket(""));
			super.CompilazioneSetEnable(idCompilazione);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void CompilazioneSetDisable() {
		try {
			int idCompilazione=Integer.parseInt(this.getParameterFromSocket(""));
			super.CompilazioneSetDisable(idCompilazione);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void CompilazioneRispostaModifica() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.COMPILAZIONERISPOSTA_DTO.getValue());
			CompilazioneRispostaDTO dto=(CompilazioneRispostaDTO)this.converter.fromXML(xml);
			CompilazioneRispostaDTO returnDto=super.CompilazioneRispostaModifica(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void CompilazioneRispostaElimina() {
		try {
			int idCompilazioneRisposta=Integer.parseInt(this.getParameterFromSocket(""));
			super.CompilazioneRispostaElimina(idCompilazioneRisposta);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void UtenteGetByKey() {
		try {
			int idUtente=Integer.parseInt(this.getParameterFromSocket(""));
			UtenteDTO returnDto=super.UtenteGetByKey(idUtente);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void UtenteGetList_internal() {
		try {
			List<UtenteDTO> utenti=super.UtenteGetList();
			this.sendReturnValueToSocket(this.converter.toXML(utenti));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void UtenteCrea() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.UTENTE_DTO.getValue());
			UtenteDTO dto=(UtenteDTO)this.converter.fromXML(xml);
			UtenteDTO returnDto=super.UtenteCrea(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void UtenteModifica() {
		try {
			String xml=this.getParameterFromSocket(ParameterEOF.UTENTE_DTO.getValue());
			UtenteDTO dto=(UtenteDTO)this.converter.fromXML(xml);
			UtenteDTO returnDto=super.UtenteModifica(dto);
			this.sendReturnValueToSocket(this.converter.toXML(returnDto));
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void UtenteSetEnable() {
		try {
			int idUtente=Integer.parseInt(this.getParameterFromSocket(""));
			super.UtenteSetEnable(idUtente);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
	}

	private void UtenteSetDisable() {
		try {
			int idUtente=Integer.parseInt(this.getParameterFromSocket(""));
			super.UtenteSetDisable(idUtente);
			this.sendReturnValueToSocket(OperationCode.VOID_RETURN_MESSAGE.getValue());
		} catch (RemoteException e) {
			this.sendErrorToSocket(new ErroreDTO(ErrorKind.REMOTE_EXCEPTION.getValue(), e.getMessage()));
		}
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
		String xml=returnValue.replace("\n", "");
		this.WriteOnSocket(xml);
		String clientResponse=this.ReadFromSocket();
		
		while(!clientResponse.contains(OperationCode.VALID_RETURN_VALUE.getValue())){
			this.WriteOnSocket(xml);
			clientResponse=this.ReadFromSocket();
		}
	}
	
	private void sendErrorToSocket(ErroreDTO error){
		String xml=this.converter.toXML(error).replace("\n", "");
		this.WriteOnSocket(xml);
		String clientResponse=this.ReadFromSocket();
		
		while(!clientResponse.contains(OperationCode.VALID_ERROR_MESSAGE.getValue())){
			this.WriteOnSocket(xml);
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
