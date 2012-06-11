package domainManager;

import java.util.List;

import dto.CompilazioneDTO;
import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.RangeDTO;
import dto.SondaggioDTO;

public interface SondaggiManagerInterface {
	public SondaggioDTO GetByKey(int idSondaggio);
	public List<SondaggioDTO> GetList();
	public SondaggioDTO Crea(SondaggioDTO dto);
	public SondaggioDTO Modifica(SondaggioDTO dto);
	public void AggiungiDomanda(MultiplaDTO dto);
	public void AggiungiDomanda(LiberaDTO dto);
	public void AggiungiDomanda(RangeDTO dto);
	public void AggiungiDomanda(MatriceDTO dto);
	public CompilazioneDTO AggiungiCompilazione(CompilazioneDTO dto);
	public void SetEnable(int idSondaggio);
	public void SetDisable(int idSondaggio);
}
