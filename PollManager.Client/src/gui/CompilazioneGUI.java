package gui;

import java.util.Date;

import javax.swing.table.DefaultTableModel;

import dto.CompilazioneDTO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto
 */
public class CompilazioneGUI extends javax.swing.JFrame {

    private String tipodomanda="MATRICE", testolibera, titoloDomanda;
    private boolean multipla1, multipla2, multipla3, multipla4, multipla5, multipla6;
    private String range1, range2, range3, range4, range5, range6;
    private String valorematrice1,valorematrice2,valorematrice3,valorematrice4,valorematrice5,valorematrice6;
    /**
     * Creates new form CompilazioneGUI
     */
    public CompilazioneGUI() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        LiberaCompilazione = new javax.swing.JDialog();
        titoloLiberaLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liberaTestoArea = new javax.swing.JTextArea();
        chiudiLibera = new javax.swing.JButton();
        annullaLibera = new javax.swing.JButton();
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
        MatriceCompilazione = new javax.swing.JDialog();
        titoloMatriceLabel = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        chiudiCompliazione = new javax.swing.JButton();

        LiberaCompilazione.setMaximumSize(new java.awt.Dimension(540, 320));
        LiberaCompilazione.setMinimumSize(new java.awt.Dimension(540, 320));

        titoloLiberaLabel.setText("jLabel1");

        liberaTestoArea.setColumns(20);
        liberaTestoArea.setRows(5);
        jScrollPane2.setViewportView(liberaTestoArea);

