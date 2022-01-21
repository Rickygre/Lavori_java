package com.mycompany.prova1;

import java.util.Scanner;

public class Lez01 {

    public static void main(String[] args) {
        /*
        String msg = "Buongiorno tss";
        int numero_msg = 12; 
        float temperature = 13.5f ;
        String txt = msg + " - " + numero_msg ;
        
        Scanner reader ;
        reader= new Scanner(System.in);
        
        txt = reader.nextLine();
        
        
        
        
        System.out.println(txt);
        System.out.println("ciao");
         */

 /*
        //dichiaro le variabili numeriche
          int num1;
          int num2;
          
         //faccio input da tastiera con classe scanner
          Scanner lettore = new Scanner(System.in);
          
          
          System.out.println("inserisci primo importo:");
          num1 = lettore.nextInt();
          
          System.out.println("inserisci secondo importo:");
          num2 = lettore.nextInt();
          lettore.close();
          
          
          //dichiaro operazione di somma delle variabili
           int somma;
           somma = num1 + num2;
    
          //dichiaro una variabile testo per stampare a video il messaggio
          String msg_risultato = "la somma degli importi è :" + somma;
          
          System.out.println(msg_risultato);
          
          msg_risultato = "gli importi erano : " + num1 + " - " + num2 ;
          
          System.out.println(msg_risultato);  */
        //dichiaro variabili 
        int num1;
        int num2;
        int saldo;

        Scanner lettore = new Scanner(System.in);
        //carico i dati sul lettore Scanner
        System.out.println("inserisci primo prezzo: ");
        num1 = lettore.nextInt();
        System.out.println("inserisci secondo prezzo: ");
        num2 = lettore.nextInt();
        System.out.println("dimmi il tuo saldo: ");
        saldo = lettore.nextInt();
        lettore.close();

        //dichiaro operazione delle variabili
        int somma;
        somma = num1 + num2;

        String msg_risultato = "il totale è : " + somma;
        System.out.println(msg_risultato);

        msg_risultato = "i costi sono: " + num1 + " e " + num2;
        System.out.println(msg_risultato);

        //condizione if / else
        if (saldo >= somma) {
            msg_risultato = "Complimenti! hai abbastanza denaro,Compra!";
            int resto = saldo - somma;
            msg_risultato = msg_risultato + "\n";
            msg_risultato = msg_risultato + "ti rimangono euro : ";
            msg_risultato = msg_risultato + resto;
            msg_risultato = msg_risultato + "€";

            System.out.println(msg_risultato);

        } else {
            int differenza = somma - saldo;
            msg_risultato = "Non comprare!  saldo insufficiente";
            msg_risultato = msg_risultato + "\n";
            msg_risultato = msg_risultato + "ti mancano euro : ";
            msg_risultato = msg_risultato + differenza;
            msg_risultato = msg_risultato + "€";

            System.out.println(msg_risultato);

        }

    }

}
