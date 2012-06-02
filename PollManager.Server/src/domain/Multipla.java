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
	 * 
	 * @return
	 */
	
	
	public Orientamento getOrientamento() {
		return orientamento;
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
	 * @return
	 */
	public int getNumMinRisp() {
		return NumMinRisp;
	}
	
	
	
	
	
}
