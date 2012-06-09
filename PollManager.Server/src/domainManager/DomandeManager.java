package domainManager;

import util.DTOMapper;
import dataAccess.Repository;
import domain.*;
import dto.*;

public class DomandeManager implements DomandeManagerInterface {

	private Multipla GetMultiplaById(int idDomanda){
		Multipla domanda = Repository.getInstance().<Multipla>GetByKey(Multipla.class, idDomanda);
		return domanda;
	}
	
	private Libera GetLiberaById(int idDomanda){
		Libera domanda = Repository.getInstance().<Libera>GetByKey(Libera.class, idDomanda);
		return domanda;
	}
	
	private Range GetRangeById(int idDomanda){
		Range domanda = Repository.getInstance().<Range>GetByKey(Range.class, idDomanda);
		return domanda;
	}
	
	private Matrice GetMatriceById(int idDomanda){
		Matrice domanda = Repository.getInstance().<Matrice>GetByKey(Matrice.class, idDomanda);
		return domanda;
	}
	
	private ValoriMatrice GetValoriMatriceById(int idDomanda){
		ValoriMatrice domanda = Repository.getInstance().<ValoriMatrice>GetByKey(ValoriMatrice.class, idDomanda);
		return domanda;
	}
	
	private Multipla SaveOrUpdate(Multipla domanda){
		Multipla domandaSalvata=Repository.getInstance().<Multipla>SaveOrUpdate(domanda);
		return domandaSalvata;
	}
	
	private Libera SaveOrUpdate(Libera domanda){
		Libera domandaSalvata=Repository.getInstance().<Libera>SaveOrUpdate(domanda);
		return domandaSalvata;
	}
	
	private Range SaveOrUpdate(Range domanda){
		Range domandaSalvata=Repository.getInstance().<Range>SaveOrUpdate(domanda);
		return domandaSalvata;
	}
	
	private Matrice SaveOrUpdate(Matrice domanda){
		Matrice domandaSalvata=Repository.getInstance().<Matrice>SaveOrUpdate(domanda);
		return domandaSalvata;
	}
	
	private ValoriMatrice SaveOrUpdate(ValoriMatrice domanda){
		ValoriMatrice domandaSalvata=Repository.getInstance().<ValoriMatrice>SaveOrUpdate(domanda);
		return domandaSalvata;
	}
	
	@Override
	public MultiplaDTO GetMultiplaByKey(int idDomanda){
		Multipla domanda=this.GetMultiplaById(idDomanda);
		return DTOMapper.<MultiplaDTO>Map(domanda);
	}
	
	@Override
	public LiberaDTO GetLiberaByKey(int idDomanda){
		Libera domanda=this.GetLiberaById(idDomanda);
		return DTOMapper.<LiberaDTO>Map(domanda);
	}
	
	@Override
	public RangeDTO GetRangeByKey(int idDomanda){
		Range domanda=this.GetRangeById(idDomanda);
		return DTOMapper.<RangeDTO>Map(domanda);
	}
	
	@Override
	public MatriceDTO GetMatriceByKey(int idDomanda){
		Matrice domanda=this.GetMatriceById(idDomanda);
		return DTOMapper.<MatriceDTO>Map(domanda);
	}
	
	@Override
	public ValoriMatriceDTO GetValoriMatriceByKey(int idDomanda){
		ValoriMatrice domanda=this.GetValoriMatriceById(idDomanda);
		return DTOMapper.<ValoriMatriceDTO>Map(domanda);
	}
	
	@Override
	public MultiplaDTO Modifica(MultiplaDTO dto) {
		/*
		Multipla domanda=this.GetMultiplaById(idDomanda);
		domanda.ModificaMultipla(ordine, testo, isObbligatorio, orientamento, isSingola, NumMinRisp);
		Multipla domandaSalvata=this.SaveOrUpdate(domanda);
		
		return DTOMapper.<MultiplaDTO>Map(domanda);*/return null;
	}

	@Override
	public LiberaDTO Modifica(LiberaDTO dto) {
		/*
		Libera domanda=this.GetLiberaById(idDomanda);
		domanda.ModificaLibera(ordine, testo, isObbligatorio, MaxCaratteri, MinCaratteri);
		Libera domandaSalvata=this.SaveOrUpdate(domanda);
		
		return DTOMapper.<LiberaDTO>Map(domanda);*/return null;
	}

	@Override
	public RangeDTO Modifica(RangeDTO dto) {
		/*
		Range domanda=this.GetRangeById(idDomanda);
		domanda.ModificaRange(ordine, testo, isObbligatorio, ValMin, ValMax, DescValMin, DescValMax, isRispSingola);
		Range domandaSalvata=this.SaveOrUpdate(domanda);
		
		return DTOMapper.<RangeDTO>Map(domanda);*/return null;
	}

	@Override
	public MatriceDTO Modifica(MatriceDTO dto) {
		/*
		Matrice domanda=this.GetMatriceById(idDomanda);
		domanda.ModificaMatrice(ordine, testo, isObbligatorio);
		Matrice domandaSalvata=this.SaveOrUpdate(domanda);
		
		return DTOMapper.<MatriceDTO>Map(domanda);*/return null;
	}

	@Override
	public ValoriMatriceDTO Modifica(ValoriMatriceDTO dto) {
		/*
		ValoriMatrice domanda=this.GetValoriMatriceById(idValore);
		domanda.ModificaValoriMatrice(ordine, testo);
		ValoriMatrice domandaSalvata=this.SaveOrUpdate(domanda);
		
		return DTOMapper.<ValoriMatriceDTO>Map(domanda);*/return null;
	}

	@Override
	public ValoriMatriceDTO AggiungiValoriMatrice(ValoriMatriceDTO dto) {
		/*
		Matrice matrice=this.GetMatriceById(idDomanda);
		matrice.AggiungiValoriMatrice(ordine, testo);
		Matrice matriceSalvata=this.SaveOrUpdate(matrice);
		
		return DTOMapper.<ValoriMatriceDTO>Map(matrice);*/return null;
	}

	@Override
	public RispostaDTO AggiungiRisposta(RispostaDTO dto) {
		return null;
	}

	@Override
	public void SetEnable(int idDomanda) {
		// TODO Auto-generated method stub

	}

	@Override
	public void SetDisable(int idDomanda) {
		// TODO Auto-generated method stub

	}

}
