package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Libera extends Domanda {
	
	private int MaxCaratteri, MinCaratteri;
	
	
	/**
	 * 
	 * @param ordine
	 * @param testo
	 * @param isObbligatorio
	 * @param MaxCaratteri
	 * @param MinCaratteri
	 */
	public Libera(){
		
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

	/**
	 * 
	 * @return
	 */
	public int getMaxCaratteri() {
		return MaxCaratteri;
	}

	
	/**
	 * 
	 * @return
	 */
	public int getMinCaratteri() {
		return MinCaratteri;
	}

	
	
	
}
