package dto;
/**
 * RangeDTO
 * @author 727826-729399
 * DTO per la classe di dominio {@link} Range usato solo per la trasmissione dei dati con rmi e socket
 */
public class RangeDTO extends DomandaDTO {

	private int ValMin;
	private int ValMax;
	private String DescValMin;
	private String DescValMax; 
	private boolean isRispSingola;
	
	public int getValMin() {
		return ValMin;
	}
	public void setValMin(int valMin) {
		ValMin = valMin;
	}
	public int getValMax() {
		return ValMax;
	}
	public void setValMax(int valMax) {
		ValMax = valMax;
	}
	public String getDescValMin() {
		return DescValMin;
	}
	public void setDescValMin(String descValMin) {
		DescValMin = descValMin;
	}
	public String getDescValMax() {
		return DescValMax;
	}
	public void setDescValMax(String descValMax) {
		DescValMax = descValMax;
	}
	public boolean isRispSingola() {
		return isRispSingola;
	}
	public void setRispSingola(boolean isRispSingola) {
		this.isRispSingola = isRispSingola;
	}
}
