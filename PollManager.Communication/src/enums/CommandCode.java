package enums;

public enum CommandCode {
	LOGIN("LOGIN"),
	LOGOUT("LOGOUT"),
	SONDAGGIO_GETBYKEY("SONDAGGIO_GETBYKEY"),
	SONDAGGIO_GETLIST("SONDAGGIO_GETLIST"),
	SONDAGGIO_CREA("SONDAGGIO_CREA"),
	SONDAGGIO_MODIFICA("SONDAGGIO_MODIFICA");
	
	private String value;
	
	CommandCode(String Value){
		this.value=Value;
	}

	public String getValue() {
		return value;
	}
}
