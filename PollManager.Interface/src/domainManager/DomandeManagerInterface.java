package domainManager;

import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.RangeDTO;
import dto.RispostaDTO;
import dto.ValoriMatriceDTO;

public interface DomandeManagerInterface {
	public MultiplaDTO GetMultiplaByKey(int idDomanda);
	public LiberaDTO GetLiberaByKey(int idDomanda);
	public RangeDTO GetRangeByKey(int idDomanda);
	public MatriceDTO GetMatriceByKey(int idDomanda);
	public ValoriMatriceDTO GetValoriMatriceByKey(int idDomanda);
	public MultiplaDTO Modifica(MultiplaDTO dto);
	public LiberaDTO Modifica(LiberaDTO dto);
	public RangeDTO Modifica(RangeDTO dto);
	public MatriceDTO Modifica(MatriceDTO dto);
	public ValoriMatriceDTO Modifica(ValoriMatriceDTO dto);
	public ValoriMatriceDTO AggiungiValoriMatrice(ValoriMatriceDTO dto);
	public RispostaDTO AggiungiRisposta(RispostaDTO dto);
	public void SetEnable(int idDomanda);
	public void SetDisable(int idDomanda);
}
