package server;

import java.util.List;
import dto.*;

public interface IServer {
	//Login - Logout
	public UtenteDTO Login(String user, String password);
	public void Logout(UtenteDTO utente);
	
	//Sondaggio
	public SondaggioDTO SondaggioGetSondaggio(int idSondaggio);
	public List<SondaggioDTO> SondaggiogetSondaggi();
	public SondaggioDTO SondaggioCreaSondaggio(SondaggioDTO dto);
	public SondaggioDTO SondaggioModificaSondaggio(SondaggioDTO dto);
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
}
