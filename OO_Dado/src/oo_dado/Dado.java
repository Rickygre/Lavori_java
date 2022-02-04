package oo_dado;

import java.util.ArrayList;
import java.util.Random;

public class Dado {

    private final int numerofacce;
    private int ultimo_lancio;
    private final ArrayList<Integer> storia = new ArrayList<>(); //dichiaro una lista array
    //che tenga lo storico della partita

    public Dado(int nfacce) {
        this.numerofacce = nfacce;
    }

    public void lancia() {  //metodo lancio 
        Random rnd = new Random();
        ultimo_lancio = rnd.nextInt(numerofacce) + 1;
        storia.add(ultimo_lancio); //al metodo lancia implemento arraylist 
        //passando come parametro ultimolancio

    }

    public int getNumeroFacce() {
        return numerofacce;
    }

    public int getUltimo_lancio() {
        return ultimo_lancio;
    }

    public ArrayList<Integer> getStoria() {
        return new ArrayList<>(storia);
    }

}
