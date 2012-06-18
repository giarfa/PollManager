package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Compilazione {
	
	private int idCompilazione;
	private Date datacompilazione;
	private String note;
	private boolean isdefinitiva;
	private boolean attivo;
	private Utente utenteAssociato;
	private Sondaggio sondaggioAssociato;
	@SuppressWarnings("rawtypes")
	private List compilazionirisposta;
	
	public Compilazione() {
		this.idCompilazione=-1;
		this.datacompilazione=new Date();
		this.isdefinitiva=false;
		this.attivo=true;
		this.compilazionirisposta=new ArrayList<CompilazioneRisposta>();
	}
	
	public static Compilazione CreaCompilazione(Sondaggio sondaggioAssociato, Utente utenteAssociato, String note){
		Compilazione compilazione=new Compilazione();
		
		compilazione.sondaggioAssociato=sondaggioAssociato;
		compilazione.utenteAssociato=utenteAssociato;
		compilazione.note=note;
		
		return compilazione;
	}
	
	public Compilazione ModificaCompilazione(String note){
		this.note=note;
		
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public void AggiungiCompilazioneRisposta(Risposta rispostaAssociata, ValoriMatrice valoreMatriceAssociato, String rispostalibera, String testolibero){
		CompilazioneRisposta compilazione=CompilazioneRisposta.CreaCompilazioneRisposta(this, rispostaAssociata, valoreMatriceAssociato, rispostalibera, testolibero);
		this.compilazionirisposta.add(compilazione);
	}
	
	public void setEnable(){
		this.attivo=true;
	}
	
	public void setDisable(){
		this.attivo=false;
	}
	
	/**
	 * @return the attivo
	 */
	public boolean isAttivo() {
		return attivo;
	}

	/**
	 * @param attivo the attivo to set
	 */
	void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	/**
	 * @return the idCompilazione
	 */
	public int getIdCompilazione() {
		return idCompilazione;
	}

	/**
	 * @param idCompilazione the idCompilazione to set
	 */
	void setIdCompilazione(int idCompilazione) {
		this.idCompilazione = idCompilazione;
	}

	/**
	 * @return the datacompilazione
	 */
	public Date getDatacompilazione() {
		return datacompilazione;
	}

	/**
	 * @param datacompilazione the datacompilazione to set
	 */
	void setDatacompilazione(Date datacompilazione) {
		this.datacompilazione = datacompilazione;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the isdefinitiva
	 */
	public boolean isIsdefinitiva() {
		return isdefinitiva;
	}

	/**
	 * @param isdefinitiva the isdefinitiva to set
	 */
	void setIsdefinitiva(boolean isdefinitiva) {
		this.isdefinitiva = isdefinitiva;
	}

	/**
	 * @return the utenteAssociato
	 */
	public Utente getUtenteAssociato() {
		return utenteAssociato;
	}

	/**
	 * @param utenteAssociato the utenteAssociato to set
	 */
	void setUtenteAssociato(Utente utenteAssociato) {
		this.utenteAssociato = utenteAssociato;
	}

	/**
	 * @return the sondaggioAssociato
	 */
	public Sondaggio getSondaggioAssociato() {
		return sondaggioAssociato;
	}

	/**
	 * @param sondaggioAssociato the sondaggioAssociato to set
	 */
	void setSondaggioAssociato(Sondaggio sondaggioAssociato) {
		this.sondaggioAssociato = sondaggioAssociato;
	}

	/**
	 * @return the compilazionirisposta
	 */
	@SuppressWarnings("unchecked")
	public List<CompilazioneRisposta> getCompilazionirisposta() {
		return compilazionirisposta;
	}

	/**
	 * @param compilazionirisposta the compilazionirisposta to set
	 */
	@SuppressWarnings("rawtypes")
	void setCompilazionirisposta(List compilazionirisposta) {
		this.compilazionirisposta = compilazionirisposta;
	}
}
