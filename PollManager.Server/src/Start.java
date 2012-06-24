import thread.ServerAcceptRmi;


public class Start {

	/**Start del server
	 * @param args
	 */
	public static void main(String[] args) {
		ServerAcceptRmi rmi = new ServerAcceptRmi("127.0.0.1");
		Thread Rmithread=new Thread(rmi);
		
		Rmithread.start();
		
		while(true){
			
		}
		//rmi.Shutdown();
	}

}
