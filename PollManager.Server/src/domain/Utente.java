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
	 * @param ruolo
	 * @param nome
	 * @param cognome
	 * @param password
	 * @return Utente
	 */
	public static Utente CreaUtente(int matricola,Ruolo ruolo, String nome, String cognome,String password){
		Utente utente= new Utente();
		utente.nome=nome;
		utente.cognome=cognome;
		utente.matricola=matricola;
		utente.password=password;
		utente.ruolo=ruolo;
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
	public void setDisable(){
		this.attivo= false;
	}
	/**
	 * 
	 * @param utente
	 */
	public void setEnable(){
		this.attivo= true;
	}
	
	public boolean correctPassword(String password){
		if (password.length()>5) return true;
		else return false;
	}

	public int getMatricola() {
		return matricola;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getNomeutente() {
		return nomeutente;
	}
	
	public String getPassword() {
		return password;
	}
	
	public boolean isActive() {
		return attivo;
	}
	

}
