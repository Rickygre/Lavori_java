package newpackage;

import java.util.Random;

public class MainRicerca {

    public static void main(String[] args) {
        int[] input = generaArrayCasuale(10, 20);
        Arrays_Tools.stampa(input);

        System.out.println(" IL NUMERO MAX è: " + Arrays_Tools.trovaMax(input));

        System.out.println("RICERCA:" + Arrays_Tools.ricerca(input, 9));

        System.out.println(" IL NUMERO MIN è: " + Arrays_Tools.trovaMin(input));

        System.out.println(" LA SOMMA DEGLI ARRAY È: " + Arrays_Tools.calcolaSomma(input));

        System.out.println(" LA MEDIA DEGLI ARRAY È: " + Arrays_Tools.trovaMedia(input));

        System.out.println(" ordine trovato È: " + Arrays_Tools.trovaOrdine(input));

    }

    /**
     *
     * @param ncelle numero celle dell array
     * @param max massimo intero contenuto nell'array
     * @return
     */
    private static int[] generaArrayCasuale(int ncelle, int max) {
        int[] ris = new int[ncelle];
        for (int i = 0; i < ris.length; i++) {
            ris[i] = generaNumeroCasuale(max);

        }
        return ris;

    }

    private static int generaNumeroCasuale(int max) {
        Random random = new Random();
        return random.nextInt(max);

    }

}
