package Interface;

public class RegistroDeMaterial extends javax.swing.JFrame {

    public RegistroDeMaterial() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_libros = new javax.swing.JButton();
        lbl_regmaterial = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        btn_mtAdVi = new javax.swing.JButton();
        lbl_iconReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_libros.setBackground(new java.awt.Color(51, 51, 0));
        btn_libros.setFont(new java.awt.Font("Ebrima", 1, 20)); // NOI18N
        btn_libros.setForeground(new java.awt.Color(255, 255, 255));
        btn_libros.setText("Libros");
        btn_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_librosActionPerformed(evt);
            }
        });

        lbl_regmaterial.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        lbl_regmaterial.setForeground(new java.awt.Color(0, 0, 102));
        lbl_regmaterial.setText("¿Qué tipo de Material va a registrar?");

        btn_exit.setBackground(new java.awt.Color(153, 0, 102));
        btn_exit.setFont(new java.awt.Font("Ebrima", 1, 20)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_mtAdVi.setBackground(new java.awt.Color(204, 0, 0));
        btn_mtAdVi.setFont(new java.awt.Font("Ebrima", 1, 20)); // NOI18N
        btn_mtAdVi.setForeground(new java.awt.Color(255, 255, 255));
        btn_mtAdVi.setText("Material Audiovisual");
        btn_mtAdVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mtAdViActionPerformed(evt);
            }
        });

        lbl_iconReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registro.jpg"))); // NOI18N
        lbl_iconReg.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_regmaterial)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_iconReg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_exit)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_libros)
                            .addComponent(btn_mtAdVi))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_regmaterial)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_mtAdVi)
                        .addGap(114, 114, 114)
                        .addComponent(btn_exit)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_iconReg)
                            .addComponent(btn_libros))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_librosActionPerformed
        btn_libros.setEnabled(false);
        RegistroLibros rL = new RegistroLibros();
        rL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_librosActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.setVisible(false);
        PrincipalBiblioTech pBiblio = new PrincipalBiblioTech();
        pBiblio.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_mtAdViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mtAdViActionPerformed
        RegistroDeAudiovisuales regAuVi = new RegistroDeAudiovisuales();
        regAuVi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_mtAdViActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_libros;
    private javax.swing.JButton btn_mtAdVi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_iconReg;
    private javax.swing.JLabel lbl_regmaterial;
    // End of variables declaration//GEN-END:variables
}
