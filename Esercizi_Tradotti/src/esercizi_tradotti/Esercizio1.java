package esercizi_tradotti;

import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        int x;
        int y;
        int z = 0;
        int ris = 0;
        int somma;

        Scanner lettore1 = new Scanner(System.in);
        System.out.println("inserisci primo numero: ");
        x = lettore1.nextInt();

        Scanner lettore2 = new Scanner(System.in);
        System.out.println("inserisci secondo numero: ");
        y = lettore2.nextInt();

        if (x > y) {
            somma = x + y;
            z = x;
            x = y;
            y = z;

        }
        while (x <= y) {

            ris = ris + x;
            x = x + 1;
            System.out.println(ris);

        }

    }

}
