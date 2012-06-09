package server;

import java.util.List;
import dto.*;

public interface ServerInterface {
	//Login - Logout
	public UtenteDTO Login(String user, String password);
	public void Logout(UtenteDTO utente);
	
	//Sondaggio
	public SondaggioDTO SondaggioGetByKey(int idSondaggio);
	public List<SondaggioDTO> SondaggioGetList();
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto);
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto);
	public MultiplaDTO SondaggioAggiungiDomandaMultipla(MultiplaDTO dto);
	public LiberaDTO SondaggioAggiungiDomandaLibera(LiberaDTO dto);
	public RangeDTO SondaggioAggiungiDomandaRange(RangeDTO dto);
	public MatriceDTO SondaggioAggiungiDomandaMatrice(MatriceDTO dto);
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto);
	public void SondaggioSetEnable(int idSondaggio);
	public void SondaggioSetDisable(int idSondaggio);
	
	//Domanda
	public MultiplaDTO DomandaModifica(MultiplaDTO dto);
	public LiberaDTO DomandaModifica(LiberaDTO dto);
	public RangeDTO DomandaModifica(RangeDTO dto);
	public MatriceDTO DomandaModifica(MatriceDTO dto);
	public ValoriMatriceDTO DomandaModifica(ValoriMatriceDTO dto);
	public ValoriMatriceDTO DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto);
	public RispostaDTO DomandaAggiungiRisposta(RispostaDTO dto);
	public void DomandaSetEnable(int idDomanda);
	public void DomandaSetDisable(int idDomanda);
	
	//Risposta
	public RispostaDTO RispostaModifica(RispostaDTO dto);
	public void RispostaSetEnable(int idRisposta);
	public void RispostaSetDisable(int idRisposta);
	
	//Compilazione Sondaggio
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto);
	public CompilazioneRispostaDTO CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto);
	public void CompilazioneSetEnable(int idCompilazione);
	public void CompilazioneSetDisable(int idCompilazione);
	
	//Compilazione Risposta
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto);
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta);
	
	//Utente
	public UtenteDTO UtenteGetByKey(int idUtente);
	public List<UtenteDTO> UtenteGetList();
	public UtenteDTO UtenteCrea(UtenteDTO dto);
	public UtenteDTO UtenteModifica(UtenteDTO dto);
	public void UtenteSetEnable(int idUtente);
	public void UtenteSetDisable(int idUtente);
}
