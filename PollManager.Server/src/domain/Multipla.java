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
		
		}
	
	public static Multipla CreaMultipla(int ordine, String testo, boolean isObbligatorio, Orientamento orientamento, boolean isSingola,int NumMinRisp){
		Multipla multipla=new Multipla();
		multipla.ordine=ordine;
		multipla.testo=testo;
		multipla.isObbligatorio=isObbligatorio;
		multipla.orientamento=orientamento;
		multipla.isSingola=isSingola;
		multipla.NumMinRisp=NumMinRisp;
		return multipla;
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
