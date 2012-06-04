package domain;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public class Sondaggio {
	
	private int idSondaggio;
	private String titolo;
	private String descrizione;
	private boolean attivo;
	private ArrayList <Domanda> domande;
	private ArrayList <Compilazione> compilazioni;
	
	/**
	 * 
	 */
	public Sondaggio(){
		this.idSondaggio=0;
		this.attivo=true;
		this.domande=new ArrayList<Domanda>();
		this.compilazioni=new ArrayList<Compilazione>();
	}
	
	/**
	 * 
	 * @param titolo
	 * @param descrizione
	 * @return
	 */
	public static Sondaggio CreaSondaggio(String titolo, String descrizione){
		Sondaggio sondaggio= new Sondaggio();
		sondaggio.titolo=titolo;
		sondaggio.descrizione=descrizione;
		return sondaggio;
	}
	
	/**
	 * 
	 * @param titolo = oakoaa
	 * @param descrizione
	 * @return
	 */
	public Sondaggio ModificaSondaggio(String titolo, String descrizione){
		this.titolo=titolo;
		this.descrizione=descrizione;
		return this;
	}
	
	public void AggiungiDomandaMultipla(int ordine, String testo, boolean isObbligatorio, Orientamento orientamento, boolean isSingola,int NumMinRisp){
		Multipla multipla=Multipla.CreaMultipla(ordine, testo, isObbligatorio, orientamento, isSingola, NumMinRisp, this);
		this.domande.add(multipla);
	}
	
	public void AggiungiDomandaLibera(int ordine, String testo, boolean isObbligatorio, int MaxCaratteri, int MinCaratteri){
		Libera libera=Libera.CreaLibera(ordine, testo, isObbligatorio, MaxCaratteri, MinCaratteri, this);
		this.domande.add(libera);
	}
	
	public void AggiungiDomandaRange(int ordine, String testo, boolean isObbligatorio, int ValMin, int ValMax, String DescValMin, String DescValMax, boolean isRispSingola){
		Range range=Range.CreaRange(ordine, testo, isObbligatorio, ValMin, ValMax, DescValMin, DescValMax, isRispSingola, this);
		this.domande.add(range);
	}
	
	public void AggiungiDomandaMatrice(int ordine, String testo, boolean isObbligatorio){
		Matrice matrice=Matrice.CreaMatrice(ordine, testo, isObbligatorio, this);
		this.domande.add(matrice);
	}
	
	public void AggiungiCompilazione(Sondaggio sondaggioAssociato, Utente utenteAssociato, String note){
		Compilazione compilazione=Compilazione.CreaCompilazione(this, utenteAssociato, note);
		this.compilazioni.add(compilazione);
	}
	
	public void setDisable(){
		this.attivo= false;
	}
	
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
	public ArrayList<Domanda> getDomande() {
		return domande;
	}

	/**
	 * @param domande the domande to set
	 */
	void setDomande(ArrayList<Domanda> domande) {
		this.domande = domande;
	}

	/**
	 * @return the compilazioni
	 */
	public ArrayList<Compilazione> getCompilazioni() {
		return compilazioni;
	}

	/**
	 * @param compilazioni the compilazioni to set
	 */
	void setCompilazioni(ArrayList<Compilazione> compilazioni) {
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
