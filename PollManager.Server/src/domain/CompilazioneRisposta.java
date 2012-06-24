package domain;
/**
*
* @author 727826-729399
*/
public class CompilazioneRisposta {
	
	private int idCompilazioneRisposta;
	private String rispostalibera;
	private String testolibero;
	private String range;
	private Compilazione compilazioneAssociata;
	private Risposta rispostaAssociata;
	private ValoriMatrice valoreMatriceAssociato;
	
	/**
	 * Costruttore di Compilazione Risposta
	 */
	public CompilazioneRisposta() {
		this.idCompilazioneRisposta=-1;
	}
	/**
	 * Crea una nuova ComplizaioneRisposta
	 * @param compilazioneAssociata	Compilazione associata alla CompilazioneRisposta
	 * @param rispostaAssociata Risposta Associata
	 * @param valoreMatriceAssociato ValoreMatrice associate se domanda è una Matrice
	 * @param rispostalibera Se domanda Libera
	 * @param testolibero Se la risposta ha testo libero
	 * @param range Il valore della risposta alla domanda di tipo Range
	 * @return this
	 */
	public static CompilazioneRisposta CreaCompilazioneRisposta(Compilazione compilazioneAssociata, Risposta rispostaAssociata, ValoriMatrice valoreMatriceAssociato, String rispostalibera, String testolibero, String range){
		CompilazioneRisposta compilazioneRisposta=new CompilazioneRisposta();
		
		compilazioneRisposta.compilazioneAssociata=compilazioneAssociata;
		compilazioneRisposta.rispostaAssociata=rispostaAssociata;
		compilazioneRisposta.valoreMatriceAssociato=valoreMatriceAssociato;
		compilazioneRisposta.rispostalibera=rispostalibera;
		compilazioneRisposta.testolibero=testolibero;
		compilazioneRisposta.range=range;
		
		return compilazioneRisposta;
	}
	/**
	 * Modifaca CompilazioneRisposta esistente
	 * @param compilazioneAssociata	Compilazione associata alla CompilazioneRisposta
	 * @param rispostaAssociata Risposta Associata
	 * @param valoreMatriceAssociato ValoreMatrice associate se domanda è una Matrice
	 * @param rispostalibera Se domanda Libera
	 * @param testolibero Se la risposta ha testo libero
	 * @param range Il valore della risposta alla domanda di tipo Range
	 * @return this
	 */
	public CompilazioneRisposta ModificaCompilazioneRisposta(Risposta rispostaAssociata, ValoriMatrice valoreMatriceAssociato, String rispostalibera, String testolibero, String range){
		this.rispostaAssociata=rispostaAssociata;
		this.valoreMatriceAssociato=valoreMatriceAssociato;
		this.rispostalibera=rispostalibera;
		this.testolibero=testolibero;
		this.range=range;
		
		return this;
	}

	/**
	 * @return the idCompilazioneRisposta
	 */
	public int getIdCompilazioneRisposta() {
		return idCompilazioneRisposta;
	}

	/**
	 * @param idCompilazioneRisposta the idCompilazioneRisposta to set
	 */
	void setIdCompilazioneRisposta(int idCompilazioneRisposta) {
		this.idCompilazioneRisposta = idCompilazioneRisposta;
	}

	/**
	 * @return the rispostalibera
	 */
	public String getRispostalibera() {
		return rispostalibera;
	}

	/**
	 * @param rispostalibera the rispostalibera to set
	 */
	void setRispostalibera(String rispostalibera) {
		this.rispostalibera = rispostalibera;
	}

	/**
	 * @return the testolibero
	 */
	public String getTestolibero() {
		return testolibero;
	}

	/**
	 * @param testolibero the testolibero to set
	 */
	void setTestolibero(String testolibero) {
		this.testolibero = testolibero;
	}

	/**
	 * @return the compilazioneAssociata
	 */
	public Compilazione getCompilazioneAssociata() {
		return compilazioneAssociata;
	}

	/**
	 * @param compilazioneAssociata the compilazioneAssociata to set
	 */
	void setCompilazioneAssociata(Compilazione compilazioneAssociata) {
		this.compilazioneAssociata = compilazioneAssociata;
	}

	/**
	 * @return the rispostaAssociata
	 */
	public Risposta getRispostaAssociata() {
		return rispostaAssociata;
	}

	/**
	 * @param rispostaAssociata the rispostaAssociata to set
	 */
	void setRispostaAssociata(Risposta rispostaAssociata) {
		this.rispostaAssociata = rispostaAssociata;
	}

	/**
	 * @return the valoreMatriceAssociato
	 */
	public ValoriMatrice getValoreMatriceAssociato() {
		return valoreMatriceAssociato;
	}

	/**
	 * @param valoreMatriceAssociato the valoreMatriceAssociato to set
	 */
	void setValoreMatriceAssociato(ValoriMatrice valoreMatriceAssociato) {
		this.valoreMatriceAssociato = valoreMatriceAssociato;
	}
	
	public void setRange(String range) {
		this.range = range;
	}
	public String getRange() {
		return range;
	}
}
