package resolver;
import java.net.Socket;

import client.*;
import server.*;
import communication.*;
import domainManager.*;


public class Resolver {
	
	private static Resolver instance=null;
	
	private Resolver(){
	}
	
	public static Resolver getInstance(){
		if (instance==null)
			instance=new Resolver();
		return instance;
	}
	
	public CompilazioniManagerInterface getCompilazioneManager(){
		return DomainManagerFactory.getInstance().getCompilazioniManager();
	}
	
	public RisposteManagerInterface getRisposteManager(){
		return DomainManagerFactory.getInstance().getRisposteManager();
	}
	
	public DomandeManagerInterface getDomandeManager(){
		return DomainManagerFactory.getInstance().getDomandeManager();
	}
	
	public SondaggiManagerInterface getSondaggiManager(){
		return DomainManagerFactory.getInstance().getSondaggiManager();
	}
	
	public UtentiManagerInterface getUtentiManager(){
		return DomainManagerFactory.getInstance().getUtentiManager();
	}
	
	public ServerRmiInterface getServerRmi(){
		return new ServerRmi();
	}
	
	public ClientRmiInterface getClientRmi(String host){
		return new ClientRmi(host);
	}
	
	public ServerSocketInterface getServerSocket(Socket clientSocket){
		return new ServerSocket(clientSocket);
	}
	
	public ClientSocketInterface getClientSocket(String host){
		return new ClientSocket(host);
	}
}
