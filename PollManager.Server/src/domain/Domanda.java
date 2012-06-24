package domain;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author 727826-729399
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
	
	/**
	 * Costruttore di Domanda
	 */
	public Domanda() {
		this.idDomanda=-1;
		this.attivo=true;
		this.risposte=new ArrayList<Risposta>();
	}
	/**
	 * Aggiungi Risposta alla Domanda
	 * @param ordine Ordine della Risposta
	 * @param testo Testo della Risposta
	 * @param hasTestoLibero se la risposta ha testo libero
	 * @param isNonRisponde Se la Risposta è vuota;
	 */
	@SuppressWarnings("unchecked")
	public void AggiungiRisposta(int ordine, String testo, boolean hasTestoLibero, boolean isNonRisponde){
		Risposta risposta=Risposta.CreaRisposta(ordine, testo, hasTestoLibero, isNonRisponde, this);
		this.risposte.add(risposta);
	}
	
	/**
	 * Abilita Risposta
	 */
	public void setEnable(){
		this.attivo=true;
	}
	/**
	 * Disabilita Risposta
	 */
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
	 * Lista delle Risposte
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
	/**
	*
	*
	 */
	public int getIdDomandaTipo() {
		return idDomandaTipo;
	}
	/**
	 * 
	 * @param idDomandaTipo
	 */
	void setIdDomandaTipo(int idDomandaTipo) {
		this.idDomandaTipo = idDomandaTipo;
	}
}
