package domain;



public class Compilazione {
	private Data datacompilazione;
	private String note;
	private boolean isdefinitiva;
	
	/**
	 * 
	 * @return
	 */
	public Data getDatacompilazione() {
		return datacompilazione;
	}
	/**
	 * 
	 * @param datacompilazione
	 */
	public void setDatacompilazione(Data datacompilazione) {
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
