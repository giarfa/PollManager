package domainManager;

import java.util.ArrayList;
import java.util.List;
import util.DTOMapper;
import dataAccess.Repository;
import domain.Orientamento;
import domain.Sondaggio;
import domain.Utente;
import dto.CompilazioneDTO;
import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.RangeDTO;
import dto.SondaggioDTO;

public class SondaggiManager implements SondaggiManagerInterface {
	
	SondaggiManager(){
		
	}

	private Sondaggio GetById(int idSondaggio){
		Sondaggio sondaggio = Repository.getInstance().<Sondaggio>GetByKey(Sondaggio.class, idSondaggio);
		return sondaggio;
	}
	
	private Sondaggio SaveOrUpdate(Sondaggio sondaggio){
		Sondaggio sondaggioSalvato=Repository.getInstance().<Sondaggio>SaveOrUpdate(sondaggio);
		return sondaggioSalvato;
	}
	
	private SondaggioDTO GetDTO(Sondaggio sondaggio){
		return DTOMapper.getInstance().<SondaggioDTO>map(sondaggio, SondaggioDTO.class);
	}
	
	@Override
	public SondaggioDTO GetByKey(int idSondaggio) {
		Sondaggio sondaggio=this.GetById(idSondaggio);
		return this.GetDTO(sondaggio);
	}

	@Override
	public List<SondaggioDTO> GetList() {
		List<Sondaggio> dbList=Repository.getInstance().<Sondaggio>GetAll(Sondaggio.class);
		List<SondaggioDTO> dtoList=new ArrayList<SondaggioDTO>();
		for(Sondaggio item : dbList){
			dtoList.add(this.GetDTO(item));
		}
		return dtoList;
	}

	@Override
	public SondaggioDTO Crea(SondaggioDTO dto) {
		Sondaggio sondaggio=Sondaggio.CreaSondaggio(dto.getTitolo(), dto.getDescrizione());
		Sondaggio sondaggioSalvato=this.SaveOrUpdate(sondaggio);
		return this.GetDTO(sondaggioSalvato);
	}

	@Override
	public SondaggioDTO Modifica(SondaggioDTO dto) {
		Sondaggio sondaggio=this.GetById(dto.getIdSondaggio());
		sondaggio.ModificaSondaggio(dto.getTitolo(), dto.getDescrizione());
		Sondaggio sondaggioSalvato=this.SaveOrUpdate(sondaggio);
		return this.GetDTO(sondaggioSalvato);
	}

	@Override
	public int AggiungiDomanda(MultiplaDTO dto) {
		Sondaggio sondaggio=this.GetById(dto.getSondaggioAssociatoIdSondaggio());
		Orientamento orientamento=DTOMapper.getInstance().<Orientamento>map(dto.getOrientamento(), Orientamento.class);
		sondaggio.AggiungiDomandaMultipla(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio(), orientamento, dto.isIs_singola(), dto.getNumMinRisp());
		Sondaggio sondaggioSalvato=this.SaveOrUpdate(sondaggio);
		return sondaggioSalvato.getDomande().get(0).getIdDomanda();
	}

	@Override
	public int AggiungiDomanda(LiberaDTO dto) {
		Sondaggio sondaggio=this.GetById(dto.getSondaggioAssociatoIdSondaggio());
		sondaggio.AggiungiDomandaLibera(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio(), dto.getMaxCaratteri(), dto.getMinCaratteri());
		Sondaggio sondaggioSalvato=this.SaveOrUpdate(sondaggio);
		return sondaggioSalvato.getDomande().get(0).getIdDomanda();
	}

	@Override
	public int AggiungiDomanda(RangeDTO dto) {
		Sondaggio sondaggio=this.GetById(dto.getSondaggioAssociatoIdSondaggio());
		sondaggio.AggiungiDomandaRange(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio(), dto.getValMin(), dto.getValMax(), dto.getDescValMin(), dto.getDescValMax(), dto.isRispSingola());
		Sondaggio sondaggioSalvato=this.SaveOrUpdate(sondaggio);
		return sondaggioSalvato.getDomande().get(0).getIdDomanda();
	}

	@Override
	public int AggiungiDomanda(MatriceDTO dto) {
		Sondaggio sondaggio=this.GetById(dto.getSondaggioAssociatoIdSondaggio());
		sondaggio.AggiungiDomandaMatrice(dto.getOrdine(), dto.getTesto(), dto.isObbligatorio());
		Sondaggio sondaggioSalvato=this.SaveOrUpdate(sondaggio);
		return sondaggioSalvato.getDomande().get(0).getIdDomanda();
	}

	@Override
	public CompilazioneDTO AggiungiCompilazione(CompilazioneDTO dto) {
		Sondaggio sondaggio=this.GetById(dto.getSondaggioAssociatoIdSondaggio());
		Utente utente=DomainManagerFactory.getInstance().getUtentiManager().GetById(dto.getUtenteAssociato().getIdUtente());
		sondaggio.AggiungiCompilazione(sondaggio, utente, dto.getNote());
		Sondaggio sondaggioSavato=this.SaveOrUpdate(sondaggio);
		int idCompilazione=sondaggioSavato.getCompilazioni().get(sondaggioSavato.getCompilazioni().size()-1).getIdCompilazione();
		return DomainManagerFactory.getInstance().getCompilazioniManager().GetByKey(idCompilazione);
	}

	@Override
	public void SetEnable(int idSondaggio) {
		Sondaggio sondaggio=this.GetById(idSondaggio);
		sondaggio.setEnable();
		this.SaveOrUpdate(sondaggio);
	}

	@Override
	public void SetDisable(int idSondaggio) {
		Sondaggio sondaggio=this.GetById(idSondaggio);
		sondaggio.setDisable();
		this.SaveOrUpdate(sondaggio);
	}

}
