
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class WinCalcio extends javax.swing.JFrame {

    ArrayList<Squadra> elencosq = new ArrayList<>();
    ArrayList<Partita> elencopartite = new ArrayList<>();
    ArrayList<Classifica> elencoClassifica = new ArrayList<>();

    public WinCalcio() {
        initComponents();
        caricaSquadreCSV();
        caricaPartiteCSV();
        refreshElencoSquadre();
        refreshTablePartite();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txNomesquadra = new javax.swing.JTextField();
        txSedesquadra = new javax.swing.JTextField();
        btnNewsquadra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListaSquadre = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblElencoPartite = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnNewPartita = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txGiornata = new javax.swing.JTextField();
        txsqCasa = new javax.swing.JTextField();
        txsqTrasf = new javax.swing.JTextField();
        txgoalCasa = new javax.swing.JTextField();
        txgoalTrasf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClassifica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Squadra");

        jLabel2.setText("Nome:");

        jLabel3.setText("Sede:");

        btnNewsquadra.setText("New");
        btnNewsquadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewsquadraActionPerformed(evt);
            }
        });

        jLabel4.setText("Elenco Squadre");

        jScrollPane1.setViewportView(lstListaSquadre);

        tblElencoPartite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "giornata", "sqCasa", "sqTrasf", "goalCasa", "goalTrasferta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblElencoPartite);

        jLabel6.setText("ELENCO PARTITE");

        jLabel7.setText("giornata:");

        jLabel8.setText("sqCasa:");

        jLabel9.setText("sqTrasf:");

        jLabel10.setText("goalCasa:");

        jLabel11.setText("goalTrasf:");

        btnNewPartita.setText("New");
        btnNewPartita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPartitaActionPerformed(evt);
            }
        });

        jLabel12.setText("Partita");

        jLabel13.setText("Classifica:");

        tblClassifica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Squadra", "Punti", "GoalF", "GoalS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane3.setViewportView(tblClassifica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txNomesquadra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(txSedesquadra, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addComponent(btnNewsquadra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txgoalTrasf, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNewPartita, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txgoalCasa)
                                            .addComponent(txsqTrasf)
                                            .addComponent(txsqCasa)
                                            .addComponent(txGiornata))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(194, 194, 194)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNomesquadra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txSedesquadra, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(27, 27, 27)
                        .addComponent(btnNewsquadra)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txGiornata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txsqCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txsqTrasf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txgoalCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txgoalTrasf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNewPartita)
                                    .addComponent(jLabel13)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewsquadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewsquadraActionPerformed
        String nome = txNomesquadra.getText();
        String sede = txSedesquadra.getText();
        Squadra sq = new Squadra(nome, sede);

        elencosq.add(sq);
        refreshElencoSquadre();
        salvaSquadreCSV();


    }//GEN-LAST:event_btnNewsquadraActionPerformed

    private void btnNewPartitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPartitaActionPerformed

        int giornata = Integer.parseInt(txGiornata.getText());
        String sqCasa = txsqCasa.getText();
        String sqTrasf = txsqTrasf.getText();
        int goalCasa = Integer.parseInt(txgoalCasa.getText());
        int goalTrasf = Integer.parseInt(txgoalTrasf.getText());
        Partita p = new Partita(giornata, sqCasa, sqTrasf, goalCasa, goalTrasf);

        elencopartite.add(p);
        refreshTablePartite();
        salvaPartiteCSV();


    }//GEN-LAST:event_btnNewPartitaActionPerformed

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
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinCalcio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewPartita;
    private javax.swing.JButton btnNewsquadra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstListaSquadre;
    private javax.swing.JTable tblClassifica;
    private javax.swing.JTable tblElencoPartite;
    private javax.swing.JTextField txGiornata;
    private javax.swing.JTextField txNomesquadra;
    private javax.swing.JTextField txSedesquadra;
    private javax.swing.JTextField txgoalCasa;
    private javax.swing.JTextField txgoalTrasf;
    private javax.swing.JTextField txsqCasa;
    private javax.swing.JTextField txsqTrasf;
    // End of variables declaration//GEN-END:variables

    private void refreshElencoSquadre() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < elencosq.size(); i++) {
            String nome = elencosq.get(i).getNome();
            String sede = elencosq.get(i).getSede();

            model.addElement(nome + " " + sede);
        }

        lstListaSquadre.setModel(model);

    }

    private void salvaSquadreCSV() {
        //recupero una squadra per volta
        //estraggo info di tipo string
        //aggiungo info ad un testo generico e poi setto in display
        String testoDisplay = "nomesquadra;sede \n";
        for (int i = 0; i < elencosq.size(); i++) {
            //recupero un corso per volta
            Squadra s = elencosq.get(i);
            String info = s.getCSV(); //richiamo metodo geintfo per richiamare le informazioni delle variabili
            testoDisplay += info;

        }
        try {

            FileWriter myWriter = new FileWriter("/home/tss/Scuola/squadre.csv");

            myWriter.write(testoDisplay);

            myWriter.close();

        } catch (IOException ex) {

        }

    }

    private void caricaSquadreCSV() {

        try {

            //aprire il file /tss/scuola.csv
            File filecsv = new File("/home/tss/Scuola/squadre.csv");
            //creo scanner per leggere una riga per volta
            Scanner lettore = new Scanner(filecsv);
            //estrarre una riga per volta
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    //dati[0] nomecorso, dati[1] durata ecc
                    String nome = dati[0];
                    String sede = dati[1];

                    Squadra s = new Squadra(nome, sede);

                    elencosq.add(s);
                }
                n++;
                //la riga la taglio in tanti pezzi col; in un array
                //elemento per elemento dell'array lo imposto ad un corso
                //la squadra la aggiungo alla lista
            }
            //e cosi via PER LE ALTRE RIGHE DEL FILE
            //alla fine chiudo se no si blocca
        } catch (Exception e) {

        }
    }

    private void refreshTablePartite() {

        DefaultTableModel model = (DefaultTableModel) tblElencoPartite.getModel();

        model.setRowCount(0);

        Object[] rowData = new Object[5];

        for (Partita p : elencopartite) {

            rowData[0] = p.getGiornata();
            rowData[1] = p.getSquadraCasa();
            rowData[2] = p.getSquadraTrasferta();
            rowData[3] = p.getGoalCasa();
            rowData[4] = p.getGoalTrasferta();

            model.addRow(rowData);

        }
        tblElencoPartite.setModel(model);

    }

    private void salvaPartiteCSV() {

        String testoDisplay = "giornata;squadraCasa;squadraTrasferta;goalCasa;goalTrasferta \n";
        for (int i = 0; i < elencopartite.size(); i++) {
            //recupero un corso per volta
            Partita p = elencopartite.get(i);
            String info = p.getpartiteCSV();
            testoDisplay += info;

        }
        try {

            FileWriter myWriter = new FileWriter("/home/tss/Scuola/partite.csv");

            myWriter.write(testoDisplay);

            myWriter.close();

        } catch (IOException ex) {

        }

    }

    private void caricaPartiteCSV() {

        try {

            //aprire il file /tss/scuola.csv
            File filepart = new File("/home/tss/Scuola/partite.csv");
            //creo scanner per leggere una riga per volta
            Scanner lettore = new Scanner(filepart);
            //estrarre una riga per volta
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    //dati[0] nomecorso, dati[1] durata ecc
                    int giornata = Integer.parseInt(dati[0]);
                    String sqCasa = dati[1];
                    String sqTrasf = dati[2];
                    int goalCasa = Integer.parseInt(dati[3]);
                    int goalTrasf = Integer.parseInt(dati[4]);

                    Partita p = new Partita(giornata, sqCasa, sqTrasf, goalCasa, goalTrasf);

                    elencopartite.add(p);
                }
                n++;
                //la riga la taglio in tanti pezzi col; in un array
                //elemento per elemento dell'array lo imposto ad un corso
                //la squadra la aggiungo alla lista
            }
            //e cosi via PER LE ALTRE RIGHE DEL FILE
            //alla fine chiudo se no si blocca
        } catch (Exception e) {

        }
    }

    private void refreshTableClassifica() {

        DefaultTableModel model = (DefaultTableModel) tblClassifica.getModel();

        model.setRowCount(0);

        Object[] rowData = new Object[4];
        setClassifica();
        Collections.sort(elencoClassifica);

        for (Classifica c : elencoClassifica) {

            rowData[0] = c.getSquadra();
            rowData[1] = c.getPunti();
            rowData[2] = c.getGoalfatti();
            rowData[3] = c.getGoalsubiti();

            model.addRow(rowData);

        }

    }

    private void setClassifica() {
        elencoClassifica = new ArrayList<>();
        for (Squadra s : elencosq) {
            Classifica classifica = new Classifica(s);
            
            
            
        }
        

    }

}
