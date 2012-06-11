package server;

import java.util.List;

import resolver.Resolver;

import domainManager.CompilazioniManagerInterface;
import domainManager.DomandeManagerInterface;
import domainManager.RisposteManagerInterface;
import domainManager.SondaggiManagerInterface;
import domainManager.UtentiManagerInterface;
import dto.CompilazioneDTO;
import dto.CompilazioneRispostaDTO;
import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.RangeDTO;
import dto.RispostaDTO;
import dto.SondaggioDTO;
import dto.UtenteDTO;
import dto.ValoriMatriceDTO;

public class BaseServer implements ServerInterface {

	@Override
	public UtenteDTO Login(String user, String password) {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.Login(user, password);
	}

	@Override
	public void Logout(UtenteDTO utente) {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.Logout(utente);
	}

	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.GetByKey(idSondaggio);
	}

	@Override
	public List<SondaggioDTO> SondaggioGetList() {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.GetList();
	}

	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.Crea(dto);
	}

	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.Modifica(dto);
	}

	@Override
	public void SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.AggiungiDomanda(dto);
	}

	@Override
	public void SondaggioAggiungiDomandaLibera(LiberaDTO dto) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.AggiungiDomanda(dto);
	}

	@Override
	public void SondaggioAggiungiDomandaRange(RangeDTO dto) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.AggiungiDomanda(dto);
	}

	@Override
	public void SondaggioAggiungiDomandaMatrice(MatriceDTO dto) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.AggiungiDomanda(dto);
	}

	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.AggiungiCompilazione(dto);
	}

	@Override
	public void SondaggioSetEnable(int idSondaggio) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.SetEnable(idSondaggio);
	}

	@Override
	public void SondaggioSetDisable(int idSondaggio) {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.SetDisable(idSondaggio);
	}

	@Override
	public void DomandaModifica(MultiplaDTO dto) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(LiberaDTO dto) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(RangeDTO dto) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(MatriceDTO dto) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.AggiungiValoriMatrice(dto);
	}

	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.AggiungiRisposta(dto);
	}

	@Override
	public void DomandaSetEnable(int idDomanda) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.SetEnable(idDomanda);
	}

	@Override
	public void DomandaSetDisable(int idDomanda) {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.SetDisable(idDomanda);
	}

	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		return manager.Modifica(dto);
	}

	@Override
	public void RispostaSetEnable(int idRisposta) {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		manager.SetEnable(idRisposta);
	}

	@Override
	public void RispostaSetDisable(int idRisposta) {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		manager.SetDisable(idRisposta);
	}

	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		
		return manager.Modifica(dto);
	}

	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.AggiungiCompilazioneRisposta(dto);
	}

	@Override
	public void CompilazioneSetEnable(int idCompilazione) {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.SetEnable(idCompilazione);
	}

	@Override
	public void CompilazioneSetDisable(int idCompilazione) {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.SetDisable(idCompilazione);
	}

	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		
		return manager.Modifica(dto);
	}

	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.Elimina(idCompilazioneRisposta);
	}

	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.GetByKey(idUtente);
	}

	@Override
	public List<UtenteDTO> UtenteGetList() {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.GetList();
	}

	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		return manager.Crea(dto);
	}

	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		return manager.Modifica(dto);
	}

	@Override
	public void UtenteSetEnable(int idUtente) {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.SetEnable(idUtente);
	}

	@Override
	public void UtenteSetDisable(int idUtente) {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.SetDisable(idUtente);
	}

}
