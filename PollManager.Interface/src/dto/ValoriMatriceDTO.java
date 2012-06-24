package dto;

/**
 * ValoriMatriceDTO
 * @author 727826-729399
 * DTO per la classe di dominio {@link} ValoriMatrice usato solo per la trasmissione dei dati con rmi e socket
 */
public class ValoriMatriceDTO {
	
	private int idValoriMatrice;
	private int matriceIdDomanda;
	private int ordine;
	private String testo;
	
	public int getIdValoriMatrice() {
		return idValoriMatrice;
	}
	public void setIdValoriMatrice(int idValoriMatrice) {
		this.idValoriMatrice = idValoriMatrice;
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
	public void setMatriceIdDomanda(int matriceIdDomanda) {
		this.matriceIdDomanda = matriceIdDomanda;
	}
	public int getMatriceIdDomanda() {
		return matriceIdDomanda;
	}
}
