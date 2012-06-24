package dto;

/**
 * MatriceDTO
 * @author 727826-729399
 * DTO per la classe di dominio {@link} Matrice usato solo per la trasmissione dei dati con rmi e socket
 */
import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public class MatriceDTO extends DomandaDTO {

	private ArrayList <ValoriMatriceDTO> valorimatrice;

	public void setValorimatrice(ArrayList <ValoriMatriceDTO> valorimatrice) {
		this.valorimatrice = valorimatrice;
	}

	public ArrayList <ValoriMatriceDTO> getValorimatrice() {
		return valorimatrice;
	}
}
