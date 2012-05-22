package Socket;
/**
 * 
 * @author Alberto
 *
 */
public class ServerSocket {
	
	private static  int port;
	
	
	public ServerSocket(int port) {
		this.port=port;
	}
	/**
	 * 
	 * @param port
	 */
	public int SetPort(int port){
		this.port=port;
		return port;
	}
	

	
}
