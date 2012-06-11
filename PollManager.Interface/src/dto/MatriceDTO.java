package dto;

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
