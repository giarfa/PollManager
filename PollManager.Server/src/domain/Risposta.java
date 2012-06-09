package domain;

public class Risposta {
	
	private int idRisposta;
	private int ordine;	
	private String testo;
	private boolean hasTestoLibero;
	private boolean isNonRisponde;
	private boolean attivo;
	private Domanda domandaAssociata;
	
	public Risposta() {
		this.idRisposta=0;
		this.attivo=true;
	}
	
	public static Risposta CreaRisposta(int ordine, String testo, boolean hasTestoLibero, boolean isNonRisponde, Domanda domandaAssociata){
		Risposta risposta= new Risposta();
		risposta.ordine=ordine;
		risposta.testo=testo;
		risposta.hasTestoLibero=hasTestoLibero;
		risposta.isNonRisponde=isNonRisponde;
		risposta.domandaAssociata=domandaAssociata;
		return risposta;
	}

	public Risposta ModificaRisposta(int ordine, String testo, boolean hasTestoLibero, boolean isNonRisponde, Domanda domandaAssociata)
	{
		this.ordine=ordine;
		this.testo=testo;
		this.hasTestoLibero=hasTestoLibero;
		this.isNonRisponde=isNonRisponde;
		this.domandaAssociata=domandaAssociata;
		return this;
	}
	
	public void setEnable(){
		this.attivo=true;
	}
	
	public void setDisable(){
		this.attivo=false;
	}
	
	/**
	 * @return the attivo
	 */
	public boolean isAttivo() {
		return attivo;
	}

	/**
	 * @param attivo the attivo to set
	 */
	void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	/**
	 * @return the idRisposta
	 */
	public int getIdRisposta() {
		return idRisposta;
	}

	/**
	 * @param idRisposta the idRisposta to set
	 */
	void setIdRisposta(int idRisposta) {
		this.idRisposta = idRisposta;
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

	/**
	 * @return the hasTestoLibero
	 */
	public boolean isHasTestoLibero() {
		return hasTestoLibero;
	}

	/**
	 * @param hasTestoLibero the hasTestoLibero to set
	 */
	void setHasTestoLibero(boolean hasTestoLibero) {
		this.hasTestoLibero = hasTestoLibero;
	}

	/**
	 * @return the isNonRisponde
	 */
	public boolean isNonRisponde() {
		return isNonRisponde;
	}

	/**
	 * @param isNonRisponde the isNonRisponde to set
	 */
	void setNonRisponde(boolean isNonRisponde) {
		this.isNonRisponde = isNonRisponde;
	}

	/**
	 * @return the domandaAssociata
	 */
	public Domanda getDomandaAssociata() {
		return domandaAssociata;
	}

	/**
	 * @param domandaAssociata the domandaAssociata to set
	 */
	void setDomandaAssociata(Domanda domandaAssociata) {
		this.domandaAssociata = domandaAssociata;
	}
}
