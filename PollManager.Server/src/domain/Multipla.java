package domain;

import domain.Orientamento;
/**
*
* @author 727826-729399
*/
public class Multipla extends Domanda {
	
	private Orientamento orientamento;
	private boolean isSingola;
	private int NumMinRisp;
	
	/**
	 * Costruttore di Multipla
	 */
	public Multipla(){
		super();
		this.idDomandaTipo=1;
	}
	/**
	 * Crea nuova domanda Multipla
	 ** @param ordine Ordine della Domanda nel Sondaggio 
	 * @param testo Testo della Domanda
	 * @param isObbligatorio Se ha Risposta obbligatoria
	 * @param orientamento Orientamento della domanda(Orrizontale o Verticale)
	 * @param isSingola Se consentita singola Rispista
	 * @param NumMinRisp Numero minimo Risposte
	* @param sondaggioAssociato Sondaggio associato alla Domanda
	 * @return this
	 */
	public static Multipla CreaMultipla(int ordine, String testo, boolean isObbligatorio, Orientamento orientamento, boolean isSingola,int NumMinRisp, Sondaggio sondaggioAssociato){
		Multipla multipla=new Multipla();
		multipla.ordine=ordine;
		multipla.testo=testo;
		multipla.isObbligatorio=isObbligatorio;
		multipla.orientamento=orientamento;
		multipla.isSingola=isSingola;
		multipla.NumMinRisp=NumMinRisp;
		multipla.sondaggioAssociato=sondaggioAssociato;
		return multipla;
	}
	/**
	 * Modifica domanda Multipla esistente
	 ** @param ordine Ordine della Domanda nel Sondaggio 
	 * @param testo Testo della Domanda
	 * @param isObbligatorio Se ha Risposta obbligatoria
	 * @param orientamento Orientamento della domanda(Orrizontale o Verticale)
	 * @param isSingola Se consentita singola Rispista
	 * @param NumMinRisp Numero minimo Risposte
	 * @return
	 */
	public Multipla ModificaMultipla(int ordine, String testo, boolean isObbligatorio, Orientamento orientamento, boolean isSingola,int NumMinRisp){
		this.ordine=ordine;
		this.testo=testo;
		this.isObbligatorio=isObbligatorio;
		this.orientamento=orientamento;
		this.isSingola=isSingola;
		this.NumMinRisp=NumMinRisp;
		return this;
	}

	/**
	 * @return the orientamento
	 */
	public Orientamento getOrientamento() {
		return orientamento;
	}

	/**
	 * @param orientamento the orientamento to set
	 */
	void setOrientamento(Orientamento orientamento) {
		this.orientamento = orientamento;
	}

	/**
	 * @return the isSingola
	 */
	public boolean getIsSingola() {
		return isSingola;
	}

	/**
	 * @param isSingola the isSingola to set
	 */
	void setIsSingola(boolean isSingola) {
		this.isSingola = isSingola;
	}

	/**
	 * @return the numMinRisp
	 */
	public int getNumMinRisp() {
		return NumMinRisp;
	}

	/**
	 * @param numMinRisp the numMinRisp to set
	 */
	void setNumMinRisp(int numMinRisp) {
		NumMinRisp = numMinRisp;
	}
}
