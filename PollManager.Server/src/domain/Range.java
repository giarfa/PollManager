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
	
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param ValMin
	 * @param ValMax
	 * @param DescValMin
	 * @param DescValMax
	 * @param isRispSingola
	 */
	public Range(int ordine, String testo, boolean isObbligatorio, int ValMin, int ValMax, String DescValMin, String DescValMax, boolean isRispSingola){
		super.ordine=ordine;
		super.testo=testo;
		super.isObbligatorio=isObbligatorio;
		this.ValMin=ValMin;
		this.ValMax=ValMax;
		this.DescValMin=DescValMin;
		this.DescValMax=DescValMax;
		this.isRispSingola=isRispSingola;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getValMin() {
		return ValMin;
	}
	
	/**
	 * 
	 * @param valMin
	 */
	public void setValMin(int valMin) {
		ValMin = valMin;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getValMax() {
		return ValMax;
	}
	
	/**
	 * 
	 * @param valMax
	 */
	public void setValMax(int valMax) {
		ValMax = valMax;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescValMin() {
		return DescValMin;
	}
	
	/**
	 * 
	 * @param descValMin
	 */
	public void setDescValMin(String descValMin) {
		DescValMin = descValMin;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescValMax() {
		return DescValMax;
	}
	
	/**
	 * 
	 * @param descValMax
	 */
	public void setDescValMax(String descValMax) {
		DescValMax = descValMax;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isRispSingola() {
		return isRispSingola;
	}
	
	/**
	 * 
	 * @param isRispSingola
	 */
	public void setRispSingola(boolean isRispSingola) {
		this.isRispSingola = isRispSingola;
	}
	
	
}
