package domain;

import java.util.ArrayList;
import java.util.Date;



public class Compilazione {
	
	private int idCompilazione;
	private Date datacompilazione;
	private String note;
	private boolean isdefinitiva;
	private Utente utenteAssociato;
	private Sondaggio sondaggioAssociato;
	private ArrayList <CompilazioneRisposta> compilazionirisposta;
	
	public Compilazione() {
		this.idCompilazione=0;
		this.datacompilazione=new Date();
		this.isdefinitiva=false;
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
	
	public void AggiungiCompilazioneRisposta(){
		
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
	public ArrayList<CompilazioneRisposta> getCompilazionirisposta() {
		return compilazionirisposta;
	}

	/**
	 * @param compilazionirisposta the compilazionirisposta to set
	 */
	void setCompilazionirisposta(
			ArrayList<CompilazioneRisposta> compilazionirisposta) {
		this.compilazionirisposta = compilazionirisposta;
	}
}
