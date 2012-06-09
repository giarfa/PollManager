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
	public void Modifica(MultiplaDTO dto);
	public void Modifica(LiberaDTO dto);
	public void Modifica(RangeDTO dto);
	public void Modifica(MatriceDTO dto);
	public void Modifica(ValoriMatriceDTO dto);
	public void AggiungiValoriMatrice(ValoriMatriceDTO dto);
	public void AggiungiRisposta(RispostaDTO dto);
	public void SetEnable(int idDomanda);
	public void SetDisable(int idDomanda);
}
