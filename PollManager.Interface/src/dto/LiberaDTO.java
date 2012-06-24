package dto;
/**
 * LiberaDTO
 * @author 727826-729399
 * DTO per la classe di dominio {@link} Libera usato solo per la trasmissione dei dati con rmi e socket
 */
public class LiberaDTO extends DomandaDTO {

	private int MaxCaratteri;
	private int MinCaratteri;
	
	public int getMaxCaratteri() {
		return MaxCaratteri;
	}
	public void setMaxCaratteri(int maxCaratteri) {
		MaxCaratteri = maxCaratteri;
	}
	public int getMinCaratteri() {
		return MinCaratteri;
	}
	public void setMinCaratteri(int minCaratteri) {
		MinCaratteri = minCaratteri;
	}
}
