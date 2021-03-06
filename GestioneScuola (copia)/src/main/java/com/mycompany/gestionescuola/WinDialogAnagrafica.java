package com.mycompany.gestionescuola;

import static com.mycompany.gestionescuola.WinGestione.listaCorsi;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class WinDialogAnagrafica extends javax.swing.JDialog {

    /**
     * Creates new form WinDialogAnagrafica
     */
    public WinDialogAnagrafica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        refreshLista();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAnagrafica = new javax.swing.JList<>();
        lblID = new javax.swing.JLabel();
        txCognome = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        txMail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnConferma = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestione Anagrafica");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnClose.setText("Chiudi");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lstAnagrafica.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAnagrafica.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAnagraficaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAnagrafica);

        lblID.setText("ID");

        jLabel2.setText("Cognome:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Indirizzo mail:");

        btnNew.setText("nuova anagrafica");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnConferma.setText("Conferma");
        btnConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfermaActionPerformed(evt);
            }
        });

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnElimina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txCognome, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(txNome)
                                .addComponent(txMail)
                                .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnConferma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txCognome, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txNome, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txMail, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConferma, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnElimina, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        pulisci();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfermaActionPerformed
        // TODO add your handling code here:
        String n = txNome.getText();
        String c = txCognome.getText();
        String m = txMail.getText();
        if (lblID.getText().equals("")) { //caso no id e quindi nuovo
            int id = WinGestione.getNewIDanagrafica();
            Anagrafica a = new Anagrafica(id, c, n, m);
            WinGestione.listaAnagrafiche.add(a);
        } else {
            //ide presente e quindi modifica
            int id = Integer.parseInt(lblID.getText());
            Anagrafica a = new Anagrafica(id, c, n, m);
            //cerco l indice dell elemento selezionato
            //in lista che sto modificando
            int index = lstAnagrafica.getSelectedIndex();
            WinGestione.listaAnagrafiche.set(index, a);
        }

        refreshLista();
        pulisci();
        salvaAnagraficaCSV();


    }//GEN-LAST:event_btnConfermaActionPerformed

    private void lstAnagraficaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAnagraficaValueChanged
        // TODO add your handling code here:
        int index = lstAnagrafica.getSelectedIndex();
        if (index == -1) { //niente di selezionato
            pulisci();
            return;
        }
        Anagrafica a = WinGestione.listaAnagrafiche.get(index);
        lblID.setText("" + a.getId_anagrafica());
        txCognome.setText(a.getCognome());
        txNome.setText(a.getNome());
        txMail.setText(a.getMail());

    }//GEN-LAST:event_lstAnagraficaValueChanged

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        // TODO add your handling code here

        int index = lstAnagrafica.getSelectedIndex();
        if (index == -1) {
            return;
        }
        int id = WinGestione.listaAnagrafiche.get(index).getId_anagrafica();
        boolean ok = true;
        for (Corso c : WinGestione.listaCorsi) {

            if (c.isAlunno(id) == true) {
                ok = false;
                break;
            }

        }
        if (ok) {

            int input = JOptionPane.showConfirmDialog(null, "Confermi l 'eliminazione?", "ELIMINA anagrafica", JOptionPane.OK_CANCEL_OPTION);
            if (input == 0) {

                WinGestione.listaAnagrafiche.remove(index);
                salvaAnagraficaCSV();
                refreshLista();

            } else {
                JOptionPane.showMessageDialog(null, "alunno iscritto al corso,impossibile eliminarlo!");
            }


    }//GEN-LAST:event_btnEliminaActionPerformed
    }

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
            java.util.logging.Logger.getLogger(WinDialogAnagrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinDialogAnagrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinDialogAnagrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinDialogAnagrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WinDialogAnagrafica dialog = new WinDialogAnagrafica(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConferma;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JList<String> lstAnagrafica;
    private javax.swing.JTextField txCognome;
    private javax.swing.JTextField txMail;
    private javax.swing.JTextField txNome;
    // End of variables declaration//GEN-END:variables

    private void pulisci() {
        txCognome.setText("");
        txNome.setText("");
        txMail.setText("");
        lblID.setText("");

    }

    private void refreshLista() {
        //creo modello dati, aggiungo elementi e lo setto
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < WinGestione.listaAnagrafiche.size(); i++) {
            Anagrafica a = WinGestione.listaAnagrafiche.get(i);
            String item = a.getId_anagrafica() + ")" + a.getCognome() + " "
                    + a.getNome() + " " + a.getMail();
            model.addElement(item);

        }

        lstAnagrafica.setModel(model);

    }

    private void salvaAnagraficaCSV() {
        //recupero un corso per volta
        //estraggo info di tipo string
        //aggiungo info ad un testo generico e poi setto in display
        String intestazione = "id;cognome;nome;mail\n";
        String dati = "";
        for (int i = 0; i < WinGestione.listaAnagrafiche.size(); i++) {
            //recupero un corso per volta
            Anagrafica a = WinGestione.listaAnagrafiche.get(i);
            String riga = a.getCSV(); //richiamo metodo geintfo per richiamare le informazioni delle variabili
            dati += riga;

        }
        String txfile = intestazione + dati;
        try {
            //creo file corsi .txt
            FileWriter myWriter = new FileWriter("/home/tss/Scuola/anagrafica.csv");
            //ci scrivo dentro testo display
            myWriter.write(txfile);
            //lo chiudo se no si blocca
            myWriter.close();

        } catch (IOException ex) {
            lblMsg.setText("errore di scrittura file corsi.csv");
        }

    }

}
