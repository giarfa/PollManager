package domainManager;

import util.DTOMapper;
import dataAccess.Repository;
import domain.Compilazione;
import domain.CompilazioneRisposta;
import dto.CompilazioneDTO;
import dto.CompilazioneRispostaDTO;

public class CompilazioneManager implements CompilazioneManagerInterface {

	private Compilazione GetById(int idCompilazione){
		Compilazione compilazione = Repository.getInstance().<Compilazione>GetByKey(Compilazione.class, idCompilazione);
		return compilazione;
	}
	
	private Compilazione SaveOrUpdate(Compilazione compilazione){
		Compilazione compilazioneSalvata=Repository.getInstance().<Compilazione>SaveOrUpdate(compilazione);
		return compilazioneSalvata;
	}
	
	private CompilazioneDTO GetDTO(Compilazione compilazione){
		return DTOMapper.getInstance().<CompilazioneDTO>map(compilazione, CompilazioneDTO.class);
	}
	
	private CompilazioneRisposta GetCompilazioneRispostaById(int idCompilazioneRisposta){
		CompilazioneRisposta compilazione = Repository.getInstance().<CompilazioneRisposta>GetByKey(CompilazioneRisposta.class, idCompilazioneRisposta);
		return compilazione;
	}
	
	private CompilazioneRisposta SaveOrUpdate(CompilazioneRisposta compilazione){
		CompilazioneRisposta compilazioneSalvata=Repository.getInstance().<CompilazioneRisposta>SaveOrUpdate(compilazione);
		return compilazioneSalvata;
	}
	
	private CompilazioneRispostaDTO GetDTO(CompilazioneRisposta compilazione){
		return DTOMapper.getInstance().<CompilazioneRispostaDTO>map(compilazione, CompilazioneRispostaDTO.class);
	}
	
	@Override
	public CompilazioneDTO Modifica(CompilazioneDTO dto) {
		Compilazione compilazione=this.GetById(idCompilazione);
		compilazione.ModificaCompilazione(note);
		Compilazione compilazioneSalvata=this.SaveOrUpdate(compilazione);
		return DTOMapper.getInstance().<CompilazioneDTO>map(compilazioneSalvata, CompilazioneDTO.class);
	}

	@Override
	public void AggiungiCompilazioneRisposta(CompilazioneRispostaDTO dto) {
		Compilazione compilazione=this.GetById(idCompilazione);
		compilazione.AggiungiCompilazioneRisposta(rispostaAssociata, valoreMatriceAssociato, rispostalibera, testolibero);
		this.SaveOrUpdate(compilazione);
	}

	@Override
	public void SetEnable(int idCompilazione) {
		Compilazione compilazione=this.GetById(idCompilazione);
		compilazione.setEnable();
		this.SaveOrUpdate(compilazione);
	}

	@Override
	public void SetDisable(int idCompilazione) {
		Compilazione compilazione=this.GetById(idCompilazione);
		compilazione.setDisable();
		this.SaveOrUpdate(compilazione);
	}

	@Override
	public CompilazioneRispostaDTO Modifica(CompilazioneRispostaDTO dto) {
		CompilazioneRisposta risposta=this.GetCompilazioneRispostaById(idCompilazioneRisposta);
		risposta.ModificaCompilazioneRisposta(rispostaAssociata, valoreMatriceAssociato, rispostalibera, testolibero);
		CompilazioneRisposta rispostaSalvata=this.SaveOrUpdate(risposta);
		return this.GetDTO(rispostaSalvata);
	}

	@Override
	public void Elimina(int idCompilazioneRisposta) {
		CompilazioneRisposta risposta=this.GetCompilazioneRispostaById(idCompilazioneRisposta);
		Repository.getInstance().<CompilazioneRisposta>Delete(risposta);
	}

}
