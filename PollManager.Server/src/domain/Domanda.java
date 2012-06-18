package domain;

import java.util.ArrayList;
import java.util.List;

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
	protected int idDomandaTipo;
	@SuppressWarnings("rawtypes")
	protected List risposte;
	
	public Domanda() {
		this.idDomanda=-1;
		this.attivo=true;
		this.risposte=new ArrayList<Risposta>();
	}
	
	@SuppressWarnings("unchecked")
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
	public boolean getAttivo() {
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
	public boolean getIsObbligatorio() {
		return isObbligatorio;
	}

	/**
	 * @param isObbligatorio the isObbligatorio to set
	 */
	void setIsObbligatorio(boolean isObbligatorio) {
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
	@SuppressWarnings("unchecked")
	public List<Risposta> getRisposte() {
		return risposte;
	}

	/**
	 * @param risposte the risposte to set
	 */
	@SuppressWarnings("rawtypes")
	void setRisposte(List risposte) {
		this.risposte = risposte;
	}

	public int getIdDomandaTipo() {
		return idDomandaTipo;
	}

	void setIdDomandaTipo(int idDomandaTipo) {
		this.idDomandaTipo = idDomandaTipo;
	}
}
