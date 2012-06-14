package server;

import java.rmi.RemoteException;

public interface ServerAcceptInterface {

	public ServerRunnableInterface OpenChannel(String clientName) throws RemoteException;
	
	public void CloseChannel(String clientName) throws RemoteException;
}
