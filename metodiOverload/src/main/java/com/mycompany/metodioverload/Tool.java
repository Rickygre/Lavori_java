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

    /**
     *
     * carica dati random di un array
     *
     * @param ar arry da caricare
     * @return ritorna array caricato di numeri random 1.10
     */
    static int[] loadData(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 10) + 1;

        }
        return ar;

    }

    /**
     * carica dati random di un array
     *
     * @param ar arry da caricare
     * @param range num maX DEL DATO 1..range
     *
     * @return ARRAY CARICATO DI NUMERI random 1..range
     */
    static int[] loadDataInt(int[] ar, int range) {

        for (int i = 0; i < ar.length; i++) {
            double caso = Math.random();
            caso = caso * range;
            ar[i] = (int) (caso + 1);

        }
        return ar;

    }

    static int[] concatArrays(int[] ar1, int[] ar2) {
        //controllo dimensione array1 con una variabile(dim1)
        int dim1 = ar1.length;
        //controllo dimensione array2 con una variabile(dim2)
        int dim2 = ar2.length;
        //creo una terza variabile che mi sommi i due array
        int dimok = dim1 + dim2;
        //creo un terzo array che contenga le dimensioni totali dei due array
        int[] arok = new int[dimok];
        //leggo dimensioni array 1 con ciclo for
        for (int i = 0; i < dim1; i++) {
            arok[i] = ar1[i];

        }
        //inserimento secondo array da ultima posizione precedente
        //0 in 5 1 in 6 2 in 7 ...
        //0 in 5+0 1 1 5+1 6 2 in 5+2 7
        for (int i = 0; i < dim2; i++) {
            arok[i + dim1] = ar2[i];

        }

        //dichiaro un ritorno
        return arok;

    }

    static int cercaVirus(int[] ar, int[] virus) {
        int pos = -1;

        //controllo virus su prima posizione
        //eseguo n controlli per quanto è lungo il virus creando una variabile
        int vlen = virus.length;
        //4 5 3 5 7
        //3 5 7
        int numcontrolli = ar.length - vlen;
        for (int k = 0; k < numcontrolli; k++) {

        }
        //ciclo controllo sequenza
        boolean ok = true;

        for (int i = 0; i < vlen; i++) {
            int k = 0;
            if (virus[i] != ar[i + k]) {
                ok = false;

                break;

            }//fine controllo virus in posizione

            if (ok) { //trova virus
                pos = k;
                break;
            }
            //passo al prossimo controllo e mi sposto

        }

        return pos;
    }

}
