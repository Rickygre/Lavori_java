package oo_bj;
//--------------------------------------------
//--------------------------------------------
//--------------------------------------------
//------------ GIOCO DEL BLACK JACK ----------
//--------------------------------------------
//--------------------------------------------
//--------------------------------------------

public class OO_BJ {

    public static void main(String[] args) throws InterruptedException {

        Mazzo mazzo = new Mazzo();

        Giocatore g = new Giocatore();
        Banco b = new Banco();

        do {
            if (mazzo.numeroCarte() < 20) {
                mazzo.crea();
            }
            g.iniziaMano();
            b.iniziaMano();
            g.addCarta(mazzo.pesca(false));
            g.addCarta(mazzo.pesca(false));
            b.addCarta(mazzo.pesca(false));
            b.addCarta(mazzo.pesca(true));
            System.out.println(g.toString());
            while (g.isContinuaMano() && !g.isOut()) {
                Thread.sleep(3000);
                g.addCarta(mazzo.pesca(false));
                System.out.println(g.toString());
            }
            if (g.isOut()) {
                g.decrementaSoldi();
                System.out.println("soldi giocatiore: " + g.getSoldi());
                continue;
            }

            while (b.isContinuaMano() && !b.isOut()) {
                Thread.sleep(3000);
                g.addCarta(mazzo.pesca(false));
                System.out.println(g.toString());
            }
            if (b.isOut() || b.valoreMano() < g.valoreMano()) {
                g.incrementaSoldi();
            } else if (b.valoreMano() > g.valoreMano) {
                b.incrementaSoldi();

            }
            System.out.println("soldi giocatiore: " + g.getSoldi());

        } while (g.isContinuaPartita());

    }

}
