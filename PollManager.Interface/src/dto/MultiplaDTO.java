package dto;
/**
 * MultiplaDTO
 * @author 727826-729399
 * DTO per la classe di dominio {@link} Multipla usato solo per la trasmissione dei dati con rmi e socket
 */
public class MultiplaDTO extends DomandaDTO {
	
	private OrientamentoDTO orientamento;
	private boolean is_singola;
	private short NumMinRisp;
	
	public OrientamentoDTO getOrientamento() {
		return orientamento;
	}
	public void setOrientamento(OrientamentoDTO orientamento) {
		this.orientamento = orientamento;
	}
	public boolean isIs_singola() {
		return is_singola;
	}
	public void setIs_singola(boolean is_singola) {
		this.is_singola = is_singola;
	}
	public short getNumMinRisp() {
		return NumMinRisp;
	}
	public void setNumMinRisp(short numMinRisp) {
		NumMinRisp = numMinRisp;
	}
}
