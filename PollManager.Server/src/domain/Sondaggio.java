package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Sondaggio {
	
	private String titolo, descrizione;
	private boolean attivo;
	
	/**
	 * 
	 * @return
	 */
	public String getTitolo() {
		return titolo;
	}
	/**
	 * 
	 * @param titolo
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	/**
	 * 
	 * @return
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * 
	 * @param descrizione
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isAttivo() {
		return attivo;
	}
	/**
	 * 
	 * @param attivo
	 */
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	

}
