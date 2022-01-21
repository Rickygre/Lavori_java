package prova3;

import java.util.Scanner;

public class Prova3 {

    public static void main(String[] args) {
        
        //  ESERCIZIO 01
        
        Scanner lettore = new Scanner(System.in);
        System.out.println("inserisci primo numero");
        int x = lettore.nextInt();

        System.out.println("inserisci secondo numero");
        int y = lettore.nextInt();

        int risultato = 0;

        while (x <= y) {
            risultato = risultato + x;
            x = x + 1;

        }
        System.out.println("il risultato è " + risultato);

 /*     ESERCIZIO3
        Scanner lettore = new Scanner(System.in);
        System.out.println("inserisci primo numero");
        int x = lettore.nextInt();

        System.out.println("inserisci secondo numero");
        int y = lettore.nextInt();

        int quoziente = 0;
        int resto = 0;
        int calcola = x;

        if (y != 0) {
            while (y <= calcola) {
                quoziente = quoziente + 1;
                calcola = calcola - 1;
            }
            resto = calcola;
            System.out.println("il quoziente ed il resto corrispondono a : " + quoziente + resto);

        }else {
            System.out.println("impossibile calcolare la divisione per 0");
            
        }*/
 /* ESERCIZIO 04 
        
        Scanner lettore = new Scanner(System.in);
        System.out.println("inserisci primo numero");
        int x = lettore.nextInt();

        System.out.println("inserisci secondo numero");
        int y = lettore.nextInt();

        int risultato = 1;
        int conta = 1;
        int ris = 0;
        int conta1 = 1;

        while (conta <= y) {
            conta1 = 1;
            ris = 0;
            while (conta1 <= x) {
                ris = ris + risultato;
                conta1 = conta1 + 1;
            }
            risultato = ris;
            conta = conta + 1;

        }
        System.out.println("il risultato dei valori inseriti è: " + risultato);*/
    }
}
