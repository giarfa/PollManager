package Socket;
/**
 * 
 * @author Alberto
 *
 */


public class ClientSocket {
	private static  int port;
	private static  String host;
	
	public ClientSocket(String host, int port){
		this.host=host;
		this.port=port;
	}
	/**
	 * 
	 * @param host
	 * @param port
	 */
	public void SetSocket(String host, int port){
		this.host=host;
		this.port=port;
	}
}
