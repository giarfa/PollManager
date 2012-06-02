package domain;

import java.util.ArrayList;

/**
 * 
 * @author Alberto
 *
 */
public class Sondaggio {
	
	private String titolo, descrizione;
	private boolean attivo;
	private ArrayList <Domanda> domande= new ArrayList<Domanda>();
	private ArrayList <Compilazione> compilazioni= new ArrayList<Compilazione>();
	
	/**
	 * 
	 */
	public Sondaggio(){
		attivo=true;
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
	 */
	public static void VisualizzaSondaggio(){
	
	}
	
	/**
	 * 
	 */
	public Sondaggio ModificaSondaggio(String titolo, String descrizione){
		this.titolo=titolo;
		this.descrizione=descrizione;
		return this;
	}
	/**
	 * 
	 */
	
	public static void CancellaSondaggio(){
		
	}
	
	public void setDisable(){
		this.attivo= false;
	}
	
	public void setEnable(){
		this.attivo= true;
		
	}
	/**
	 * 
	 * @return
	 */
	public String getTitolo() {
		return titolo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isAttivo() {
		return attivo;
	}
	

}
