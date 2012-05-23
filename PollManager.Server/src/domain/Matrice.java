package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Matrice extends Domanda {
	
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param MaxCaratteri
	 * @param MinCaratteri
	 */
	
	
	public Matrice(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri){
		super.ordine=ordine;
		super.testo=testo;
		super.isObbligatorio=isObbligatorio;
	}

}
