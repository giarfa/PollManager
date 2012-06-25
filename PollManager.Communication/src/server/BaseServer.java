package server;

import java.rmi.RemoteException;
import java.util.List;
import resolver.Resolver;
import domainManager.*;
import dto.*;
import exception.*;

/**
 * Implementazione RMI-Server
 * @author 727826-729399
 *
 */
public abstract class BaseServer implements ServerInterface {
	/**
	 * Login Utente
	 */
	@Override
	public UtenteDTO Login(String user, String password) throws RemoteException, InvalidCredentialException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.Login(user, password);
	}

	/**
	 * Logout Utente
	 */
	@Override
	public void Logout(UtenteDTO utente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.Logout(utente);
	}

	/**
	 * Get Sondaggio dall'id
	 */
	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.GetByKey(idSondaggio);
	}

	/**
	 * Lista Sondaggi
	 */
	@Override
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.GetList();
	}
	/**
	 * Crea Sondaggio
	 */
	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.Crea(dto);
	}
	/**
	 * Modifica sondaggio
	 */
	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.Modifica(dto);
	}

	/**
	 * Aggiungi domanda Multipla al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	/**
	 * Aggiungi domanda Libera al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaLibera(LiberaDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	/**
	 * Aggiungi domanda Range al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaRange(RangeDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	/**
	 * Aggiungi domanda Matrice al Sondaggio
	 */
	@Override
	public int SondaggioAggiungiDomandaMatrice(MatriceDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	/**
	 * Aggiungi Compilazione al Sondaggio
	 */
	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.AggiungiCompilazione(dto);
	}

	/**
	 *  Attiva Sondaggio
	 */
	@Override
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.SetEnable(idSondaggio);
	}

	/**
	 * Disattiva Sondaggio
	 */
	@Override
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.SetDisable(idSondaggio);
	}

	/**
	 * Modifica Domanda Multipla
	 */
	@Override
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	/**
	 * Modifica Domanda Libera
	 */
	@Override
	public void DomandaModifica(LiberaDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	/**
	 * Modifica Domanda Range
	 */
	@Override
	public void DomandaModifica(RangeDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	/**
	 * Modifica Domanda Matrice
	 */
	@Override
	public void DomandaModifica(MatriceDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	/**
	 * Modifica ValoriMatrice 
	 */
	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}
	/**
	 * Aggiungi ValoriMatrice a Domanda
	 */
	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.AggiungiValoriMatrice(dto);
	}

	/**
	 * Aggiungi Risposta a Domanda
	 */
	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.AggiungiRisposta(dto);
	}

	/**
	 * Attiva Domanda
	 */
	@Override
	public void DomandaSetEnable(int idDomanda) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.SetEnable(idDomanda);
	}

	/**
	 * Disattiva Domanda
	 */
	@Override
	public void DomandaSetDisable(int idDomanda) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.SetDisable(idDomanda);
	}

	/**
	 * Modifica Risposta
	 */
	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		return manager.Modifica(dto);
	}

	/**
	 * Attiva Risposta
	 */
	@Override
	public void RispostaSetEnable(int idRisposta) throws RemoteException {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		manager.SetEnable(idRisposta);
	}

	/**
	 * Disattiva Risposta
	 */
	@Override
	public void RispostaSetDisable(int idRisposta) throws RemoteException {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		manager.SetDisable(idRisposta);
	}

	/**
	 * Modifica Compilazione
	 */
	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		
		return manager.Modifica(dto);
	}

	/**
	 * Agguingi CompilazioneRisposta a Compilazione
	 */
	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.AggiungiCompilazioneRisposta(dto);
	}

	/**
	 * Attiva Compilazione
	 */
	@Override
	public void CompilazioneSetEnable(int idCompilazione) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.SetEnable(idCompilazione);
	}

	/**
	 * Disattiva Compilazione
	 */
	@Override
	public void CompilazioneSetDisable(int idCompilazione) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.SetDisable(idCompilazione);
	}

	/**
	 * Modifica CompilazioneRisposta
	 */
	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		
		return manager.Modifica(dto);
	}

	/**
	 * Elimina CompilazioneRisposta
	 * 
	 */
	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.Elimina(idCompilazioneRisposta);
	}

	/**
	 * Get Utente dall'idUtente
	 */
	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.GetByKey(idUtente);
	}

	/**
	 * Lista Utenti
	 */
	@Override
	public List<UtenteDTO> UtenteGetList() throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.GetList();
	}
 
	/**
	 * Crea Utente
	 */
	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		return manager.Crea(dto);
	}

	/**
	 * Modifica Utente
	 */
	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		return manager.Modifica(dto);
	}

	/**
	 * Attiva Utente
	 */
	@Override
	public void UtenteSetEnable(int idUtente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.SetEnable(idUtente);
	}

	/**
	 * Disattiva Utente
	 */
	@Override
	public void UtenteSetDisable(int idUtente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.SetDisable(idUtente);
	}

}
