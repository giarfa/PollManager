package domain;
/**
*
* @author 727826-729399
*/
public class Libera extends Domanda {
	
	private int MaxCaratteri;
	private int MinCaratteri;
	/**
	 * Costruttore di Libera
	 */
	public Libera(){
		super();
		this.idDomandaTipo=2;
	}
	
	/**
	 * Crea nuova domanda Libera
	 * @param ordine Ordine della Domanda nel Sondaggio 
	 * @param testo Testo della Domanda
	 * @param isObbligatorio Se ha Risposta obbligatoria
	 * @param MaxCaratteri Massimo numero caratteri Risposta
	 * @param MinCaratteri Minimo numero caratteri Risposta
	 * @param sondaggioAssociato Sondaggio associato alla Domanda
	 * @return this
	 */
	public static Libera CreaLibera(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri, Sondaggio sondaggioAssociato){
		Libera libera=new Libera();
		libera.ordine=ordine;
		libera.testo=testo;
		libera.isObbligatorio=isObbligatorio;
		libera.MaxCaratteri=MaxCaratteri;
		libera.MinCaratteri=MinCaratteri;
		libera.sondaggioAssociato=sondaggioAssociato;
		return libera;
	}

	/**
	 * Modifica domanda Libera esistente
	 * @param ordine Ordine della Domanda nel Sondaggio 
	 * @param testo Testo della Domanda
	 * @param isObbligatorio Se ha Risposta obbligatoria
	 * @param MaxCaratteri Massimo numero caratteri Risposta
	 * @param MinCaratteri Minimo numero caratteri Risposta
	 * @return this
	 */
	public Libera ModificaLibera(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri){
		this.ordine=ordine;
		this.testo=testo;
		this.isObbligatorio=isObbligatorio;
		this.MaxCaratteri=MaxCaratteri;
		this.MinCaratteri=MinCaratteri;
		return this;
	}

	/**
	 * @return the maxCaratteri
	 */
	public int getMaxCaratteri() {
		return MaxCaratteri;
	}

	/**
	 * @param maxCaratteri the maxCaratteri to set
	 */
	void setMaxCaratteri(int maxCaratteri) {
		MaxCaratteri = maxCaratteri;
	}

	/**
	 * @return the minCaratteri
	 */
	public int getMinCaratteri() {
		return MinCaratteri;
	}

	/**
	 * @param minCaratteri the minCaratteri to set
	 */
	void setMinCaratteri(int minCaratteri) {
		MinCaratteri = minCaratteri;
	}
	
	/**
	 * Valore massimo coerente con il minimo
	 * @return	true ok false ko
	 */
	public boolean correctValMinMaxChar(){
		if (this.MaxCaratteri>=this.MinCaratteri) return true;
		else return false;
	}
}
