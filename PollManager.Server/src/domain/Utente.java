package domain;

import java.util.Date;


/**
* Utente
* @author 727826-729399
*/
public class Utente {
	
	private int idUtente;
	private int matricola;
	private String nome;
	private String cognome;
	private String nomeutente;
	private String password;
	private Ruolo ruolo;
	private Date datacreazione;
	private boolean attivo;

	public Utente(){
		this.idUtente=-1;
		this.attivo= true;
		this.datacreazione=new Date();
	}
	
	/**
	 * Crea Utente
	 * @param matricola Matricola Utente
	 * @param ruolo Ruolo Utente
	 * @param nome Nome Utente
	 * @param cognome Cognome Utente
	 * @param nomeutente NomeUtente Utente
	 * @param password Password Utente
	 * @return this
	 */
	public static Utente CreaUtente(int matricola,Ruolo ruolo, String nome, String cognome,String nomeutente,String password){
		Utente utente= new Utente();
		utente.nome=nome;
		utente.cognome=cognome;
		utente.matricola=matricola;
		utente.nomeutente=nomeutente;
		utente.password=password;
		utente.ruolo=ruolo;
		return utente;
	}	
	/**
	 * Modifica Utente
	 * @param matricola Matricola Utente
	 * @param ruolo Ruolo Utente
	 * @param nome Nome Utente
	 * @param cognome Cognome Utente
	 * @param nomeutente NomeUtente Utente
	 * @param password Password Utente
	 * @return this
	 */
	 public Utente ModificaUtente(int matricola,Ruolo ruolo,String nome, String cognome,String nomeutente,String password) {
		 this.nome=nome;
         this.cognome=cognome;
         this.matricola=matricola;
         this.ruolo=ruolo;
         this.nomeutente=nomeutente;
         ModificaUtente(password);
         return this;
     }	 
	 /**
	  * Modifica Utente Password
	  * @param password Passwor Utente
	  * @return
	  */
	 public Utente ModificaUtente(String password){
     	this.password=password;
     	return this;
     }

	/**
	 * Disabilita Utente
	 */
	public void setDisable(){
		this.attivo= false;
	}
	/**
	 * Abilita Utente
	 */
	public void setEnable(){
		this.attivo= true;
	}
	/**
	 * Password Corretta
	 * @return true corretta false non corretta
	 */
	public boolean correctPassword(){
		if (this.password.length()>5) 
			return true;
		return false;
	}

	/**
	 * @return the idUtente
	 */
	public int getIdUtente() {
		return idUtente;
	}

	/**
	 * @param idUtente the idUtente to set
	 */
	void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	/**
	 * @return the matricola
	 */
	public int getMatricola() {
		return matricola;
	}

	/**
	 * @param matricola the matricola to set
	 */
	void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the nomeutente
	 */
	public String getNomeutente() {
		return nomeutente;
	}

	/**
	 * @param nomeutente the nomeutente to set
	 */
	void setNomeutente(String nomeutente) {
		this.nomeutente = nomeutente;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the ruolo
	 */
	public Ruolo getRuolo() {
		return ruolo;
	}

	/**
	 * @param ruolo the ruolo to set
	 */
	void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	/**
	 * @return the datacreazione
	 */
	public Date getDatacreazione() {
		return datacreazione;
	}

	/**
	 * @param datacreazione the datacreazione to set
	 */
	void setDatacreazione(Date datacreazione) {
		this.datacreazione = datacreazione;
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
}
