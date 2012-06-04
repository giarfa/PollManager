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
		super();
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
	
	public Range ModificaRange(int ordine, String testo, boolean isObbligatorio, int ValMin, int ValMax, String DescValMin, String DescValMax, boolean isRispSingola){
		this.ordine=ordine;
		this.testo=testo;
		this.isObbligatorio=isObbligatorio;
		this.ValMin=ValMin;
		this.ValMax=ValMax;
		this.DescValMin=DescValMin;
		this.DescValMax=DescValMax;
		this.isRispSingola=isRispSingola;
		return this;
	}

	/**
	 * @return the valMin
	 */
	public int getValMin() {
		return ValMin;
	}

	/**
	 * @param valMin the valMin to set
	 */
	void setValMin(int valMin) {
		ValMin = valMin;
	}

	/**
	 * @return the valMax
	 */
	public int getValMax() {
		return ValMax;
	}

	/**
	 * @param valMax the valMax to set
	 */
	void setValMax(int valMax) {
		ValMax = valMax;
	}

	/**
	 * @return the descValMin
	 */
	public String getDescValMin() {
		return DescValMin;
	}

	/**
	 * @param descValMin the descValMin to set
	 */
	void setDescValMin(String descValMin) {
		DescValMin = descValMin;
	}

	/**
	 * @return the descValMax
	 */
	public String getDescValMax() {
		return DescValMax;
	}

	/**
	 * @param descValMax the descValMax to set
	 */
	void setDescValMax(String descValMax) {
		DescValMax = descValMax;
	}

	/**
	 * @return the isRispSingola
	 */
	public boolean isRispSingola() {
		return isRispSingola;
	}

	/**
	 * @param isRispSingola the isRispSingola to set
	 */
	void setRispSingola(boolean isRispSingola) {
		this.isRispSingola = isRispSingola;
	}
}
