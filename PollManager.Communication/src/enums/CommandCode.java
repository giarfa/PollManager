package enums;
/**
 * 
* @author 727826-729399
* 
*/
public enum CommandCode {
	LOGIN("LOGIN"),
	LOGOUT("LOGOUT"),
	SONDAGGIO_GETBYKEY("SONDAGGIO_GETBYKEY"),
	SONDAGGIO_GETLIST("SONDAGGIO_GETLIST"),
	SONDAGGIO_CREA("SONDAGGIO_CREA"),
	SONDAGGIO_MODIFICA("SONDAGGIO_MODIFICA"),
	SONDAGGIO_AGGIUNGIDOMANDA_MULTIPLA("SONDAGGIO_AGGIUNGIDOMANDA_MULTIPLA"),
	SONDAGGIO_AGGIUNGIDOMANDA_LIBERA("SONDAGGIO_AGGIUNGIDOMANDA_LIBERA"),
	SONDAGGIO_AGGIUNGIDOMANDA_RANGE("SONDAGGIO_AGGIUNGIDOMANDA_RANGE"),
	SONDAGGIO_AGGIUNGIDOMANDA_MATRICE("SONDAGGIO_AGGIUNGIDOMANDA_MATRICE"),
	SONDAGGIO_AGGIUNGICOMPILAZIONE("SONDAGGIO_AGGIUNGICOMPILAZIONE"),
	SONDAGGIO_SETENABLE("SONDAGGIO_SETENABLE"),
	SONDAGGIO_SETDISABLE("SONDAGGIO_SETDISABLE"),
	DOMANDA_MODIFICA_MULTIPLA("DOMANDA_MODIFICA_MULTIPLA"),
	DOMANDA_MODIFICA_LIBERA("DOMANDA_MODIFICA_LIBERA"),
	DOMANDA_MODIFICA_RANGE("DOMANDA_MODIFICA_RANGE"),
	DOMANDA_MODIFICA_MATRICE("DOMANDA_MODIFICA_MATRICE"),
	DOMANDA_MODIFICA_VALORIMATRICE("DOMANDA_MODIFICA_VALORIMATRICE"),
	DOMANDA_AGGIUNGI_VALORIMATRICE("DOMANDA_AGGIUNGI_VALORIMATRICE"),
	DOMANDA_AGGIUNGI_RISPOSTA("DOMANDA_AGGIUNGI_RISPOSTA"),
	DOMANDA_SETENABLE("DOMANDA_SETENABLE"),
	DOMANDA_SETDISABLE("DOMANDA_SETDISABLE"),
	RISPOSTA_MODIFICA("RISPOSTA_MODIFICA"),
	RISPOSTA_SETENABLE("RISPOSTA_SETENABLE"),
	RISPOSTA_SETDISABLE("RISPOSTA_SETDISABLE"),
	COMPILAZIONE_MODIFICA("COMPILAZIONE_MODIFICA"),
	COMPILAZIONE_AGGIUNGI_COMPILAZIONERISPOSTA("COMPILAZIONE_AGGIUNGI_COMPILAZIONERISPOSTA"),
	COMPILAZIONE_SETENABLE("COMPILAZIONE_SETENABLE"),
	COMPILAZIONE_SETDISABLE("COMPILAZIONE_SETDISABLE"),
	COMPILAZIONERISPOSTA_MODIFICA("COMPILAZIONERISPOSTA_MODIFICA"),
	COMPILAZIONERISPOSTA_ELIMINA("COMPILAZIONERISPOSTA_ELIMINA"),
	UTENTE_GETBYKEY("UTENTE_GETBYKEY"),
	UTENTE_GETLIST("UTENTE_GETLIST"),
	UTENTE_CREA("UTENTE_CREA"),
	UTENTE_MODIFICA("UTENTE_MODIFICA"),
	UTENTE_SETENABLE("UTENTE_SETENABLE"),
	UTENTE_SETDISABLE("UTENTE_SETDISABLE");
	
	private String value;
	
	CommandCode(String Value){
		this.value=Value;
	}

	public String getValue() {
		return value;
	}
}
