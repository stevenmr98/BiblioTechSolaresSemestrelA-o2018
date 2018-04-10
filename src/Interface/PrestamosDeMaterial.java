package Interface;

import domain.AddStudent;
import domain.Book;
import domain.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrestamosDeMaterial extends javax.swing.JFrame {

    //instancias
    File myFile = new File("./Students.dat");
    Student myStudent = new Student();
    AddStudent studentFile = new AddStudent("./Students.dat");
    
    public PrestamosDeMaterial() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    //metodo que evalua la existencia del estudiante
    public boolean foundStudent() throws FileNotFoundException, IOException, ClassNotFoundException{
        List<Student> studentList = new ArrayList<Student>();
        if (myFile.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting del objeto
            studentList = (List<Student>) aux;
            objectInput.close();
        }
        for (int i = 0; i < studentList.size(); i++) {
            myStudent = studentFile.getStudent(i);
            if(myStudent.getID().equalsIgnoreCase(tfd_id.getText()))
                return true;
        
    }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        tfd_id = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        lbl_found = new javax.swing.JLabel();
        lbl_instruction = new javax.swing.JLabel();
        btn_books = new javax.swing.JButton();
        btn_AudiVi = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        lbl_title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_title.setText("Préstamos de Materiales");

        lbl_id.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        lbl_id.setText("Carné:");

        btn_search.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        btn_search.setText("Buscar");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        lbl_found.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_found.setForeground(new java.awt.Color(0, 0, 204));
        lbl_found.setText("Estudiante Encontrado!");
        lbl_found.setVisible(false);

        lbl_instruction.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_instruction.setText("A continuación seleccione el material que desea solicitar:");

        btn_books.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_books.setText("Libros");
        btn_books.setEnabled(false);
        btn_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_booksActionPerformed(evt);
            }
        });

        btn_AudiVi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_AudiVi.setText("Material AudioVisual");
        btn_AudiVi.setEnabled(false);
        btn_AudiVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AudiViActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
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
                        .addComponent(lbl_title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lbl_found))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_instruction)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(lbl_id)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfd_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_search))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_books)
                            .addGap(44, 44, 44)
                            .addComponent(btn_AudiVi)
                            .addGap(17, 17, 17)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btn_exit)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(tfd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(31, 31, 31)
                .addComponent(lbl_found)
                .addGap(35, 35, 35)
                .addComponent(lbl_instruction)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_books)
                    .addComponent(btn_AudiVi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_booksActionPerformed
        this.setVisible(false);
        try {
            BusqLibros searchBook = new BusqLibros();
            searchBook.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(PrestamosDeMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrestamosDeMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_booksActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {
            if(foundStudent()==true){
                lbl_found.setVisible(true);
                btn_books.setEnabled(true);
                btn_AudiVi.setEnabled(true);
            }
                } catch (IOException ex) {
            Logger.getLogger(PrestamosDeMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrestamosDeMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.setVisible(false);
        PrincipalBiblioTech pTech = new PrincipalBiblioTech();
        pTech.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_AudiViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AudiViActionPerformed
        this.setVisible(false);
        try {
            SearchAudiovisual searAudVi = new SearchAudiovisual();
            searAudVi.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(PrestamosDeMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrestamosDeMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AudiViActionPerformed

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
            java.util.logging.Logger.getLogger(PrestamosDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamosDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamosDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamosDeMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamosDeMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AudiVi;
    private javax.swing.JButton btn_books;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_found;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_instruction;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField tfd_id;
    // End of variables declaration//GEN-END:variables
}
