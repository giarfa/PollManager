package base;

import java.rmi.RemoteException;
import java.util.List;
import dto.*;
import exception.*;

/**
 * BaseInterface
 * @author 727826-729399
 *
 */
public interface BaseInterface {

	/**
	 * Login Utente
	 * @param user
	 * @param password
	 * @return
	 * @throws RemoteException
	 * @throws InvalidCredentialException
	 */
	public UtenteDTO Login(String user, String password) throws RemoteException, InvalidCredentialException;
	
	/**
	 * Logout Utente
	 * @param utente
	 * @throws RemoteException
	 */
	public void Logout(UtenteDTO utente) throws RemoteException;
	
	//Sondaggio
	
	/**
	 *  Get Sondaggio dall'id
	 */
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException;
	
	/**
	 * Lista Sondaggi
	 * @return
	 * @throws RemoteException
	 */
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException;
	
	/**
	 * Crea Sondaggio
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException;
	
	/**
	 * Modifica sondaggio
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) throws RemoteException;
	
	
	/**
	 * Aggiungi domanda Multipla al Sondaggio
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public int SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) throws RemoteException;
	
	/**
	 * Aggiungi domanda Libera al Sondaggio
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public int SondaggioAggiungiDomandaLibera(LiberaDTO dto) throws RemoteException;
	
	/**
	 * Aggiungi domanda Range al Sondaggio
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public int SondaggioAggiungiDomandaRange(RangeDTO dto) throws RemoteException;
	
	/**
	 * Aggiungi domanda Matrice al Sondaggio
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public int SondaggioAggiungiDomandaMatrice(MatriceDTO dto) throws RemoteException;
	
	/**
	 * Aggiungi Compilazione al Sondaggio
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) throws RemoteException;
	/**
	 * Attiva Sondaggio
	 * @param idSondaggio
	 * @throws RemoteException
	 */
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException;
	/**
	 * Disattiva Sondaggio
	 * @param idSondaggio
	 * @throws RemoteException
	 */
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException;
	
	//Domanda
	/**
	 * Modifica Domanda Multipla
	 */
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException;
	
	/**
	 * Modifica Domanda Libera
	 * @param dto
	 * @throws RemoteException
	 */
	public void DomandaModifica(LiberaDTO dto) throws RemoteException;
	/**
	 *  Modifica Domanda Range
	 * @param dto
	 * @throws RemoteException
	 */
	public void DomandaModifica(RangeDTO dto) throws RemoteException;
	/**
	 * 
	 * @param dto
	 * @throws RemoteException
	 */
	public void DomandaModifica(MatriceDTO dto) throws RemoteException;
	/**
	 * Modifica Domanda Matrice
	 * @param dto
	 * @throws RemoteException
	 */
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException;
	
	/**
	 * Aggiungi ValoriMatrice a Domanda
	 * @param dto
	 * @throws RemoteException
	 */
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) throws RemoteException;
	
	/**
	 * Aggiungi Risposta a Domanda
	 * @param dto
	 * @throws RemoteException
	 */
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException;
	
	/**
	 * Attiva Domanda
	 * @param idDomanda
	 * @throws RemoteException
	 */
	public void DomandaSetEnable(int idDomanda) throws RemoteException;
	
	/**
	 * Disattiva Domanda
	 * @param idDomanda
	 * @throws RemoteException
	 */
	public void DomandaSetDisable(int idDomanda) throws RemoteException;
	
	//Risposta
	
	/**
	 * Modifica Risposta
	 */
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException;
	/**
	 * Attiva Risposta
	 * @param idRisposta
	 * @throws RemoteException
	 */
	public void RispostaSetEnable(int idRisposta) throws RemoteException;
	
	/**
	 * Disattiva Risposta
	 * @param idRisposta
	 * @throws RemoteException
	 */
	public void RispostaSetDisable(int idRisposta) throws RemoteException;
	
	//Compilazione Sondaggio
	
	/**
	 * Modifica Compilazione
	 */
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) throws RemoteException;
	
	/**
	 * Agguingi CompilazioneRisposta a Compilazione
	 * @param dto
	 * @throws RemoteException
	 */
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) throws RemoteException;
	
	/**
	 * Attiva Compilazione
	 * @param idCompilazione
	 * @throws RemoteException
	 */
	public void CompilazioneSetEnable(int idCompilazione) throws RemoteException;
	
	/**
	 * Disattiva Compilazione
	 * @param idCompilazione
	 * @throws RemoteException
	 */
	public void CompilazioneSetDisable(int idCompilazione) throws RemoteException;
	
	//Compilazione Risposta
	/**
	 * Modifica CompilazioneRisposta
	 */
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) throws RemoteException;
	
	/**
	 * Elimina CompilazioneRisposta
	 * @param idCompilazioneRisposta
	 * @throws RemoteException
	 */
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) throws RemoteException;
	
	//Utente

	/**
	 * Get Utente dall'idUtente
	 */
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException;
	
	/**
	 * Lista Utenti
	 * @return
	 * @throws RemoteException
	 */
	public List<UtenteDTO> UtenteGetList() throws RemoteException;
	
	/**
	 * Crea Utente
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException;
	
	/**
	 * Modifica Utente
	 * @param dto
	 * @return
	 * @throws RemoteException
	 */
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException;
	
	/**
	 * Attiva Utente
	 * @param idUtente
	 * @throws RemoteException
	 */
	public void UtenteSetEnable(int idUtente) throws RemoteException;
	
	/**
	 * Disattiva Utente
	 * @param idUtente
	 * @throws RemoteException
	 */
	public void UtenteSetDisable(int idUtente) throws RemoteException;
}
