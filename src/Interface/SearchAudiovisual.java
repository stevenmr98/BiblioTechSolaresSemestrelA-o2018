
package Interface;
import com.mxrck.autocompleter.TextAutoCompleter;
import domain.AddAudiovisual;
import domain.AddLoans;
import domain.Audiovisual;
import domain.Loans;
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


public class SearchAudiovisual extends javax.swing.JFrame {

    //instancias
    Audiovisual myAudio = new Audiovisual();
    Loans loan = new Loans();
    File myFile = new File("./Audiovisual.dat");
    File myFileLoan = new File("./Loans.dat");
    AddAudiovisual addAudioVi = new AddAudiovisual("./Audiovisual.dat");
    AddLoans addLoan = new AddLoans(myFileLoan);
    Calendar fecha = new GregorianCalendar();
    int ano = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH)+1;
    int dia = fecha.get(Calendar.DAY_OF_MONTH);
    String date = dia+"/"+mes+"/"+ano;
    public SearchAudiovisual() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
         autoCompleteText();
    }

    //metodo que autocompleta lo que se escribe en el textfield
    public void autoCompleteText() throws FileNotFoundException, IOException, ClassNotFoundException{
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(tfd_Busqueda);
        List<Audiovisual> audioList = new ArrayList<Audiovisual>();
        if (myFile.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting del objeto
            audioList = (List<Audiovisual>) aux;
            objectInput.close();
        }
        //recorre el objeto y le asigna la sugerencia
        for (int i = 0; i < audioList.size(); i++) {
            if (i >= 0 && i <= audioList.size()) {
            myAudio = addAudioVi.getAudio(i);
            textAutoCompleter.addItem(myAudio.getID());
            
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        tfd_Busqueda = new javax.swing.JTextField();
        btn_loan = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        lbl_borrowedBook = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTitle.setText("Búsqueda de audiovisuales");

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInfo.setText("Inserte el código del equpo requerido:");

        btn_loan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_loan.setText("Préstamo");
        btn_loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loanActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        lbl_borrowedBook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_borrowedBook.setText("Libro Prestado");
        lbl_borrowedBook.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfd_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_loan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lbl_borrowedBook))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btn_exit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo)
                    .addComponent(tfd_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_loan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(lbl_borrowedBook)
                .addGap(42, 42, 42)
                .addComponent(btn_exit)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.setVisible(false);
        PrestamosDeMaterial presMat = new PrestamosDeMaterial();
        presMat.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_loanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loanActionPerformed
        String id = tfd_Busqueda.getText();
        String code = "";
        List<Audiovisual> audioViList = new ArrayList<Audiovisual>();
            ObjectInputStream objectInput;
        try {
            objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            audioViList = (List<Audiovisual>) aux;
            objectInput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < audioViList.size(); i++) {
            try {
                myAudio = addAudioVi.getAudio(i);
                    code = String.valueOf(myAudio.getID());
                    loan = new Loans(id, date);
                    addLoan.addEndRecord(loan);
                    
                    lbl_borrowedBook.setText("Préstamo del Material AudioVisual ID: "+id+", fecha: "+date);
                    lbl_borrowedBook.setVisible(true);
                
                
            } catch (IOException ex) {
                Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BusqLibros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_loanActionPerformed

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
            java.util.logging.Logger.getLogger(SearchAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SearchAudiovisual().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(SearchAudiovisual.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchAudiovisual.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_loan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbl_borrowedBook;
    private javax.swing.JTextField tfd_Busqueda;
    // End of variables declaration//GEN-END:variables
}
