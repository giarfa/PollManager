package start;

import gui.AccessoGUI;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.util.Properties;

import resolver.Resolver;

import client.ClientRmiInterface;



public class Start {

	/**
	 * Start Client
	 * @param args
	 */
	
	public static void main(String[] args) throws Exception{
		
		
		Properties config = new Properties();
		FileInputStream input = new FileInputStream("config.properies");
		config.load(input);
		input.close();
		String host = config.getProperty("host");
		
		
		String idClient=InetAddress.getLocalHost().getHostName();
		
		ClientRmiInterface client =Resolver.getInstance().getClientRmi(host);
		
		client.OpenChannel(idClient);
		
		
		AccessoGUI a=new AccessoGUI(idClient, client);
		a.setVisible(true);
		}
}