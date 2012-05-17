package domain;

import java.util.Date;

public class Compilazione {
	private Date datacompilazione;
	private String note;
	private boolean isdefinitiva;
	
	/**
	 * 
	 * @return
	 */
	public Date getDatacompilazione() {
		return datacompilazione;
	}
	/**
	 * 
	 * @param datacompilazione
	 */
	public void setDatacompilazione(Date datacompilazione) {
		this.datacompilazione = datacompilazione;
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
	 * @param note
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isIsdefinitiva() {
		return isdefinitiva;
	}
	/**
	 * 
	 * @param isdefinitiva
	 */
	public void setIsdefinitiva(boolean isdefinitiva) {
		this.isdefinitiva = isdefinitiva;
	}


}
