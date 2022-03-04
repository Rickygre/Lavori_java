package com.mycompany.gestionescuola;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

public class WinGestione extends javax.swing.JFrame {

    static ArrayList<Corso> listaCorsi = new ArrayList<Corso>();
    static ArrayList<Anagrafica> listaAnagrafiche = new ArrayList<Anagrafica>();
    int idcorso = -1;

    public WinGestione() {
        initComponents();
        this.setLocationRelativeTo(null);
        caricaDatiAnagrafica();
        caricaDatiCorsi();
        showCorsi();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitolo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpDisplay = new javax.swing.JTextPane();
        btnGestioneCorso = new javax.swing.JButton();
        btnGestAnagrafica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCorsi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblTitolo.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolo.setText("Gestione scuola");

        jScrollPane2.setViewportView(tpDisplay);

        btnGestioneCorso.setText("Gestione Corsi");
        btnGestioneCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioneCorsoActionPerformed(evt);
            }
        });

        btnGestAnagrafica.setText("Gestione Anagrafiche");
        btnGestAnagrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestAnagraficaActionPerformed(evt);
            }
        });

        tblCorsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Corso", "Durata ore", "Data inizio", "N°Iscritti"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCorsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCorsi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGestAnagrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGestioneCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGestioneCorso)
                            .addComponent(btnGestAnagrafica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestioneCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioneCorsoActionPerformed

        new winDialogCorsi(this, true).setVisible(true);

    }//GEN-LAST:event_btnGestioneCorsoActionPerformed

    private void btnGestAnagraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestAnagraficaActionPerformed
        //apertura finestra dialogo per caricamento e gestione anagrafica
        new WinDialogAnagrafica(this, true).setVisible(true);

    }//GEN-LAST:event_btnGestAnagraficaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        showCorsi();
        refreshTable();
    }//GEN-LAST:event_formWindowActivated

    private void tblCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCorsiMouseClicked
        // TODO add your handling code here:
        int index = tblCorsi.getSelectedRow();
        JOptionPane.showMessageDialog(null, listaCorsi.get(index).getInfo());
        
    }//GEN-LAST:event_tblCorsiMouseClicked

    private void refreshTable() {
        //recuperare la struttura dati della mia tabella come model
        //creo un cast di default tablemodel tra tonde
        DefaultTableModel model = (DefaultTableModel) tblCorsi.getModel();
        //pulire la tabella dai dati precedenti setto la dimensione a zero.
        model.setRowCount(0);
        //creo un array da 3 righe
        Object[] rowData = new Object[4];
        //scorro la lista dei corsi
        for (Corso c : listaCorsi) {
            //assegno ai 3 elemnti dell'array il contenuto equivalente di colonna
            rowData[0] = c.getNomecorso();
            rowData[1] = c.getDurataore();
            //faccio lo spli per convertire formato data da string a int
            DateTimeFormatter ddmmaa = DateTimeFormatter.ofPattern("dd/MM/yy");
            c.getDatainizio().format(ddmmaa);
            rowData[2] = c.getDatainizio().format(ddmmaa);
            rowData[3] = c.getRegistro().size(); // alla posizione 3 dell'array aggiungo n° iscritti
            //prendendo il registro con .size
            model.addRow(rowData);

        }

    }

    private void showCorsi() {
        //recupero un corso per volta
        //estraggo info di tipo string
        //aggiungo info ad un testo generico e poi setto in display
        String testoDisplay = "";
        for (int i = 0; i < listaCorsi.size(); i++) {
            //recupero un corso per volta
            Corso c = listaCorsi.get(i);
            String info = "[" + (i + 1) + "]" + c.getInfo(); //richiamo metodo geintfo per richiamare le informazioni delle variabili
            testoDisplay = info + testoDisplay;

        }
        //visualizzo i corsi in display
        tpDisplay.setText(testoDisplay);

    }

    private void caricaDatiCorsi() {
        try {

            //aprire il file /tss/scuola.csv
            File filecsv = new File("/home/tss/Scuola/corsi.csv");
            //creo scanner per leggere una riga per volta
            Scanner lettore = new Scanner(filecsv);
            //estrarre una riga per volta
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    //dati[0] nomecorso, dati[1] durata ecc
                    String nc = dati[0];
                    int durata = Integer.parseInt(dati[1]);
                    String des = dati[2];
                    String d[] = dati[3].split("-");
                    int y = Integer.parseInt(d[0]);
                    int m = Integer.parseInt(d[1]);
                    int g = Integer.parseInt(d[2]);
                    String link = "";
                    if (dati.length >= 5) {
                        link = dati[4];
                    }

                    Corso c = new Corso(nc, durata, y, m, g);
                    if (dati.length >= 6) { //se lungo 6 ho gli scritti
                        String registro = dati[5];
                        String[] regID = registro.split(",");
                        for (String sid : regID) {
                            //indice anagrafica
                            int id = Integer.parseInt(sid);
                            Anagrafica al = getAlunnoById(id);
                            c.insertAlunno(al);

                        }

                    }

                    c.setDescrizione(des);
                    c.setLink(link);
                    //il corso è pronto e lo aggiungiamo alla lista
                    listaCorsi.add(c);
                }
                n++;
                //la riga la taglio in tanti pezzi col; in un array
                //elemento per elemento dell'array lo imposto ad un corso
                //il corso lo aggiungo alla lista
            }
            //e cosi via PER LE ALTRE RIGHE DEL FILE
            //alla fine chiudo se no si blocca
        } catch (Exception e) {

        }

    }

    private void caricaDatiAnagrafica() {
        try {

            //aprire il file /tss/scuola.csv
            File filecsv = new File("/home/tss/Scuola/anagrafica.csv");
            //creo scanner per leggere una riga per volta
            Scanner lettore = new Scanner(filecsv);
            //estrarre una riga per volta
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    //dati[0] nomecorso, dati[1] durata ecc
                    int id = Integer.parseInt(dati[0]);
                    String cog = dati[1];
                    String nom = dati[2];
                    String mail = dati[3];
                    Anagrafica a = new Anagrafica(id, cog, nom, mail);
                    //il corso è pronto e lo aggiungiamo alla lista
                    listaAnagrafiche.add(a);
                }
                n++;
                //la riga la taglio in tanti pezzi col; in un array
                //elemento per elemento dell'array lo imposto ad un corso
                //il corso lo aggiungo alla lista
            }
            //e cosi via PER LE ALTRE RIGHE DEL FILE
            //alla fine chiudo se no si blocca
        } catch (Exception e) {

        }

    }

    public static int getNewIDanagrafica() {
        int newID = 1;
        if (listaAnagrafiche.size() > 0) {
            newID = listaAnagrafiche.get(listaAnagrafiche.size() - 1).getId_anagrafica() + 1;

        }

        return newID;
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
            java.util.logging.Logger.getLogger(WinGestione.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinGestione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestAnagrafica;
    private javax.swing.JButton btnGestioneCorso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JTable tblCorsi;
    private javax.swing.JTextPane tpDisplay;
    // End of variables declaration//GEN-END:variables

    public static Anagrafica getAlunnoById(int id) {
        for (Anagrafica a : listaAnagrafiche) {
            if (id == a.getId_anagrafica()) {
                return a;
            }

        }
        return null;
    }

}
