package oo_bj;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;

/**
 *
 * @author tss
 */
public class Mazzo {

    private ArrayList<Carta> carte;
    private final int numCarte;

    public Mazzo() {
        this(52);
    }

    public Mazzo(int numCarte) {
        this.numCarte = numCarte;
        carte = new ArrayList<>(numCarte); //creo oggetto mazzo di carte
        creaMazzo();

    }

    private void creaMazzo() {
        EnumSet<Carta.Seme> semi = EnumSet.allOf(Carta.Seme.class);
        for (Carta.Seme seme : semi) {
            for (int i = 1; i <= 13; i++) {
                Carta.Nome nome = Carta.Nome.values()[i-1];
                if (i == 1) {
                    //asso
                    ArrayList<Integer> valori = new ArrayList<>(2);
                    valori.add(1);
                    valori.add(11);
                    carte.add(new Carta(seme, i, nome, valori));

                } else if (i >= 10) {
                    //figure
                    carte.add(new Carta(seme, 10, nome));
                } else {
                    Carta carta = new Carta(seme, i, nome);
                    carte.add(carta);
                }
            }

        }
    }

    public Carta pesca() {
        Random rnd = new Random();
        int index = rnd.nextInt(carte.size());
        Carta result = carte.get(index);
        carte.remove(index);
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Carta carta : carte) {
            result += carta.toString() + "\n";
        }
        return result;
    }

}
