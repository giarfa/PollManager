package base;

import java.rmi.RemoteException;
import java.util.List;
import dto.*;
import exception.*;

public interface BaseInterface {

	
	public UtenteDTO Login(String user, String password) throws RemoteException, InvalidCredentialException;
	public void Logout(UtenteDTO utente) throws RemoteException;
	
	//Sondaggio
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException;
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException;
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException;
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) throws RemoteException;
	public int SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) throws RemoteException;
	public int SondaggioAggiungiDomandaLibera(LiberaDTO dto) throws RemoteException;
	public int SondaggioAggiungiDomandaRange(RangeDTO dto) throws RemoteException;
	public int SondaggioAggiungiDomandaMatrice(MatriceDTO dto) throws RemoteException;
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) throws RemoteException;
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException;
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException;
	
	//Domanda
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException;
	public void DomandaModifica(LiberaDTO dto) throws RemoteException;
	public void DomandaModifica(RangeDTO dto) throws RemoteException;
	public void DomandaModifica(MatriceDTO dto) throws RemoteException;
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException;
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) throws RemoteException;
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException;
	public void DomandaSetEnable(int idDomanda) throws RemoteException;
	public void DomandaSetDisable(int idDomanda) throws RemoteException;
	
	//Risposta
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException;
	public void RispostaSetEnable(int idRisposta) throws RemoteException;
	public void RispostaSetDisable(int idRisposta) throws RemoteException;
	
	//Compilazione Sondaggio
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) throws RemoteException;
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) throws RemoteException;
	public void CompilazioneSetEnable(int idCompilazione) throws RemoteException;
	public void CompilazioneSetDisable(int idCompilazione) throws RemoteException;
	
	//Compilazione Risposta
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) throws RemoteException;
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) throws RemoteException;
	
	//Utente
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException;
	public List<UtenteDTO> UtenteGetList() throws RemoteException;
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException;
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException;
	public void UtenteSetEnable(int idUtente) throws RemoteException;
	public void UtenteSetDisable(int idUtente) throws RemoteException;
}
