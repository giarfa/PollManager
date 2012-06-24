package server;

import java.rmi.RemoteException;
import java.util.List;
import resolver.Resolver;
import domainManager.*;
import dto.*;
import exception.*;

public class BaseServer implements ServerInterface {

	@Override
	public UtenteDTO Login(String user, String password) throws RemoteException, InvalidCredentialException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.Login(user, password);
	}

	@Override
	public void Logout(UtenteDTO utente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.Logout(utente);
	}

	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.GetByKey(idSondaggio);
	}

	@Override
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.GetList();
	}

	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.Crea(dto);
	}

	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.Modifica(dto);
	}

	@Override
	public int SondaggioAggiungiDomandaMultipla(MultiplaDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	@Override
	public int SondaggioAggiungiDomandaLibera(LiberaDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	@Override
	public int SondaggioAggiungiDomandaRange(RangeDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	@Override
	public int SondaggioAggiungiDomandaMatrice(MatriceDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		return manager.AggiungiDomanda(dto);
	}

	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		
		return manager.AggiungiCompilazione(dto);
	}

	@Override
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.SetEnable(idSondaggio);
	}

	@Override
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException {
		SondaggiManagerInterface manager=Resolver.getInstance().getSondaggiManager();
		manager.SetDisable(idSondaggio);
	}

	@Override
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(LiberaDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(RangeDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(MatriceDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.Modifica(dto);
	}

	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.AggiungiValoriMatrice(dto);
	}

	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.AggiungiRisposta(dto);
	}

	@Override
	public void DomandaSetEnable(int idDomanda) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.SetEnable(idDomanda);
	}

	@Override
	public void DomandaSetDisable(int idDomanda) throws RemoteException {
		DomandeManagerInterface manager=Resolver.getInstance().getDomandeManager();
		manager.SetDisable(idDomanda);
	}

	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		return manager.Modifica(dto);
	}

	@Override
	public void RispostaSetEnable(int idRisposta) throws RemoteException {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		manager.SetEnable(idRisposta);
	}

	@Override
	public void RispostaSetDisable(int idRisposta) throws RemoteException {
		RisposteManagerInterface manager=Resolver.getInstance().getRisposteManager();
		manager.SetDisable(idRisposta);
	}

	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		
		return manager.Modifica(dto);
	}

	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.AggiungiCompilazioneRisposta(dto);
	}

	@Override
	public void CompilazioneSetEnable(int idCompilazione) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.SetEnable(idCompilazione);
	}

	@Override
	public void CompilazioneSetDisable(int idCompilazione) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.SetDisable(idCompilazione);
	}

	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(CompilazioneRispostaDTO dto) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		
		return manager.Modifica(dto);
	}

	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta) throws RemoteException {
		CompilazioniManagerInterface manager=Resolver.getInstance().getCompilazioneManager();
		manager.Elimina(idCompilazioneRisposta);
	}

	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.GetByKey(idUtente);
	}

	@Override
	public List<UtenteDTO> UtenteGetList() throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		
		return manager.GetList();
	}

	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		return manager.Crea(dto);
	}

	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		return manager.Modifica(dto);
	}

	@Override
	public void UtenteSetEnable(int idUtente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.SetEnable(idUtente);
	}

	@Override
	public void UtenteSetDisable(int idUtente) throws RemoteException {
		UtentiManagerInterface manager=Resolver.getInstance().getUtentiManager();
		manager.SetDisable(idUtente);
	}

}
