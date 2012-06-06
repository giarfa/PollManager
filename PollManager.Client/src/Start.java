import gui.AccessoGUI;
import gui.AmministratoreGUI;


public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AmministratoreGUI a =new AmministratoreGUI();
				a.showComponents();
			}
			});
	}

}
