package dto;
/**
 * 
 * @author Alberto
 *
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
