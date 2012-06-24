package exception;

import java.io.Serializable;
/** 
 * InvalidCredentialException
 * @author 727826-729399
 */
public class InvalidCredentialException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCredentialException() {
		super();
	}
	
	public InvalidCredentialException(String message) {
		super(message);
	}
}
