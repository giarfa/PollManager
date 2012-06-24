package domain;

import java.util.ArrayList;
import java.util.List;

/**
* Sondaggio
* @author 727826-729399
*/
public class Sondaggio {
	
	private int idSondaggio;
	private String titolo;
	private String descrizione;
	private boolean attivo;
	@SuppressWarnings("rawtypes")
	private List domande;
	@SuppressWarnings("rawtypes")
	private List compilazioni;
	
	/**
	 * Costruttore
	 */
	public Sondaggio(){
		this.idSondaggio=-1;
		this.attivo=true;
		this.domande=new ArrayList<Domanda>();
		this.compilazioni=new ArrayList<Compilazione>();
	}
	
	/**
	 * Crea Sondaggio
	 * @param titolo Titolo Sondaggio
	 * @param descrizione Descrizione Sondaggio
	 * @return this
	 */
	public static Sondaggio CreaSondaggio(String titolo, String descrizione){
		Sondaggio sondaggio= new Sondaggio();
		sondaggio.titolo=titolo;
		sondaggio.descrizione=descrizione;
		return sondaggio;
	}
	
	/**
	 * Modifica Sondaggio
	 * @param titolo Titolo Sondaggio
	 * @param descrizione Descrizione Sondaggio
	 * @return this
	 */
	public Sondaggio ModificaSondaggio(String titolo, String descrizione){
		this.titolo=titolo;
		this.descrizione=descrizione;
		return this;
	}
	/**
	 * @see {@link} Multipla.CreaMultipla 
	 */
	@SuppressWarnings("unchecked")
	public void AggiungiDomandaMultipla(int ordine, String testo, boolean isObbligatorio, Orientamento orientamento, boolean isSingola,int NumMinRisp){
		Multipla multipla=Multipla.CreaMultipla(ordine, testo, isObbligatorio, orientamento, isSingola, NumMinRisp, this);
		this.domande.add(multipla);
	}
	
	/**
	 * @see {@link} Libera.CreaLibera 
	 */
	@SuppressWarnings("unchecked")
	public void AggiungiDomandaLibera(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri){
		Libera libera=Libera.CreaLibera(ordine, testo, isObbligatorio, MaxCaratteri, MinCaratteri, this);
		this.domande.add(libera);
	}
	
	/**
	 * @see {@link} Range.CreaRange 
	 */
	@SuppressWarnings("unchecked")
	public void AggiungiDomandaRange(int ordine, String testo, boolean isObbligatorio, int ValMin, int ValMax, String DescValMin, String DescValMax, boolean isRispSingola){
		Range range=Range.CreaRange(ordine, testo, isObbligatorio, ValMin, ValMax, DescValMin, DescValMax, isRispSingola, this);
		this.domande.add(range);
	}
	
	/**
	 * @see {@link} Matrice.CreaMatrice 
	 */
	@SuppressWarnings("unchecked")
	public void AggiungiDomandaMatrice(int ordine, String testo, boolean isObbligatorio){
		Matrice matrice=Matrice.CreaMatrice(ordine, testo, isObbligatorio, this);
		this.domande.add(matrice);
	}
	/**
	 * @see {@link} Compilazione.CreaCompilazione 
	 */
	@SuppressWarnings("unchecked")
	public void AggiungiCompilazione(Sondaggio sondaggioAssociato, Utente utenteAssociato, String note){
		Compilazione compilazione=Compilazione.CreaCompilazione(this, utenteAssociato, note);
		this.compilazioni.add(compilazione);
	}
	
	/**
	 * Disattiva Sondaggio
	 */
	public void setDisable(){
		this.attivo= false;
	}
	
	/**
	 * Attiva Sondaggio
	 */
	public void setEnable(){
		this.attivo= true;
		
	}

	/**
	 * @return the idSondaggio
	 */
	public int getIdSondaggio() {
		return idSondaggio;
	}

	/**
	 * @param idSondaggio the idSondaggio to set
	 */
	void setIdSondaggio(int idSondaggio) {
		this.idSondaggio = idSondaggio;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the domande
	 */
	@SuppressWarnings("unchecked")
	public List<Domanda> getDomande() {
		return domande;
	}

	/**
	 * @param domande the domande to set
	 */
	@SuppressWarnings("rawtypes")
	void setDomande(List domande) {
		this.domande = domande;
	}

	/**
	 * @return the compilazioni
	 */
	@SuppressWarnings("unchecked")
	public List<Compilazione> getCompilazioni() {
		return compilazioni;
	}

	/**
	 * @param compilazioni the compilazioni to set
	 */
	@SuppressWarnings("rawtypes")
	void setCompilazioni(List compilazioni) {
		this.compilazioni = compilazioni;
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
