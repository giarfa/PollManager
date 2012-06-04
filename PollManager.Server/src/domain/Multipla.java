package domain;

import domain.Orientamento;
/**
 * 
 * @author Alberto
 *
 */
public class Multipla extends Domanda {
	
	private Orientamento orientamento;
	private boolean isSingola;
	private int NumMinRisp;
	
	/**
	 * 
	 */
	public Multipla(){
		super();
	}
	
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
	public boolean isSingola() {
		return isSingola;
	}

	/**
	 * @param isSingola the isSingola to set
	 */
	void setSingola(boolean isSingola) {
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
