package it.tss.esercizio1_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il numero da analizare");
        int x = sc.nextInt();

        int n = 1;
        int sommaDivisori = 0;

        while (n < x) {
            if (x % n == 0) {
                sommaDivisori += n;

            }
            /*n = n + 1;
            n += 1;    modi differenti di scrivere stesso significato*/
            n++;

        }

        if (sommaDivisori == x) {
            System.out.println(x + "perfetto");
        } else if (sommaDivisori > x) {
            System.out.println(x + "abbondante");
        } else {
            System.out.println(x + "difettivo");
        }

    }

}
