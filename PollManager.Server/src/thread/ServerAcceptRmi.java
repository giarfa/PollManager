package thread;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Hashtable;
import resolver.Resolver;
import server.ServerRunnableInterface;
import communication.ServerAcceptRmiInterface;
import communication.ServerRmiInterface;

public class ServerAcceptRmi implements ServerAcceptRmiInterface, Runnable {

	private String url;
	private String host;
	
	// Client connessi
	private Hashtable<String,Thread> clients;
	private ArrayList<String> clientsName;
	// Lock per la sincronizzazione
	private Object lock = null;
	private boolean shutdown;
	
	public ServerAcceptRmi(String host) {
		this.host=host;
		this.clients=new Hashtable<String, Thread>();
		this.clientsName=new ArrayList<String>();
		this.lock=new Object();
		this.shutdown=false;
		this.url = "rmi://" + this.host + "/PollManager";
	}
	
	public void Shutdown(){
		this.shutdown=true;
	}
	
	@Override
	public ServerRunnableInterface OpenChannel(String clientName) throws RemoteException {
		ServerRmiInterface server = Resolver.getInstance().getServerRmi();
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
			if (System.getSecurityManager() == null)
				System.setSecurityManager(new SecurityManager());
			// Esporto la classe come remota e con visibilita interfaccia
			ServerAcceptRmiInterface stub = (ServerAcceptRmiInterface) UnicastRemoteObject.exportObject(this, 0);
			// Recupero il registry e faccio il rebind
			Registry registry = LocateRegistry.getRegistry(host);
			registry.rebind(url, stub);
			try {
				while(!this.shutdown){
					//Attendo
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				//Se ricevo un interrup gestisco la chiusura
				System.out.println("Interrup ricevuto. Chiudo il processo");
			}
			registry.unbind(url);
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
