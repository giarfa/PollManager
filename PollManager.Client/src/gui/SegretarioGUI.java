package gui;

import java.awt.List;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import client.ClientInterface;
import dto.CompilazioneDTO;
import dto.DomandaDTO;
import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.OrientamentoDTO;
import dto.RangeDTO;
import dto.RispostaDTO;
import dto.SondaggioDTO;
import dto.UtenteDTO;
import dto.ValoriMatriceDTO;


/**
*
* @author 727826-729399
*/
public class SegretarioGUI extends javax.swing.JFrame {

	
	private String titoloDomanda;
	private String idClient;
	private String valMaxRange, valMinRange, descValMinRange, descValMAxRange,
			opzione1, opzione2, opzione3, opzione4, opzione5, opzione6;
	private boolean obbligatorio, isRispSingola , modificaFlag=false;
	private ClientInterface client;
	private int MinCharLibera, MaxCharLibera, idSondaggio, idDomanda,i=0, idRisposta1, idRisposta2, idRisposta3, idRisposta4,idRisposta5,  idRisposta6;
	private UtenteDTO utente;		
	private SondaggioDTO sondaggio;
	private DomandaDTO domandaModifica;
	
	
	/**
	 * Costruttore di SegretarioGUI
	 * @param idClient
	 * @param client
	 * @throws RemoteException 
	 */
	public SegretarioGUI(String idClient, ClientInterface client, UtenteDTO utente) throws RemoteException {
		this.client = client;
		this.idClient = idClient;
		this.utente=utente;
		initComponents();
		inizializza();
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	/**
     * inizializza componenti SegretarioGUI
     */

	 @SuppressWarnings("unchecked")
	   
	    private void initComponents() {

	        InsDatiSondaggio = new javax.swing.JDialog();
	        titoloText = new javax.swing.JTextField();
	        descrizionetext = new javax.swing.JTextField();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        eventoText = new javax.swing.JTextField();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        altroText = new javax.swing.JTextField();
	        rivoltoCombo = new javax.swing.JComboBox();
	        prosegui = new javax.swing.JButton();
	        annullaInsDatiSondaggio = new javax.swing.JButton();
	        SceltaDomanda = new javax.swing.JDialog();
	        jButton7 = new javax.swing.JButton();
	        sceltaDomandaCombo = new javax.swing.JComboBox();
	        jLabel5 = new javax.swing.JLabel();
	        Libera = new javax.swing.JDialog();
	        titoloLibera = new javax.swing.JTextField();
	        nMaxCharLibera = new javax.swing.JTextField();
	        jLabel6 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        salvaLibera = new javax.swing.JButton();
	        annullaLibera = new javax.swing.JButton();
	        obbligatoriaLiberaCheck = new javax.swing.JCheckBox();
	        jLabel40 = new javax.swing.JLabel();
	        nMinCharLibera = new javax.swing.JTextField();
	        Matrice = new javax.swing.JDialog();
	        jLabel19 = new javax.swing.JLabel();
	        titoloMaticeText = new javax.swing.JTextField();
	        jLabel20 = new javax.swing.JLabel();
	        jLabel21 = new javax.swing.JLabel();
	        jLabel22 = new javax.swing.JLabel();
	        jLabel23 = new javax.swing.JLabel();
	        vm1Text = new javax.swing.JTextField();
	        vm2Text = new javax.swing.JTextField();
	        vm3Text = new javax.swing.JTextField();
	        vm4Text = new javax.swing.JTextField();
	        salvaMatrice = new javax.swing.JButton();
	        jLabel24 = new javax.swing.JLabel();
	        sr1Text = new javax.swing.JTextField();
	        jLabel25 = new javax.swing.JLabel();
	        jLabel26 = new javax.swing.JLabel();
	        vm5Text = new javax.swing.JTextField();
	        vm6Text = new javax.swing.JTextField();
	        jLabel27 = new javax.swing.JLabel();
	        sr2Text = new javax.swing.JTextField();
	        jLabel28 = new javax.swing.JLabel();
	        sr3Text = new javax.swing.JTextField();
	        jLabel29 = new javax.swing.JLabel();
	        sr4Text = new javax.swing.JTextField();
	        jLabel30 = new javax.swing.JLabel();
	        sr5Text = new javax.swing.JTextField();
	        jLabel31 = new javax.swing.JLabel();
	        sr6Text = new javax.swing.JTextField();
	        annullaMatrice = new javax.swing.JButton();
	        obbligatoriaMatriceCheck = new javax.swing.JCheckBox();
	        Range = new javax.swing.JDialog();
	        titoloRangeText = new javax.swing.JTextField();
	        jLabel8 = new javax.swing.JLabel();
	        valMinRangeText = new javax.swing.JTextField();
	        valMaxRangeText = new javax.swing.JTextField();
	        jLabel9 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        jLabel11 = new javax.swing.JLabel();
	        jLabel12 = new javax.swing.JLabel();
	        descValMinText = new javax.swing.JTextField();
	        descValMaxText = new javax.swing.JTextField();
	        salvaRange = new javax.swing.JButton();
	        jLabel13 = new javax.swing.JLabel();
	        range1Text = new javax.swing.JTextField();
	        jLabel32 = new javax.swing.JLabel();
	        range2Text = new javax.swing.JTextField();
	        jLabel33 = new javax.swing.JLabel();
	        range3Text = new javax.swing.JTextField();
	        range4Text = new javax.swing.JTextField();
	        range5Text = new javax.swing.JTextField();
	        jLabel34 = new javax.swing.JLabel();
	        jLabel35 = new javax.swing.JLabel();
	        annullaRange = new javax.swing.JButton();
	        obbligatoriaRangeCheck = new javax.swing.JCheckBox();
	        singolaRangeCheck = new javax.swing.JCheckBox();
	        Multipla = new javax.swing.JDialog();
	        jLabel14 = new javax.swing.JLabel();
	        salvaMultipla = new javax.swing.JButton();
	        titoloMultipla = new javax.swing.JTextField();
	        multipla1 = new javax.swing.JTextField();
	        multipla2 = new javax.swing.JTextField();
	        multipla3 = new javax.swing.JTextField();
	        multipla4 = new javax.swing.JTextField();
	        jLabel15 = new javax.swing.JLabel();
	        jLabel16 = new javax.swing.JLabel();
	        jLabel17 = new javax.swing.JLabel();
	        jLabel18 = new javax.swing.JLabel();
	        annullaMultipla = new javax.swing.JButton();
	        jLabel36 = new javax.swing.JLabel();
	        multipla5 = new javax.swing.JTextField();
	        jLabel37 = new javax.swing.JLabel();
	        multipla6 = new javax.swing.JTextField();
	        obbligatoriaMultiplaCheck = new javax.swing.JCheckBox();
	        singolaRispostaMultipla = new javax.swing.JCheckBox();
	        orientamentoCombo = new javax.swing.JComboBox();
	        jLabel41 = new javax.swing.JLabel();
	        specificare1Check = new javax.swing.JCheckBox();
	        specificare2Check = new javax.swing.JCheckBox();
	        specificare3Check = new javax.swing.JCheckBox();
	        specificare4Check = new javax.swing.JCheckBox();
	        specificare6Check = new javax.swing.JCheckBox();
	        specificare5Check = new javax.swing.JCheckBox();
	        ModificaDomanda = new javax.swing.JDialog();
	        modificaDomanda = new javax.swing.JButton();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        jList2 = new javax.swing.JList();
	        nuovaDomanda = new javax.swing.JButton();
	        jButton8 = new javax.swing.JButton();
	        Uscita = new javax.swing.JDialog();
	        jLabel38 = new javax.swing.JLabel();
	        jButton3 = new javax.swing.JButton();
	        jButton5 = new javax.swing.JButton();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        visualizzaSondaggio = new javax.swing.JButton();
	        jButton4 = new javax.swing.JButton();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jList1 = new javax.swing.JList();
	        jButton17 = new javax.swing.JButton();
	        Logout = new javax.swing.JButton();
	        jMenuBar1 = new javax.swing.JMenuBar();
	        jMenu1 = new javax.swing.JMenu();
	        jMenuItem2 = new javax.swing.JMenuItem();
	        jMenu2 = new javax.swing.JMenu();
	        jMenuItem3 = new javax.swing.JMenuItem();

	        InsDatiSondaggio.setTitle("Poll Manager-Crea Sondaggio");
	        InsDatiSondaggio.setMinimumSize(new java.awt.Dimension(640, 360));

	        jLabel1.setText("Titolo");

	        jLabel2.setText("Descrizione");

	        jLabel3.setText("Evento");

	        jLabel4.setText("Rivolto a...");

	        altroText.setEnabled(false);

	        rivoltoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Studenti Polimi", "Studenti Scuole Superiori", "Laureati", "Altro (specificare)..." }));
	        rivoltoCombo.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                rivoltoComboItemStateChanged(evt);
	            }
	        });

	        prosegui.setLabel("Prosegui...");
	        prosegui.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                proseguiActionPerformed(evt);
	            }
	        });

	        annullaInsDatiSondaggio.setLabel("Annulla");
	        annullaInsDatiSondaggio.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                annullaInsDatiSondaggioActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout InsDatiSondaggioLayout = new javax.swing.GroupLayout(InsDatiSondaggio.getContentPane());
	        InsDatiSondaggio.getContentPane().setLayout(InsDatiSondaggioLayout);
	        InsDatiSondaggioLayout.setHorizontalGroup(
	            InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(InsDatiSondaggioLayout.createSequentialGroup()
	                .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(InsDatiSondaggioLayout.createSequentialGroup()
	                        .addGap(89, 89, 89)
	                        .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel3)
	                            .addComponent(jLabel4))
	                        .addGap(66, 66, 66)
	                        .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(descrizionetext)
	                            .addComponent(eventoText)
	                            .addComponent(rivoltoCombo, 0, 127, Short.MAX_VALUE)
	                            .addComponent(titoloText))
	                        .addGap(46, 46, 46))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsDatiSondaggioLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(prosegui)
	                        .addGap(155, 155, 155)))
	                .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(altroText)
	                    .addComponent(annullaInsDatiSondaggio, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
	                .addContainerGap(110, Short.MAX_VALUE))
	        );
	        InsDatiSondaggioLayout.setVerticalGroup(
	            InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(InsDatiSondaggioLayout.createSequentialGroup()
	                .addGap(40, 40, 40)
	                .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(titoloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(descrizionetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel2))
	                .addGap(18, 18, 18)
	                .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(eventoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel3))
	                .addGap(29, 29, 29)
	                .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(rivoltoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel4)
	                    .addComponent(altroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
	                .addGroup(InsDatiSondaggioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(prosegui)
	                    .addComponent(annullaInsDatiSondaggio))
	                .addGap(54, 54, 54))
	        );

	        SceltaDomanda.setTitle("Seleziona Domanda");
	        SceltaDomanda.setMinimumSize(new java.awt.Dimension(320, 180));
	        jButton7.setText("Avanti >");
	        jButton7.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton7ActionPerformed(evt);
	            }
	        });

	        sceltaDomandaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Libera", "Multipla", "Matrice", "Range" }));

	        jLabel5.setText("Scegli il tipo di domanda:");

	        javax.swing.GroupLayout SceltaDomandaLayout = new javax.swing.GroupLayout(SceltaDomanda.getContentPane());
	        SceltaDomanda.getContentPane().setLayout(SceltaDomandaLayout);
	        SceltaDomandaLayout.setHorizontalGroup(
	            SceltaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(SceltaDomandaLayout.createSequentialGroup()
	                .addGap(71, 71, 71)
	                .addGroup(SceltaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(sceltaDomandaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(76, Short.MAX_VALUE))
	        );
	        SceltaDomandaLayout.setVerticalGroup(
	            SceltaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SceltaDomandaLayout.createSequentialGroup()
	                .addGap(25, 25, 25)
	                .addComponent(jLabel5)
	                .addGap(18, 18, 18)
	                .addComponent(sceltaDomandaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jButton7)
	                .addContainerGap(42, Short.MAX_VALUE))
	        );

	        Libera.setMinimumSize(new java.awt.Dimension(600, 320));

	        jLabel6.setText("Testo Domanda:");

	        jLabel7.setText("Numero massimo caratteri:");

	        salvaLibera.setText("Salva");
	        salvaLibera.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                salvaLiberaActionPerformed(evt);
	            }
	        });

	        annullaLibera.setText("Annulla");
	        annullaLibera.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                annullaLiberaActionPerformed(evt);
	            }
	        });

	        obbligatoriaLiberaCheck.setText("Obbligatoria");

	        jLabel40.setText("Numero minimo caratteri:");

	        javax.swing.GroupLayout LiberaLayout = new javax.swing.GroupLayout(Libera.getContentPane());
	        Libera.getContentPane().setLayout(LiberaLayout);
	        LiberaLayout.setHorizontalGroup(
	            LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LiberaLayout.createSequentialGroup()
	                .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(LiberaLayout.createSequentialGroup()
	                        .addGap(29, 29, 29)
	                        .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jLabel6)
	                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                    .addGroup(LiberaLayout.createSequentialGroup()
	                        .addGap(95, 95, 95)
	                        .addComponent(salvaLibera, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(LiberaLayout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(titoloLibera, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                .addComponent(nMinCharLibera, javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(nMaxCharLibera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
	                        .addGap(168, 168, 168))
	                    .addGroup(LiberaLayout.createSequentialGroup()
	                        .addGap(88, 88, 88)
	                        .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(obbligatoriaLiberaCheck)
	                            .addComponent(annullaLibera, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(0, 0, Short.MAX_VALUE))))
	        );
	        LiberaLayout.setVerticalGroup(
	            LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(LiberaLayout.createSequentialGroup()
	                .addGap(78, 78, 78)
	                .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(titoloLibera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel6))
	                .addGap(55, 55, 55)
	                .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(nMaxCharLibera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel7)
	                    .addComponent(obbligatoriaLiberaCheck))
	                .addGap(18, 18, 18)
	                .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel40)
	                    .addComponent(nMinCharLibera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
	                .addGroup(LiberaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(salvaLibera)
	                    .addComponent(annullaLibera))
	                .addGap(24, 24, 24))
	        );

	        Matrice.setMinimumSize(new java.awt.Dimension(860, 500));

	        jLabel19.setText("Titolo");

	        jLabel20.setText("Valore Matrice 1");

	        jLabel21.setText("Valore Matrice 2");

	        jLabel22.setText("Valore Matrice 3");

	        jLabel23.setText("Valore Matrice 4");

	        salvaMatrice.setText("Salva");
	        salvaMatrice.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                salvaMatriceActionPerformed(evt);
	            }
	        });

	        jLabel24.setText("Sottorisposta 1");

	        jLabel25.setText("Valore Martice 5");

	        jLabel26.setText("Valora Matrice 6");

	        jLabel27.setText("Sottorisposta 2");

	        jLabel28.setText("Sottorisposta 3");

	        jLabel29.setText("Sottorisposta 4");

	        jLabel30.setText("Sottorisposta 5");

	        jLabel31.setText("Sottorisposta 6");

	        annullaMatrice.setText("Annulla");
	        annullaMatrice.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                annullaMatriceActionPerformed(evt);
	            }
	        });

	        obbligatoriaMatriceCheck.setText("Obbligatoria");

	        javax.swing.GroupLayout MatriceLayout = new javax.swing.GroupLayout(Matrice.getContentPane());
	        Matrice.getContentPane().setLayout(MatriceLayout);
	        MatriceLayout.setHorizontalGroup(
	            MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(MatriceLayout.createSequentialGroup()
	                .addGap(58, 58, 58)
	                .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(MatriceLayout.createSequentialGroup()
	                        .addComponent(obbligatoriaMatriceCheck)
	                        .addGap(0, 0, Short.MAX_VALUE))
	                    .addGroup(MatriceLayout.createSequentialGroup()
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jLabel19)
	                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addGap(50, 50, 50)
	                        .addComponent(titoloMaticeText)
	                        .addContainerGap())
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriceLayout.createSequentialGroup()
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(MatriceLayout.createSequentialGroup()
	                                .addGap(175, 175, 175)
	                                .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(vm1Text)
	                                    .addComponent(vm2Text)
	                                    .addComponent(vm3Text)
	                                    .addComponent(vm4Text)
	                                    .addComponent(vm5Text)
	                                    .addComponent(vm6Text, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                            .addComponent(salvaMatrice, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addGroup(MatriceLayout.createSequentialGroup()
	                                .addComponent(annullaMatrice, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addContainerGap())
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriceLayout.createSequentialGroup()
	                                .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)))
	                                .addGap(88, 88, 88)
	                                .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(sr2Text, javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(sr1Text, javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(sr3Text)
	                                    .addComponent(sr4Text)
	                                    .addComponent(sr5Text)
	                                    .addComponent(sr6Text, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(79, 79, 79))))))
	        );
	        MatriceLayout.setVerticalGroup(
	            MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(MatriceLayout.createSequentialGroup()
	                .addGap(30, 30, 30)
	                .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(MatriceLayout.createSequentialGroup()
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel24)
	                            .addComponent(sr1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(22, 22, 22)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel27)
	                            .addComponent(sr2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(20, 20, 20)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel28)
	                            .addComponent(sr3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel29)
	                            .addComponent(sr4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel30)
	                            .addComponent(sr5Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel31)
	                            .addComponent(sr6Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(MatriceLayout.createSequentialGroup()
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel19)
	                            .addComponent(titoloMaticeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(48, 48, 48)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel20)
	                            .addComponent(vm1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(20, 20, 20)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel21)
	                            .addComponent(vm2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel22)
	                            .addComponent(vm3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel23)
	                            .addComponent(vm4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel25)
	                            .addComponent(vm5Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel26)
	                            .addComponent(vm6Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
	                .addComponent(obbligatoriaMatriceCheck)
	                .addGap(18, 18, 18)
	                .addGroup(MatriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(salvaMatrice)
	                    .addComponent(annullaMatrice))
	                .addGap(24, 24, 24))
	        );

	        Range.setMinimumSize(new java.awt.Dimension(640, 680));

	        jLabel8.setText("Testo Domanda");

	        

	        jLabel9.setText("Min Valore Range");

	        jLabel10.setText("Massimo Valore Range");

	        jLabel11.setText("Descrizione:");

	        jLabel12.setText("Descrizione:");

	        salvaRange.setText("Salva");
	        salvaRange.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                salvaRangeActionPerformed(evt);
	            }
	        });

	        jLabel13.setText("Risposta");

	       
	        range1Text.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                range1TextKeyPressed(evt);
	            }
	        });

	        jLabel32.setText("Risposta 2:");

	        range2Text.setEnabled(false);
	        range2Text.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                range2TextKeyPressed(evt);
	            }
	        });

	        jLabel33.setText("Risposta 3:");

	        range3Text.setEnabled(false);
	        range3Text.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                range3TextKeyPressed(evt);
	            }
	        });

	        range4Text.setEnabled(false);
	        range4Text.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                range4TextKeyPressed(evt);
	            }
	        });

	        range5Text.setEnabled(false);
	        

	        jLabel34.setText("Risposta 4:");

	        jLabel35.setText("Risposta 5:");
	        jLabel35.setToolTipText("");

	        annullaRange.setText("Annulla");
	        annullaRange.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                annullaRangeActionPerformed(evt);
	            }
	        });

	        obbligatoriaRangeCheck.setText("Obbligatoria");

	        singolaRangeCheck.setSelected(true);
	        singolaRangeCheck.setText("Risposta Singola");
	        singolaRangeCheck.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                singolaRangeCheckActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout RangeLayout = new javax.swing.GroupLayout(Range.getContentPane());
	        Range.getContentPane().setLayout(RangeLayout);
	        RangeLayout.setHorizontalGroup(
	            RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(RangeLayout.createSequentialGroup()
	                .addGap(54, 54, 54)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(RangeLayout.createSequentialGroup()
	                        .addComponent(obbligatoriaRangeCheck)
	                        .addGap(53, 53, 53)
	                        .addComponent(singolaRangeCheck))
	                    .addGroup(RangeLayout.createSequentialGroup()
	                        .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                            .addComponent(annullaRange, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel33)
	                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel34)
	                            .addComponent(jLabel32)
	                            .addComponent(jLabel35))
	                        .addGap(82, 82, 82)
	                        .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(RangeLayout.createSequentialGroup()
	                                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(valMinRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(valMaxRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(35, 35, 35)
	                                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(jLabel11)
	                                    .addComponent(jLabel12))
	                                .addGap(37, 37, 37)
	                                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(descValMinText, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
	                                    .addComponent(descValMaxText)))
	                            .addComponent(titoloRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(RangeLayout.createSequentialGroup()
	                                .addGap(65, 65, 65)
	                                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(salvaRange, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                        .addComponent(range2Text)
	                                        .addComponent(range3Text)
	                                        .addComponent(range4Text)
	                                        .addComponent(range5Text)
	                                        .addComponent(range1Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
	                .addContainerGap(44, Short.MAX_VALUE))
	        );
	        RangeLayout.setVerticalGroup(
	            RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(RangeLayout.createSequentialGroup()
	                .addGap(25, 25, 25)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(titoloRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel8))
	                .addGap(39, 39, 39)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel9)
	                    .addComponent(valMinRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel11)
	                    .addComponent(descValMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(30, 30, 30)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(valMaxRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel10)
	                    .addComponent(jLabel12)
	                    .addComponent(descValMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(obbligatoriaRangeCheck)
	                    .addComponent(singolaRangeCheck))
	                .addGap(15, 15, 15)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(salvaRange)
	                    .addComponent(annullaRange))
	                .addGap(44, 44, 44)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(range1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel13))
	                .addGap(18, 18, 18)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(range2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel32))
	                .addGap(18, 18, 18)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(range3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel33))
	                .addGap(18, 18, 18)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(range4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel34))
	                .addGap(18, 18, 18)
	                .addGroup(RangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(range5Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel35))
	                .addContainerGap(49, Short.MAX_VALUE))
	        );

	        //Multipla.setAutoRequestFocus(false);
	        Multipla.setMinimumSize(new java.awt.Dimension(540, 600));

	        jLabel14.setText("Titolo");

	        salvaMultipla.setText("Salva");
	        salvaMultipla.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                salvaMultiplaActionPerformed(evt);
	            }
	        });

	        multipla3.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                multipla3KeyPressed(evt);
	            }
	        });

	        multipla4.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                multipla4KeyPressed(evt);
	            }
	        });

	        jLabel15.setText("Opzione1");

	        jLabel16.setText("Opzione2");

	        jLabel17.setText("Opzione3");

	        jLabel18.setText("Opzione4");

	        annullaMultipla.setText("Annulla");
	        annullaMultipla.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                annullaMultiplaActionPerformed(evt);
	            }
	        });

	        jLabel36.setText("Opzione5");

	        multipla5.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                multipla5KeyPressed(evt);
	            }
	        });

	        jLabel37.setText("Opzione6");

	        obbligatoriaMultiplaCheck.setText("Obbligatoria");

	        singolaRispostaMultipla.setSelected(true);
	        singolaRispostaMultipla.setText("Risposta Singola");
	        singolaRispostaMultipla.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                singolaRispostaMultiplaActionPerformed(evt);
	            }
	        });

	        orientamentoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orizzontale", "Verticale" }));

	        jLabel41.setText("Orientamento");

	        specificare1Check.setText("Specificare");

	        specificare2Check.setText("Specificare");

	        specificare3Check.setText("Specificare");

	        specificare4Check.setText("Specificare");

	        specificare6Check.setText("Specificare");

	        specificare5Check.setText("Specificare");

	        javax.swing.GroupLayout MultiplaLayout = new javax.swing.GroupLayout(Multipla.getContentPane());
	        Multipla.getContentPane().setLayout(MultiplaLayout);
	        MultiplaLayout.setHorizontalGroup(
	            MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(MultiplaLayout.createSequentialGroup()
	                .addGap(62, 62, 62)
	                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel14)
	                    .addComponent(jLabel41)
	                    .addComponent(jLabel15)
	                    .addComponent(jLabel16)
	                    .addComponent(jLabel17)
	                    .addComponent(jLabel18)
	                    .addComponent(jLabel36)
	                    .addComponent(jLabel37))
	                .addGap(91, 91, 91)
	                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(MultiplaLayout.createSequentialGroup()
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                .addComponent(multipla1, javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(multipla2, javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(multipla3, javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(multipla4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                .addComponent(multipla6, javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(multipla5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(36, 36, 36)
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(MultiplaLayout.createSequentialGroup()
	                                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(specificare1Check)
	                                    .addComponent(specificare2Check)
	                                    .addComponent(specificare3Check)
	                                    .addComponent(specificare4Check)
	                                    .addComponent(specificare6Check))
	                                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(MultiplaLayout.createSequentialGroup()
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(annullaMultipla)
	                                            .addComponent(salvaMultipla, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                        .addGap(51, 51, 51))
	                                    .addGroup(MultiplaLayout.createSequentialGroup()
	                                        .addGap(27, 27, 27)
	                                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(obbligatoriaMultiplaCheck)
	                                            .addComponent(singolaRispostaMultipla))
	                                        .addContainerGap(30, Short.MAX_VALUE))))
	                            .addGroup(MultiplaLayout.createSequentialGroup()
	                                .addComponent(specificare5Check)
	                                .addGap(0, 0, Short.MAX_VALUE))))
	                    .addGroup(MultiplaLayout.createSequentialGroup()
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(orientamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(titoloMultipla, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addContainerGap())))
	        );
	        MultiplaLayout.setVerticalGroup(
	            MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(MultiplaLayout.createSequentialGroup()
	                .addGap(51, 51, 51)
	                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(titoloMultipla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel14))
	                .addGap(18, 18, 18)
	                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(orientamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel41))
	                .addGap(18, 18, 18)
	                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(MultiplaLayout.createSequentialGroup()
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(multipla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel15)
	                            .addComponent(specificare1Check))
	                        .addGap(18, 18, 18)
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel16)
	                            .addComponent(multipla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(specificare2Check))
	                        .addGap(18, 18, 18)
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel17)
	                            .addComponent(multipla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(specificare3Check)))
	                    .addGroup(MultiplaLayout.createSequentialGroup()
	                        .addComponent(obbligatoriaMultiplaCheck)
	                        .addGap(9, 9, 9)
	                        .addComponent(singolaRispostaMultipla)))
	                .addGap(18, 18, 18)
	                .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(MultiplaLayout.createSequentialGroup()
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel18)
	                            .addComponent(multipla4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(specificare4Check))
	                        .addGap(18, 18, 18)
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel36)
	                            .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(multipla5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(specificare5Check)))
	                        .addGap(18, 18, 18)
	                        .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(MultiplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                .addComponent(multipla6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(specificare6Check))
	                            .addComponent(jLabel37)))
	                    .addGroup(MultiplaLayout.createSequentialGroup()
	                        .addComponent(salvaMultipla)
	                        .addGap(56, 56, 56)
	                        .addComponent(annullaMultipla)))
	                .addContainerGap(37, Short.MAX_VALUE))
	        );

	        ModificaDomanda.setMinimumSize(new java.awt.Dimension(640, 480));

	        modificaDomanda.setText("Modifica Domanda Selezionata");
	        modificaDomanda.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                modificaDomandaActionPerformed(evt);
	            }
	        });

	        jList2.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        jScrollPane2.setViewportView(jList2);

	        nuovaDomanda.setText("Agguingi Domanda");
	        nuovaDomanda.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                nuovaDomandaActionPerformed(evt);
	            }
	        });

	        jButton8.setText("Chiudi");
	        jButton8.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton8ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout ModificaDomandaLayout = new javax.swing.GroupLayout(ModificaDomanda.getContentPane());
	        ModificaDomanda.getContentPane().setLayout(ModificaDomandaLayout);
	        ModificaDomandaLayout.setHorizontalGroup(
	            ModificaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(ModificaDomandaLayout.createSequentialGroup()
	                .addContainerGap(105, Short.MAX_VALUE)
	                .addGroup(ModificaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificaDomandaLayout.createSequentialGroup()
	                        .addGroup(ModificaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(ModificaDomandaLayout.createSequentialGroup()
	                                .addComponent(modificaDomanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(nuovaDomanda, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(90, 90, 90))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificaDomandaLayout.createSequentialGroup()
	                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(217, 217, 217))))
	        );
	        ModificaDomandaLayout.setVerticalGroup(
	            ModificaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(ModificaDomandaLayout.createSequentialGroup()
	                .addGap(27, 27, 27)
	                .addGroup(ModificaDomandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(modificaDomanda)
	                    .addComponent(nuovaDomanda))
	                .addGap(31, 31, 31)
	                .addComponent(jButton8)
	                .addGap(38, 38, 38)
	                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(92, Short.MAX_VALUE))
	        );

	        Uscita.setMinimumSize(new java.awt.Dimension(320, 180));

	        jLabel38.setText("Sei sicuro di volere uscire?");

	        jButton3.setText("Sì");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
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
	                        .addGap(39, 39, 39)
	                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(101, 101, 101)
	                        .addComponent(jButton5))
	                    .addGroup(UscitaLayout.createSequentialGroup()
	                        .addGap(66, 66, 66)
	                        .addComponent(jLabel38)))
	                .addContainerGap(34, Short.MAX_VALUE))
	        );
	        UscitaLayout.setVerticalGroup(
	            UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(UscitaLayout.createSequentialGroup()
	                .addGap(25, 25, 25)
	                .addComponent(jLabel38)
	                .addGap(33, 33, 33)
	                .addGroup(UscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton5)
	                    .addComponent(jButton3))
	                .addContainerGap(33, Short.MAX_VALUE))
	        );

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Poll Manager- Segretario");
	        setForeground(java.awt.Color.white);

	        jButton1.setText("Crea Sondaggio");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setText("Modifica Sondaggio");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        visualizzaSondaggio.setText("Visualizza Sondaggio");
	        visualizzaSondaggio.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                visualizzaSondaggioActionPerformed(evt);
	            }
	        });

	        jButton4.setText("Storicizza\\Destoricizza");
	        jButton4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton4ActionPerformed(evt);
	            }
	        });

	        jList1.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        jScrollPane1.setViewportView(jList1);

	        jButton17.setText("Compila Sondaggio");
	        jButton17.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton17ActionPerformed(evt);
	            }
	        });

	        Logout.setText("Logout");
	        Logout.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                LogoutActionPerformed(evt);
	            }
	        });

	        jMenu1.setText("File");

	        jMenuItem2.setText("Esci");
	        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItem2ActionPerformed(evt);
	            }
	        });
	        jMenu1.add(jMenuItem2);

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
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
	                        .addComponent(visualizzaSondaggio)
	                        .addGap(27, 27, 27)
	                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(27, 27, 27))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(49, 49, 49)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(207, 207, 207)
	                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(visualizzaSondaggio)
	                    .addComponent(jButton2))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton4)
	                    .addComponent(jButton17))
	                .addGap(26, 26, 26)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(41, 41, 41)
	                .addComponent(Logout)
	                .addContainerGap(40, Short.MAX_VALUE))
	        );

	        getAccessibleContext().setAccessibleName("Segretario");

	        pack();
	    }// </editor-fold>


	  /**
	   * Apre ModificaDomanda(jDialog)
	   * @param evt
	   */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		sondaggio=(SondaggioDTO) jList1.getSelectedValue();
		jList2.setListData(sondaggio.getDomande().toArray());
		ModificaDomanda.setVisible(true);
	}
	/**
	 * Apre InsDatiSondaggio(jDialog)
	 * @param evt
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		
		InsDatiSondaggio.setVisible(true);
	}
	/**
	 * Salva Sondaggio
	 * @param evt
	 */
	private void proseguiActionPerformed(java.awt.event.ActionEvent evt) {
		
		String titolo = titoloText.getText();
		String descrizione = descrizionetext.getText();
		String rivolto = (String) rivoltoCombo.getSelectedItem();
		String altroRivolto = altroText.getText();
		String evento = eventoText.getText();

		SondaggioDTO sondaggio = new SondaggioDTO();

		sondaggio.setTitolo(titolo);
		sondaggio.setDescrizione("Descrizione: " + descrizione + " Rivolto a: "
				+ rivolto + " " + altroRivolto + " Evento: " + evento);

		try {
			this.sondaggio=client.SondaggioCrea(sondaggio);
			SceltaDomanda.setVisible(true);
			InsDatiSondaggio.setVisible(false);

		} catch (RemoteException e) {
			
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

		clearSondaggio();
	}

/**
 * Apre jDialog domanda selezionata
 * @param evt
 */
	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		

		if ((String) sceltaDomandaCombo.getSelectedItem() == "Libera") {
			Libera.setVisible(true);
		}
		if ((String) sceltaDomandaCombo.getSelectedItem() == "Matrice") {
			Matrice.setVisible(true);
		}
		if ((String) sceltaDomandaCombo.getSelectedItem() == "Multipla") {
			Multipla.setVisible(true);

		}
		if ((String) sceltaDomandaCombo.getSelectedItem() == "Range") {
			Range.setVisible(true);
		}

	}
