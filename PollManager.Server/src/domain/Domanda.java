package domain;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public abstract class Domanda {

	protected int ordine;
	protected String testo;
	protected boolean isObbligatorio;
	protected Sondaggio sondaggioAssociato;
	protected ArrayList <Risposta> risposte= new ArrayList<Risposta>();
	
	/**
	 * 
	 * @return
	 */
	public int getOrdine() {
		return ordine;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public String getTesto() {
		return testo;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isObbligatorio() {
		return isObbligatorio;
	}
	
	
	
}
