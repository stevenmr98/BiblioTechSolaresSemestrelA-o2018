/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import domain.AddBook;
import domain.Book;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroLibros extends javax.swing.JFrame {

    //Instancias
    AddBook addB = new AddBook("./Books.dat");
    Book myBook = new Book();
    
    String Type = "Físico", Category="Cuentos";
    
    public RegistroLibros() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cmb_type = new javax.swing.JComboBox<>();
        lbl_title = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        tfd_name = new javax.swing.JTextField();
        lbl_category = new javax.swing.JLabel();
        cmb_category = new javax.swing.JComboBox<>();
        lbl_year = new javax.swing.JLabel();
        lbl_editorial = new javax.swing.JLabel();
        tfd_editorial = new javax.swing.JTextField();
        tfd_year = new javax.swing.JTextField();
        lbl_regBook = new javax.swing.JLabel();
        lbl_autor = new javax.swing.JLabel();
        tfd_autor = new javax.swing.JTextField();
        btn_addBook = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        lbl_success = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        cmb_type.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fisico", "Digital" }));
        cmb_type.setVisible(true);
        cmb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_typeActionPerformed(evt);
            }
        });

        lbl_title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_title.setText("Registre su Libro y sus Características");

        lbl_type.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lbl_type.setText("Tipo:");

        lbl_name.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lbl_name.setText("Nombre:");

        tfd_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfd_nameFocusGained(evt);
            }
        });

        lbl_category.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lbl_category.setText("Categoría:");

        cmb_category.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuentos", "Informática", "Agronomía", "Educación" }));
        cmb_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoryActionPerformed(evt);
            }
        });

        lbl_year.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lbl_year.setText("Año:");

        lbl_editorial.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lbl_editorial.setText("Editorial:");

        tfd_editorial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfd_editorialFocusGained(evt);
            }
        });

        tfd_year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfd_yearFocusGained(evt);
            }
        });

        lbl_regBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegLibro.png"))); // NOI18N

        lbl_autor.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lbl_autor.setText("Autor:");

        tfd_autor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfd_autorFocusGained(evt);
            }
        });

        btn_addBook.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        btn_addBook.setText("Agregar");
        btn_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBookActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        lbl_success.setFont(new java.awt.Font("Eras Demi ITC", 1, 30)); // NOI18N
        lbl_success.setForeground(new java.awt.Color(0, 0, 153));
        lbl_success.setText("Succes to Add a Book!");
        lbl_success.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_exit)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_editorial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfd_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_autor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfd_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_category)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_regBook, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addBook)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_type)
                                .addGap(149, 149, 149)
                                .addComponent(lbl_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfd_name, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(lbl_year)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfd_year, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(lbl_success)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_title)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_type)
                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_name)
                    .addComponent(tfd_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_year)
                    .addComponent(tfd_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_editorial)
                    .addComponent(tfd_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_autor)
                    .addComponent(tfd_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_category)
                    .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_exit)
                    .addComponent(lbl_regBook)
                    .addComponent(btn_addBook))
                .addGap(26, 26, 26)
                .addComponent(lbl_success)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBookActionPerformed
        myBook = new Book(tfd_name.getText(), tfd_editorial.getText(), tfd_autor.getText(), Type, Category, Integer.parseInt(tfd_year.getText()));
        try {
            addB.serialize(myBook);
            lbl_success.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(RegistroLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfd_name.setText("");
        tfd_autor.setText("");
        tfd_editorial.setText("");
        tfd_year.setText("");
    }//GEN-LAST:event_btn_addBookActionPerformed

    private void cmb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_typeActionPerformed
        if(cmb_type.getSelectedItem().equals("Fisico")){
        Type = "Fisico";
        lbl_success.setVisible(false);
        }
            
        if(cmb_type.getSelectedItem().equals("Digital")){
            Type = "Digital";
        lbl_success.setVisible(false);
    }
            
    }//GEN-LAST:event_cmb_typeActionPerformed

    private void cmb_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoryActionPerformed
        if(cmb_category.getSelectedItem().equals("Cuentos")){
            Category = "Cuentos";
            lbl_success.setVisible(false);
        }
            
        if(cmb_category.getSelectedItem().equals("Informática")){
            Category = "Informática";
            lbl_success.setVisible(false);
        }
        if(cmb_category.getSelectedItem().equals("Agronomía")){
            Category = "Agronomía";
            lbl_success.setVisible(false);
        }
        if(cmb_category.getSelectedItem().equals("Educación")){
            Category = "Educación";
            lbl_success.setVisible(false);
        }

    }//GEN-LAST:event_cmb_categoryActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        RegistroDeMaterial regMat = new RegistroDeMaterial();
        this.setVisible(false);
        regMat.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void tfd_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfd_nameFocusGained
        lbl_success.setVisible(false);
    }//GEN-LAST:event_tfd_nameFocusGained

    private void tfd_yearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfd_yearFocusGained
        lbl_success.setVisible(false);
    }//GEN-LAST:event_tfd_yearFocusGained

    private void tfd_editorialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfd_editorialFocusGained
        lbl_success.setVisible(false);
    }//GEN-LAST:event_tfd_editorialFocusGained

    private void tfd_autorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfd_autorFocusGained
        lbl_success.setVisible(false);
    }//GEN-LAST:event_tfd_autorFocusGained

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
            java.util.logging.Logger.getLogger(RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addBook;
    private javax.swing.JButton btn_exit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_category;
    private javax.swing.JComboBox<String> cmb_type;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_editorial;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_regBook;
    private javax.swing.JLabel lbl_success;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JTextField tfd_autor;
    private javax.swing.JTextField tfd_editorial;
    private javax.swing.JTextField tfd_name;
    private javax.swing.JTextField tfd_year;
    // End of variables declaration//GEN-END:variables
}
