package oo_bj;
//--------------------------------------------
//--------------------------------------------
//--------------------------------------------
//------------ GIOCO DEL BLACK JACK ----------
//--------------------------------------------
//--------------------------------------------
//--------------------------------------------

public class OO_BJ {

    public static void main(String[] args) {

        Carta carta = new Carta(Carta.Seme.CUORI, 10, Carta.Nome.DIECI);
        //System.out.println(carta.toString());
        Mazzo mazzo = new Mazzo();
        //System.out.println(mazzo.toString());

        for (int i = 0; i < 10; i++) {
            Carta pescata = mazzo.pesca();
            System.out.println(pescata.toString());
        }

    }

}
