package gui;

/**
*
* @author 727826-729399
*/
public class AboutGUI extends javax.swing.JFrame {

    /**
     * Costruttore di AboutGUI
     */
    public AboutGUI() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * Inizializza AboutGUI
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        aboutLabel = new javax.swing.JLabel();
        aboutChiudi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aboutLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aboutLabel.setText("Poll Manager v1.0");

        aboutChiudi.setText("Chiudi");
        aboutChiudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutChiudiActionPerformed(evt);
            }
        });

        jLabel1.setText("Giarola Francesco-727826");

        jLabel2.setText("Merli Alberto - 729399");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(aboutLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(aboutChiudi)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(aboutChiudi)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }



    /**
     * Nasconde AboutGUI
     * @param evt
     */
    private void aboutChiudiActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        this.setVisible(false);
    }                                           

  
    private javax.swing.JButton aboutChiudi;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
}
