package oo_dado;

public class Main {

    public static void main(String[] args) {
        //System.out.println("----------INIZIO PARTITA-------------");
        Util.stampaConsole("----------INIZIO PARTITA-------------");
        int nomegiocatore = Util.getInteger("Informare il numero");
        Giocatore g = new Giocatore(10, 15, 5);
        Dado dadoG = new Dado(6);
        Dado dadoB = new Dado(6);
        int conta = 1;
        do {
            dadoG.lancia();
            dadoB.lancia();
            stampaMano(conta, dadoG.getUltimo_lancio(), dadoB.getUltimo_lancio());
            if (dadoG.getUltimo_lancio() > dadoB.getUltimo_lancio()) {
                g.incrementaSoldi();
                stampaGiocatore(g.getSoldi());

            } else {
                g.decrementaSoldi();
                stampaGiocatore(g.getSoldi());

            }
            conta++;
        } while (g.isContinua());
        System.out.println("Saldo finale del Giocatore: " + g.getSoldi());
        System.out.println("Riepilogo lanci partita del Banco: " + dadoB.getStoria());

        System.out.println("----------FINE PARTITA-------------");

    }

    private static void stampaMano(int conta, int lancioG, int lancioB) {
        String msg = (String.format("Mano_numero %s Banco=%s Giocatore=%s", conta, lancioB, lancioG));
        System.out.println(msg);

    }

    private static void stampaGiocatore(int soldi) {
        System.out.println(soldi);
    }

}
