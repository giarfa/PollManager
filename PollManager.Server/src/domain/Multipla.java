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
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param orientamento
	 * @param isSingola
	 * @param NumMinRisp
	 */
	public Multipla(int ordine, String testo, boolean isObbligatorio, Orientamento orientamento, boolean isSingola,int NumMinRisp){
		super.ordine=ordine;
		super.testo=testo;
		super.isObbligatorio=isObbligatorio;
		this.orientamento=orientamento;
		this.isSingola=isSingola;
		this.NumMinRisp=NumMinRisp;
		}
	
	/**
	 * 
	 * @return
	 */
	public Orientamento getOrientamento() {
		return orientamento;
	}
	
	/**
	 * 
	 * @param orientamento
	 */
	public void setOrientamento(Orientamento orientamento) {
		this.orientamento = orientamento;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSingola() {
		return isSingola;
	}
	
	/**
	 * 
	 * @param isSingola
	 */
	public void setSingola(boolean isSingola) {
		this.isSingola = isSingola;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumMinRisp() {
		return NumMinRisp;
	}
	
	/**
	 * 
	 * @param NumMinRisp
	 */
	public void setNumMinRisp(int NumMinRisp) {
		this.NumMinRisp = NumMinRisp;
	}
	
	
	
}
