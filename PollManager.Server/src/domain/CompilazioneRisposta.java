package domain;
/**
 * 
 * @author Alberto
 *
 */
public class CompilazioneRisposta {
	
	private int idCompilazioneRisposta;
	private String rispostalibera;
	private String testolibero;
	private Compilazione compilazioneAssociata;
	private Risposta rispostaAssociata;
	private ValoriMatrice valoreMatriceAssociato;
	
	public CompilazioneRisposta() {
		this.idCompilazioneRisposta=0;
	}
	
	public static CompilazioneRisposta CreaCompilazioneRisposta(Compilazione compilazioneAssociata, Risposta rispostaAssociata, ValoriMatrice valoreMatriceAssociato, String rispostalibera, String testolibero){
		CompilazioneRisposta compilazioneRisposta=new CompilazioneRisposta();
		
		compilazioneRisposta.compilazioneAssociata=compilazioneAssociata;
		compilazioneRisposta.rispostaAssociata=rispostaAssociata;
		compilazioneRisposta.valoreMatriceAssociato=valoreMatriceAssociato;
		compilazioneRisposta.rispostalibera=rispostalibera;
		compilazioneRisposta.testolibero=testolibero;
		
		return compilazioneRisposta;
	}
	
	public CompilazioneRisposta ModificaCompilazioneRisposta(Risposta rispostaAssociata, ValoriMatrice valoreMatriceAssociato, String rispostalibera, String testolibero){
		this.rispostaAssociata=rispostaAssociata;
		this.valoreMatriceAssociato=valoreMatriceAssociato;
		this.rispostalibera=rispostalibera;
		this.testolibero=testolibero;
		
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
}
