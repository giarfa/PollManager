import gui.AccessoGUI;
import gui.SegretarioGUI;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.util.Properties;

import client.ClientRmi;



public class Start {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) throws Exception{
		
		
		Properties config = new Properties();
		FileInputStream input = new FileInputStream("config.properies");
		config.load(input);
		input.close();
		String host = config.getProperty("host");
		
		
		String idClient=InetAddress.getLocalHost().getHostName();
		
		ClientRmi client=new ClientRmi(host);
		
		client.OpenChannel(idClient);
		
		
		AccessoGUI a=new AccessoGUI(idClient);
		a.setVisible(true);
		
	}

}
