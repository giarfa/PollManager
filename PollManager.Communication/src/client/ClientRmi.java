package client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import communication.*;
import dto.*;
import exception.*;
/**
*Implementazione RMI-Client
* @author 727826-729399
*/
public class ClientRmi implements ClientRmiInterface {
	
	private String host;
	private String url;
	private ServerRmiInterface server;
	private ServerAcceptRmiInterface communicationServer;
	
	public ClientRmi(String host){
		this.host=host;
		this.url = "rmi://" + this.host + "/PollManager";
		try {
			if (System.getSecurityManager() == null)
				System.setSecurityManager(new SecurityManager());
			Registry registry = LocateRegistry.getRegistry(host);
			// Recupero l'istanza della classe remota
			this.communicationServer = (ServerAcceptRmiInterface) registry.lookup(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Apertura canale comunicazione
	 */
	@Override
	public void OpenChannel(String clientName) {
		try {
			this.server=(ServerRmiInterface) this.communicationServer.OpenChannel(clientName);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Chiusura canale comunicazione
	 */
	@Override
	public void CloseChannel(String clientName) {
		try {
			this.communicationServer.CloseChannel(clientName);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Login Utente
	 */
	@Override
	public UtenteDTO Login(String user, String password) throws RemoteException, InvalidCredentialException {
		return this.server.Login(user, password);
	}
	/**
	 * Logout Utente
	 */
	@Override
	public void Logout(UtenteDTO utente) throws RemoteException {
		this.server.Logout(utente);
	}
	
	/**
	 * Get Sondaggio dall'id
	 */
	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException {
		return this.server.SondaggioGetByKey(idSondaggio);
	}
	/**
	 * Lista Sondaggi
	 */
	@Override
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException {
		return this.server.SondaggioGetList();
	}
	/**
	 * Crea Sondaggio
	 */
	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException {
		return this.server.SondaggioCrea(dto);
	}
	/**
	 * Modifica sondaggio
	 */
	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) throws RemoteException {
		return this.server.SondaggioModifica(dto);
	}
	/**
	 * Aggiungi domanda Multipla al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) throws RemoteException {
		return this.server.SondaggioAggiungiDomandaMultipla(dto);
	}
	
	/**
	 * Aggiungi domanda Libera al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaLibera(LiberaDTO dto) throws RemoteException {
		return this.server.SondaggioAggiungiDomandaLibera(dto);
	}
	/**
	 * Aggiungi domanda Range al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaRange(RangeDTO dto) throws RemoteException {
		return this.server.SondaggioAggiungiDomandaRange(dto);
	}
	
	/**
	 * Aggiungi domanda Matrice al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaMatrice(MatriceDTO dto) throws RemoteException {
		return this.server.SondaggioAggiungiDomandaMatrice(dto);
	}
	/**
	 * Aggiungi Compilazione al Sondaggio
	 */
	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) throws RemoteException {
		return this.server.SondaggioAggiungiCompilazione(dto);
	}
	
	/**
	 *  Attiva Sondaggio
	 */
	@Override
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException {
		this.server.SondaggioSetEnable(idSondaggio);
	}
	/**
	 * Disattiva Sondaggio
	 */
	@Override
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException {
		this.server.SondaggioSetDisable(idSondaggio);
	}
	/**
	 * Modifica Domanda Multipla
	 */
	@Override
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * Modifica Domanda Libera
	 */
	@Override
	public void DomandaModifica(LiberaDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * Modifica Domanda Range
	 */
	@Override
	public void DomandaModifica(RangeDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * Modifica Domanda Matrice
	 */
	@Override
	public void DomandaModifica(MatriceDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * Modifica ValoriMatrice 
	 */
	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * Aggiungi ValoriMatrice a Domanda
	 */
	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) throws RemoteException {
		this.server.DomandaAggiungiValoriMatrice(dto);
	}
	/**
	 * Aggiungi Risposta a Domanda
	 */
	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException {
		this.server.DomandaAggiungiRisposta(dto);
	}
	/**
	 * Attiva Domanda
	 */
	@Override
	public void DomandaSetEnable(int idDomanda) throws RemoteException {
		this.server.DomandaSetEnable(idDomanda);
	}
	/**
	 * Disattiva Domanda
	 */
	@Override
	public void DomandaSetDisable(int idDomanda) throws RemoteException {
		this.server.DomandaSetDisable(idDomanda);
	}
	/**
	 * Modifica Risposta
	 */
	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException {
		return this.server.RispostaModifica(dto);
	}

	/**
	 * Attiva Risposta
	 */
	@Override
	public void RispostaSetEnable(int idRisposta) throws RemoteException {
		this.server.RispostaSetEnable(idRisposta);
	}

	/**
	 * Disattiva Risposta
	 */
	@Override
	public void RispostaSetDisable(int idRisposta) throws RemoteException {
		this.server.RispostaSetDisable(idRisposta);
	}
/**
 * Modifica Compilazione
 */
	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) throws RemoteException {
		return this.server.CompilazioneModifica(dto);
	}
	
	/**
	 * Agguingi CompilazioneRisposta a Compilazione
	 */
	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) throws RemoteException {
		this.server.CompilazioneAggiungiCompilazioneRisposta(dto);
	}

	/**
	 * Attiva Compilazione
	 */
	@Override
	public void CompilazioneSetEnable(int idCompilazione) throws RemoteException {
		this.server.CompilazioneSetEnable(idCompilazione);
	}
	/**
	 * Disattiva Compilazione
	 */
	@Override
	public void CompilazioneSetDisable(int idCompilazione) throws RemoteException {
		this.server.CompilazioneSetDisable(idCompilazione);
	}
	
	/**
	 * Modifica CompilazioneRisposta
	 */
	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) throws RemoteException {
		return this.server.CompilazioneRispostaModifica(dto);
	}
	/**
	 * Elimina CompilazioneRisposta
	 * 
	 */
	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) throws RemoteException {
		this.server.CompilazioneRispostaElimina(idCompilazioneRisposta);
	}
	
	/**
	 * Get Utente dall'idUtente
	 */
	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException {
		return this.server.UtenteGetByKey(idUtente);
	}
	
	/**
	 * Lista Utenti
	 */
	@Override
	public List<UtenteDTO> UtenteGetList() throws RemoteException {
		return this.server.UtenteGetList();
	}
	/**
	 * Crea Utente
	 */
	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException {
		return this.server.UtenteCrea(dto);
	}
	
	/**
	 * Modifica Utente
	 */
	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException {
		return this.server.UtenteModifica(dto);
	}
	/**
	 * Attiva Utente
	 */
	@Override
	public void UtenteSetEnable(int idUtente) throws RemoteException {
		this.server.UtenteSetEnable(idUtente);
	}
	/**
	 * Disattiva Utente
	 */
	@Override
	public void UtenteSetDisable(int idUtente) throws RemoteException {
		this.server.UtenteSetDisable(idUtente);
	}
}
