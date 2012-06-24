package enums;
/**
 * Tipi di Errore
* @author 727826-729399
* 
*/

public enum ErrorKind {
	REMOTE_EXCEPTION("REMOTE_EXCEPTION"),
	INVALIDCREDENTIAL_EXCEPTION("INVALIDCREDENTIAL_EXCEPTION");
	
	private String value;
	
	ErrorKind(String Value){
		this.value=Value;
	}

	public String getValue() {
		return value;
	}
}
