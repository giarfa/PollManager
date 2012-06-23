package thread;

import java.net.Socket;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Hashtable;
import resolver.Resolver;
import server.ServerRunnableInterface;
import communication.ServerAcceptSocketInterface;
import communication.ServerSocketInterface;

public class ServerAcceptSocket implements ServerAcceptSocketInterface, Runnable {

	private int port = 4445;
	
	// Client connessi
	private Hashtable<String,Thread> clients;
	private ArrayList<String> clientsName;
	// Lock per la sincronizzazione
	private Object lock = null;
	private boolean shutdown;
	
	public ServerAcceptSocket(){
		this.clients=new Hashtable<String, Thread>();
		this.clientsName=new ArrayList<String>();
		this.lock=new Object();
		this.shutdown=false;
	}
	
	/**
	 * Spegne il server
	 */
	public void Shutdown(){
		this.shutdown=true;
	}
	
	@Override
	public ServerRunnableInterface OpenChannel(String clientName) throws RemoteException {
		return null;
	}
	
	public ServerRunnableInterface OpenChannel(String clientName, Socket clientSocket) throws RemoteException {
		ServerSocketInterface server = Resolver.getInstance().getServerSocket(clientSocket);
		Thread thread = new Thread(server);

		synchronized (this.lock) {
			//Aggiungo il client ai client connessi
			this.clients.put(clientName,thread);
			this.clientsName.add(clientName);
		}
		thread.start();
		return server;
	}

	@Override
	public void CloseChannel(String clientName) throws RemoteException {
		synchronized (this.lock) {
			//Tolgo il client dai client connessi
			Thread thread=this.clients.remove(clientName);
			this.clientsName.remove(clientName);
			thread.interrupt();
		}
	}

	@Override
	public void run() {
		try {
			java.net.ServerSocket serverSocket=new java.net.ServerSocket(this.port);
			Socket clientSocket=null;
			int i = 0;
			while(!this.shutdown){
				clientSocket = serverSocket.accept();
				this.OpenChannel("Client."+i, clientSocket);
				i++;
			}
			
			this.QuitActiveClients();
			System.exit(0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void QuitActiveClients(){
		Thread thread;
		for(String item : this.clientsName){
			thread=this.clients.get(item);
			if(thread.isAlive())
				thread.interrupt();
		}
	}

}
