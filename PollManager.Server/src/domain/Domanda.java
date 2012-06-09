package domain;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public abstract class Domanda {

	protected int idDomanda;
	protected int ordine;
	protected String testo;
	protected boolean isObbligatorio;
	protected Sondaggio sondaggioAssociato;
	protected boolean attivo;
	protected ArrayList <Risposta> risposte;
	
	protected Domanda() {
		this.idDomanda=0;
		this.attivo=true;
		this.risposte=new ArrayList<Risposta>();
	}
	
	public void AggiungiRisposta(int ordine, String testo, boolean hasTestoLibero, boolean isNonRisponde){
		Risposta risposta=Risposta.CreaRisposta(ordine, testo, hasTestoLibero, isNonRisponde, this);
		this.risposte.add(risposta);
	}
	
	public void setEnable(){
		this.attivo=true;
	}
	
	public void setDisable(){
		this.attivo=false;
	}

	/**
	 * @return the attivo
	 */
	public boolean isAttivo() {
		return attivo;
	}

	/**
	 * @param attivo the attivo to set
	 */
	void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	/**
	 * @return the idDomanda
	 */
	public int getIdDomanda() {
		return idDomanda;
	}

	/**
	 * @param idDomanda the idDomanda to set
	 */
	void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}

	/**
	 * @return the ordine
	 */
	public int getOrdine() {
		return ordine;
	}

	/**
	 * @param ordine the ordine to set
	 */
	void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	/**
	 * @return the testo
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * @param testo the testo to set
	 */
	void setTesto(String testo) {
		this.testo = testo;
	}

	/**
	 * @return the isObbligatorio
	 */
	public boolean isObbligatorio() {
		return isObbligatorio;
	}

	/**
	 * @param isObbligatorio the isObbligatorio to set
	 */
	void setObbligatorio(boolean isObbligatorio) {
		this.isObbligatorio = isObbligatorio;
	}

	/**
	 * @return the sondaggioAssociato
	 */
	public Sondaggio getSondaggioAssociato() {
		return sondaggioAssociato;
	}

	/**
	 * @param sondaggioAssociato the sondaggioAssociato to set
	 */
	void setSondaggioAssociato(Sondaggio sondaggioAssociato) {
		this.sondaggioAssociato = sondaggioAssociato;
	}

	/**
	 * @return the risposte
	 */
	public ArrayList<Risposta> getRisposte() {
		return risposte;
	}

	/**
	 * @param risposte the risposte to set
	 */
	void setRisposte(ArrayList<Risposta> risposte) {
		this.risposte = risposte;
	}
}
