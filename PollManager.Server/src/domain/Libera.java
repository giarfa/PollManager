package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Libera extends Domanda {
	
	private int MaxCaratteri, MinCaratteri;
	
	
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param MaxCaratteri
	 * @param MinCaratteri
	 */
	public Libera(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri){
		super.ordine=ordine;
		super.testo=testo;
		super.isObbligatorio=isObbligatorio;
		this.MaxCaratteri=MaxCaratteri;
		this.MinCaratteri=MinCaratteri;
		
	}

	/**
	 * 
	 * @return
	 */
	public int getMaxCaratteri() {
		return MaxCaratteri;
	}

	/**
	 * 
	 * @param maxCaratteri
	 */
	public void setMaxCaratteri(int maxCaratteri) {
		MaxCaratteri = maxCaratteri;
	}

	/**
	 * 
	 * @return
	 */
	public int getMinCaratteri() {
		return MinCaratteri;
	}

	/**
	 * 
	 * @param minCaratteri
	 */
	public void setMinCaratteri(int minCaratteri) {
		MinCaratteri = minCaratteri;
	}
	
	
}
