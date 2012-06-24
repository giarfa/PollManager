package dto;

public class RispostaDTO {

	private int idRisposta;
	private int ordine;	
	private String testo;
	private boolean hasTestoLibero;
	private boolean isNonRisponde;
	private boolean attivo;
	private int domandaAssociataIdDomanda;
	
	/**
	 * @return the idRisposta
	 */
	public int getIdRisposta() {
		return idRisposta;
	}
	/**
	 * @param idRisposta the idRisposta to set
	 */
	public void setIdRisposta(int idRisposta) {
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
	public void setOrdine(int ordine) {
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
	public void setTesto(String testo) {
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
	public void setHasTestoLibero(boolean hasTestoLibero) {
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
	public void setNonRisponde(boolean isNonRisponde) {
		this.isNonRisponde = isNonRisponde;
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
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public void setDomandaAssociataIdDomanda(int domandaAssociataIdDomanda) {
		this.domandaAssociataIdDomanda = domandaAssociataIdDomanda;
	}
	public int getDomandaAssociataIdDomanda() {
		return domandaAssociataIdDomanda;
	}
	@Override
	public String toString() {
		return testo + ", ordine=" + ordine
				+ ", attivo=" + attivo;
	}
}
