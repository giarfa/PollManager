package domainManager;

import java.util.List;

import dto.UtenteDTO;
import exception.InvalidCredentialException;

public interface UtentiManagerInterface {
	public UtenteDTO Login(String user, String password) throws InvalidCredentialException;
	public void Logout(UtenteDTO utente);
	
	public UtenteDTO GetByKey(int idUtente);
	public List<UtenteDTO> GetList();
	public UtenteDTO Crea(UtenteDTO dto);
	public UtenteDTO Modifica(UtenteDTO dto);
	public void SetEnable(int idUtente);
	public void SetDisable(int idUtente);
}
