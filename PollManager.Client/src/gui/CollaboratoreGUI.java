package gui;

import client.ClientInterface;

/**
 *
 * @author 727826-729399
 */
public class CollaboratoreGUI extends javax.swing.JFrame {

    private int idSondaggio;
    private String idClient;
    private ClientInterface client;
    
    /**
     * Costruttore di CollaboratoreGUI
     * @param idClient
     * @param client
     */
    public CollaboratoreGUI(String idClient, ClientInterface client) {
        this.client=client;
        this.idClient=idClient;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        Uscita.setMaximumSize(new java.awt.Dimension(320, 180));
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

        jButton1.setText("Crea Report");

        jButton2.setText("Compila Sondaggio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Visualizza Sondaggio Selezionato");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
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
    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {                                    
        
    }                                   
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
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
	
        VisualizzaSondaggioGUI v= new VisualizzaSondaggioGUI(idSondaggio, client);
        v.setVisible(true);
    }                                        
    /**
     * Apre CompilazioneGUI
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        CompilazioneGUI a=new CompilazioneGUI();
        a.setVisible(true);
    }                                        
    
    
    /**
     * Logout
     * @param evt
     */
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        
    	
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
    
    // Variables declaration - do not modify
    private javax.swing.JDialog Uscita;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    // End of variables declaration
}


