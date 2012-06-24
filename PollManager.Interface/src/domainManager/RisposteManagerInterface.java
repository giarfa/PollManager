package domainManager;

import dto.RispostaDTO;

/**
 * Risposte Manager
 * @author 727826-729399
 * Per i metodi vedere @see @link BaseInterface
 */
public interface RisposteManagerInterface {
	public RispostaDTO GetByKey(int idRisposta);
	public RispostaDTO Modifica(RispostaDTO dto);
	public void SetEnable(int idRisposta);
	public void SetDisable(int idRisposta);
}
