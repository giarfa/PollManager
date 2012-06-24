package gui;

import java.awt.List;
import java.rmi.RemoteException;
import java.util.ArrayList;

import client.ClientInterface;

import dto.DomandaDTO;
import dto.RispostaDTO;
import dto.SondaggioDTO;
import dto.UtenteDTO;


/**
 * 
 * @author Alberto
 */
public class VisualizzaSondaggioGUI extends javax.swing.JFrame {
	private SondaggioDTO sondaggio;
	private ClientInterface client;

	/**
	 * Creates new form VisualizzaSondaggio
	 */
	public VisualizzaSondaggioGUI(SondaggioDTO sondaggio, ClientInterface client) {
		initComponents();
		
		this.client = client;
		this.sondaggio = sondaggio;
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		inizializza();
	}

	/**
	 * inizializza componenti VisualizzaSondaggioGUI
	 */
	  @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jLabel3 = new javax.swing.JLabel();
	        jButton5 = new javax.swing.JButton();
	        jScrollPane4 = new javax.swing.JScrollPane();
	        jList4 = new javax.swing.JList();
	        jScrollPane5 = new javax.swing.JScrollPane();
	        jList5 = new javax.swing.JList();
	        jLabel4 = new javax.swing.JLabel();
	        visualizzaRisposte = new javax.swing.JButton();
	        creaReport = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel3.setText("Risposte:");

	        jButton5.setText("Chiudi");
	        jButton5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton5ActionPerformed(evt);
	            }
	        });

	        jScrollPane4.setViewportView(jList4);

	        jList5.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        jScrollPane5.setViewportView(jList5);

	        jLabel4.setText("Domande:");

	        visualizzaRisposte.setText("Visualizza Possibili Risposte");
	        visualizzaRisposte.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                visualizzaRisposteActionPerformed(evt);
	            }
	        });

	        creaReport.setText("Crea Report");
	        creaReport.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                creaReportActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(65, 65, 65)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(156, 156, 156))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(visualizzaRisposte))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(58, 58, 58)
	                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(45, 45, 45))))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(292, 292, 292)
	                .addComponent(creaReport)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(24, 24, 24)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel3))
	                .addGap(32, 32, 32)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton5)
	                    .addComponent(visualizzaRisposte))
	                .addGap(21, 21, 21))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(69, 69, 69)
	                .addComponent(creaReport)
	                .addContainerGap())
	        );

	        pack();
	    }// </editor-fold>                        



	 /**
	  * Chiude VisualizzaSondaggioGUI
	  * @param evt
	  */
	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
	}
	
	/**
	 * Stampa la lista risposte della domanda selezionata
	 * @param evt 
	 */
	private void visualizzaRisposteActionPerformed(java.awt.event.ActionEvent evt) {
		
		java.util.List<RispostaDTO> listarisposte= new java.util.ArrayList<RispostaDTO>();
		DomandaDTO d = ((DomandaDTO) jList5.getSelectedValue());
		listarisposte=d.getRisposte();
		jList4.setListData(listarisposte.toArray());
	}
	
	/**
	 * Crea report in pdf
	 * @param evt
	 */
	private void creaReportActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }
	/**
     * inizializza VisualizzaSondaggioGUI
     */
	private void inizializza() {
		jList5.setListData(sondaggio.getDomande().toArray());
	}

	
	private javax.swing.JButton creaReport;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton visualizzaRisposte;
	
}
