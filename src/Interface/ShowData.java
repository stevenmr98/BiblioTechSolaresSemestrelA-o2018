package Interface;

import domain.AddAudiovisual;
import domain.AddBook;
import domain.AddLoans;
import domain.AddStudent;
import domain.Audiovisual;
import domain.Book;
import domain.Loans;
import domain.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ShowData extends javax.swing.JFrame {

    //instancias
    Book myBook = new Book();
    Audiovisual myAudVi = new Audiovisual();
    Student myStudent = new Student();
    Loans myLoans = new Loans();
    File myFile = new File("./Books.dat");
    File myFileStu = new File("./Students.dat");
    File myFileAV = new File("./Audiovisual.dat");
    File myFileLoans = new File("./Loans.dat");
    AddBook fileBook = new AddBook("./Books.dat");
    AddStudent fileStudent = new AddStudent("./Students.dat");
    AddLoans fileLoans = new AddLoans(myFileLoans);
    AddAudiovisual fileAuVi = new AddAudiovisual("./Audiovisual.dat");
    
    public ShowData() throws IOException, ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        TableAudioVisualFill();
        TableBookFill();
        TableStudentFill();
        TablePrestamosFill();
    }
    
    //Metodo que llena la table con los datos de los libros
    public void TableBookFill() throws IOException, ClassNotFoundException {
        List<Book> booksList = new ArrayList<Book>();
        String fila[] = new String[8];
        //valida la existencia del archivo
        if (myFile.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting del objeto
            booksList = (List<Book>) aux;
            objectInput.close();
        }
        //recorre el objeto y le asigna los datos a cada posición de la tabla
        for (int i = 0; i < booksList.size(); i++) {

            DefaultTableModel modelo2 = (DefaultTableModel) tbl_libros.getModel();
            if (i >= 0 && i <= booksList.size()) {
                myBook = fileBook.getBook(i);

                fila[0] = myBook.getName();
                fila[1] = myBook.getEditorial();
                fila[2] = myBook.getAutor();
                fila[3] = myBook.getType();
                fila[4] = myBook.getCategory();
                fila[5] = String.valueOf(myBook.getYear());
                fila[6] = myBook.getID();
                fila[7] = String.valueOf(myBook.isAvailable());
                

                modelo2.addRow(fila);
                tbl_libros.setModel(modelo2);

            }
        }
    }
    
    //Metodo que llena la table con los datos del material audiovisual
    public void TableAudioVisualFill() throws IOException, ClassNotFoundException {
        List<Audiovisual> audioVisualList = new ArrayList<Audiovisual>();
        String fila1[] = new String[7];
        //valida la existencia del archivo
        if (myFileAV.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFileAV));
            Object aux = objectInput.readObject();

            //casting del objeto
            audioVisualList = (List<Audiovisual>) aux;
            objectInput.close();
        }
        //recorre el objeto y le asigna los datos a cada posición de la tabla
        for (int i = 0; i < audioVisualList.size(); i++) {

            DefaultTableModel modelo1 = (DefaultTableModel) tbl_audioVisual.getModel();
            if (i >= 0 && i <= audioVisualList.size()) {
                myAudVi = fileAuVi.getAudio(i);

                fila1[0] = myAudVi.getModel();
                fila1[1] = myAudVi.getBrand();
                fila1[2] = myAudVi.getCategory();
                fila1[3] = myAudVi.getCondition();
                fila1[4] = String.valueOf(myAudVi.getYear());
                fila1[5] = String.valueOf(myAudVi.getID());
                fila1[6] = String.valueOf(myAudVi.isAvailable());
                
                modelo1.addRow(fila1);
                tbl_audioVisual.setModel(modelo1);

            }
        }
    }
    
    //Metodo que llena la table con los datos de los estudiantes
    public void TableStudentFill() throws IOException, ClassNotFoundException {
        List<Student> studentList = new ArrayList<Student>();
        String fila2[] = new String[4];
        //valida la existencia del archivo
        if (myFileStu.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFileStu));
            Object aux = objectInput.readObject();

            //casting del objeto
            studentList = (List<Student>) aux;
            objectInput.close();
        }
        //recorre el objeto y le asigna los datos a cada posición de la tabla
        for (int i = 0; i < studentList.size(); i++) {

            DefaultTableModel modelo3 = (DefaultTableModel) tbl_student.getModel();
//            if (i >= 0 && i <= studentList.size()) {
                myStudent = fileStudent.getStudent(i);

                fila2[0] = myStudent.getName();
                fila2[1] = myStudent.getCarreer();
                fila2[2] = String.valueOf(myStudent.getYear());
                fila2[3] = myStudent.getID();
                
                modelo3.addRow(fila2);
                tbl_student.setModel(modelo3);

//            }
        }
    }
    
    //Metodo que llena la table con los datos de los prestamos
     public void TablePrestamosFill() throws IOException, ClassNotFoundException {
        List<Loans> LoanList = new ArrayList<Loans>();
        String fila3[] = new String[2];
        //recorre el objeto y le asigna los datos a cada posición de la tabla
        for (int i = 0; i < fileLoans.fileSize(); i++) {

            DefaultTableModel modelo3 = (DefaultTableModel) tbl_prestamos.getModel();
                myLoans = fileLoans.getLoan(i);

                fila3[0] = myLoans.getID();
                fila3[1] = myLoans.getDate();
                
                modelo3.addRow(fila3);
                tbl_prestamos.setModel(modelo3);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_libros = new javax.swing.JTable();
        btn_exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_exit1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_audioVisual = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_exit2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_student = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_prestamos = new javax.swing.JTable();
        btn_exit3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 0));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        tbl_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Editorial", "Autor", "Tipo", "Categoría", "Año", "ID", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_libros.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_libros);
        if (tbl_libros.getColumnModel().getColumnCount() > 0) {
            tbl_libros.getColumnModel().getColumn(0).setResizable(false);
            tbl_libros.getColumnModel().getColumn(1).setResizable(false);
            tbl_libros.getColumnModel().getColumn(2).setResizable(false);
            tbl_libros.getColumnModel().getColumn(3).setResizable(false);
            tbl_libros.getColumnModel().getColumn(4).setResizable(false);
            tbl_libros.getColumnModel().getColumn(5).setResizable(false);
            tbl_libros.getColumnModel().getColumn(6).setResizable(false);
            tbl_libros.getColumnModel().getColumn(7).setResizable(false);
        }

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btn_exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_exit)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Books", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });

        btn_exit1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_exit1.setText("Salir");
        btn_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit1ActionPerformed(evt);
            }
        });

        tbl_audioVisual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Categoría", "Condición", "Year", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_audioVisual.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_audioVisual);
        if (tbl_audioVisual.getColumnModel().getColumnCount() > 0) {
            tbl_audioVisual.getColumnModel().getColumn(0).setResizable(false);
            tbl_audioVisual.getColumnModel().getColumn(1).setResizable(false);
            tbl_audioVisual.getColumnModel().getColumn(2).setResizable(false);
            tbl_audioVisual.getColumnModel().getColumn(3).setResizable(false);
            tbl_audioVisual.getColumnModel().getColumn(4).setResizable(false);
            tbl_audioVisual.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btn_exit1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_exit1)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Material AudioVisual", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 0));

        btn_exit2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_exit2.setText("Salir");
        btn_exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit2ActionPerformed(evt);
            }
        });

        tbl_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Carrera", "Carné", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_student.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_student);
        if (tbl_student.getColumnModel().getColumnCount() > 0) {
            tbl_student.getColumnModel().getColumn(0).setResizable(false);
            tbl_student.getColumnModel().getColumn(1).setResizable(false);
            tbl_student.getColumnModel().getColumn(2).setResizable(false);
            tbl_student.getColumnModel().getColumn(2).setHeaderValue("Carné");
            tbl_student.getColumnModel().getColumn(3).setResizable(false);
            tbl_student.getColumnModel().getColumn(3).setHeaderValue("ID");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btn_exit2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_exit2)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Students", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        tbl_prestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_prestamos.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbl_prestamos);
        if (tbl_prestamos.getColumnModel().getColumnCount() > 0) {
            tbl_prestamos.getColumnModel().getColumn(0).setResizable(false);
            tbl_prestamos.getColumnModel().getColumn(1).setResizable(false);
        }

        btn_exit3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_exit3.setText("Salir");
        btn_exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btn_exit3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btn_exit3)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Préstamos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.setVisible(false);
        PrincipalBiblioTech pTech = new PrincipalBiblioTech();
        pTech.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit1ActionPerformed
        this.setVisible(false);
        PrincipalBiblioTech pTech = new PrincipalBiblioTech();
        pTech.setVisible(true);
    }//GEN-LAST:event_btn_exit1ActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
       
    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
        
    }//GEN-LAST:event_jPanel2FocusGained

    private void btn_exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit2ActionPerformed
        this.setVisible(false);
        PrincipalBiblioTech pTech = new PrincipalBiblioTech();
        pTech.setVisible(true);
    }//GEN-LAST:event_btn_exit2ActionPerformed

    private void btn_exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit3ActionPerformed
        this.setVisible(false);
        PrincipalBiblioTech pTech = new PrincipalBiblioTech();
        pTech.setVisible(true);
    }//GEN-LAST:event_btn_exit3ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShowData().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ShowData.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ShowData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_exit1;
    private javax.swing.JButton btn_exit2;
    private javax.swing.JButton btn_exit3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_audioVisual;
    private javax.swing.JTable tbl_libros;
    private javax.swing.JTable tbl_prestamos;
    private javax.swing.JTable tbl_student;
    // End of variables declaration//GEN-END:variables
}
