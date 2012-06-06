import gui.SegretarioGUI;




public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SegretarioGUI a =new SegretarioGUI();
				a.showComponents();
			}
			});
	}

}
