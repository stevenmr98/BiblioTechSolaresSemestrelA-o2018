
package Interface;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PrincipalBiblioTech extends javax.swing.JFrame {

   
    public PrincipalBiblioTech() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BiblioTechSolares");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Images/Back.jpg"));
        JLabel Background= new JLabel();
        Background.setIcon(uno);
        getLayeredPane().add(Background,JLayeredPane.FRAME_CONTENT_LAYER);
        Background.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
         this.add(Background, BorderLayout.CENTER);
        this.setSize(Background.getWidth(), Background.getHeight());
    }

  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regMat = new javax.swing.JButton();
        btn_prestamos = new javax.swing.JButton();
        btn_regStud = new javax.swing.JButton();
        btn_listdat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));

        btn_regMat.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_regMat.setText("Registro de Material");
        btn_regMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regMatActionPerformed(evt);
            }
        });

        btn_prestamos.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_prestamos.setText("Préstamos");
        btn_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamosActionPerformed(evt);
            }
        });

        btn_regStud.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_regStud.setText("Registro de Estudiantes");
        btn_regStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regStudActionPerformed(evt);
            }
        });

        btn_listdat.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_listdat.setText("Lista de Datos");
        btn_listdat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listdatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_regMat)
                .addGap(18, 18, 18)
                .addComponent(btn_prestamos)
                .addGap(18, 18, 18)
                .addComponent(btn_regStud)
                .addGap(18, 18, 18)
                .addComponent(btn_listdat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_regStud)
                    .addComponent(btn_prestamos)
                    .addComponent(btn_regMat)
                    .addComponent(btn_listdat))
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regMatActionPerformed
        RegistroDeMaterial regMat = new RegistroDeMaterial();
        regMat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regMatActionPerformed

    private void btn_regStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regStudActionPerformed
        RegistroDeEstudiantes regStud= new RegistroDeEstudiantes();
        regStud.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regStudActionPerformed

    private void btn_listdatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listdatActionPerformed
        ShowData show;
        try {
            show = new ShowData();
            show.setVisible(true);
        this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalBiblioTech.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalBiblioTech.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_listdatActionPerformed

    private void btn_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamosActionPerformed
        this.setVisible(false);
        PrestamosDeMaterial prestMater = new PrestamosDeMaterial();
        prestMater.setVisible(true);
    }//GEN-LAST:event_btn_prestamosActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalBiblioTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalBiblioTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalBiblioTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalBiblioTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalBiblioTech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_listdat;
    private javax.swing.JButton btn_prestamos;
    private javax.swing.JButton btn_regMat;
    private javax.swing.JButton btn_regStud;
    // End of variables declaration//GEN-END:variables
}