/**
 * Attiva/Disattiva altroText
 * @param evt
 */
	private void rivoltoComboItemStateChanged(java.awt.event.ItemEvent evt) {
		

		if (3 == rivoltoCombo.getSelectedIndex())
			altroText.setEnabled(true);
		else {
			altroText.setEnabled(false);
			altroText.setText("");
		}

	}
/**
 * Pulisci rangeText superiori se rangeText vouto
 * @param evt
 */
	private void range1TextKeyPressed(java.awt.event.KeyEvent evt) {
		

		if (range1Text.getText().length() == 0) {

			range2Text.setText("");

			range3Text.setText("");

			range4Text.setText("");

			range5Text.setText("");
		}

	}
	/**
	 * Pulisci rangeText superiori se rangeText vouto
	 * @param evt
	 */
	private void range2TextKeyPressed(java.awt.event.KeyEvent evt) {
		if (range2Text.getText().length() == 0) {

			range3Text.setText("");

			range4Text.setText("");

			range5Text.setText("");
		}
	}
	/**
	 * Pulisci rangeText superiori se rangeText vouto
	 * @param evt
	 */
	private void range3TextKeyPressed(java.awt.event.KeyEvent evt) {
if (range3Text.getText().length() == 0) {

			range4Text.setText("");

			range5Text.setText("");
		}
	}
	/**
	 * Pulisci rangeText superiori se rangeText vouto
	 * @param evt
	 */
	private void range4TextKeyPressed(java.awt.event.KeyEvent evt) {
		

		if (range4Text.getText().length() == 0) {

			range5Text.setText("");
		}
	}
	
	/**
	 * 
	 * @param evt
	 */
	private void multipla3KeyPressed(java.awt.event.KeyEvent evt) {
		if (multipla1.getText().length() > 0
				&& multipla2.getText().length() > 0
				&& multipla3.getText().length() > 0) {
			multipla4.setEnabled(true);
			specificare4Check.setEnabled(true);
		} else {
			multipla4.setEnabled(false);
			specificare4Check.setEnabled(false);
			multipla4.setText("");
			multipla5.setText("");
			multipla6.setText("");
		}
	}
	/**
	 * 
	 * @param evt
	 */
	private void multipla4KeyPressed(java.awt.event.KeyEvent evt) {
		
		if (multipla1.getText().length() > 0
				&& multipla2.getText().length() > 0
				&& multipla3.getText().length() > 0
				&& multipla4.getText().length() > 0) {
			multipla5.setEnabled(true);
			specificare5Check.setEnabled(false);
		} else {
			multipla5.setEnabled(false);
			specificare5Check.setEnabled(false);
			multipla5.setText("");
			multipla6.setText("");
		}

	}
	/**
	 * 
	 * @param evt
	 */
	private void multipla5KeyPressed(java.awt.event.KeyEvent evt) {
		
		if (multipla1.getText().length() > 0
				&& multipla2.getText().length() > 0
				&& multipla3.getText().length() > 0
				&& multipla4.getText().length() > 0
				&& multipla5.getText().length() > 0) {
			multipla6.setEnabled(true);
			specificare6Check.setEnabled(true);
		} else {
			multipla6.setEnabled(false);
			specificare6Check.setEnabled(false);
			multipla6.setText("");
		}
	}
	/**
	 * Annulla domanda Libera
	 * @param evt
	 */
	private void annullaLiberaActionPerformed(java.awt.event.ActionEvent evt) {
		clearLibera();
		Libera.setVisible(false);
	}
	/**
	 * apre conferma uscita dal programma
	 * @param evt
	 */
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		Uscita.setVisible(true);
	}
	/**
	 * Apre AboutGUI
	 * @param evt
	 */
	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		AboutGUI a = new AboutGUI();
		a.setVisible(true);
	}
	/**
	 * Chiudi il programma
	 * @param evt
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		exit();
	}
	
	/**
	 * Annulla chiusura programma
	 * @param evt
	 */
	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		Uscita.setVisible(false);
	}
	
	/**
	 * Annulla domanda Range
	 * @param evt
	 */
	private void annullaRangeActionPerformed(java.awt.event.ActionEvent evt) {

		clearRange();
		Range.setVisible(false);
	}

	/**
	 * Salva domanda Range
	 * @param evt
	 */
	private void salvaRangeActionPerformed(java.awt.event.ActionEvent evt) {
		
		titoloDomanda = titoloRangeText.getText();
		valMinRange = valMinRangeText.getText();
		valMaxRange = valMaxRangeText.getText();
		descValMinRange = descValMinText.getText();
		descValMAxRange = descValMaxText.getText();
		opzione1 = range1Text.getText();
		opzione2 = range2Text.getText();
		opzione3 = range3Text.getText();
		opzione4 = range4Text.getText();
		opzione5 = range5Text.getText();
		obbligatorio = obbligatoriaRangeCheck.isSelected();
		isRispSingola = singolaRangeCheck.isSelected();
		
		idSondaggio=this.sondaggio.getIdSondaggio();

		try {

			if (Integer.parseInt(valMaxRange) <= Integer.parseInt(valMinRange)) {
				JOptionPane.showMessageDialog(this, "Valore massimo e minimo caratteri non coerenti","Errore:",JOptionPane.ERROR_MESSAGE);
				valMaxRangeText.setText("");
				valMinRangeText.setText("");
			}

			else {

				RangeDTO range = new RangeDTO();

				range.setTesto(titoloDomanda);
				range.setDescValMax(descValMAxRange);
				range.setDescValMin(descValMinRange);
				range.setObbligatorio(obbligatorio);
				range.setOrdine(0);
				range.setRispSingola(isRispSingola);
				range.setSondaggioAssociatoIdSondaggio(idSondaggio);
				range.setValMax(MaxCharLibera);
				range.setValMin(MinCharLibera);
				if (modificaFlag) 
					{
						range.setIdDomanda(idDomanda);
					}
				
				int id=client.SondaggioAggiungiDomandaRange(range);
				if (!modificaFlag){
					
					RispostaDTO risp=new RispostaDTO();
					risp.setTesto("");
					risp.setDomandaAssociataIdDomanda(id);
					risp.setNonRisponde(true);
					risp.setOrdine(99);
					client.DomandaAggiungiRisposta(risp);
				}
				i++;
				creaRispostaRange(opzione1, 0,id);

				if (!opzione2.isEmpty()) {
					i++;
					creaRispostaRange(opzione2,1,id);

					if (!opzione3.isEmpty()) {
						i++;
						creaRispostaRange(opzione3,2,id);
						
						if (!opzione4.isEmpty()) {
							i++;
							creaRispostaRange(opzione4,3,id);
							
							if (!opzione5.isEmpty()) {
								i++;
								creaRispostaRange(opzione5,4,id);
								
								if (!opzione6.isEmpty()) {
									i++;
									creaRispostaRange(opzione6,5,id);
								}
							}
						}
					}
				}

				clearRange();
				Range.setVisible(false);
				inizializza();
			}
		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(this, "Valore massimo e minimo caratteri non coerenti","Errore:",JOptionPane.ERROR_MESSAGE);
			valMaxRangeText.setText("");
			valMinRangeText.setText("");
		} catch (RemoteException e) {
			
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	/**
	 * Salva Domanda Matrice
	 * @param evt
	 */
	private void salvaMatriceActionPerformed(java.awt.event.ActionEvent evt) {
		
		titoloDomanda = titoloMaticeText.getText();
		opzione1 = vm1Text.getText();
		opzione2 = vm2Text.getText();
		opzione3 = vm3Text.getText();
		opzione4 = vm4Text.getText();
		opzione5 = vm5Text.getText();
		opzione6 = vm6Text.getText();
		String sr1 = sr1Text.getText();
		String sr2 = sr2Text.getText();
		String sr3 = sr3Text.getText();
		String sr4 = sr4Text.getText();
		String sr5 = sr5Text.getText();
		String sr6 = sr6Text.getText();
		obbligatorio = obbligatoriaMatriceCheck.isSelected();
		
		idSondaggio=this.sondaggio.getIdSondaggio();
		
		MatriceDTO matrice = new MatriceDTO();

		matrice.setTesto(titoloDomanda);
		matrice.setObbligatorio(obbligatorio);
		matrice.setSondaggioAssociatoIdSondaggio(idSondaggio);
		if (modificaFlag) {
			matrice.setIdDomanda(idDomanda);
		}
		
		try {
			int id=client.SondaggioAggiungiDomandaMatrice(matrice);
			if (!modificaFlag){
				
				RispostaDTO risp=new RispostaDTO();
				risp.setTesto("");
				risp.setDomandaAssociataIdDomanda(id);
				risp.setNonRisponde(true);
				risp.setOrdine(99);
				client.DomandaAggiungiRisposta(risp);
			}
			agguingiValoreMatrice(opzione1, 0, matrice,id);
			if (!opzione2.isEmpty()) {

				agguingiValoreMatrice(opzione2, 1, matrice,id);

				if (!opzione3.isEmpty()) {
					agguingiValoreMatrice(opzione3, 2, matrice,id);

					if (!opzione4.isEmpty()) {
						
						agguingiValoreMatrice(opzione4, 3, matrice,id);
						
						if (!opzione5.isEmpty()) {
							
							agguingiValoreMatrice(opzione5, 4, matrice,id);
							
							if (!opzione6.isEmpty()) {
								
								agguingiValoreMatrice(opzione6, 5, matrice,id);
							}
						}
					}
				}
			}
			i++;
			creaRispostaMatrice(sr1, 0,id);
			if (!sr2.isEmpty()) {
				i++;
				creaRispostaMatrice(sr2,1,id);

				if (!sr3.isEmpty()) {
					i++;
					creaRispostaMatrice(sr3,2,id);

					if (!sr4.isEmpty()) {
						i++;
						creaRispostaMatrice(sr4,3,id);
						
						if (!sr5.isEmpty()) {
							i++;
							creaRispostaMatrice(sr5,4,id);
							
							if (!sr6.isEmpty()) {
								i++;
								creaRispostaMatrice(sr6,5,id);
							}
						}
					}
				}
			}
			
			
			i=0;
			clearMatrice();
			Matrice.setVisible(false);
			inizializza();
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Annulla creazione domanda Matrice
	 * @param evt
	 */
	private void annullaMatriceActionPerformed(java.awt.event.ActionEvent evt) {
		
		Matrice.setVisible(false);
	}
	
	/**
	 * Anulla creazione domanda Multipla
	 * @param evt
	 */
	private void annullaMultiplaActionPerformed(java.awt.event.ActionEvent evt) {

		clearMultipla();
		Multipla.setVisible(false);
	}
	
	/**
	 * Salva domanda Multipla
	 * @param evt
	 */
	private void salvaMultiplaActionPerformed(java.awt.event.ActionEvent evt) {
		
		titoloDomanda = titoloMultipla.getText();
		opzione1 = multipla1.getText();
		opzione2 = multipla2.getText();
		opzione3 = multipla3.getText();
		opzione4 = multipla4.getText();
		opzione5 = multipla5.getText();
		opzione6 = multipla6.getText();
		obbligatorio = obbligatoriaMultiplaCheck.isSelected();
		boolean specificare1=specificare1Check.isSelected();
		boolean specificare2=specificare2Check.isSelected();
		boolean specificare3=specificare3Check.isSelected();
		boolean specificare4=specificare4Check.isSelected();
		boolean specificare5=specificare5Check.isSelected();
		boolean specificare6=specificare6Check.isSelected();
		idSondaggio=this.sondaggio.getIdSondaggio();
		MultiplaDTO multipla = new MultiplaDTO();

		multipla.setTesto(titoloDomanda);
		multipla.setObbligatorio(obbligatorio);
		multipla.setSondaggioAssociatoIdSondaggio(idSondaggio);
		multipla.setOrientamento(OrientamentoDTO.ORIZZONTALE);
		if (modificaFlag) multipla.setIdDomanda(idDomanda);
		
		try {
			int id=client.SondaggioAggiungiDomandaMultipla(multipla);
			if (!modificaFlag){
				
				RispostaDTO risp=new RispostaDTO();
				risp.setTesto("");
				risp.setDomandaAssociataIdDomanda(id);
				risp.setNonRisponde(true);
				risp.setOrdine(99);
				client.DomandaAggiungiRisposta(risp);
			}
			
			i++;
			creaRispostaMultipla(opzione1,0,specificare1,id);

			if (!opzione2.isEmpty()) {
				i++;
				creaRispostaMultipla(opzione2,1,specificare2,id);

				if (!opzione3.isEmpty()) {
					i++;
					creaRispostaMultipla(opzione3,2,specificare3,id);

					if (!opzione4.isEmpty()) {
						i++;
						creaRispostaMultipla(opzione4,3,specificare4,id);
						
						if (!opzione5.isEmpty()) {
							i++;
							creaRispostaMultipla(opzione5,5,specificare5,id);
							
							if (!opzione6.isEmpty()) {
								i++;
								creaRispostaMultipla(opzione6,6,specificare6,id);
							}
						}
					}
				}
			}
			i=0;
			clearMultipla();
			Multipla.setVisible(false);
			inizializza();
		} catch (RemoteException e) {
			
			e.printStackTrace();
			clearMultipla();
		}

	}
	
	/**
	 * Modifica Domanda 
	 * @param evt
	 */
	private void modificaDomandaActionPerformed(java.awt.event.ActionEvent evt) {
		domandaModifica=(DomandaDTO) jList2.getSelectedValue();
		if (domandaModifica instanceof LiberaDTO) {
			
			LiberaDTO l=(LiberaDTO) domandaModifica;
			Libera.setVisible(true);
			
			titoloLibera.setText(l.getTesto());
			nMaxCharLibera.setText(Integer.toString(l.getMaxCaratteri()));
			nMinCharLibera.setText(Integer.toString(l.getMinCaratteri()));
			obbligatoriaLiberaCheck.setSelected(l.isObbligatorio());
			idDomanda=l.getIdDomanda();
			modificaFlag=true;
		}

		if (domandaModifica instanceof MatriceDTO) {
			
			MatriceDTO m=(MatriceDTO) domandaModifica;
			Matrice.setVisible(true);
			titoloMaticeText.setText(m.getTesto());
			ArrayList<RispostaDTO> r=m.getRisposte();
			try{
				vm1Text.setText(m.getValorimatrice().get(0).getTesto());
				vm2Text.setText(m.getValorimatrice().get(1).getTesto());
				vm3Text.setText(m.getValorimatrice().get(2).getTesto());
				vm4Text.setText(m.getValorimatrice().get(3).getTesto());
				vm5Text.setText(m.getValorimatrice().get(4).getTesto());
				vm6Text.setText(m.getValorimatrice().get(5).getTesto());
				}
			catch (IndexOutOfBoundsException e){
			
			}
			try{
				sr1Text.setText(r.get(0).getTesto());
				sr2Text.setText(r.get(1).getTesto());
				sr3Text.setText(r.get(2).getTesto());
				sr4Text.setText(r.get(3).getTesto());
				sr5Text.setText(r.get(4).getTesto());
				sr6Text.setText(r.get(5).getTesto());
				
			}
			catch (IndexOutOfBoundsException e){
			
			}
			obbligatoriaMatriceCheck.setSelected(m.isObbligatorio());
			idDomanda=m.getIdDomanda();
			modificaFlag=true;
		}
		if (domandaModifica instanceof MultiplaDTO) {
			
			Multipla.setVisible(true);
			MultiplaDTO mul=(MultiplaDTO) domandaModifica;
			titoloMultipla.setText(mul.getTesto());
			obbligatoriaMultiplaCheck.setSelected(mul.isObbligatorio());
			try{	
				multipla1.setText(mul.getRisposte().get(0).getTesto());
				multipla2.setText(mul.getRisposte().get(1).getTesto());
				multipla3.setText(mul.getRisposte().get(2).getTesto());
				multipla4.setText(mul.getRisposte().get(3).getTesto());
				multipla5.setText(mul.getRisposte().get(4).getTesto());
				multipla6.setText(mul.getRisposte().get(5).getTesto());
			}
			catch (IndexOutOfBoundsException e){
			}
			
			specificare1Check.setSelected(mul.getRisposte().get(0).isHasTestoLibero());
			specificare2Check.setSelected(mul.getRisposte().get(1).isHasTestoLibero());
			specificare3Check.setSelected(mul.getRisposte().get(2).isHasTestoLibero());
			specificare4Check.setSelected(mul.getRisposte().get(3).isHasTestoLibero());
			specificare5Check.setSelected(mul.getRisposte().get(4).isHasTestoLibero());
			specificare6Check.setSelected(mul.getRisposte().get(5).isHasTestoLibero());
			idDomanda=mul.getIdDomanda();
			modificaFlag=true;

		}
		if (domandaModifica instanceof RangeDTO) {
			
			Range.setVisible(true);
			RangeDTO r=(RangeDTO)domandaModifica;
			idDomanda=r.getIdDomanda();
			titoloRangeText.setText(r.getTesto());
			valMinRangeText.setText(Integer.toString(r.getValMin()));
			valMaxRangeText.setText(Integer.toString(r.getValMax()));
			descValMinText.setText(r.getDescValMin());
			descValMaxText.setText(r.getDescValMax());
			obbligatoriaRangeCheck.setSelected(obbligatorio);
			
			try{
				range1Text.setText(r.getRisposte().get(0).getTesto());
				range2Text.setText(r.getRisposte().get(1).getTesto());
				range3Text.setText(r.getRisposte().get(2).getTesto());
				range4Text.setText(r.getRisposte().get(3).getTesto());
				range5Text.setText(r.getRisposte().get(4).getTesto());
			}
			
			catch (IndexOutOfBoundsException e){
			} 
			idDomanda=r.getIdDomanda();
			modificaFlag=true;
			

		}
	}
	
	/**
	 * Apre SceltaDomanda(jDialog)
	 * @param evt
	 */
	private void nuovaDomandaActionPerformed(java.awt.event.ActionEvent evt) {
		modificaFlag=false;
		SceltaDomanda.setVisible(true);
	}
	
	/**
	 * Apre VisualizzaSondaggioGUI
	 * @param evt
	 */
	private void visualizzaSondaggioActionPerformed(
			java.awt.event.ActionEvent evt) {
		
		SondaggioDTO s= (SondaggioDTO) jList1.getSelectedValue();
		VisualizzaSondaggioGUI a = new VisualizzaSondaggioGUI(s, client);
		a.setVisible(true);
	}
	
	/**
	 * Apre CompilazioneGUI
	 * @param evt
	 */
	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			SondaggioDTO s= (SondaggioDTO) jList1.getSelectedValue();
    		CompilazioneDTO d=new CompilazioneDTO();
        	d.setDatacompilazione(new Date());
        	d.setSondaggioAssociatoIdSondaggio(s.getIdSondaggio());
			CompilazioneDTO compilazione = client.SondaggioAggiungiCompilazione(d);
			CompilazioneGUI c = new CompilazioneGUI(s,client,compilazione);
			c.setVisible(true);
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	/**
	 * Attiva\Disattiva Sondaggio
	 * @param evt
	 */
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		SondaggioDTO s=(SondaggioDTO) jList1.getSelectedValue();
		
		if (s.isAttivo()) s.setAttivo(false);
		if (!s.isAttivo())s.setAttivo(true);
		try {
			inizializza();
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * Loguot Utente
	 * @param evt
	 */
	private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			client.Logout(utente);
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		AccessoGUI b = new AccessoGUI(idClient, client);
		this.setVisible(false);
		b.setVisible(true);
	}
	
	
	/**
	 * Pulisci InsDatiSondaggio
	 * @param evt
	 */
	private void annullaInsDatiSondaggioActionPerformed(
			java.awt.event.ActionEvent evt) {
		

		clearSondaggio();
		InsDatiSondaggio.setVisible(false);
	}
	
	
	/**
	 * Salva Domanda Libera
	 * @param evt
	 */
	private void salvaLiberaActionPerformed(java.awt.event.ActionEvent evt) {
	
		titoloDomanda = titoloLibera.getText();
		MaxCharLibera = Integer.parseInt(nMaxCharLibera.getText());
		obbligatorio = obbligatoriaLiberaCheck.isSelected();
		MinCharLibera = Integer.parseInt(nMinCharLibera.getText());
		idSondaggio=this.sondaggio.getIdSondaggio();
		

		if (titoloDomanda.length() == 0) {

			JOptionPane.showMessageDialog(this, "Completare i campi","Errore:",JOptionPane.ERROR_MESSAGE);

		} else {
			LiberaDTO libera = new LiberaDTO();
			libera.setTesto(titoloDomanda);
			libera.setObbligatorio(obbligatorio);
			libera.setMaxCaratteri(MaxCharLibera);
			libera.setMinCaratteri(MinCharLibera);
			libera.setSondaggioAssociatoIdSondaggio(idSondaggio);
			if (modificaFlag) {
				libera.setIdDomanda(idDomanda);
				modificaFlag=false;
			}

			try {

				int id=client.SondaggioAggiungiDomandaLibera(libera);
				
				
				if (!modificaFlag){
					
					RispostaDTO risp=new RispostaDTO();
					risp.setTesto("");
					risp.setDomandaAssociataIdDomanda(id);
					risp.setNonRisponde(true);
					risp.setOrdine(99);
					
					client.DomandaAggiungiRisposta(risp);
					risp=new RispostaDTO();
					risp.setTesto("");
					risp.setDomandaAssociataIdDomanda(id);
					risp.setNonRisponde(false);
					risp.setOrdine(0);
					
					client.DomandaAggiungiRisposta(risp);
				}

				inizializza();
			} catch (RemoteException e) {
				JOptionPane.showMessageDialog(this, e.getMessage(),"Errore:",JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
			clearLibera();
			Libera.setVisible(false);
		}
	}

	
	/**
	 * Annulla ModificaDomanda
	 * @param evt
	 */
	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		modificaFlag=false;
		ModificaDomanda.setVisible(false);
	}
	/**
	 * Abilita/Disabilita rangeText
	 * @param evt
	 */
	private void singolaRangeCheckActionPerformed(java.awt.event.ActionEvent evt) {
		
		if (singolaRangeCheck.isSelected() == true) {

			range2Text.setEnabled(false);
			range3Text.setEnabled(false);
			range4Text.setEnabled(false);
			range5Text.setEnabled(false);
			range2Text.setText("");
			range3Text.setText("");
			range4Text.setText("");
			range5Text.setText("");

		} else {

			range2Text.setEnabled(true);
			range3Text.setEnabled(true);
			range4Text.setEnabled(true);
			range5Text.setEnabled(true);

		}
	}
	/**
	 * 
	 * @param evt
	 */
	private void singolaRispostaMultiplaActionPerformed(
			java.awt.event.ActionEvent evt) {
		
	}
	/**
	 * Pulisci campi InsDatiSondaggio(jDialog)
	 */
	private void clearSondaggio() {
		titoloText.setText("");
		descrizionetext.setText("");
		altroText.setText("");
		eventoText.setText("");
		rivoltoCombo.setSelectedIndex(0);
	}
	/**
	 * Pulisci campi Range(jDialog)
	 */
	private void clearRange() {
		titoloRangeText.setText("");
		valMinRangeText.setText("");
		valMaxRangeText.setText("");
		descValMinText.setText("");
		descValMaxText.setText("");
		range1Text.setText("");
		range2Text.setText("");
		range3Text.setText("");
		range4Text.setText("");
		range5Text.setText("");
		obbligatoriaRangeCheck.setSelected(false);
	}
	/**
	 * Pulisci campi Matrice(jDialog)
	 */
	private void clearMatrice() {
		titoloMaticeText.setText("");
		vm1Text.setText("");
		vm2Text.setText("");
		vm3Text.setText("");
		vm4Text.setText("");
		vm5Text.setText("");
		vm6Text.setText("");
		sr1Text.setText("");
		sr2Text.setText("");
		sr3Text.setText("");
		sr4Text.setText("");
		sr5Text.setText("");
		sr6Text.setText("");
		obbligatoriaMatriceCheck.setSelected(false);

	}
	/**
	 * Pulisci campi Multipla(jDialog)
	 */
	private void clearMultipla() {
		titoloMultipla.setText("");
		multipla1.setText("");
		multipla2.setText("");
		multipla3.setText("");
		multipla4.setText("");
		multipla5.setText("");
		multipla6.setText("");
		obbligatoriaMultiplaCheck.setSelected(false);

	}
	/**
	 * pulisci campi Libera(jDialog)
	 */
	private void clearLibera() {
		titoloLibera.setText("");
		nMaxCharLibera.setText("");
		obbligatoriaLiberaCheck.setSelected(false);

	}
	
	
	/**
	 * Crea Risposta Multipla
	 * @param opzione
	 * @param ordine
	 * @param specificare
	 * @throws RemoteException
	 */
	private void creaRispostaMultipla(String opzione,int ordine, boolean specificare, int idDomanda) throws RemoteException {
		RispostaDTO risposta = new RispostaDTO();

		risposta.setDomandaAssociataIdDomanda(idDomanda);
		risposta.setHasTestoLibero(specificare);
		risposta.setOrdine(ordine);
		risposta.setTesto(opzione);
		risposta.setNonRisponde(false);
		if (modificaFlag)
			getIdRisposta(domandaModifica, risposta);
		
		client.DomandaAggiungiRisposta(risposta);
		
		}
	
	/**
	 * Crea Risposta Range
	 * @param opzione
	 * @param ordine
	 * @throws RemoteException
	 */
	private void creaRispostaRange(String opzione, int ordine, int idDomanda) throws RemoteException{
		RispostaDTO risposta = new RispostaDTO();

		risposta.setDomandaAssociataIdDomanda(idDomanda);
		risposta.setTesto(opzione);
		risposta.setOrdine(ordine);
		if (modificaFlag)
			getIdRisposta(domandaModifica, risposta);
		
		client.DomandaAggiungiRisposta(risposta);
		
	}
	/**
	 * Aggiungi Valore Matrice
	 * @param sr
	 * @param ordine
	 * @param matrice
	 * @throws RemoteException
	 */
	private void agguingiValoreMatrice(String sr, int ordine, MatriceDTO matrice, int idDomanda) throws RemoteException{
		ValoriMatriceDTO valorimatrice = new ValoriMatriceDTO();
		
		valorimatrice.setMatriceIdDomanda(idDomanda);
		valorimatrice.setOrdine(0);
		valorimatrice.setTesto(sr);
		
			client.DomandaAggiungiValoriMatrice(valorimatrice);
		
	}
	
	/**
	 * Crea Risposta Matrice
	 * @param opzione Testo della risposta
	 * @param ordine Ordinamento risposta nella domanda
	 * @throws RemoteException
	 */
	private void creaRispostaMatrice(String opzione, int ordine, int idDomanda) throws RemoteException{
		RispostaDTO risposta = new RispostaDTO();
		risposta.setDomandaAssociataIdDomanda(idDomanda);
		risposta.setTesto(opzione);
		risposta.setOrdine(ordine);
		if (modificaFlag)
			getIdRisposta(domandaModifica, risposta);
			
	
		
		client.DomandaAggiungiRisposta(risposta);
		
	}
	/**
	 * Preleva gli id di tutte le risposte di d
	 * @param d DomandaDTO
	 */
	private void getIdRisposta(DomandaDTO d, RispostaDTO risposta){
		idRisposta1=d.getRisposte().get(0).getIdRisposta();
		idRisposta2=d.getRisposte().get(1).getIdRisposta();
		idRisposta3=d.getRisposte().get(2).getIdRisposta();
		idRisposta4=d.getRisposte().get(3).getIdRisposta();
		idRisposta5=d.getRisposte().get(4).getIdRisposta();
		idRisposta6=d.getRisposte().get(5).getIdRisposta();
		if (modificaFlag){
			
			if (i==1)risposta.setIdRisposta(idRisposta1);
			if (i==2)risposta.setIdRisposta(idRisposta2);
			if (i==3)risposta.setIdRisposta(idRisposta3);
			if (i==4)risposta.setIdRisposta(idRisposta4);
			if (i==5)risposta.setIdRisposta(idRisposta5);
			if (i==6)risposta.setIdRisposta(idRisposta6);
		}
	}
	
	
	/**
	 * Istruzioni di uscita dal Programma
	 */
	private void exit(){
		
		client.CloseChannel(idClient);
		System.exit((0));
	}
	
	/**
	 * Inizializza Lista sondaggi
	 * @throws RemoteException
	 */
	private void inizializza() throws RemoteException{
	
			java.util.List<SondaggioDTO> listaSondaggio=client.SondaggioGetList();
			jList1.setListData(listaSondaggio.toArray());
		
	
	}

	private javax.swing.JDialog InsDatiSondaggio;
    private javax.swing.JDialog Libera;
    private javax.swing.JButton Logout;
    private javax.swing.JDialog Matrice;
    private javax.swing.JDialog ModificaDomanda;
    private javax.swing.JDialog Multipla;
    private javax.swing.JDialog Range;
    private javax.swing.JDialog SceltaDomanda;
    private javax.swing.JDialog Uscita;
    private javax.swing.JTextField altroText;
    private javax.swing.JButton annullaInsDatiSondaggio;
    private javax.swing.JButton annullaLibera;
    private javax.swing.JButton annullaMatrice;
    private javax.swing.JButton annullaMultipla;
    private javax.swing.JButton annullaRange;
    private javax.swing.JTextField descValMaxText;
    private javax.swing.JTextField descValMinText;
    private javax.swing.JTextField descrizionetext;
    private javax.swing.JTextField eventoText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificaDomanda;
    private javax.swing.JTextField multipla1;
    private javax.swing.JTextField multipla2;
    private javax.swing.JTextField multipla3;
    private javax.swing.JTextField multipla4;
    private javax.swing.JTextField multipla5;
    private javax.swing.JTextField multipla6;
    private javax.swing.JTextField nMaxCharLibera;
    private javax.swing.JTextField nMinCharLibera;
    private javax.swing.JButton nuovaDomanda;
    private javax.swing.JCheckBox obbligatoriaLiberaCheck;
    private javax.swing.JCheckBox obbligatoriaMatriceCheck;
    private javax.swing.JCheckBox obbligatoriaMultiplaCheck;
    private javax.swing.JCheckBox obbligatoriaRangeCheck;
    private javax.swing.JComboBox orientamentoCombo;
    private javax.swing.JButton prosegui;
    private javax.swing.JTextField range1Text;
    private javax.swing.JTextField range2Text;
    private javax.swing.JTextField range3Text;
    private javax.swing.JTextField range4Text;
    private javax.swing.JTextField range5Text;
    private javax.swing.JComboBox rivoltoCombo;
    private javax.swing.JButton salvaLibera;
    private javax.swing.JButton salvaMatrice;
    private javax.swing.JButton salvaMultipla;
    private javax.swing.JButton salvaRange;
    private javax.swing.JComboBox sceltaDomandaCombo;
    private javax.swing.JCheckBox singolaRangeCheck;
    private javax.swing.JCheckBox singolaRispostaMultipla;
    private javax.swing.JCheckBox specificare1Check;
    private javax.swing.JCheckBox specificare2Check;
    private javax.swing.JCheckBox specificare3Check;
    private javax.swing.JCheckBox specificare4Check;
    private javax.swing.JCheckBox specificare5Check;
    private javax.swing.JCheckBox specificare6Check;
    private javax.swing.JTextField sr1Text;
    private javax.swing.JTextField sr2Text;
    private javax.swing.JTextField sr3Text;
    private javax.swing.JTextField sr4Text;
    private javax.swing.JTextField sr5Text;
    private javax.swing.JTextField sr6Text;
    private javax.swing.JTextField titoloLibera;
    private javax.swing.JTextField titoloMaticeText;
    private javax.swing.JTextField titoloMultipla;
    private javax.swing.JTextField titoloRangeText;
    private javax.swing.JTextField titoloText;
    private javax.swing.JTextField valMaxRangeText;
    private javax.swing.JTextField valMinRangeText;
    private javax.swing.JButton visualizzaSondaggio;
    private javax.swing.JTextField vm1Text;
    private javax.swing.JTextField vm2Text;
    private javax.swing.JTextField vm3Text;
    private javax.swing.JTextField vm4Text;
    private javax.swing.JTextField vm5Text;
    private javax.swing.JTextField vm6Text;
	
}
