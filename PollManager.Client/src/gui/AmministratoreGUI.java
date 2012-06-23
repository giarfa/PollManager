package gui;

import java.awt.List;
import java.rmi.RemoteException;
import java.util.Date;

import client.ClientInterface;
import dto.RuoloDTO;
import dto.UtenteDTO;

/**
 *
 * @author 727826-729399
 */
public class AmministratoreGUI extends javax.swing.JFrame {

    
    private String utenteNome, utenteCognome,  utentePassword, utenteNomeUtente, idClient,utenteRuolo;
    private ClientInterface client;
    private int utenteMatricola, idUtente;
    private RuoloDTO ruolo;
    private UtenteDTO utente;
    private Date dataCreazione;
    
    /**
     * 
     * @param idClient
     * @param client
     */
    public AmministratoreGUI(String idClient, ClientInterface client) {
        this.client=client;
        this.idClient=idClient;
        initComponents();
        inizializza();
    }

    /**
     * inizializza componenti AmministratoreGUI
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        Utente = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        utenteNomeText = new javax.swing.JTextField();
        utenteCognomeText = new javax.swing.JTextField();
        utenteMatricolaText = new javax.swing.JTextField();
        utenteNomeUtenteText = new javax.swing.JTextField();
        utentePasswordText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        utenteRuoloComboBox = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Uscita = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        aggiungiUtente = new javax.swing.JButton();
        modificaUtente = new javax.swing.JButton();
        attivaUtente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        cancellaUtente = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        Utente.setMinimumSize(new java.awt.Dimension(380, 480));

        jLabel1.setText("Nome");

        jLabel2.setText("Cognome");

        jLabel3.setText("Matricola");

        jLabel4.setText("Nome Utente");

        jLabel5.setText("Password");

        jLabel6.setText("Ruolo");

        utenteRuoloComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Segretario", "Collaboratore", "Amministratore" }));

        jButton5.setText("Aggiungi Utente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Annulla");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UtenteLayout = new javax.swing.GroupLayout(Utente.getContentPane());
        Utente.getContentPane().setLayout(UtenteLayout);
        UtenteLayout.setHorizontalGroup(
            UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtenteLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UtenteLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(31, 31, 31)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(UtenteLayout.createSequentialGroup()
                        .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(62, 62, 62)
                        .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(utenteNomeText)
                            .addComponent(utenteCognomeText)
                            .addComponent(utenteMatricolaText)
                            .addComponent(utenteNomeUtenteText)
                            .addComponent(utentePasswordText)
                            .addComponent(utenteRuoloComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        UtenteLayout.setVerticalGroup(
            UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtenteLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(utenteNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(utenteCognomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(utenteMatricolaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(utenteNomeUtenteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(utentePasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(utenteRuoloComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(UtenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(38, 38, 38))
        );

        Uscita.setMinimumSize(new java.awt.Dimension(320, 180));

        jButton1.setText("Sì");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Sei sicuro di voler uscire?");

        jButton2.setText("No");
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UscitaLayout = new javax.swing.GroupLayout(Uscita.getContentPane());
        Uscita.getContentPane().setLayout(UscitaLayout);
        UscitaLayout.setHorizontalGroup(
            UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UscitaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UscitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(80, 80, 80))
        );
        UscitaLayout.setVerticalGroup(
            UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UscitaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aggiungiUtente.setLabel("Aggiungi utente");
        aggiungiUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiUtenteActionPerformed(evt);
            }
        });

        modificaUtente.setText("Modifica Utente");
        modificaUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaUtenteActionPerformed(evt);
            }
        });

        attivaUtente.setText("Disabilita/Abilita");
        attivaUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attivaUtenteUtenteActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        cancellaUtente.setText("Cancella Utente");
        cancellaUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaUtenteActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jMenu2.setText("File");

        jMenuItem1.setText("Esci");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("?");

        jMenuItem2.setText("About...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(aggiungiUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificaUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(attivaUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancellaUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(logout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancellaUtente)
                    .addComponent(attivaUtente)
                    .addComponent(modificaUtente)
                    .addComponent(aggiungiUtente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(logout)
                .addGap(22, 22, 22))
        );
        
        
        
        
        pack();
    }
                                            
    /**
     * Apre conferma uscita da programma
     * @param evt
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        Uscita.setVisible(true);
       
    }                                          
    /**
     * Chiude il programma
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        exit();
    }                                        
    /**
     * Annulla Uscita
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Uscita.setVisible(false);
    }                                        
    /**
     * Apre AboutGUI
     * @param evt
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        AboutGUI a=new AboutGUI();
        a.setVisible(true);
    }                                          
    /**
     * Inizializza Aggiungi Utente
     * @param evt
     */
    private void aggiungiUtenteActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        Utente.setVisible(true);
        jButton5.setText("Agguingi Utente");
    }                                              
    /**
     * Inizializza Modifica Utente
     * @param evt
     */
    private void modificaUtenteActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        Utente.setVisible(true);
        jButton5.setText("Modifica Utente");
        utente= (UtenteDTO) jList1.getSelectedValue();
        utenteMatricolaText.setText(utente.getMatricola()+"");
        utenteNomeText.setText(utente.getNome());
        utenteCognomeText.setText(utente.getCognome());
        utenteNomeUtenteText.setText(utente.getNomeutente());
        utentePasswordText.setText(utente.getPassword());
        if (utente.getRuolo()==ruolo.AMMINISTRATORE){
        	utenteRuoloComboBox.setSelectedItem((String) "Amministratore");
        }
        if (utente.getRuolo()==ruolo.COLLABORATORE){
        	utenteRuoloComboBox.setSelectedItem((String) "Collaboratore");
        }
        if (utente.getRuolo()==ruolo.SEGRETARIO){
        	utenteRuoloComboBox.setSelectedItem((String) "Segretario");
        }
    
    
    }                                              
    /**
     * Salva utente se nuovo oppure modifica
     * @param evt
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt){                                         
        
    	try{
        	 utenteMatricola=Integer.parseInt(utenteMatricolaText.getText());
        	 utenteNome=utenteNomeText.getText();
             utenteCognome=utenteCognomeText.getText();	
             utenteNomeUtente=utenteNomeUtenteText.getText();
             utentePassword=utentePasswordText.getText();
            
             UtenteDTO utente=new UtenteDTO();
             
         	 utente.setNome(utenteNome);
         	 utente.setCognome(utenteCognome);
         	 utente.setMatricola(utenteMatricola);
         	 
         	 if ((String)utenteRuoloComboBox.getSelectedItem()=="Amministratore"){
         		utente.setRuolo(ruolo.AMMINISTRATORE);
         	 }
         	 if ((String)utenteRuoloComboBox.getSelectedItem()=="Segretario"){
         		utente.setRuolo(ruolo.SEGRETARIO);
         	 }
         	 if ((String)utenteRuoloComboBox.getSelectedItem()=="Collaboratore"){
         		utente.setRuolo(ruolo.COLLABORATORE);
         	 }
         	 
         	 utente.setDatacreazione(dataCreazione=new Date());
         	 utente.setPassword(utentePassword);
         	 
         	if (jButton5.getText()== "Aggiungi Utente"){
            	try {
    				client.UtenteCrea(utente);
    			} catch (RemoteException e) {
    				
    				e.printStackTrace();
    			}
            }
            
            if (jButton5.getText()== "Modifica Utente"){
            	try {
            		
            		utente.setIdUtente(((UtenteDTO) jList1.getSelectedValue()).getIdUtente());
            		client.UtenteModifica(utente);
            		
    			} catch (RemoteException e) {
    			
    				
    				e.printStackTrace();
    			}
            }
            clearUtente();
            Utente.setVisible(false);
        
        
        } catch (Exception e) {
        		e.printStackTrace();
        		//Errore.setVisible(true);
        	}
    }                                        
    /**
     * Annulla creazione\modifica utente
     * @param evt
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        clearUtente();
        Utente.setVisible(false);
    }                                        
    /**
     * Logout
     * @param evt
     */
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
        
        AccessoGUI b=new AccessoGUI(idClient, client);
        this.setVisible(false);
        b.setVisible(true);
        
    } 
    /**
     * Attiva utente selezionato
     * @param evt
     */
    private void attivaUtenteUtenteActionPerformed(java.awt.event.ActionEvent evt) {
        
    
    	try {
    		idUtente= ((UtenteDTO) jList1.getSelectedValue()).getIdUtente();
			client.UtenteSetEnable(idUtente);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
    	
    	
    }
    /**
     * Cancella utente selezionato
     * @param evt
     */
    private void cancellaUtenteActionPerformed(java.awt.event.ActionEvent evt) {
      try {
    		idUtente= ((UtenteDTO) jList1.getSelectedValue()).getIdUtente();
			client.UtenteSetDisable(idUtente);
		
    	
    	} catch (RemoteException e) {
		
			e.printStackTrace();
		}
    	
    }
    
    
    /**
     *	Pulisce campi Utente(jDialog) 
     */
    public void clearUtente(){
    	utenteNomeText.setText("");
        utenteCognomeText.setText("");
        utenteMatricolaText.setText("");
        utenteNomeText.setText("");
        utentePasswordText.setText("");
        utenteNomeUtenteText.setText("");
        utenteRuoloComboBox.setSelectedIndex(0);
    }
    /**
     * Inizializza AmministratoreGUI
     */
    private void inizializza(){
    	
    	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	java.util.List<UtenteDTO> listaUtenti=(java.util.List<UtenteDTO>) new List();
        try {
			
        	listaUtenti=client.UtenteGetList();
		
        } catch (RemoteException e) {
			
			
        	
        	e.printStackTrace();
        	e.getMessage();
		}
        
       jList1.setListData(listaUtenti.toArray());
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
    private javax.swing.JDialog Utente;
    private javax.swing.JButton aggiungiUtente;
    private javax.swing.JButton cancellaUtente;
    private javax.swing.JButton attivaUtente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton modificaUtente;
    private javax.swing.JTextField utenteCognomeText;
    private javax.swing.JTextField utenteMatricolaText;
    private javax.swing.JTextField utenteNomeText;
    private javax.swing.JTextField utenteNomeUtenteText;
    private javax.swing.JTextField utentePasswordText;
    private javax.swing.JComboBox utenteRuoloComboBox;
    // End of variables declaration
}


