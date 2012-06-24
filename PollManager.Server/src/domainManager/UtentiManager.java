package domainManager;

import java.util.ArrayList;
import java.util.List;
import util.DTOMapper;
import dataAccess.Repository;
import domain.Ruolo;
import domain.Utente;
import dto.UtenteDTO;
import exception.InvalidCredentialException;

public class UtentiManager implements UtentiManagerInterface {
	
	UtentiManager(){
		
	}

	public Utente GetById(int idUtente){
		Utente utente = Repository.getInstance().<Utente>GetByKey(Utente.class, idUtente);
		return utente;
	}
	
	private Utente SaveOrUpdate(Utente utente){
		Utente utenteSalvato=Repository.getInstance().<Utente>SaveOrUpdate(utente);
		return utenteSalvato;
	}
	
	private UtenteDTO GetDTO(Utente utente){
		return DTOMapper.getInstance().<UtenteDTO>map(utente, UtenteDTO.class);
	}
	
	@Override
	public UtenteDTO Login(String user, String password) throws InvalidCredentialException {
		try {
			Utente utente = Repository.getInstance().Login(user, password);
			return this.GetDTO(utente);
		} catch (Exception e) {
			throw new InvalidCredentialException("Invalid Credential");
		}
	}

	@Override
	public void Logout(UtenteDTO utente) {
		// TODO Auto-generated method stub

	}

	@Override
	public UtenteDTO GetByKey(int idUtente) {
		Utente utente = this.GetById(idUtente);
		return this.GetDTO(utente);
	}

	@Override
	public List<UtenteDTO> GetList() {
		List<Utente> dbList=Repository.getInstance().<Utente>GetAll(Utente.class);
		List<UtenteDTO> dtoList=new ArrayList<UtenteDTO>();
		for(Utente item : dbList){
			dtoList.add(this.GetDTO(item));
		}
		return dtoList;
	}

	@Override
	public UtenteDTO Crea(UtenteDTO dto) {
		Ruolo ruolo=DTOMapper.getInstance().<Ruolo>map(dto.getRuolo(), Ruolo.class);
		Utente utente=Utente.CreaUtente(dto.getMatricola(), ruolo, dto.getNome(), dto.getCognome(),dto.getNomeutente(), dto.getPassword());
		Utente utenteSalvato=this.SaveOrUpdate(utente);
		return this.GetDTO(utenteSalvato);
	}

	@Override
	public UtenteDTO Modifica(UtenteDTO dto) {
		Utente utente=this.GetById(dto.getIdUtente());
		Ruolo ruolo=DTOMapper.getInstance().<Ruolo>map(dto.getRuolo(), Ruolo.class);
		utente.ModificaUtente(dto.getMatricola(), ruolo, dto.getNome(), dto.getCognome(),dto.getNomeutente(), dto.getPassword());
		Utente utenteSalvato=this.SaveOrUpdate(utente);
		return this.GetDTO(utenteSalvato);
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
