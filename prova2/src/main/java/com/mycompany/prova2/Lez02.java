package com.mycompany.prova2;

import java.util.Scanner;

public class Lez02 {

    public static void main(String[] args) {
        /*
        String[] generi = {"femmina", "maschio", "neutro", "trans", "questioning"};
        System.out.println(generi[0]);
        System.out.println(generi[3]);
        generi[3] = "transgender";
        System.out.println(generi[3]);
        System.out.println(generi.length);
        System.out.println(generi[generi.length - 1]);

        //ciclo for
        for (int i = 0; i < generi.length; i++) {
            //stampa a video un ordine numerico con parentesi tonda
            System.out.println((i + 1) + ")" + generi[i]);

        } */

        //esercizio lista registro
        String nomi[];  //nomi sarà array con elenco partecipanti
        int quanti;     //variabile che conterrà dimensione lista fornita dall'utente

        Scanner lettore = new Scanner(System.in);
        System.out.println("quanti nomi vuoi inserire nella lista? :");

        //carico la dimensione scelta dall'utente
        quanti = lettore.nextInt();
        //dimensiono la lista come da richiesta precedente
        nomi = new String[quanti];

        Scanner lettoreS = new Scanner(System.in);

        for (int i = 0; i < nomi.length; i++) {
            String nome;
            System.out.println("inserisci nome [(" + (i + 1) + "/" + nomi.length + "]: ");
            nome = lettoreS.nextLine();
            nomi[i] = nome;

        }
        for (int i = 0; i < nomi.length; i++) {
            System.out.println((i + 1) + ")" + nomi[i]);
        }
        System.out.println("Complimenti hai completato il registro.");

    }

}
