package provaboolean;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Provaboolean {

    public static void main(String[] args) {

        int myvoto = 0;
        //dichiaro un lettore per input utente
        Scanner lettore = new Scanner(System.in);
        System.out.println("inserisci valutazione esame finale: ");
        myvoto = lettore.nextInt();

        //importo libreria di una finestra dialogo
        String vototx = JOptionPane.showInputDialog("inserisci la media dei voti: ");
        //conversione in intero la stringa vototx
        myvoto = Integer.parseInt(vototx);

        //condizione di una fascia numerica compresa tra 0 e 10
        if (!(myvoto >= 0 && myvoto <= 10)) {
            System.out.println("ERRORE DATI INSERITI");
            return;
        }

        //condizione del programma: 
        //per essere ammesso all 'esame devo prendere come voto almeno 5 
        //ossia (maggiore o uguale a 5 compreso)
        if (myvoto >= 5) {
            System.out.println("Sei Ammesso!");
            //fascia pericolante 5-6
            // fascia discreta 7-8
            //fascia ottima 9-10
            if (myvoto >= 5 && myvoto <= 6) {
                System.out.println("Sei pericolante!!!");
            } else {
                if (myvoto >= 7 && myvoto <= 8) {
                    System.out.println("Sei discreta!!!");
                } else {
                    if (myvoto >= 9 && myvoto <= 10) {
                        System.out.println("Sei ottimo!!!");
                    }

                }

            }

        } else {
            System.out.print("NON SEI AMMESSO!!!");

        }
    }
}
