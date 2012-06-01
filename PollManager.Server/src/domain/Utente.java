package domain;

import java.util.Date;


/**
 * 
 * @author Alberto
 *
 */
public class Utente {
	private int matricola;
	private String nome, cognome, nomeutente, password;
	private Ruolo ruolo;
	private Date datacreazione;
	private boolean attivo;

	
	/**
	 * 
	 */
	public Utente(){
		this.attivo= true;
		this.datacreazione=new Date();
		}
	
	/**
	 * 
	 * @param matricola
	 * @param nome
	 * @param cognome
	 * @param password
	 * @return
	 */
	public static Utente CreaUtente(int matricola,Ruolo ruolo, String nome, String cognome,String password){
		Utente utente= new Utente();
		utente.setNome(nome);
		utente.setCognome(cognome);
		utente.setMatricola(matricola);
		utente.setPassword(password);
		utente.setRuolo(ruolo);
		return utente;
	}
	
	

	 public Utente ModificaUtente(int matricola,String nome, String cognome,String password) {
     	this.nome=nome;
         this.cognome=cognome;
         this.matricola=matricola;
         ModificaUtente(password);
         return this;
     }
	 
	 
	 public Utente ModificaUtente(String password){
     	this.password=password;
     	return this;
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
	 * @return nomeutente
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
	 * @param ruolo
	 */
	private void setRuolo(Ruolo ruolo) {
		this.ruolo=ruolo;
		
	}
	/**
	 * 
	 * @return
	 */
	public boolean isActive() {
		return attivo;
	}
	

}
