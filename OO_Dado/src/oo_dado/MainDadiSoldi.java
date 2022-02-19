package oo_dado;

import java.util.Random;
import java.util.Scanner;

public class MainDadiSoldi {

    static int soldi;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci i soldi: ");
        soldi = sc.nextInt();
        int contaMani = 1;
        while (soldi > 0) {
            gioca(contaMani);
            contaMani++;
        }

    }

    private static void gioca(int numMano) {
        int dado_player = lanciaDado();
        int dado_banco = lanciaDado();
        System.out.println(String.format("mano_numero %s banco=%s giocatore=%s", numMano, dado_banco, dado_player));
        if (dado_player > dado_banco) {
            soldi++;
            System.out.println("mano vinta dal giocatore!!!");
        } else {
            soldi--;
            System.out.println("IL BANCO VINCE!!!!");
        }
        System.out.println("-------------------------------------");

    }

    private static int lanciaDado() {
        Random rnd = new Random();
        return rnd.nextInt(5) + 1;
    }

}
