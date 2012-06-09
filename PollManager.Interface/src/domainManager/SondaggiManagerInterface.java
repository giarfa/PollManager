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
	public MultiplaDTO AggiungiDomanda(MultiplaDTO dto);
	public LiberaDTO AggiungiDomanda(LiberaDTO dto);
	public RangeDTO AggiungiDomanda(RangeDTO dto);
	public MatriceDTO AggiungiDomanda(MatriceDTO dto);
	public CompilazioneDTO AggiungiCompilazione(CompilazioneDTO dto);
	public void SetEnable(int idSondaggio);
	public void SetDisable(int idSondaggio);
}
