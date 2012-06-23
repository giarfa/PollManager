package gui;

import java.rmi.RemoteException;

import client.ClientInterface;
import dto.RuoloDTO;
import dto.UtenteDTO;
import exception.InvalidCredentialException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
*
* @author 727826-729399
*/
public class AccessoGUI extends javax.swing.JFrame {
	
	private String nomeutente,password,idClient;
	private RuoloDTO tipoUtente;
    private ClientInterface client;
    private UtenteDTO utente;
    
    /**
     * Costruttore di AccessoGUI
     * @param idClient
     * @param client
     */
    public AccessoGUI(String idClient, ClientInterface client) {
        
    	this.client=client;
        this.idClient=idClient;
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
    }

    /**
     * Inizializza AccessoGUI
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        Uscita = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Errore = new javax.swing.JDialog();
        close = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        exitButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        Uscita.setLocationByPlatform(true);
        Uscita.setMinimumSize(new java.awt.Dimension(320, 180));

        jLabel4.setText("Sei sicuro di voler uscire?");

        jButton1.setText("Sì");
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("No");
        
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
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(UscitaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
        );
        UscitaLayout.setVerticalGroup(
            UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UscitaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Errore.setMinimumSize(new java.awt.Dimension(320, 180));
        Errore.setType(java.awt.Window.Type.POPUP);

        close.setText("OK");
        
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome utente o password non corretti: riprova");

        javax.swing.GroupLayout ErroreLayout = new javax.swing.GroupLayout(Errore.getContentPane());
        Errore.getContentPane().setLayout(ErroreLayout);
        ErroreLayout.setHorizontalGroup(
            ErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErroreLayout.createSequentialGroup()
                .addGroup(ErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ErroreLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5))
                    .addGroup(ErroreLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(close)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        ErroreLayout.setVerticalGroup(
            ErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ErroreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close)
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Poll Manager-Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setText("Poll Manager");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome Utente");

        jLabel3.setText("Password");

        exitButton.setText("Esci");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        

        jMenuItem1.setText("Esci");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("?");

        jMenuItem3.setText("About...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addGap(89, 89, 89)
                        .addComponent(exitButton)))
                .addGap(0, 88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(exitButton))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }                       
    
    /**
     * Annulla Uscita
     * @param evt
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Uscita.setVisible(true);
    }                                          
    
    /**
     * Apre AboutGUI
     * @param evt
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        AboutGUI a=new AboutGUI();
        a.setVisible(true);
    }                                          
    
    
    /**
     * Login utente
     * @param evt
     */
    @SuppressWarnings("deprecation")
	private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    	nomeutente=jTextField1.getText();
        password=jPasswordField1.getText();
        
        clearAccesso();
        
		try {

			if (nomeutente.length() == 0 || password.length() == 0) {
				Errore.setVisible(true);
			} else {
				utente=client.Login(nomeutente, password);
				tipoUtente=utente.getRuolo();
				
				if (tipoUtente == RuoloDTO.SEGRETARIO) {

					SegretarioGUI s = new SegretarioGUI(idClient, client,utente);
					s.setVisible(true);
					this.setVisible(false);
				}
				if (tipoUtente == RuoloDTO.COLLABORATORE) {
					CollaboratoreGUI s = new CollaboratoreGUI(idClient, client,utente);
					s.setVisible(true);
					this.setVisible(false);
				}
				if (tipoUtente == RuoloDTO.AMMINISTRATORE) {
					AmministratoreGUI s = new AmministratoreGUI(idClient,
							client,utente);
					s.setVisible(true);
					this.setVisible(false);
				}
			}
		}
			
		 catch (RemoteException e) {
			jLabel5.setText("Errore di connessione: riprovare");
			Errore.setVisible(true);
			e.printStackTrace();
		} catch (InvalidCredentialException e) {
			jLabel5.setText("Nome utente o password non validi");
			Errore.setVisible(true);
		}
        
        
    }                                           
    /**
     * Apre conferma uscita dal programma
     * @param evt
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Uscita.setVisible(true);
    }                                          
    /**
     * Chiude Errore(jDialog)
     * @param evt
     */
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        Errore.setVisible(false);
    }                                     
    /**
     * Chiude il programma
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        exit();
    }                                        
    /**
     * 
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       Uscita.setVisible(false);
    }                                        
    
    
    /**
     * Pulisce campi AccessoGUI
     */
    private void clearAccesso(){
    	jTextField1.setText("");
    	jPasswordField1.setText("");
    }
   
    
    /**
     * Istruzioni per la chiusura del programma
     */
    private void exit(){
    	client.CloseChannel(idClient);
    	System.exit(0);
    }
    
    private javax.swing.JDialog Errore;
    private javax.swing.JDialog Uscita;
    private javax.swing.JButton close;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginButton;
    // End of variables declaration
}

	
