package server;

import communication.ServerRmiInterface;

public class ServerRmi extends BaseServer implements ServerRmiInterface {

	@Override
	public void run() {
		try {
			while(true){
				//Attendo 2 secondi
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			//Se ricevo un interrup gestisco la chiusura
			System.out.println("Interrup ricevuto. Chiudo il processo");
		}
	}
}
