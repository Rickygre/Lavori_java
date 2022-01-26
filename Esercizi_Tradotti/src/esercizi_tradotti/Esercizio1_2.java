package esercizi_tradotti;

import java.util.Scanner;

public class Esercizio1_2 {

    public static void main(String[] args) {
        int x;
        int y;
        int conta = 0;
        int ris = 0;

        Scanner lettore1 = new Scanner(System.in);
        System.out.println("inserisci primo numero: ");
        x = lettore1.nextInt();

        Scanner lettore2 = new Scanner(System.in);
        System.out.println("inserisci secondo numero: ");
        y = lettore2.nextInt();

        while (conta <= y) {

            ris = ris + 1;
            conta = conta + 1;

        }

        System.out.println(ris);

    }
}
