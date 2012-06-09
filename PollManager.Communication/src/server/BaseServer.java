package server;

import java.util.List;

import resolver.Resolver;

import domainManager.RisposteManagerInterface;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Logout(UtenteDTO utente) {
		// TODO Auto-generated method stub

	}

	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SondaggioDTO> SondaggioGetList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultiplaDTO SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LiberaDTO SondaggioAggiungiDomandaLibera(LiberaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RangeDTO SondaggioAggiungiDomandaRange(RangeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatriceDTO SondaggioAggiungiDomandaMatrice(MatriceDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SondaggioSetEnable(int idSondaggio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void SondaggioSetDisable(int idSondaggio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaModifica(MultiplaDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void DomandaModifica(LiberaDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void DomandaModifica(RangeDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void DomandaModifica(MatriceDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void DomandaSetEnable(int idDomanda) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaSetDisable(int idDomanda) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void CompilazioneSetEnable(int idCompilazione) {
		// TODO Auto-generated method stub

	}

	@Override
	public void CompilazioneSetDisable(int idCompilazione) {
		// TODO Auto-generated method stub

	}

	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(
			CompilazioneRispostaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) {
		// TODO Auto-generated method stub

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
