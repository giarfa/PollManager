package domainManager;

import dto.CompilazioneDTO;
import dto.CompilazioneRispostaDTO;

public interface CompilazioniManagerInterface {
	public CompilazioneDTO Modifica(CompilazioneDTO dto);
	public void AggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto);
	public void SetEnable(int idCompilazione);
	public void SetDisable(int idCompilazione);
	
	public CompilazioneRispostaDTO Modifica(CompilazioneRispostaDTO dto);
	public void Elimina(int idCompilazioneRisposta);
}
