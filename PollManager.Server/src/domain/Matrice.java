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
	public static Matrice CreaMatrice(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri){
		Matrice matrice=new Matrice();
		matrice.ordine=ordine;
		matrice.testo=testo;
		matrice.isObbligatorio=isObbligatorio;
		return matrice;
	}

}
