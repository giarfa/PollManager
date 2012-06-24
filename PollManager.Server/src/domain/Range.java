package domain;
/**
* Range
* @author 727826-729399
*/
public class Range extends Domanda {
	
	private int ValMin;
	private int ValMax;
	private String DescValMin;
	private String DescValMax; 
	private boolean isRispSingola;
	
	/**
	 * Costruttore
	 */
	public Range(){
		super();
		this.idDomandaTipo=3;
	}
	
	/**
	 * Crea Range
	 * @param ordine ordine domanda
	 * @param testo Testo domanda
	 * @param isObbligatorio
	 * @param ValMin Valore minimo Range
	 * @param ValMax Valore massimo Range
	 * @param DescValMin Descrizione valore minimo range
	 * @param DescValMax Descrizione valore massimo range
	 * @param isRispSingola se risposta singola
	 * @param sondaggioassociato Sondaggio associato alla domanda
	 * @return this
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
	 * Modifica range
	 * @param ordine ordine domanda
	 * @param testo Testo domanda
	 * @param isObbligatorio
	 * @param ValMin Valore minimo Range
	 * @param ValMax Valore massimo Range
	 * @param DescValMin Descrizione valore minimo range
	 * @param DescValMax Descrizione valore massimo range
	 * @param isRispSingola se risposta singola
	 * @return
	 */
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
	public boolean getIsRispSingola() {
		return isRispSingola;
	}

	/**
	 * @param isRispSingola the isRispSingola to set
	 */
	void setIsRispSingola(boolean isRispSingola) {
		this.isRispSingola = isRispSingola;
	}
	
	
	/**
	 * 
	 * @return true se ValMin< ValMax
	 */
	public boolean correctVal(){
		if (this.ValMax>this.ValMin) return true;
		else return false;
	}
}
