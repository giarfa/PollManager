package gui;

import java.rmi.RemoteException;
import java.util.Date;

import javax.swing.JOptionPane;

import client.ClientInterface;
import dto.CompilazioneDTO;
import dto.SondaggioDTO;
import dto.UtenteDTO;

/**
 *
 * @author 727826-729399
 */
public class CollaboratoreGUI extends javax.swing.JFrame {

    private int idSondaggio;
    private String idClient;
    private ClientInterface client;
    private UtenteDTO utente;
    private SondaggioDTO sondaggio;
    /**
     * Costruttore di CollaboratoreGUI
     * @param idClient Nome del terminale
     * @param client Client Interface
     */
    public CollaboratoreGUI(String idClient, ClientInterface client, UtenteDTO utente) {
        this.client=client;
        this.idClient=idClient;
        this.utente=utente;
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * inizializza componenti GUI
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Uscita = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        compilaSondaggio = new javax.swing.JButton();
        visualizzaSondaggio = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        Uscita.setMinimumSize(new java.awt.Dimension(320, 180));

        jLabel1.setText("Sei sicuro di voler uscire?");

        jButton4.setText("Sì");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("No");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UscitaLayout = new javax.swing.GroupLayout(Uscita.getContentPane());
        Uscita.getContentPane().setLayout(UscitaLayout);
        UscitaLayout.setHorizontalGroup(
            UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UscitaLayout.createSequentialGroup()
                .addGroup(UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UscitaLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(UscitaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        UscitaLayout.setVerticalGroup(
            UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UscitaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        compilaSondaggio.setText("Compila Sondaggio");
        compilaSondaggio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilaSondaggioActionPerformed(evt);
            }
        });

        visualizzaSondaggio.setText("Visualizza Sondaggio Selezionato");
        visualizzaSondaggio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizzaSondaggioActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jMenu6.setText("File");

        jMenuItem1.setText("Esci");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar3.add(jMenu6);

        jMenu7.setText("?");

        jMenuItem2.setText("About...");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuBar3.add(jMenu7);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visualizzaSondaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compilaSondaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(274, 274, 274))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizzaSondaggio)
                    .addComponent(compilaSondaggio))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(logout)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

                                  
    /**
     * 
     * @param evt
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
     
        Uscita.setVisible(true);
    }                                          
    /**
     * Chiude il programma
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
        exit();
    }                                        
    /**
     * Annulla "Uscita"
     * @param evt
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Uscita.setVisible(false);
    }                                        
    /**
     * Apre AboutGUI
     * @param evt
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        AboutGUI a =new AboutGUI();
        a.setVisible(true);
                
    }                                          
    /**
     * Apre VisualizzaSondaaggioGUI
     * @param evt
     */
    private void visualizzaSondaggioActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
    	SondaggioDTO s= (SondaggioDTO) jList1.getSelectedValue();
        VisualizzaSondaggioGUI v= new VisualizzaSondaggioGUI(s, client);
        v.setVisible(true);
    }                                        
    /**
     * Apre CompilazioneGUI
     * @param evt
     */
    private void compilaSondaggioActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	
		try {
			CompilazioneDTO d=new CompilazioneDTO();
	    	d.setDatacompilazione(new Date());
	    	d.setSondaggioAssociatoIdSondaggio(sondaggio.getIdSondaggio());
			CompilazioneDTO compilazione;
			compilazione = client.SondaggioAggiungiCompilazione(d);
			CompilazioneGUI a=new CompilazioneGUI(sondaggio,client,compilazione);
	        a.setVisible(true);
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
    	
    }                                        
    
    
    /**
     *  Logout
     * @param evt
     */
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	
    	try {
			client.Logout(utente);
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
    	AccessoGUI b=new AccessoGUI(idClient, client);
        this.setVisible(false);
        b.setVisible(true);
    }
    
    
    /**
     * Istruzioni per la chiusura del programma
     */
    private void exit(){
    	client.CloseChannel(idClient);
    	System.exit(0);
    }
    
    private javax.swing.JDialog Uscita;
    public javax.swing.JButton compilaSondaggio;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton visualizzaSondaggio;
    
}


