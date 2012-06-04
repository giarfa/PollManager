package domain;
/**
 * 
 * @author Alberto
 *
 */
public class ValoriMatrice {

	private int idValoriMatrice;
	private Matrice matrice;
	private int ordine;
	private String testo;
	
	public ValoriMatrice() {
		this.idValoriMatrice=0;
	}
	
	public static ValoriMatrice CreaValoriMatrice(Matrice matrice, int ordine, String testo){
		ValoriMatrice valoriMatrice=new ValoriMatrice();
		valoriMatrice.matrice=matrice;
		valoriMatrice.ordine=ordine;
		valoriMatrice.testo=testo;
		
		return valoriMatrice;
	}
	
	public ValoriMatrice ModificaValoriMatrice(int ordine, String testo){
		this.ordine=ordine;
		this.testo=testo;
		
		return this;
	}

	/**
	 * @return the idValoriMatrice
	 */
	public int getIdValoriMatrice() {
		return idValoriMatrice;
	}

	/**
	 * @param idValoriMatrice the idValoriMatrice to set
	 */
	void setIdValoriMatrice(int idValoriMatrice) {
		this.idValoriMatrice = idValoriMatrice;
	}

	/**
	 * @return the matrice
	 */
	public Matrice getMatrice() {
		return matrice;
	}

	/**
	 * @param matrice the matrice to set
	 */
	void setMatrice(Matrice matrice) {
		this.matrice = matrice;
	}

	/**
	 * @return the ordine
	 */
	public int getOrdine() {
		return ordine;
	}

	/**
	 * @param ordine the ordine to set
	 */
	void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	/**
	 * @return the testo
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * @param testo the testo to set
	 */
	void setTesto(String testo) {
		this.testo = testo;
	}
}
