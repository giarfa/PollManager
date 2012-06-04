package domain;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public class Matrice extends Domanda {
	
	private ArrayList <ValoriMatrice> valorimatrice;

	public Matrice(){
		super();
		this.valorimatrice=new ArrayList<ValoriMatrice>();
	}
	
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param MaxCaratteri
	 * @param MinCaratteri
	 * @return
	 */
	public static Matrice CreaMatrice(int ordine, String testo, boolean isObbligatorio, Sondaggio sondaggioAssociato){
		Matrice matrice=new Matrice();
		matrice.ordine=ordine;
		matrice.testo=testo;
		matrice.isObbligatorio=isObbligatorio;
		matrice.sondaggioAssociato=sondaggioAssociato;
		return matrice;
	}

	public Matrice ModificaMatrice(int ordine, String testo, boolean isObbligatorio){
		this.ordine=ordine;
		this.testo=testo;
		this.isObbligatorio=isObbligatorio;
		
		return this;
	}
	
	public void AggiungiValoriMatrice(int ordine, String testo){
		ValoriMatrice valoriMatrice=ValoriMatrice.CreaValoriMatrice(this, ordine, testo);
		this.valorimatrice.add(valoriMatrice);
	}

	/**
	 * @return the valorimatrice
	 */
	public ArrayList<ValoriMatrice> getValorimatrice() {
		return valorimatrice;
	}

	/**
	 * @param valorimatrice the valorimatrice to set
	 */
	void setValorimatrice(ArrayList<ValoriMatrice> valorimatrice) {
		this.valorimatrice = valorimatrice;
	}
}