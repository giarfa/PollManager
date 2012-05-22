package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Sondaggio {
	
	private String titolo, descrizione;
	private boolean attivo;
	
	
	public Sondaggio(String titolo, String descrizione){
		this.titolo=titolo;
		this.descrizione=descrizione;
		attivo=true;
	}
	public void setDisable(Sondaggio sondaggio){
		sondaggio.attivo= false;
	}
	
	public void setEnable(Sondaggio sondaggio){
		sondaggio.attivo= true;
	}
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
	

}
