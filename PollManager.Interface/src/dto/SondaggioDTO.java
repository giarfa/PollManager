package dto;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public class SondaggioDTO {
	
	private int idSondaggio;
	private String titolo;
	private String descrizione;
	private boolean attivo;
	private ArrayList <DomandaDTO> domande;
	private ArrayList <CompilazioneDTO> compilazioni;
	
	public int getIdSondaggio() {
		return idSondaggio;
	}
	public void setIdSondaggio(int idSondaggio) {
		this.idSondaggio = idSondaggio;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public boolean isAttivo() {
		return attivo;
	}
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public ArrayList<DomandaDTO> getDomande() {
		return domande;
	}
	public void setDomande(ArrayList<DomandaDTO> domande) {
		this.domande = domande;
	}
	public ArrayList<CompilazioneDTO> getCompilazioni() {
		return compilazioni;
	}
	public void setCompilazioni(ArrayList<CompilazioneDTO> compilazioni) {
		this.compilazioni = compilazioni;
	}
	@Override
	public String toString() {
		return "titolo=" + titolo + ", descrizione="
				+ descrizione + ", attivo=" + attivo;
	}
}