        chiudiLibera.setLabel("Salva");
        chiudiLibera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiLiberaActionPerformed(evt);
            }
        });

        annullaLibera.setText("Annulla");
        annullaLibera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annullaLiberaMouseClicked(evt);
            }
        });
        annullaLibera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaLiberaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LiberaCompilazioneLayout = new javax.swing.GroupLayout(LiberaCompilazione.getContentPane());
        LiberaCompilazione.getContentPane().setLayout(LiberaCompilazioneLayout);
        LiberaCompilazioneLayout.setHorizontalGroup(
            LiberaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LiberaCompilazioneLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(LiberaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LiberaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LiberaCompilazioneLayout.createSequentialGroup()
                            .addComponent(chiudiLibera, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(annullaLibera, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(titoloLiberaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(chiudiLibera))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        MultiplaCompilazione.setMinimumSize(new java.awt.Dimension(378, 351));

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

        javax.swing.GroupLayout MultiplaCompilazioneLayout = new javax.swing.GroupLayout(MultiplaCompilazione.getContentPane());
        MultiplaCompilazione.getContentPane().setLayout(MultiplaCompilazioneLayout);
        MultiplaCompilazioneLayout.setHorizontalGroup(
            MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                            .addComponent(salvaMultipla, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(annullaMultipla))
                        .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                            .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(multipla1Check)
                                .addComponent(multipla2Check)
                                .addComponent(multipla3Check))
                            .addGap(99, 99, 99)
                            .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(multipla4Check)
                                .addComponent(multipla5Check)
                                .addComponent(multipla6Check))))
                    .addComponent(titoloMultiplaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        MultiplaCompilazioneLayout.setVerticalGroup(
            MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiplaCompilazioneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titoloMultiplaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multipla1Check)
                    .addComponent(multipla4Check))
                .addGap(18, 18, 18)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multipla2Check)
                    .addComponent(multipla5Check))
                .addGap(18, 18, 18)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multipla3Check)
                    .addComponent(multipla6Check))
                .addGap(43, 43, 43)
                .addGroup(MultiplaCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvaMultipla)
                    .addComponent(annullaMultipla))
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
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(range1Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range2Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range3Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range4Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range5Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(range6Combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(annullaRange, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salvaRange, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        RangeCompilazioneLayout.setVerticalGroup(
            RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RangeCompilazioneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloRangeLabel)
                .addGap(23, 23, 23)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(range1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(range2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(range3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(range4Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(range5Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(range6Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(RangeCompilazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvaRange)
                    .addComponent(annullaRange))
                .addContainerGap(50, Short.MAX_VALUE))
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
                    .addComponent(jButton8))
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

    private void annullaLiberaMouseClicked(java.awt.event.MouseEvent evt) {                                           
        
        
    }                                          
    /**
     * 
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (tipodomanda == "MATRICE") {
            MatriceCompilazione.setVisible(true);
            titoloMatriceLabel.setText(titoloDomanda);

            Object[][] dati = {{new String("pluto"), new Boolean(false), new Boolean(false), new Boolean(false)}};

            Object[] columnNames = {
                "",
                valorematrice1,
                valorematrice2,
                valorematrice3,
                valorematrice4,
                valorematrice5,
                valorematrice6,
                
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
            
            

        }
        if (tipodomanda=="LIBERA"){
            LiberaCompilazione.setVisible(true);
            titoloLiberaLabel.setText(titoloDomanda);
        }
            
        if (tipodomanda=="RANGE"){
            RangeCompilazione.setVisible(true);
            titoloRangeLabel.setText(titoloDomanda);
        }
        if (tipodomanda=="MULTIPLA"){
            MultiplaCompilazione.setVisible(true);
            titoloMultiplaLabel.setText(titoloDomanda);
        }
    }                                        
    /**
     * 
     * @param evt
     */
    private void annullaLiberaActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
        liberaTestoArea.setText("");
        LiberaCompilazione.setVisible(false);
    }                                             
    /**
     * 
     * @param evt
     */
    private void chiudiLiberaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        testolibera=liberaTestoArea.getText();
        liberaTestoArea.setText("");
        LiberaCompilazione.setVisible(false);
        
    }                                            
    /**
     * 
     * @param evt
     */
    private void annullaMultiplaActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
        
        multipla1Check.setSelected(false);
        multipla2Check.setSelected(false);
        multipla3Check.setSelected(false);
        multipla4Check.setSelected(false);
        multipla5Check.setSelected(false);
        multipla6Check.setSelected(false);
        
        MultiplaCompilazione.setVisible(false);
    }                                               
    /**
     * 
     * @param evt
     */
    private void salvaMultiplaActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
        multipla1=multipla1Check.isSelected();
        multipla2=multipla2Check.isSelected();
        multipla3=multipla3Check.isSelected();
        multipla4=multipla4Check.isSelected();
        multipla5=multipla5Check.isSelected();
        multipla6=multipla6Check.isSelected();
        
        CompilazioneDTO compilazione =new CompilazioneDTO();
        compilazione.setDatacompilazione(new Date());
       
        
        multipla1Check.setSelected(false);
        multipla2Check.setSelected(false);
        multipla3Check.setSelected(false);
        multipla4Check.setSelected(false);
        multipla5Check.setSelected(false);
        multipla6Check.setSelected(false);
        
        MultiplaCompilazione.setVisible(false);
        
        
    }                                             
    /**
     * 
     * @param evt
     */
    private void salvaRangeActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
        range1=(String) range1Combo.getSelectedItem();
        range2=(String) range2Combo.getSelectedItem();
        range3=(String) range3Combo.getSelectedItem();
        range4=(String) range4Combo.getSelectedItem();
        range5=(String) range5Combo.getSelectedItem();
        range6=(String) range6Combo.getSelectedItem();
        
        range1Combo.setSelectedIndex(0);
        range2Combo.setSelectedIndex(0);
        range3Combo.setSelectedIndex(0);
        range4Combo.setSelectedIndex(0);
        range5Combo.setSelectedIndex(0);
        range6Combo.setSelectedIndex(0);
        
        RangeCompilazione.setVisible(false);
    }                                          
    /**
     * 
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
     * 
     * @param evt
     */
    private void chiudiCompliazioneActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        
        this.setVisible(false);
    }                                                  

   
    // Variables declaration - do not modify
    private javax.swing.JDialog LiberaCompilazione;
    private javax.swing.JDialog MatriceCompilazione;
    private javax.swing.JDialog MultiplaCompilazione;
    private javax.swing.JDialog RangeCompilazione;
    private javax.swing.JButton annullaLibera;
    private javax.swing.JButton annullaMultipla;
    private javax.swing.JButton annullaRange;
    private javax.swing.JButton chiudiCompliazione;
    private javax.swing.JButton chiudiLibera;
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
    private javax.swing.JComboBox range1Combo;
    private javax.swing.JComboBox range2Combo;
    private javax.swing.JComboBox range3Combo;
    private javax.swing.JComboBox range4Combo;
    private javax.swing.JComboBox range5Combo;
    private javax.swing.JComboBox range6Combo;
    private javax.swing.JButton salvaMultipla;
    private javax.swing.JButton salvaRange;
    private javax.swing.JLabel titoloLiberaLabel;
    private javax.swing.JLabel titoloMatriceLabel;
    private javax.swing.JLabel titoloMultiplaLabel;
    private javax.swing.JLabel titoloRangeLabel;
    // End of variables declaration
}
