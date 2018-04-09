package Interface;

import DomainClass.AddBook;
import DomainClass.Book;
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
    
    Book myBook = new Book();
    File myFile = new File("./Books.dat");
    AddBook fileBook = new AddBook("./Books.dat");
    int x=0;
     
    public ShowData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        cmb_dataList = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_libros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lbl_title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_title.setText("Show Data");

        cmb_dataList.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        cmb_dataList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros", "Material Audiovisual", "Estudiantes", "Préstamos" }));
        cmb_dataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_dataListActionPerformed(evt);
            }
        });

        tbl_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Editorial", "Autor", "Tipo", "Categoría", "Año", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
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
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_dataList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_title)
                    .addComponent(cmb_dataList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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

    public void TableBookFill() throws IOException, ClassNotFoundException {
        List<Book> booksList = new ArrayList<Book>();
        String fila[] = new String[7];
        if (myFile.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting del objeto
            booksList = (List<Book>) aux;
            objectInput.close();
        }
        for (int i = 0; i < booksList.size(); i++) {

            DefaultTableModel modelo = (DefaultTableModel) tbl_libros.getModel();
            if (i >= 0 && i <= booksList.size()) {
                myBook = fileBook.getBook(i);

                fila[0] = myBook.getName();
                fila[1] = myBook.getEditorial();
                fila[2] = myBook.getAutor();
                fila[3] = myBook.getType();
                fila[4] = myBook.getCategory();
                fila[5] = String.valueOf(myBook.getYear());
                fila[6] = myBook.getISBN();

                modelo.addRow(fila);
                tbl_libros.setModel(modelo);

            }
        }
    }
    
    private void cmb_dataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_dataListActionPerformed
        if(cmb_dataList.getSelectedItem().equals("Libros"))
            try {
                TableBookFill();
//           x=1;
//        if(cmb_dataList.getSelectedItem().equals("Material AudioVisual"))
//           x=2;
//        if(cmb_dataList.getSelectedItem().equals("Estudiantes"))
//           x=3;
//        if(cmb_dataList.getSelectedItem().equals("Préstamos"))
//           x=4;
        } catch (IOException ex) {
            Logger.getLogger(ShowData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_dataListActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_dataList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTable tbl_libros;
    // End of variables declaration//GEN-END:variables
}
