package oo_dado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Util {

    static void stampaConsole(String messaggio) {
        System.out.println(messaggio);
    }

    static void stampaPainel(String messaggio) {
        JOptionPane.showMessageDialog(null, messaggio);
    }

    /**
     *
     * @return
     */
    static int getInteger(String messaggio) {

        int ris = 0;
        int aux = 0;

        do {
            try {

                ris = Integer.parseInt(JOptionPane.showInputDialog(null, messaggio));
                aux = 1;

            } catch (Exception e) {
                //TODO: handle exception
                stampaPainel("Non è un numero intero");
            }

        } while (aux == 0);

        return ris;
    }

    static float getFloat(String messaggio) {

        float ris = 0;
        int aux = 0;

        do {
            try {

                ris = Float.parseFloat(JOptionPane.showInputDialog(null, messaggio));
                aux = 1;

            } catch (Exception e) {
                //TODO: handle exception
                stampaPainel("Non è un numero intero");
            }

        } while (aux == 0);

        return ris;
    }

    static String getString(String messaggio) {

        String ris = "";
        int aux = 0;

        do {
            try {

                ris = JOptionPane.showInputDialog(null, messaggio);
                aux = 1;

            } catch (Exception e) {
                //TODO: handle exception
                stampaPainel("Non è un numero intero");
            }

        } while (aux == 0);

        return ris;
    }

    static boolean arrayRicerca(int[] numeri, int n) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        for (int i = 0; i < numeri.length; i++) {

            if (numeri[i] == n) {
                return true;
            }

        }
        return false;
    }

    static int arrayRicercaIndexOf(int[] numeri, int n) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        return arrayRicercaIndexOf(0, numeri, n);

    }

    static int arrayRicercaIndexOf(int start, int[] numeri, int n) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        for (int i = start; i < numeri.length; i++) {

            if (numeri[i] == n) {
                return i;
            }

        }
        return -1;
    }

    static int[] generaArrayCasuale(int ncelle, int max) {
        if (ncelle == 0 || max == 0) {
            throw new IllegalArgumentException("Non sono parametri validi per creare un Array");
        }

        int[] ris = new int[ncelle];

        for (int i = 0; i < ris.length; i++) {

            ris[i] = geraNumeroCasuale(max);

        }

        return ris;

    }

    static int geraNumeroCasuale(int max) {
        if (max == 0) {
            throw new IllegalArgumentException("Deve informare un valore per la variabile @max");
        }

        Random ris = new Random();

        return ris.nextInt(max);

    }

    static int arrayMax(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        int ris = numeri[0];

        for (int i = 1; i < numeri.length; i++) {

            if (numeri[i] > ris) {

                ris = numeri[i];

            }

        }

        return ris;

    }

    static int arrayMin(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        int ris = numeri[0];

        for (int i = 1; i < numeri.length; i++) {

            if (numeri[i] < ris) {

                ris = numeri[i];

            }

        }

        return ris;

    }

    static int arraySomma(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        int ris = numeri[0];

        for (int i = 1; i < numeri.length; i++) {

            ris += numeri[i];

        }

        return ris;

    }

    static int[] arrayCopy(int[] numeri) {

        int[] ris = new int[numeri.length];

        for (int i = 0; i < numeri.length; i++) {
            ris[i] = numeri[i];
        }

        return ris;
    }

    /**
     * ritorna un array contenente l'unione di numeri1 e numeri2
     *
     * @param numeri1
     * @param numeri2
     * @return
     */
    public static int[] arrayUnisci(int[] numeri1, int[] numeri2) {
        //throw new UnsupportedOperationException("Non ancora implementato!!");
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        /*Fatto prima
        int[] ris = new int[numeri1.length + numeri2.length];
        int a = 0;
        for(int y = 0; y < numeri1.length; y++)
        {
            ris[a] = numeri1[y];
            a++;
        }
        for(int y = 0; y < numeri2.length; y++)
        {
            ris[a] = numeri2[y];
            a++;
        }
        
        return ris;
         */
        //origini Alfonso
        int[] ris = new int[numeri1.length + numeri2.length];

        for (int i = 0; i < numeri1.length; i++) {
            ris[i] = numeri1[i];
        }
        for (int i = 0; i < numeri2.length; i++) {
            ris[numeri1.length + i] = numeri2[i];
        }
        return ris;

    }

    /**
     * ritorna true se numeri1 contiene numeri2 nella sequenza corretta
     *
     * @param numeri1 È il array dove ce ne una informazione completa
     * @param numeri2 È il array che volio trovare dentro di Numeri1
     * @return
     */
    static boolean arrayContieneSequenza(int[] numeri1, int[] numeri2) {
        //throw new UnsupportedOperationException("Non ancora implementato!!");
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        if (numeri1.length < numeri2.length) {
            return false;
        }

        /*
        int a = 0;
        for(int y = 0; y < numeri1.length;y++)
        {
            if(numeri1[y] == numeri2[a])
            {
                a++;
            }
            else
            {
                if (a!=0)
                {
                    a = 0;
                    y--;
                }
            }
            if(a == (numeri2.length))
            {
                ris = true;
                return ris;
            }
          
        }
         */
        if (numeri2.length == 0) {
            return false;
        }
        if (numeri2.length > numeri1.length) {
            return false;
        }
        boolean ris = false;
        int n = numeri2[0];
        int start = arrayRicercaIndexOf(numeri1, n);
        while (start != -1 && numeri1.length >= start + numeri2.length && !ris) {
            ris = true;
            for (int i = 0; i < numeri2.length; i++) {
                if (numeri1[start + i] != numeri2[i]) {
                    ris = false;
                    break;
                }
            }
            start = arrayRicercaIndexOf(start + 1, numeri1, n);
        }
        return ris;
    }

    /**
     * ritorna true se numeri1 contiene tutti i valori di numeri2, in qualunque
     * sequenza
     *
     * @param numeri1
     * @param numeri2
     * @return
     */
    static boolean arrayContieneValori(int[] numeri1, int[] numeri2) {
        //throw new UnsupportedOperationException("Non ancora implementato!!");
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        boolean ris = true;
        /*
        for(int x = 0; x < numeri2.length; x++)
        {
            ris = false;
            for(int y = 0; y < numeri1.length; y++)
            {
                if(numeri1[y] == numeri2[x])
                {
                    ris = true;
                    break;
                }
            }
            if(ris == false)
            {
                break;
            }
        }
        return ris;
         */
        for (int n : numeri2) {
            if (arrayRicerca(numeri1, n) == false) {
                ris = false;
            }
        }

        return ris;

    }

    /**
     * ritorna un array con solo i valori contenuti in entrambi gli array
     * sequenza
     *
     * @param numeri1
     * @param numeri2
     * @return
     */
    static int[] arrayIntersezione(int[] numeri1, int[] numeri2) {
        //throw new UnsupportedOperationException("Non ancora implementato!!");
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        //int a = 0;
        /*
        if(numeri1.length <= numeri2.length)
        {
            a = numeri1.length;
        }
        else
        {
            a = numeri2.length;
        }
        int[] ris = new int[a];
        int x = 0;
        if(numeri1.length > numeri2.length)
        {
            for(int y = 0; y < numeri1.length; y++)
            {
                if (arrayRicerca(numeri2, numeri1[y])==true)
                {
                    ris[x] = numeri1[y];
                    x++;
                }
            }
        }
        else
        {
            for(int y = 0; y < numeri2.length; y++)
            {
                if (arrayRicerca(numeri1, numeri2[y])==true)
                {
                    ris[x] = numeri2[y];
                    x++;
                }
            }
        }
         */
        int[] ris = {};
        for (int n : numeri1) {
            if (arrayRicerca(ris, n) == false && arrayRicerca(numeri2, n) == true) {
                int[] tmp = new int[1];
                tmp[0] = n;
                ris = arrayUnisci(ris, tmp);
            }
        }
        return ris;
    }

    static long arrayAvg(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        long ris = arraySomma(numeri) / numeri.length;

        return ris;

    }

    static void arrayStampa(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        for (int i = 0; i < numeri.length; i++) {

            stampaConsole(String.valueOf(numeri[i]));

        }

    }

    static void arrayStampaLinea(int[] numeri) {

        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        String array = "";

        for (int i = 0; i < numeri.length; i++) {

            if ((i + 1) != numeri.length) {
                array += String.valueOf(numeri[i]) + " , ";
            } else {
                array += String.valueOf(numeri[i]);
            }

        }

        stampaConsole(array);

    }

    static void arrayQuickSort(int[] numeri) {

        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        arrayStampaLinea(numeri);
        stampaConsole("Inizio dell'ordinamento");

        int minoreP = 0;
        int a = 0;
        int b = 0;

        for (int x = 0; x < numeri.length - 1; x++) {
            //cercare la posizione con il valore minore che la posizione atuale de la lettura del array
            a = numeri[x];
            minoreP = numeri[x];
            boolean trovato = false;

            for (int y = x; y < numeri.length; y++) {
                if (numeri[y] < a) {
                    a = numeri[y];
                    minoreP = y;
                    trovato = true;
                }
            }

            //se trovato un valore minore, fino a tutte che sono possobile dentro dell array, cambia la posizione
            if (trovato == true) {
                b = numeri[x];
                numeri[x] = numeri[minoreP];
                numeri[minoreP] = b;

                arrayStampaLinea(numeri);
            }

        }

        stampaConsole("Sort / Ordinamento Realizato");
        arrayStampaLinea(numeri);

    }

    static void arrayBubleSort(int[] numeri) {

        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Non è un Array valito");
        }

        arrayStampaLinea(numeri);
        stampaConsole("Inizio dell'ordinamento");

        //int minoreP = 0;
        int a = 0;
        //int b = 0;
        boolean ordinato = false;

        do {

            ordinato = false;

            for (int i = 0; i < numeri.length - 1; i++) {

                if (numeri[i] > numeri[i + 1]) {
                    a = numeri[i];
                    numeri[i] = numeri[i + 1];
                    numeri[i + 1] = a;
                    ordinato = true;

                    arrayStampaLinea(numeri);

                }

            }

        } while (ordinato == true);

        stampaConsole("Sort / Ordinamento Realizato");
        arrayStampaLinea(numeri);

    }

}
