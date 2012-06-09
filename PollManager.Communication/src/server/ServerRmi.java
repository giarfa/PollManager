package server;

import interfaces.ServerRmiInterface;
import java.util.List;
import resolver.Resolver;
import domainManager.*;
import dto.*;

public class ServerRmi extends BaseServer implements ServerRmiInterface {

	

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
