package server;

import java.rmi.RemoteException;
/**
*
* ServerAcceptInterface
* @author 727826-729399
*/
public interface ServerAcceptInterface {

	/**
	 * Apertura canale comunicazione
	 * @param clientName
	 * @return
	 * @throws RemoteException
	 */
	public ServerRunnableInterface OpenChannel(String clientName) throws RemoteException;
	
	/**
	 * Chiusura canale comunicazione
	 * @param clientName
	 * @throws RemoteException
	 */
	public void CloseChannel(String clientName) throws RemoteException;
}
