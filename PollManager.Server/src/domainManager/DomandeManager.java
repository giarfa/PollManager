package domainManager;

import util.DTOMapper;
import dataAccess.Repository;
import domain.*;
import dto.*;

public class DomandeManager implements DomandeManagerInterface {
	
	DomandeManager() {
		
	}

	public Domanda GetById(int idDomanda){
		Domanda domanda = Repository.getInstance().<Domanda>GetByKey(Domanda.class, idDomanda);
		return domanda;
	}
	
	public ValoriMatrice GetValoriMatriceById(int idDomanda){
		ValoriMatrice domanda = Repository.getInstance().<ValoriMatrice>GetByKey(ValoriMatrice.class, idDomanda);
		return domanda;
	}
	
	private MultiplaDTO GetMultiplaDTO(Multipla domanda){
		return DTOMapper.getInstance().<MultiplaDTO>map(domanda, MultiplaDTO.class);
	}
	
	private LiberaDTO GetLiberaDTO(Libera domanda){
		return DTOMapper.getInstance().<LiberaDTO>map(domanda, LiberaDTO.class);
	}
	
	private RangeDTO GetRangeDTO(Range domanda){
		return DTOMapper.getInstance().<RangeDTO>map(domanda, RangeDTO.class);
	}
	
	private MatriceDTO GetMatriceDTO(Matrice domanda){
		return DTOMapper.getInstance().<MatriceDTO>map(domanda, MatriceDTO.class);
	}
	
	private ValoriMatriceDTO GetValoriMatriceDTO(ValoriMatrice domanda){
		return DTOMapper.getInstance().<ValoriMatriceDTO>map(domanda, ValoriMatriceDTO.class);
	}
	
	private Domanda SaveOrUpdate(Domanda domanda){
		Domanda domandaSalvata=Repository.getInstance().<Domanda>SaveOrUpdate(domanda);
		return domandaSalvata;
	}
	
	private ValoriMatrice SaveOrUpdate(ValoriMatrice domanda){
		ValoriMatrice domandaSalvata=Repository.getInstance().<ValoriMatrice>SaveOrUpdate(domanda);
		return domandaSalvata;
	}
	
	@Override
	public MultiplaDTO GetMultiplaByKey(int idDomanda){
		Multipla domanda = (Multipla)this.GetById(idDomanda);
		return this.GetMultiplaDTO(domanda);
	}
	
	@Override
	public LiberaDTO GetLiberaByKey(int idDomanda){
		Libera domanda = (Libera)this.GetById(idDomanda);
		return this.GetLiberaDTO(domanda);
	}
	
	@Override
	public RangeDTO GetRangeByKey(int idDomanda){
		Range domanda = (Range)this.GetById(idDomanda);
		return this.GetRangeDTO(domanda);
	}
	
	@Override
	public MatriceDTO GetMatriceByKey(int idDomanda){
		Matrice domanda = (Matrice)this.GetById(idDomanda);
		return this.GetMatriceDTO(domanda);
	}
	
	@Override
	public ValoriMatriceDTO GetValoriMatriceByKey(int idDomanda){
		ValoriMatrice domanda=this.GetValoriMatriceById(idDomanda);
		return this.GetValoriMatriceDTO(domanda);
	}
	
	@Override
	public void Modifica(MultiplaDTO dto) {
		Multipla domanda= (Multipla)this.GetById(dto.getIdDomanda());
		Orientamento orientamento=DTOMapper.getInstance().<Orientamento>map(dto.getOrientamento(), Orientamento.class);
		domanda.ModificaMultipla(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio(), orientamento, dto.isIs_singola(), dto.getNumMinRisp());
		this.SaveOrUpdate(domanda);
	}

	@Override
	public void Modifica(LiberaDTO dto) {
		Libera domanda=(Libera)this.GetById(dto.getIdDomanda());
		domanda.ModificaLibera(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio(), dto.getMaxCaratteri(), dto.getMinCaratteri());
		this.SaveOrUpdate(domanda);
	}

	@Override
	public void Modifica(RangeDTO dto) {
		Range domanda=(Range)this.GetById(dto.getIdDomanda());
		domanda.ModificaRange(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio(), dto.getValMin(), dto.getValMax(), dto.getDescValMin(), dto.getDescValMax(), dto.isRispSingola());
		this.SaveOrUpdate(domanda);
	}

	@Override
	public void Modifica(MatriceDTO dto) {
		Matrice domanda=(Matrice)this.GetById(dto.getIdDomanda());
		domanda.ModificaMatrice(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio());
		this.SaveOrUpdate(domanda);
	}

	@Override
	public void Modifica(ValoriMatriceDTO dto) {
		ValoriMatrice domanda=this.GetValoriMatriceById(dto.getIdValoriMatrice());
		domanda.ModificaValoriMatrice(dto.getOrdine(), dto.getTesto());
		this.SaveOrUpdate(domanda);
	}

	@Override
	public void AggiungiValoriMatrice(ValoriMatriceDTO dto) {
		Matrice matrice=(Matrice)this.GetById(dto.getMatriceIdDomanda());
		matrice.AggiungiValoriMatrice(dto.getOrdine(), dto.getTesto());
		this.SaveOrUpdate(matrice);
	}

	@Override
	public void AggiungiRisposta(RispostaDTO dto) {
		Domanda domanda=this.GetById(dto.getDomandaAssociataIdDomanda());
		domanda.AggiungiRisposta(dto.getOrdine(), dto.getTesto(), dto.isHasTestoLibero(), dto.isNonRisponde());
		this.SaveOrUpdate(domanda);
	}

	@Override
	public void SetEnable(int idDomanda) {
		Domanda domanda=this.GetById(idDomanda);
		domanda.setEnable();
		this.SaveOrUpdate(domanda);
	}

	@Override
	public void SetDisable(int idDomanda) {
		Domanda domanda=this.GetById(idDomanda);
		domanda.setDisable();
		this.SaveOrUpdate(domanda);
	}

}
