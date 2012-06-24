package dto;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public class DomandaDTO {
	private int idDomanda;
	private int ordine;
	private String testo;
	private boolean isObbligatorio;
	private int sondaggioAssociatoIdSondaggio;
	private boolean attivo;
	private ArrayList <RispostaDTO> risposte;
	
	public int getIdDomanda() {
		return idDomanda;
	}
	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}
	public int getOrdine() {
		return ordine;
	}
	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public boolean isObbligatorio() {
		return isObbligatorio;
	}
	public void setObbligatorio(boolean isObbligatorio) {
		this.isObbligatorio = isObbligatorio;
	}
	public boolean isAttivo() {
		return attivo;
	}
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public ArrayList<RispostaDTO> getRisposte() {
		return risposte;
	}
	public void setRisposte(ArrayList<RispostaDTO> risposte) {
		this.risposte = risposte;
	}
	public void setSondaggioAssociatoIdSondaggio(
			int sondaggioAssociatoIdSondaggio) {
		this.sondaggioAssociatoIdSondaggio = sondaggioAssociatoIdSondaggio;
	}
	public int getSondaggioAssociatoIdSondaggio() {
		return sondaggioAssociatoIdSondaggio;
	}
	@Override
	public String toString() {
		return testo + ", ordine=" + ordine
				+ ", attivo=" + attivo;
	}
}
