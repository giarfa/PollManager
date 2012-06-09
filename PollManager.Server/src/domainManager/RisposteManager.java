package domainManager;

import util.DTOMapper;
import dataAccess.Repository;
import domain.Risposta;
import domain.Utente;
import dto.RispostaDTO;

public class RisposteManager implements RisposteManagerInterface {
	private Risposta GetById(int idRisposta){
		Risposta risposta = Repository.getInstance().<Risposta>GetByKey(Risposta.class, idRisposta);
		return risposta;
	}
	
	private Risposta SaveOrUpdate(Risposta risposta){
		Risposta rispostaSalvata=Repository.getInstance().<Risposta>SaveOrUpdate(risposta);
		return rispostaSalvata;
	}
	
	private RispostaDTO GetDTO(Risposta risposta){
		return DTOMapper.getInstance().<RispostaDTO>map(risposta, RispostaDTO.class);
	}
	
	@Override
	public RispostaDTO GetByKey(int idRisposta) {
		Risposta risposta = this.GetById(idRisposta);
		return this.GetDTO(risposta);
	}
	
	@Override
	public RispostaDTO Modifica(RispostaDTO dto) {
		Risposta risposta=this.GetById(idRisposta);
		risposta.ModificaRisposta(ordine, testo, hasTestoLibero, isNonRisponde, domandaAssociata);
		Risposta rispostaSalvata=this.SaveOrUpdate(risposta);
		return this.GetDTO(rispostaSalvata);
	}

	@Override
	public void SetEnable(int idRisposta) {
		Risposta risposta=this.GetById(idRisposta);
		risposta.setEnable();
		this.SaveOrUpdate(risposta);
	}

	@Override
	public void SetDisable(int idRisposta) {
		Risposta risposta=this.GetById(idRisposta);
		risposta.setDisable();
		this.SaveOrUpdate(risposta);
	}
}
