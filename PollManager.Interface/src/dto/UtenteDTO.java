package dto;

import java.util.Date;

/**
 * 
 * @author Alberto
 *
 */
public class UtenteDTO {
	private int idUtente;
	private int matricola;
	private String nome;
	private String cognome;
	private String nomeutente;
	private String password;
	private RuoloDTO ruolo;
	private Date datacreazione;
	private boolean attivo;
	
	/**
	 * @return the idUtente
	 */
	public int getIdUtente() {
		return idUtente;
	}
	/**
	 * @param idUtente the idUtente to set
	 */
	public void setIdUtente(int idUtente) {
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
	public void setMatricola(int matricola) {
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
	public void setNome(String nome) {
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
	public void setCognome(String cognome) {
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
	public void setNomeutente(String nomeutente) {
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
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the ruolo
	 */
	public RuoloDTO getRuolo() {
		return ruolo;
	}
	/**
	 * @param ruolo the ruolo to set
	 */
	public void setRuolo(RuoloDTO ruolo) {
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
	public void setDatacreazione(Date datacreazione) {
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
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
}
