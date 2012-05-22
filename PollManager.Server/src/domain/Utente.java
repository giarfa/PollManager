package domain;
/**
 * 
 * @author Alberto
 *
 */
public class Utente {
	private int matricola;
	private String nome, cognome, nomeutente, password;
	private boolean attivo;
	
	/**
	 * 
	 * @param matricola
	 * @param nome
	 * @param cognome
	 * @param nomeutente
	 * @param password
	 */
	public Utente(int matricola, String nome, String cognome, String nomeutente, String password){
		this.matricola=matricola;
		this.nome=nome;
		this.cognome=cognome;
		this.setNomeutente(nomeutente);
		this.setPassword(password);
		attivo= true;
	}
	/**
	 * 
	 * @param utente
	 */
	public void setDisable(Utente utente){
		utente.attivo= false;
	}
	/**
	 * 
	 * @param utente
	 */
	public void setEnable(Utente utente){
		utente.attivo= true;
	}
	/**
	 * 
	 * @param password
	 * @return true= password corretta
	 */
	public boolean correctPassword(String password){
		if (password.length()>5) return true;
		else return false;
	}
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
	 * @param nomeutente the nomeutente to set
	 */
	public void setNomeutente(String nomeutente) {
		this.nomeutente = nomeutente;
	}
	/**
	 * @return the nomeutente
	 */
	public String getNomeutente() {
		return nomeutente;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isActive() {
		return attivo;
	}
	

}
