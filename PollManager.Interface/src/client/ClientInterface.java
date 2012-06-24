package client;
/**
 * ClientInterface
 * @author 727826-729399
 *
 */
import base.BaseInterface;

public interface ClientInterface extends BaseInterface {
	
	
	/**
	 * Apertura del canale di Comunicazione
	 * @param clientName idClient
	 */
	public void OpenChannel(String clientName);
	
	/**
	 * Chiusura del canale di Comunicazione
	 * @param clientName idClient
	 */
	public void CloseChannel(String clientName);
}
