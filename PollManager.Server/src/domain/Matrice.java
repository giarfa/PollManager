package domain;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author 727826-729399
*/
public class Matrice extends Domanda {
	
	@SuppressWarnings("rawtypes")
	private List valorimatrice;

	/**
	 * Costruttore di Matrice
	 */
	public Matrice(){
		super();
		this.idDomandaTipo=4;
		this.valorimatrice=new ArrayList<ValoriMatrice>();
	}
	
	
	/**
	 * Crea nuova domanda Matrice
	 * @param ordine Ordine della Domanda nel Sondaggio 
	 * @param testo Testo della Domanda
	 * @param isObbligatorio Se ha Risposta obbligatoria
	 * @param sondaggioAssociato Sondaggio associato alla Domanda
	 * @return this
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
	 * Modifica domanda Matrice esistente
	  * @param ordine Ordine della Domanda nel Sondaggio 
	 * @param testo Testo della Domanda
	 * @param isObbligatorio Se ha Risposta obbligatoria
	 * @return
	 */
	public Matrice ModificaMatrice(int ordine, String testo, boolean isObbligatorio){
		this.ordine=ordine;
		this.testo=testo;
		this.isObbligatorio=isObbligatorio;
		
		return this;
	}
	/**
	 * Aggiunge ValoriMatrice alla Matrice
	 * @param ordine Ordine dei ValoriMatrice
	 * @param testo	Testo del ValoreMatrice
	 */
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