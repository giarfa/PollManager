package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Range extends Domanda {
	
	private int ValMin, ValMax;
	private String DescValMin, DescValMax; 
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
