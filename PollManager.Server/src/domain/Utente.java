package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Utente {
	private int matricola;
	private String nome, cognome;
	private boolean active;
	
	/**
	 * 
	 * @return
	 */
	public int getMatricola() {
		return matricola;
	}
	/**
	 * 
	 * @param matricola
	 */
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * 
	 * @return
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * 
	 * @param cognome
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isActive() {
		return active;
	}
	
	/**
	 * 
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

}
