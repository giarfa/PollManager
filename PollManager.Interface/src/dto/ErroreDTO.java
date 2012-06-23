package dto;

public class ErroreDTO {

	private String kind;
	private String message;
	
	public ErroreDTO(String kind, String message){
		this.setKind(kind);
		this.setMessage(message);
	}

	private void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	private void setKind(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}
}
