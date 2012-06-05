package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Libera extends Domanda {
	
	private int MaxCaratteri;
	private int MinCaratteri;

	public Libera(){
		super();
	}
	
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param MaxCaratteri
	 * @param MinCaratteri
	 * @return
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
	
	public boolean correctValMinMaxChar(){
		if (this.MaxCaratteri>=this.MinCaratteri) return true;
		else return false;
	}
}
