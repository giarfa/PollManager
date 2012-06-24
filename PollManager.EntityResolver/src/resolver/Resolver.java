package resolver;
import java.net.Socket;

import client.*;
import server.*;
import communication.*;
import domainManager.*;

/**
 * Resolver
 * @author 727826-729399
 *
 */

public class Resolver {
	
	private static Resolver instance=null;
	
	
	/**
	 * Costruttore di Resolver
	 */
	private Resolver(){
	}
	
	/**
	 * Resolver
	 * @return Istanza di Resolver
	 */
	public static Resolver getInstance(){
		if (instance==null)
			instance=new Resolver();
		return instance;
	}
	
	
	/**
	 * CompilazioniManager
	 * @return Interfaccia di CompilazioniManager
	 */
	public CompilazioniManagerInterface getCompilazioneManager(){
		return DomainManagerFactory.getInstance().getCompilazioniManager();
	}
	
	
	/**
	 * RisposteManager
	 * @return Iinterfaccia di RisposteManager
	 */
	public RisposteManagerInterface getRisposteManager(){
		return DomainManagerFactory.getInstance().getRisposteManager();
	}
	
	/**
	 * DomandeManager
	 * @return Interfaccia di DomandeManager
	 */
	public DomandeManagerInterface getDomandeManager(){
		return DomainManagerFactory.getInstance().getDomandeManager();
	}
	
	/**
	 * SondaggiManager
	 * @return Interfaccia di SondaggiManager
	 */
	public SondaggiManagerInterface getSondaggiManager(){
		return DomainManagerFactory.getInstance().getSondaggiManager();
	}
	
	/**
	 * UtentiManager
	 * @return Interfaccia di UtentiManager
	 */
	public UtentiManagerInterface getUtentiManager(){
		return DomainManagerFactory.getInstance().getUtentiManager();
	}
	
	
	/**
	 * ServerRmi
	 * @return Interfaccia di ServerRmi
	 */
	public ServerRmiInterface getServerRmi(){
		return new ServerRmi();
	}
	
	/**
	 * ClientRmi
	 * @param host url host
	 * @return Interfaccia di ClientRmi
	 */
	public ClientRmiInterface getClientRmi(String host){
		return new ClientRmi(host);
	}
	
	/**
	 * 
	 * @param clientSocket Socket del Client
	 * @return 
	 */
	public ServerSocketInterface getServerSocket(Socket clientSocket){
		return new ServerSocket(clientSocket);
	}
	
	/**
	 * Crea Client Socket
	 * @param host url host
	 * @return ClientSocket
	 */
	public ClientSocketInterface getClientSocket(String host){
		return new ClientSocket(host);
	}
}
