package domain;
/**
 * 
 * @author Alberto
 *
 */
public abstract class Domanda {

	protected int ordine;
	protected String testo;
	protected boolean isObbligatorio;
	
	/**
	 * 
	 * @return
	 */
	public int getOrdine() {
		return ordine;
	}
	
	/**
	 * 
	 * @param ordine
	 */
	public void setOrdine(int ordine) {
		this.ordine = ordine;
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
	 * @param testo
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isObbligatorio() {
		return isObbligatorio;
	}
	
	/**
	 * 
	 * @param isObbligatorio
	 */
	public void setObbligatorio(boolean isObbligatorio) {
		this.isObbligatorio = isObbligatorio;
	}
	
}
