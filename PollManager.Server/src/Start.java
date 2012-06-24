import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import thread.ServerAcceptRmi;
import thread.ServerAcceptSocket;

/**
 * Start Server
 * @author 727826-729399
 * 
 */
public class Start {

	/**Start del server
	 * @param args
	 */
	public static void main(String[] args) {
		ServerAcceptRmi rmi = new ServerAcceptRmi("127.0.0.1");
		Thread RmiThread=new Thread(rmi);
		
		RmiThread.start();
		
//		ServerAcceptSocket socket = new ServerAcceptSocket();
//		Thread SocketThread=new Thread(socket);
//		
//		SocketThread.start();
		
		Boolean continua = true;
		BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        String stringa = null;
        
        while(continua){
			try {
				//Aspetto che l'utente chieda la terminazione
				System.out.print("Digitare exit per terminare: ");
		        stringa = inputBuffer.readLine();
				if(stringa.trim().toLowerCase().contains("exit"))
					continua = false;
			} catch (IOException e) {
				System.err.println("Errore di lettura da tastiera");
			}
        }
		rmi.Shutdown();
//		socket.Shutdown();
	}

}
