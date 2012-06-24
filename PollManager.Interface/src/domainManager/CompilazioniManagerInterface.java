package domainManager;

import base.BaseInterface;
import dto.CompilazioneDTO;
import dto.CompilazioneRispostaDTO;

/**
 * Compilazioni Manager
 * @author 727826-729399
 *
 */
public interface CompilazioniManagerInterface {
	
	/**
	 * 
	 * @param idCompilazione
	 * @return
	 */
	public CompilazioneDTO GetByKey(int idCompilazione);
	/**
	 * 
	 * @see BaseInterface.CompilazioneModifica
	 */
	public CompilazioneDTO Modifica(CompilazioneDTO dto);
	/**
	 * 
	 * @see BaseInterface.CompilazioneAggiungiCompilazioneRisposta
	 */
	public void AggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto);
	/**
	 * 
	 * @see BaseInterface.CompilazioneSetEnable 
	 */
	public void SetEnable(int idCompilazione);
	/**
	 * 
	 * @see BaseInterface.CompilazioneSetDisable
	 */
	public void SetDisable(int idCompilazione);
	/**
	 * 
	 * @see BaseInterface.CompilazioneRispostaModifica
	 */
	public CompilazioneRispostaDTO Modifica(CompilazioneRispostaDTO dto);
	/**
	 * 
	 * @see BaseInterface.CompilazioneRispostaElimina
	 */
	public void Elimina(int idCompilazioneRisposta);
}
