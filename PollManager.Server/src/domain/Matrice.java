package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Alberto
 *
 */
public class Matrice extends Domanda {
	
	@SuppressWarnings("rawtypes")
	private List valorimatrice;

	public Matrice(){
		super();
		this.idDomandaTipo=4;
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
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @return
	 */
	public Matrice ModificaMatrice(int ordine, String testo, boolean isObbligatorio){
		this.ordine=ordine;
		this.testo=testo;
		this.isObbligatorio=isObbligatorio;
		
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public void AggiungiValoriMatrice(int ordine, String testo){
		ValoriMatrice valoriMatrice=ValoriMatrice.CreaValoriMatrice(this, ordine, testo);
		this.valorimatrice.add(valoriMatrice);
	}

	/**
	 * @return the valorimatrice
	 */
	@SuppressWarnings("unchecked")
	public List<ValoriMatrice> getValorimatrice() {
		return valorimatrice;
	}

	/**
	 * @param valorimatrice the valorimatrice to set
	 */
	@SuppressWarnings("rawtypes")
	void setValorimatrice(List valorimatrice) {
		this.valorimatrice = valorimatrice;
	}
}