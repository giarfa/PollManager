package domain;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public class Matrice extends Domanda {
	
	private ArrayList <ValoriMatrice> valorimatrice= new ArrayList<ValoriMatrice>();
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param MaxCaratteri
	 * @param MinCaratteri
	 */
	
	
	public Matrice(){
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
	public static Matrice CreaMatrice(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri, Sondaggio sondaggioAssociato){
		Matrice matrice=new Matrice();
		matrice.ordine=ordine;
		matrice.testo=testo;
		matrice.isObbligatorio=isObbligatorio;
		matrice.sondaggioAssociato=sondaggioAssociato;
		return matrice;
	}

}
