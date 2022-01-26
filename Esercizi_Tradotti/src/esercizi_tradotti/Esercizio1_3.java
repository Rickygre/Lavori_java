package esercizi_tradotti;

import java.util.Scanner;

public class Esercizio1_3 {

    public static void main(String[] args) {

        int x;
        int y;
        int calcola = 0;
        int resto = 0;
        int quoz = 0;

        Scanner lettore1 = new Scanner(System.in);
        System.out.println("inserisci primo numero: ");
        x = lettore1.nextInt();

        Scanner lettore2 = new Scanner(System.in);
        System.out.println("inserisci secondo numero: ");
        y = lettore2.nextInt();

        if (y != 0) {
            calcola = x;
            quoz = quoz + 1;
            calcola = calcola - y;

            resto = calcola;
            System.out.println(quoz);
            System.out.println("il resto della divisione è " + resto);

        } else {
            System.out.println("impossibile calcolare la divisione per 0!!");
        }

    }

}
