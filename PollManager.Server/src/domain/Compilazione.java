package domain;

import java.util.ArrayList;
import java.util.Date;



public class Compilazione {
	private Date datacompilazione;
	private String note;
	private boolean isdefinitiva;
	private Utente utenteAssociato;
	private ArrayList <CompilazioneRisposta> compilazionirisposta= new ArrayList<CompilazioneRisposta>();
	
	/**
	 * 
	 * @return
	 */
	public Date getDatacompilazione() {
		return datacompilazione;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNote() {
		return note;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isIsdefinitiva() {
		return isdefinitiva;
	}
	


}
