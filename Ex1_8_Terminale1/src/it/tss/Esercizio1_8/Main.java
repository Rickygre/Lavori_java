package it.tss.Esercizio1_8;

//import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("devi passare numero come parametro");
            System.exit(0);
        }
        int x = Integer.parseInt(args[0]);
        String ris = analizza(x);
        System.out.println(x + " è " + ris);

        /*Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il numero da analizare");
        int x = sc.nextInt();*/
    }

    public static String analizza(int x) {
        String ris;
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
            ris = "perfetto";
        } else if (sommaDivisori > x) {
            ris = "abbondante";
        } else {
            ris = "difettivo";
        }

        return ris;

    }

}
