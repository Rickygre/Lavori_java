package com.mycompany.metodioverload;

import javax.swing.JOptionPane;

public class Tool {

    static float insNumero() {  //creo metodo float
        float ris = 0;
        String txnumero = JOptionPane.showInputDialog("Inserisci numero: ");
        txnumero = txnumero.replaceAll(",", "."); //sostituisce le virgole col punto.
        try { //trova errore e prova un eccezzione

            ris = Float.parseFloat(txnumero);//classe Float che utilizza il metodo "parse" per conversione da float a testo.
        } catch (Exception errore) {
            errore.getMessage();
            JOptionPane.showMessageDialog(null,
                    "ERRORE assegnato 0\n" + errore.getMessage());

        }
        return ris;
    }

    static float insNumero(String messaggio) {  //creo metodo float contenente parametri String)
        float ris = 0;
        boolean ok = false;
        //ficnhè non è ok chiedo il numero
        while (!ok) {

            String txnumero = JOptionPane.showInputDialog(messaggio);
            try { //trova errore e prova un eccezzione
                ris = Float.parseFloat(txnumero); //classe Float che utilizza il metodo "parse" per conversione da float a testo.
                ok = true;
            } catch (Exception errore) {
                errore.getMessage();
                JOptionPane.showMessageDialog(null,
                        "ERRORE ritenta!! 0\n" + errore.getMessage());

            }
        }
        return ris;

    }

    static float insNumero(String messaggio, int numero_decimale) {  //creo metodo float contenente parametri int)
        float ris = 0;

        String txnumero = JOptionPane.showInputDialog(messaggio);
        try { //trova errore e prova un eccezzione

            ris = Float.parseFloat(txnumero);//classe Float che utilizza il metodo "parse" per conversione da float a testo.
        } catch (Exception errore) {
            errore.getMessage();
            JOptionPane.showMessageDialog(null,
                    "ERRORE assegnato 0\n" + errore.getMessage());

        }

        // arrotondare a numero decimale
        // se dicono 0 --> moltiplico per 1  1-->10  2-->100 3-->1000 ecc...
        float potenza = (float) Math.pow(10, numero_decimale);
        ris = Math.round(ris * potenza) / potenza;

        return ris;
    }

    /**
     * metodo per chiedere tramite mess un numero che verrà arrotondato alla
     * seconda cifra decimale
     *
     * @param messaggio domanda da porre all utente
     * @return numero float arrotondato alla seconda decimale
     */
    static float insValuta(String messaggio) {
        return insNumero(messaggio, 2);

    }

    static String giornoSettimana(int day) {
        String giorno = "";
        switch (day) {
            case 1:
                giorno = "Lunedì";
                break;
            case 2:
                giorno = "Martedì";
                break;
            case 3:
                giorno = "Mercoledì";
                break;
            case 4:
                giorno = "Giovedì";
                break;
            case 5:
                giorno = "Venerdì";
                break;
            case 6:
                giorno = "Sabato";
                break;
            case 7:
                giorno = "Domenica";
                break;
            default:
                giorno = "sconosciuto";

        }
        return giorno;

    }

    static float dist3D(float x, float y, float z) {
        float ris = 0;
        double calcolo = (x * x) + (y * y) + (z * z);

        calcolo = Math.sqrt(calcolo);
        ris = (float) calcolo;

        return ris;

    }

}
