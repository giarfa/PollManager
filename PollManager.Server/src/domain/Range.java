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
	 */
	public Range(){
		
	}
	
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
	 * @return
	 */
	
	
	public static Range CreaRange(int ordine, String testo, boolean isObbligatorio, int ValMin, int ValMax, String DescValMin, String DescValMax, boolean isRispSingola, Sondaggio sondaggioAssociato){
		Range range=new Range();
		range.ordine=ordine;
		range.testo=testo;
		range.isObbligatorio=isObbligatorio;
		range.ValMin=ValMin;
		range.ValMax=ValMax;
		range.DescValMin=DescValMin;
		range.DescValMax=DescValMax;
		range.isRispSingola=isRispSingola;
		range.sondaggioAssociato=sondaggioAssociato;
		return range;
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
	 * @return
	 */
	public int getValMax() {
		return ValMax;
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
	 * @return
	 */
	public String getDescValMax() {
		return DescValMax;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isRispSingola() {
		return isRispSingola;
	}
	
	
	
	
}
