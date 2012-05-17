package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Domanda {
	
	private int ordine;
	private String testo;
	private boolean isObbligatorio;
	
	public int getOrdine() {
		return ordine;
	}
	
	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}
	
	public String getTesto() {
		return testo;
	}
	
	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	public boolean isObbligatorio() {
		return isObbligatorio;
	}
	
	public void setObbligatorio(boolean isObbligatorio) {
		this.isObbligatorio = isObbligatorio;
	}
	
}
