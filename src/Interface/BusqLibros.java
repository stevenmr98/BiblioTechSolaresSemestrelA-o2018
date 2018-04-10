package Interface;
import com.mxrck.autocompleter.TextAutoCompleter;
import domain.AddBook;
import domain.AddLoans;
import domain.Audiovisual;
import domain.Book;
import domain.Loans;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BusqLibros extends javax.swing.JFrame {

    //instancias
    Book myBook = new Book();
    Loans loan = new Loans();
    File myFile = new File("./Books.dat");
    File myFileLoan = new File("./Loans.dat");
    AddBook addBook = new AddBook("./Books.dat");
    AddLoans addLoan = new AddLoans(myFileLoan);
    Calendar fecha = new GregorianCalendar();
    int ano = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH)+1;
    int dia = fecha.get(Calendar.DAY_OF_MONTH);
    String date = dia+"/"+mes+"/"+ano;
    
    public BusqLibros() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        autoCompleteText();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    //metodo que autocompleta lo que se está escribiendo
    public void autoCompleteText() throws FileNotFoundException, IOException, ClassNotFoundException{
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(tfd_book);
        List<Book> booksList = new ArrayList<Book>();
        if (myFile.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting del objeto
            booksList = (List<Book>) aux;
            objectInput.close();
        }
        for (int i = 0; i < booksList.size(); i++) {
            if (i >= 0 && i <= booksList.size()) {
            myBook = addBook.getBook(i);
            textAutoCompleter.addItem(myBook.getID());
            textAutoCompleter.addItem(myBook.getName());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_bookid = new javax.swing.JLabel();
        tfd_book = new javax.swing.JTextField();
        lbl_borrowedBook = new javax.swing.JLabel();
        btn_solicitar = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        lbl_title.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbl_title.setText("Búsqueda de Libros");

        lbl_bookid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_bookid.setText("Ingrese el código del Libro:");

        tfd_book.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfd_bookFocusGained(evt);
            }
        });
        tfd_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfd_bookMouseClicked(evt);
            }
        });
        tfd_book.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfd_bookKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfd_bookKeyTyped(evt);
            }
        });

        lbl_borrowedBook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_borrowedBook.setText("Libro Prestado");
        lbl_borrowedBook.setVisible(false);

        btn_solicitar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_solicitar.setText("Préstamo");
        btn_solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solicitarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_bookid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfd_book, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_solicitar)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_borrowedBook))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btn_exit)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bookid)
                    .addComponent(tfd_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_solicitar))
                .addGap(48, 48, 48)
                .addComponent(lbl_borrowedBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfd_bookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_bookKeyTyped
        
    }//GEN-LAST:event_tfd_bookKeyTyped

    private void tfd_bookKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_bookKeyPressed
//        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            
    }//GEN-LAST:event_tfd_bookKeyPressed

    private void tfd_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfd_bookMouseClicked
        
    }//GEN-LAST:event_tfd_bookMouseClicked

    private void tfd_bookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfd_bookFocusGained
        
    }//GEN-LAST:event_tfd_bookFocusGained

    private void btn_solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicitarActionPerformed
        String id = tfd_book.getText();
        String code = "";
        List<Book> bookList = new ArrayList<Book>();
            ObjectInputStream objectInput;
        try {
            objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            bookList = (List<Book>) aux;
            objectInput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < bookList.size(); i++) {
            try {
                myBook = addBook.getBook(i);
                if(myBook.getID()==id || myBook.getName().equalsIgnoreCase(id)){
                    code = myBook.getID();
                    loan = new Loans(id, date);
                    addLoan.addEndRecord(loan);
                    
                    lbl_borrowedBook.setText("Préstamo del Libro ID: "+id+", fecha: "+date);
                    lbl_borrowedBook.setVisible(true);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_solicitarActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.setVisible(false);
        PrestamosDeMaterial presMat = new PrestamosDeMaterial();
        presMat.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(BusqLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusqLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusqLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusqLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BusqLibros().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_solicitar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bookid;
    private javax.swing.JLabel lbl_borrowedBook;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField tfd_book;
    // End of variables declaration//GEN-END:variables
}
