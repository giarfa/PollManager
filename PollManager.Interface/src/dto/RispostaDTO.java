package dto;
/**
 * RispostaDTO
 * @author 727826-729399
 * DTO per la classe di dominio {@link} Risposta usato solo per la trasmissione dei dati con rmi e socket
 */

public class RispostaDTO {

	private int idRisposta;
	private int ordine;	
	private String testo;
	private boolean hasTestoLibero;
	private boolean isNonRisponde;
	private boolean attivo;
	private int domandaAssociataIdDomanda;
	
	
	public int getIdRisposta() {
		return idRisposta;
	}
	
	public void setIdRisposta(int idRisposta) {
		this.idRisposta = idRisposta;
	}
	
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
	
	public boolean isHasTestoLibero() {
		return hasTestoLibero;
	}
	
	public void setHasTestoLibero(boolean hasTestoLibero) {
		this.hasTestoLibero = hasTestoLibero;
	}
	
	public boolean isNonRisponde() {
		return isNonRisponde;
	}
	
	public void setNonRisponde(boolean isNonRisponde) {
		this.isNonRisponde = isNonRisponde;
	}
	
	public boolean isAttivo() {
		return attivo;
	}
	
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
