package server;

import java.io.Serializable;

import communication.ServerRmiInterface;
/**
* RMI-Server
* @author 727826-729399
*/
public class ServerRmi extends BaseServer implements ServerRmiInterface, Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void run() {
		try {
			while(true){
				//Attendo 2 secondi
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			//Se ricevo un interrup gestisco la chiusura
			System.out.println("Interrupt ricevuto. Chiudo il processo");
		}
	}
}
