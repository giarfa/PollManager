package domainManager;

import java.util.ArrayList;
import java.util.List;
import util.DTOMapper;
import dataAccess.Repository;
import domain.Ruolo;
import domain.Utente;
import dto.UtenteDTO;

public class UtentiManager implements UtentiManagerInterface {

	private Utente GetById(int idUtente){
		Utente utente = Repository.getInstance().<Utente>GetByKey(Utente.class, idUtente);
		return utente;
	}
	
	private Utente SaveOrUpdate(Utente utente){
		Utente utenteSalvato=Repository.getInstance().<Utente>SaveOrUpdate(utente);
		return utenteSalvato;
	}
	
	@Override
	public UtenteDTO Login(String user, String password) {
		try {
			Utente utente = Repository.getInstance().Login(user, password);
			return DTOMapper.<UtenteDTO>Map(utente);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void Logout(UtenteDTO utente) {
		// TODO Auto-generated method stub

	}

	@Override
	public UtenteDTO GetByKey(int idUtente) {
		Utente utente = this.GetById(idUtente);
		return DTOMapper.<UtenteDTO>Map(utente);
	}

	@Override
	public List<UtenteDTO> GetList() {
		List<Utente> dbList=Repository.getInstance().<Utente>GetAll(Utente.class);
		List<UtenteDTO> dtoList=new ArrayList<UtenteDTO>();
		for(Utente item : dbList){
			dtoList.add(DTOMapper.<UtenteDTO>Map(item));
		}
		return dtoList;
	}

	@Override
	public UtenteDTO Crea(UtenteDTO dto) {
		Utente utente=Utente.CreaUtente(dto.getMatricola(), Ruolo.SEGRETARIO, dto.getNome(), dto.getCognome(), dto.getPassword());
		Utente utenteSalvato=this.SaveOrUpdate(utente);
		return DTOMapper.<UtenteDTO>Map(utenteSalvato);
	}

	@Override
	public UtenteDTO Modifica(UtenteDTO dto) {
		Utente utente=this.GetById(dto.getIdUtente());
		utente.ModificaUtente(dto.getMatricola(), Ruolo.SEGRETARIO, dto.getNome(), dto.getCognome(), dto.getPassword());
		Utente utenteSalvato=this.SaveOrUpdate(utente);
		return DTOMapper.<UtenteDTO>Map(utenteSalvato);
	}

	@Override
	public void SetEnable(int idUtente) {
		Utente utente=this.GetById(idUtente);
		utente.setEnable();
		this.SaveOrUpdate(utente);
	}

	@Override
	public void SetDisable(int idUtente) {
		Utente utente=this.GetById(idUtente);
		utente.setDisable();
		this.SaveOrUpdate(utente);
	}
}
