package enums;

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
