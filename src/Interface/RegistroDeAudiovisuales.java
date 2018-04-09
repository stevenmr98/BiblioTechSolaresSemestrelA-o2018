
package Interface;

import DomainClass.AddAudiovisual;
import DomainClass.Audiovisual;
import DomainClass.Book;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroDeAudiovisuales extends javax.swing.JFrame {
    AddAudiovisual addA = new AddAudiovisual("./Audiovisual.dat");
   
    String Type = "", Condition="";
  
    public RegistroDeAudiovisuales() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        tflBrand = new javax.swing.JTextField();
        comboType = new javax.swing.JComboBox<>();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        tflYear = new javax.swing.JTextField();
        lblCondition = new javax.swing.JLabel();
        comboCondition = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblSuccess = new javax.swing.JLabel();
        tflModel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(204, 0, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Registro de Material Audiovisual");

        lblType.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblType.setText("Tipo: ");

        tflBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflBrandActionPerformed(evt);
            }
        });

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CD", "DVD", "Grabadora", "Laptop", "Parlante", "Proyector" }));
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });

        lblBrand.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBrand.setText("Marca: ");

        lblModel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblModel.setText("Modelo:");

        lblYear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblYear.setText("Año: ");

        tflYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflYearActionPerformed(evt);
            }
        });

        lblCondition.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCondition.setText("Condicion:");

        comboCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Bueno", "Regular" }));
        comboCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConditionActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_video_call_black_48dp_2x.png"))); // NOI18N
        lblImage.setText("jLabel7");

        lblSuccess.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblSuccess.setForeground(new java.awt.Color(255, 0, 51));
        lblSuccess.setText("Success to add!");
        lblSuccess.setVisible(false);

        tflModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflModelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tflYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(lblCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tflBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblModel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tflModel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(btnExit)
                                        .addGap(110, 110, 110)
                                        .addComponent(lblSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(btnAdd))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel)
                    .addComponent(lblBrand)
                    .addComponent(tflBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tflModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(tflYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnExit)
                            .addComponent(lblSuccess))
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tflBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflBrandActionPerformed

    private void tflYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflYearActionPerformed

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
       if(comboType.getSelectedItem().equals("CD's"))
            Type = "CD";
       if(comboType.getSelectedItem().equals("DVD"))
            Type = "DVD";
       if(comboType.getSelectedItem().equals("Grabadora"))
            Type = "Grabadora";
       if(comboType.getSelectedItem().equals("Parlante"))
            Type = "Parlante";
       if(comboType.getSelectedItem().equals("Proyector"))
            Type = "Proyector";
       if(comboType.getSelectedItem().equals("Laptop"))
            Type = "Laptop";
        
    }//GEN-LAST:event_comboTypeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //Renorna al menu principal
        RegistroDeMaterial rm = new RegistroDeMaterial();
        rm.setVisible(true);
        this.setVisible(false);
                                 
    }//GEN-LAST:event_btnExitActionPerformed

    private void comboConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConditionActionPerformed
       
        if(comboCondition.getSelectedItem().equals("Excelente"))
            Type = "Excelente";
        if(comboCondition.getSelectedItem().equals("Bueno"))
            Type = "Bueno";
         if(comboCondition.getSelectedItem().equals("Regular"))
            Type = "Regular";
  
    }//GEN-LAST:event_comboConditionActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
               Audiovisual myAudio =new Audiovisual(tflModel.getText(),tflBrand.getText() , Type, Condition, Integer.parseInt(tflYear.getText()));
        try {
            addA.serialize(myAudio);
           lblSuccess.setVisible(true);

           
        } catch (IOException ex) {
            Logger.getLogger(RegistroLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
           tflBrand.setText("");
           tflModel.setText("");
           tflYear.setText("");
      
    }//GEN-LAST:event_btnAddActionPerformed

    private void tflModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflModelActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeAudiovisuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeAudiovisuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeAudiovisuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeAudiovisuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeAudiovisuales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> comboCondition;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCondition;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSuccess;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField tflBrand;
    private javax.swing.JTextField tflModel;
    private javax.swing.JTextField tflYear;
    // End of variables declaration//GEN-END:variables
}
