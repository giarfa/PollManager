package client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import communication.*;
import dto.*;
import exception.*;
/**
*
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
	 * Chiusura canale di comunicazione
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
	 * 
	 */
	@Override
	public UtenteDTO Login(String user, String password) throws RemoteException, InvalidCredentialException {
		return this.server.Login(user, password);
	}
	/**
	 * 
	 */
	@Override
	public void Logout(UtenteDTO utente) throws RemoteException {
		this.server.Logout(utente);
	}
	/**
	 * 
	 */
	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException {
		return this.server.SondaggioGetByKey(idSondaggio);
	}
	/**
	 * 
	 */
	@Override
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException {
		return this.server.SondaggioGetList();
	}
	/**
	 * 
	 */
	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException {
		return this.server.SondaggioCrea(dto);
	}
	/**
	 * 
	 */
	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) throws RemoteException {
		return this.server.SondaggioModifica(dto);
	}
	/**
	 * 
	 */
	@Override
	public void SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) throws RemoteException {
		this.server.SondaggioAggiungiDomandaMultipla(dto);
	}
	/**
	 * 
	 */
	@Override
	public void SondaggioAggiungiDomandaLibera(LiberaDTO dto) throws RemoteException {
		this.server.SondaggioAggiungiDomandaLibera(dto);
	}
	/**
	 * 
	 */
	@Override
	public void SondaggioAggiungiDomandaRange(RangeDTO dto) throws RemoteException {
		this.server.SondaggioAggiungiDomandaRange(dto);
	}
	/**
	 * 
	 */
	@Override
	public void SondaggioAggiungiDomandaMatrice(MatriceDTO dto) throws RemoteException {
		this.server.SondaggioAggiungiDomandaMatrice(dto);
	}
	/**
	 * 
	 */
	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) throws RemoteException {
		return this.server.SondaggioAggiungiCompilazione(dto);
	}
	/**
	 * 
	 */
	@Override
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException {
		this.server.SondaggioSetEnable(idSondaggio);
	}
	/**
	 * 
	 */
	@Override
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException {
		this.server.SondaggioSetDisable(idSondaggio);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaModifica(LiberaDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaModifica(RangeDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaModifica(MatriceDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException {
		this.server.DomandaModifica(dto);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) throws RemoteException {
		this.server.DomandaAggiungiValoriMatrice(dto);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException {
		this.server.DomandaAggiungiRisposta(dto);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaSetEnable(int idDomanda) throws RemoteException {
		this.server.DomandaSetEnable(idDomanda);
	}
	/**
	 * 
	 */
	@Override
	public void DomandaSetDisable(int idDomanda) throws RemoteException {
		this.server.DomandaSetDisable(idDomanda);
	}
	/**
	 * 
	 */
	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException {
		return this.server.RispostaModifica(dto);
	}

	/**
	 * 
	 */
	@Override
	public void RispostaSetEnable(int idRisposta) throws RemoteException {
		this.server.RispostaSetEnable(idRisposta);
	}

	/**
	 * 
	 */
	@Override
	public void RispostaSetDisable(int idRisposta) throws RemoteException {
		this.server.RispostaSetDisable(idRisposta);
	}
/**
 * 
 */
	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) throws RemoteException {
		return this.server.CompilazioneModifica(dto);
	}
	
	/**
	 * 
	 */
	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) throws RemoteException {
		this.server.CompilazioneAggiungiCompilazioneRisposta(dto);
	}

	/**
	 * 
	 */
	@Override
	public void CompilazioneSetEnable(int idCompilazione) throws RemoteException {
		this.server.CompilazioneSetEnable(idCompilazione);
	}
	/**
	 * 
	 */
	@Override
	public void CompilazioneSetDisable(int idCompilazione) throws RemoteException {
		this.server.CompilazioneSetDisable(idCompilazione);
	}
	
	/**
	 * 
	 */
	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) throws RemoteException {
		return this.server.CompilazioneRispostaModifica(dto);
	}
	/**
	 * 
	 * 
	 */
	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) throws RemoteException {
		this.server.CompilazioneRispostaElimina(idCompilazioneRisposta);
	}
	
	/**
	 * 
	 */
	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException {
		return this.server.UtenteGetByKey(idUtente);
	}
	
	/**
	 * 
	 */
	@Override
	public List<UtenteDTO> UtenteGetList() throws RemoteException {
		return this.server.UtenteGetList();
	}
	/**
	 * 
	 */
	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException {
		return this.server.UtenteCrea(dto);
	}
	
	/**
	 * 
	 */
	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException {
		return this.server.UtenteModifica(dto);
	}
	/**
	 * 
	 */
	@Override
	public void UtenteSetEnable(int idUtente) throws RemoteException {
		this.server.UtenteSetEnable(idUtente);
	}
	/**
	 * 
	 */
	@Override
	public void UtenteSetDisable(int idUtente) throws RemoteException {
		this.server.UtenteSetDisable(idUtente);
	}
}
