package newpackage;

import java.util.Arrays;

public class Arrays_Tools {

    public static void stampa(int[] numeri) {

        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + ",");

        }
        System.out.println("");

    }

    public static boolean ricerca(int[] numeri, int n) {

        int i = 0;
        boolean trovato = false;
        while (i < numeri.length && !trovato) {
            if (numeri[i] == n) {
                trovato = true;

            }
            i = i + 1;
        }

        return trovato;

    }

    public static int trovaMax(int[] numeri) {

        int ris = 0;

        for (int numero : numeri) {
            if (ris < numero) {
                ris = numero;
            }
        }
        return ris;
    }

    public static int trovaMin(int[] numeri) {
        int min = numeri[0];
        int indice = 1;

        while (indice < numeri.length) {
            if (indice == 0) {
                min = numeri[indice];
            } else if (numeri[indice] < min) {
                min = numeri[indice];
            }
            indice = indice + 1;

        }

        return min;

    }

    public static double trovaMedia(int[] numeri) {
        if (numeri == null || numeri.length == 0) {

        }

        return (double) calcolaSomma(numeri) / numeri.length;

    }

    public static int calcolaSomma(int[] numeri) {
        int ris = 0;
        for (int i = 0; i < numeri.length; i++) {
            ris += numeri[i];

        }
        return ris;

    }

    public static boolean trovaOrdine(int[] numeri) {

        int tmp;
        boolean ordinato;

        do {
            ordinato = true;
            int indice = 0;
            while (indice < numeri.length - 1) {
                if (numeri[indice] > numeri[indice + 1]) {
                    tmp = numeri[indice];
                    numeri[indice] = numeri[indice + 1];
                    numeri[indice + 1] = tmp;

                    ordinato = false;

                }
                indice = indice + 1;

            }

        } while (!ordinato);

        return ordinato;

    }

    public static int[] copiaArray(int[] numeri) {
        int[] ris = new int[numeri.length];
        for (int i = 0; i < numeri.length; i++) {
            ris[i] = numeri[i];

        }

        return ris;

    }

    public static int[] unisci(int[] numeri1, int[] numeri2) {
        int dim1 = numeri1.length;
        int dim2 = numeri2.length;
        int dimOK = dim1 + dim2;

        int[] unione = new int[dimOK];

        for (int i = 0; i < dim1; i++) {
            unione[i] = numeri1[i];

        }
        for (int i = 0; i < dim2; i++) {
            unione[i + dim1] = numeri2[i];

        }
        return unione;

    }

    public static boolean contieneSequenza(int[] numeri1, int[] numeri2) {
        boolean ris=false;
        if(numeri1 == numeri2){
            ris=true;
        }
        
        return ris;

    }

}
