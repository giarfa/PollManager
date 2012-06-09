package domainManager;

import dto.RispostaDTO;

public interface RisposteManagerInterface {
	public RispostaDTO GetByKey(int idRisposta);
	public RispostaDTO Modifica(RispostaDTO dto);
	public void SetEnable(int idRisposta);
	public void SetDisable(int idRisposta);
}
