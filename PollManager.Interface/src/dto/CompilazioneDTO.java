package dto;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Alberto
 *
 */
public class CompilazioneDTO {
	
	private int idCompilazione;
	private Date datacompilazione;
	private String note;
	private boolean isdefinitiva;
	private boolean attivo;
	private UtenteDTO utenteAssociato;
	private int sondaggioAssociatoIdSondaggio;
	private ArrayList <CompilazioneRispostaDTO> compilazionirisposta;
	
	public int getIdCompilazione() {
		return idCompilazione;
	}
	public void setIdCompilazione(int idCompilazione) {
		this.idCompilazione = idCompilazione;
	}
	public Date getDatacompilazione() {
		return datacompilazione;
	}
	public void setDatacompilazione(Date datacompilazione) {
		this.datacompilazione = datacompilazione;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public boolean isIsdefinitiva() {
		return isdefinitiva;
	}
	public void setIsdefinitiva(boolean isdefinitiva) {
		this.isdefinitiva = isdefinitiva;
	}
	public boolean isAttivo() {
		return attivo;
	}
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public UtenteDTO getUtenteAssociato() {
		return utenteAssociato;
	}
	public void setUtenteAssociato(UtenteDTO utenteAssociato) {
		this.utenteAssociato = utenteAssociato;
	}
	public ArrayList<CompilazioneRispostaDTO> getCompilazionirisposta() {
		return compilazionirisposta;
	}
	public void setCompilazionirisposta(
			ArrayList<CompilazioneRispostaDTO> compilazionirisposta) {
		this.compilazionirisposta = compilazionirisposta;
	}
	public void setSondaggioAssociatoIdSondaggio(
			int sondaggioAssociatoIdSondaggio) {
		this.sondaggioAssociatoIdSondaggio = sondaggioAssociatoIdSondaggio;
	}
	public int getSondaggioAssociatoIdSondaggio() {
		return sondaggioAssociatoIdSondaggio;
	}
}
