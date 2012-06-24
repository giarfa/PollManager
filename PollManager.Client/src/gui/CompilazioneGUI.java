package gui;

import java.rmi.RemoteException;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import client.ClientInterface;

import dto.CompilazioneDTO;
import dto.CompilazioneRispostaDTO;
import dto.DomandaDTO;
import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.RangeDTO;
import dto.SondaggioDTO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto
 */
public class CompilazioneGUI extends javax.swing.JFrame {

    private String  titoloDomanda;
    private String valorematrice1,valorematrice2,valorematrice3,valorematrice4,valorematrice5,valorematrice6;
    private SondaggioDTO sondaggio;
    private ClientInterface client;
    private CompilazioneDTO compilazione;
    private DomandaDTO d;
    
    /**
     * Creates new form CompilazioneGUI
     */
    public CompilazioneGUI(SondaggioDTO sondaggio, ClientInterface client, CompilazioneDTO compilazione) {
        this.sondaggio=sondaggio;
        this.client=client;
    	initComponents();
    	this.compilazione=compilazione;
    	inizializza();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        LiberaCompilazione = new javax.swing.JDialog();
        titoloLiberaLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liberaTestoArea = new javax.swing.JTextArea();
        salvaLibera = new javax.swing.JButton();
        annullaLibera = new javax.swing.JButton();
        nonRispondeLibera = new javax.swing.JCheckBox();
        MultiplaCompilazione = new javax.swing.JDialog();
        titoloMultiplaLabel = new javax.swing.JLabel();
        multipla1Check = new javax.swing.JCheckBox();
        multipla2Check = new javax.swing.JCheckBox();
        multipla3Check = new javax.swing.JCheckBox();
        multipla4Check = new javax.swing.JCheckBox();
        multipla5Check = new javax.swing.JCheckBox();
        multipla6Check = new javax.swing.JCheckBox();
        annullaMultipla = new javax.swing.JButton();
        salvaMultipla = new javax.swing.JButton();
        specificare1Text = new javax.swing.JTextField();
        specificare2Text = new javax.swing.JTextField();
        specificare3Text = new javax.swing.JTextField();
        specificare4Text = new javax.swing.JTextField();
        specificare5Text = new javax.swing.JTextField();
        specificare6Text = new javax.swing.JTextField();
        specificare1Label = new javax.swing.JLabel();
        specificare2Label = new javax.swing.JLabel();
        nonRispondeMultipla = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        RangeCompilazione = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        range1Combo = new javax.swing.JComboBox();
        range2Combo = new javax.swing.JComboBox();
        range3Combo = new javax.swing.JComboBox();
        range4Combo = new javax.swing.JComboBox();
        range5Combo = new javax.swing.JComboBox();
        range6Combo = new javax.swing.JComboBox();
        annullaRange = new javax.swing.JButton();
        salvaRange = new javax.swing.JButton();
        titoloRangeLabel = new javax.swing.JLabel();
        nonRispondeRange = new javax.swing.JCheckBox();
        MatriceCompilazione = new javax.swing.JDialog();
        titoloMatriceLabel = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nonRispondeMatrice = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        chiudiCompliazione = new javax.swing.JButton();

        LiberaCompilazione.setMinimumSize(new java.awt.Dimension(540, 320));

        titoloLiberaLabel.setText("jLabel1");

        liberaTestoArea.setColumns(20);
        liberaTestoArea.setRows(5);
        jScrollPane2.setViewportView(liberaTestoArea);

        salvaLibera.setLabel("Salva");
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

        nonRispondeLibera.setText("Non Risponde");

        javax.swing.GroupLayout LiberaCompilazioneLayout = new javax.swing.GroupLayout(LiberaCompilazione.getContentPane());
        LiberaCompilazione.getContentPane().setLayout(LiberaCompilazioneLayout);
        LiberaCompilazioneLayout.setHorizontalGroup(
            LiberaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LiberaCompilazioneLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(LiberaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LiberaCompilazioneLayout.createSequentialGroup()
                        .addComponent(salvaLibera, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nonRispondeLibera)
                        .addGap(62, 62, 62)
                        .addComponent(annullaLibera, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titoloLiberaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        LiberaCompilazioneLayout.setVerticalGroup(
            LiberaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LiberaCompilazioneLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titoloLiberaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(LiberaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annullaLibera)
                    .addComponent(salvaLibera)
                    .addComponent(nonRispondeLibera))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        MultiplaCompilazione.setMaximumSize(new java.awt.Dimension(531, 351));
        MultiplaCompilazione.setMinimumSize(new java.awt.Dimension(531, 351));

        titoloMultiplaLabel.setText("jLabel2");

        multipla1Check.setText("jCheckBox1");

        multipla2Check.setText("jCheckBox2");

        multipla3Check.setText("jCheckBox3");

        multipla4Check.setText("jCheckBox4");

        multipla5Check.setText("jCheckBox5");

        multipla6Check.setText("jCheckBox6");

        annullaMultipla.setText("Annulla");
        annullaMultipla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaMultiplaActionPerformed(evt);
            }
        });

        salvaMultipla.setText("Salva");
        salvaMultipla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaMultiplaActionPerformed(evt);
            }
        });

        specificare1Label.setText("Specificare");

        specificare2Label.setText("Specificare");

        nonRispondeMultipla.setText("Non Risponde");

        javax.swing.GroupLayout MultiplaCompilazioneLayout = new javax.swing.GroupLayout(MultiplaCompilazione.getContentPane());
        MultiplaCompilazione.getContentPane().setLayout(MultiplaCompilazioneLayout);
        MultiplaCompilazioneLayout.setHorizontalGroup(
            MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                        .addComponent(salvaMultipla, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(nonRispondeMultipla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annullaMultipla))
                    .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                        .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multipla1Check)
                                    .addComponent(multipla2Check)
                                    .addComponent(multipla3Check))
                                .addGap(45, 45, 45)
                                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(specificare1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(specificare2Text)
                                    .addComponent(specificare3Text, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                            .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(specificare1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(titoloMultiplaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(multipla4Check)
                            .addComponent(multipla5Check)
                            .addComponent(multipla6Check))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(specificare2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specificare4Text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specificare5Text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specificare6Text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        MultiplaCompilazioneLayout.setVerticalGroup(
            MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titoloMultiplaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specificare1Label)
                    .addComponent(specificare2Label))
                .addGap(18, 18, 18)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multipla1Check)
                    .addComponent(multipla4Check)
                    .addComponent(specificare1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specificare4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multipla2Check)
                    .addComponent(multipla5Check)
                    .addComponent(specificare5Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specificare2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multipla3Check)
                    .addComponent(multipla6Check)
                    .addComponent(specificare3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specificare6Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvaMultipla)
                    .addComponent(annullaMultipla)
                    .addComponent(nonRispondeMultipla))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        RangeCompilazione.setMinimumSize(new java.awt.Dimension(680, 360));

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        range1Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        range2Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        range3Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        range4Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        range5Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        range6Combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        annullaRange.setText("Annulla");
        annullaRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaRangeActionPerformed(evt);
            }
        });

        salvaRange.setLabel("Salva");
        salvaRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaRangeActionPerformed(evt);
            }
        });

        titoloRangeLabel.setText("jLabel9");

        nonRispondeRange.setText("Non Risponde");

        javax.swing.GroupLayout RangeCompilazioneLayout = new javax.swing.GroupLayout(RangeCompilazione.getContentPane());
        RangeCompilazione.getContentPane().setLayout(RangeCompilazioneLayout);
        RangeCompilazioneLayout.setHorizontalGroup(
            RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titoloRangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RangeCompilazioneLayout.createSequentialGroup()
                                        .addComponent(nonRispondeRange)
                                        .addGap(46, 46, 46)))
                                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(annullaRange, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RangeCompilazioneLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(range1Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range2Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range3Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range4Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range5Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range6Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44))))))
                    .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salvaRange, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        RangeCompilazioneLayout.setVerticalGroup(
            RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloRangeLabel)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(range1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(range2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(range3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(range4Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(range5Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(range6Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvaRange)
                    .addComponent(annullaRange)
                    .addComponent(nonRispondeRange))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        titoloMatriceLabel.setText("jLabel9");

        jButton7.setText("Annulla");

        jButton8.setText("Salva");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        nonRispondeMatrice.setText("Non Risponde");

        javax.swing.GroupLayout MatriceCompilazioneLayout = new javax.swing.GroupLayout(MatriceCompilazione.getContentPane());
        MatriceCompilazione.getContentPane().setLayout(MatriceCompilazioneLayout);
        MatriceCompilazioneLayout.setHorizontalGroup(
            MatriceCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriceCompilazioneLayout.createSequentialGroup()
                .addGroup(MatriceCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatriceCompilazioneLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(MatriceCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MatriceCompilazioneLayout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(111, 111, 111)
                                .addComponent(nonRispondeMatrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))))
                    .addGroup(MatriceCompilazioneLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(titoloMatriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        MatriceCompilazioneLayout.setVerticalGroup(
            MatriceCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriceCompilazioneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(titoloMatriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(MatriceCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(nonRispondeMatrice))
                .addGap(72, 72, 72))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Compila Domanda selezionata");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chiudiCompliazione.setText("Chiudi");
        chiudiCompliazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiCompliazioneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chiudiCompliazione, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(chiudiCompliazione))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>


                                        
    
    
    /**
     * Compila domanda Selezionata
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        d=(DomandaDTO) jList1.getSelectedValue();
    
    	
        if (d instanceof MatriceDTO) {
            MatriceCompilazione.setVisible(true);
            titoloMatriceLabel.setText(d.getTesto());
            

            Object[][] dati = {{new String(d.getRisposte().get(1).getTesto()), new Boolean(false), new Boolean(false), new Boolean(false)},
				            	{new String(d.getRisposte().get(2).getTesto()), new Boolean(false), new Boolean(false), new Boolean(false)},
				            	{new String(d.getRisposte().get(3).getTesto()), new Boolean(false), new Boolean(false), new Boolean(false)},
				            	{new String(d.getRisposte().get(4).getTesto()), new Boolean(false), new Boolean(false), new Boolean(false)},
				            	{new String(d.getRisposte().get(5).getTesto()), new Boolean(false), new Boolean(false), new Boolean(false)},
				            	{new String(d.getRisposte().get(6).getTesto()), new Boolean(false), new Boolean(false), new Boolean(false)}};

            Object[] columnNames = {
                "",
                ((MatriceDTO) d).getValorimatrice().get(0).getTesto(),
                ((MatriceDTO) d).getValorimatrice().get(1).getTesto(),
                ((MatriceDTO) d).getValorimatrice().get(2).getTesto(),
                ((MatriceDTO) d).getValorimatrice().get(3).getTesto(),
                ((MatriceDTO) d).getValorimatrice().get(4).getTesto(),
                ((MatriceDTO) d).getValorimatrice().get(5).getTesto(),
                
            };


            DefaultTableModel myModel = new DefaultTableModel(dati, columnNames);
            jTable1.setModel(myModel);


            jTable1.getColumnModel().getColumn(1).setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
            jTable1.getColumnModel().getColumn(1).setCellEditor(jTable1.getDefaultEditor(Boolean.class));
            jTable1.getColumnModel().getColumn(2).setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
            jTable1.getColumnModel().getColumn(2).setCellEditor(jTable1.getDefaultEditor(Boolean.class));
            jTable1.getColumnModel().getColumn(3).setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
            jTable1.getColumnModel().getColumn(3).setCellEditor(jTable1.getDefaultEditor(Boolean.class));
            jTable1.getColumnModel().getColumn(4).setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
            jTable1.getColumnModel().getColumn(4).setCellEditor(jTable1.getDefaultEditor(Boolean.class));
            jTable1.getColumnModel().getColumn(5).setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
            jTable1.getColumnModel().getColumn(5).setCellEditor(jTable1.getDefaultEditor(Boolean.class));
            jTable1.getColumnModel().getColumn(6).setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
            jTable1.getColumnModel().getColumn(6).setCellEditor(jTable1.getDefaultEditor(Boolean.class));
            
            ///TODO boolean pop=(Boolean) jTable1.getValueAt(1, 1);

        }
        if (d instanceof LiberaDTO){
        	LiberaDTO l=(LiberaDTO) d;
            LiberaCompilazione.setVisible(true);
            titoloLiberaLabel.setText(l.getTesto());
          }
            
        if (d instanceof RangeDTO){
        	RangeDTO r=(RangeDTO) d;
            RangeCompilazione.setVisible(true);
            titoloRangeLabel.setText(r.getTesto());
            jLabel3.setText(r.getRisposte().get(1).getTesto());
            jLabel4.setText(r.getRisposte().get(2).getTesto());
            jLabel5.setText(r.getRisposte().get(3).getTesto());
            jLabel6.setText(r.getRisposte().get(4).getTesto());
            jLabel7.setText(r.getRisposte().get(5).getTesto());
            jLabel8.setText(r.getRisposte().get(6).getTesto());
            comboEnable(jLabel3.getText(), jLabel4.getText(), jLabel5.getText(), jLabel6.getText(), jLabel7.getText(), jLabel8.getText());
        }
        if (d instanceof MultiplaDTO){
        	MultiplaDTO m=(MultiplaDTO) d;
            MultiplaCompilazione.setVisible(true);
            titoloMultiplaLabel.setText(m.getTesto());
            multipla1Check.setText(m.getRisposte().get(1).getTesto());
            multipla2Check.setText(m.getRisposte().get(2).getTesto());
            multipla3Check.setText(m.getRisposte().get(3).getTesto());
            multipla4Check.setText(m.getRisposte().get(4).getTesto());
            multipla5Check.setText(m.getRisposte().get(5).getTesto());
            multipla6Check.setText(m.getRisposte().get(6).getTesto());
            specificare1Text.setEnabled(m.getRisposte().get(1).isHasTestoLibero());
            specificare2Text.setEnabled(m.getRisposte().get(2).isHasTestoLibero());
            specificare3Text.setEnabled(m.getRisposte().get(3).isHasTestoLibero());
            specificare4Text.setEnabled(m.getRisposte().get(4).isHasTestoLibero());
            specificare5Text.setEnabled(m.getRisposte().get(5).isHasTestoLibero());
            specificare6Text.setEnabled(m.getRisposte().get(6).isHasTestoLibero());
        }
    }                                        
    /**
     * Annulla compilazione domanda Libera
     * @param evt
     */
    private void annullaLiberaActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
        liberaTestoArea.setText("");
        LiberaCompilazione.setVisible(false);
    }                                             
    /**
     * Salva compialazione domanda Libera
     * @param evt
     */
    private void salvaLiberaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        String testolibera = liberaTestoArea.getText();
        CompilazioneRispostaDTO c=new CompilazioneRispostaDTO();
        boolean notRisponde=nonRispondeLibera.isSelected();
        c.setCompilazioneAssociataIdCompilazione(compilazione.getIdCompilazione());
        c.setRispostalibera(testolibera);
        c.setRispostaAssociata(d.getRisposte().get(0));
        
        try {
			client.CompilazioneAggiungiCompilazioneRisposta(c);
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
        liberaTestoArea.setText("");
        LiberaCompilazione.setVisible(false);
        
    }                                            
    /**
     * Annulla compilazione domanda Multipla
     * @param evt
     */
    private void annullaMultiplaActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
        
        multipla1Check.setSelected(false);
        multipla2Check.setSelected(false);
        multipla3Check.setSelected(false);
        multipla4Check.setSelected(false);
        multipla5Check.setSelected(false);
        multipla6Check.setSelected(false);
        specificare1Text.setText("");
        specificare2Text.setText("");
        specificare3Text.setText("");
        specificare4Text.setText("");
        specificare5Text.setText("");
        specificare6Text.setText("");
        MultiplaCompilazione.setVisible(false);
    }                                               
    /**
     * Salva compilazione Multipla
     * @param evt
     */
    private void salvaMultiplaActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
        boolean multipla1 = multipla1Check.isSelected();
        boolean multipla2 = multipla2Check.isSelected();
        boolean multipla3 = multipla3Check.isSelected();
        boolean multipla4 = multipla4Check.isSelected();
        boolean multipla5 = multipla5Check.isSelected();
        boolean multipla6 = multipla6Check.isSelected();
        
        
       
        
        multipla1Check.setSelected(false);
        multipla2Check.setSelected(false);
        multipla3Check.setSelected(false);
        multipla4Check.setSelected(false);
        multipla5Check.setSelected(false);
        multipla6Check.setSelected(false);
        
        MultiplaCompilazione.setVisible(false);
        
        
    }                                             
    /**
     * Salva Compilazione Range
     * @param evt
     */
    private void salvaRangeActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
        
    	String range1 = (String) range1Combo.getSelectedItem();
        String range2 = (String) range2Combo.getSelectedItem();
        String range3 = (String) range3Combo.getSelectedItem();
        String range4 = (String) range4Combo.getSelectedItem();
        String range5 = (String) range5Combo.getSelectedItem();
        String range6 = (String) range6Combo.getSelectedItem();
        
        CompilazioneRispostaDTO c=new CompilazioneRispostaDTO();
        
        c.setCompilazioneAssociataIdCompilazione(compilazione.getIdCompilazione());
        
        range1Combo.setSelectedIndex(0);
        range2Combo.setSelectedIndex(0);
        range3Combo.setSelectedIndex(0);
        range4Combo.setSelectedIndex(0);
        range5Combo.setSelectedIndex(0);
        range6Combo.setSelectedIndex(0);
        
        RangeCompilazione.setVisible(false);
    }                                          
    /**
     * Annulla compilazione domanda Range
     * @param evt
     */
    private void annullaRangeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        range1Combo.setSelectedIndex(0);
        range2Combo.setSelectedIndex(0);
        range3Combo.setSelectedIndex(0);
        range4Combo.setSelectedIndex(0);
        range5Combo.setSelectedIndex(0);
        range6Combo.setSelectedIndex(0);
        
        RangeCompilazione.setVisible(false);
        
    }                                            
    /**
     * Chiude CompilazioneGUI
     * @param evt
     */
    private void chiudiCompliazioneActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        
        this.setVisible(false);
    }                                                  
    
    /**
     * Inizializza CompilazioneGUI
     * @throws RemoteException 
     */
    private void inizializza(){
    	jList1.setListData(sondaggio.getDomande().toArray());
    }
    
    
    /**
     * Abilita\Disabilita comboBox compilazione Range
     * @param campo1 Text primo label
     * @param campo2 Text secondo label
     * @param campo3 Text terzo label
     * @param campo4 Text quarto label
     * @param campo5 Text quinto label
     * @param campo6 Text sesto label
     */
    private void comboEnable(String campo1,String campo2,String campo3,String campo4,String campo5,String campo6){
    	if (campo1=="") range1Combo.setEnabled(false);
    	else range1Combo.setEnabled(true);
    	if (campo2=="") range2Combo.setEnabled(false);
    	else range1Combo.setEnabled(true);
    	if (campo3=="") range3Combo.setEnabled(false);
    	else range1Combo.setEnabled(true);
    	if (campo4=="") range4Combo.setEnabled(false);
    	else range1Combo.setEnabled(true);
    	if (campo5=="") range5Combo.setEnabled(false);
    	else range1Combo.setEnabled(true);
    	if (campo6=="") range6Combo.setEnabled(false);
    	else range1Combo.setEnabled(true);
    }
    
    private javax.swing.JDialog LiberaCompilazione;
    private javax.swing.JDialog MatriceCompilazione;
    private javax.swing.JDialog MultiplaCompilazione;
    private javax.swing.JDialog RangeCompilazione;
    private javax.swing.JButton annullaLibera;
    private javax.swing.JButton annullaMultipla;
    private javax.swing.JButton annullaRange;
    private javax.swing.JButton chiudiCompliazione;
    private javax.swing.JButton salvaLibera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea liberaTestoArea;
    private javax.swing.JCheckBox multipla1Check;
    private javax.swing.JCheckBox multipla2Check;
    private javax.swing.JCheckBox multipla3Check;
    private javax.swing.JCheckBox multipla4Check;
    private javax.swing.JCheckBox multipla5Check;
    private javax.swing.JCheckBox multipla6Check;
    private javax.swing.JCheckBox nonRispondeLibera;
    private javax.swing.JCheckBox nonRispondeMatrice;
    private javax.swing.JCheckBox nonRispondeMultipla;
    private javax.swing.JCheckBox nonRispondeRange;
    private javax.swing.JComboBox range1Combo;
    private javax.swing.JComboBox range2Combo;
    private javax.swing.JComboBox range3Combo;
    private javax.swing.JComboBox range4Combo;
    private javax.swing.JComboBox range5Combo;
    private javax.swing.JComboBox range6Combo;
    private javax.swing.JButton salvaMultipla;
    private javax.swing.JButton salvaRange;
    private javax.swing.JLabel specificare1Label;
    private javax.swing.JTextField specificare1Text;
    private javax.swing.JLabel specificare2Label;
    private javax.swing.JTextField specificare2Text;
    private javax.swing.JTextField specificare3Text;
    private javax.swing.JTextField specificare4Text;
    private javax.swing.JTextField specificare5Text;
    private javax.swing.JTextField specificare6Text;
    private javax.swing.JLabel titoloLiberaLabel;
    private javax.swing.JLabel titoloMatriceLabel;
    private javax.swing.JLabel titoloMultiplaLabel;
    private javax.swing.JLabel titoloRangeLabel;
    
}
