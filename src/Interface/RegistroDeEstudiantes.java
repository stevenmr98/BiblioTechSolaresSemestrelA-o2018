package Interface;

import domain.AddStudent;
import domain.Student;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RegistroDeEstudiantes extends javax.swing.JFrame {

    String Carreer = "";
    
    public RegistroDeEstudiantes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        tfd_name = new javax.swing.JTextField();
        cmb_carreer = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        lbl_carreer = new javax.swing.JLabel();
        lbl_success = new javax.swing.JLabel();
        lbl_student = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        lbl_title.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 0));
        lbl_title.setText("Add a Student");

        lbl_name.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Nombre:");

        tfd_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfd_nameFocusGained(evt);
            }
        });
        tfd_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_nameActionPerformed(evt);
            }
        });

        cmb_carreer.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cmb_carreer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informática", "Agronomía", "Educación" }));
        cmb_carreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_carreerActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(0, 0, 153));
        btn_add.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        btn_add.setText("Agregar");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(255, 0, 0));
        btn_exit.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        lbl_carreer.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        lbl_carreer.setForeground(new java.awt.Color(255, 255, 255));
        lbl_carreer.setText("Carrera:");

        lbl_success.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        lbl_success.setForeground(new java.awt.Color(0, 0, 204));
        lbl_success.setText("Succes To Add a Student!");
        lbl_success.setVisible(false);

        lbl_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student.png"))); // NOI18N
        lbl_student.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_student, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_carreer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_carreer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfd_name, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_exit)
                                .addGap(24, 24, 24)
                                .addComponent(btn_add))
                            .addComponent(lbl_success)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_title)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_carreer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_carreer))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_success)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_exit)
                            .addComponent(btn_add)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_title)
                        .addGap(28, 28, 28)
                        .addComponent(lbl_student)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        AddStudent addS = new AddStudent("./Students.dat");
        Student myStudent = new Student(tfd_name.getText(), Carreer);
        try {
            addS.serialize(myStudent);
            lbl_success.setVisible(true);
            tfd_name.setText("");
        } catch (IOException ex) {
            Logger.getLogger(RegistroDeEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroDeEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void cmb_carreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_carreerActionPerformed
        if(cmb_carreer.getSelectedItem().equals("Informática"))
            Carreer="Informática";
        if(cmb_carreer.getSelectedItem().equals("Agronomía"))
            Carreer="Agronomía";
        if(cmb_carreer.getSelectedItem().equals("Educación"))
            Carreer="Educación";
                
    }//GEN-LAST:event_cmb_carreerActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        PrincipalBiblioTech prinBi = new PrincipalBiblioTech();
        this.setVisible(false);
        prinBi.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void tfd_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_nameActionPerformed

    private void tfd_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfd_nameFocusGained
        lbl_success.setVisible(false);
    }//GEN-LAST:event_tfd_nameFocusGained

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
            java.util.logging.Logger.getLogger(RegistroDeEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox<String> cmb_carreer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_carreer;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_student;
    private javax.swing.JLabel lbl_success;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField tfd_name;
    // End of variables declaration//GEN-END:variables
}
