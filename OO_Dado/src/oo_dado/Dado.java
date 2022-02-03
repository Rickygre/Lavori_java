package oo_dado;

import java.util.Random;

public class Dado {

    private final int numerofacce;
    private int ultimo_lancio;

    public Dado(int nfacce) {
        this.numerofacce = nfacce;
    }

    public void lancia() {  //metodo lancio 
        Random rnd = new Random();
        ultimo_lancio = rnd.nextInt(numerofacce - 1) + 1;

    }

    public int getNumeroFacce() {
        return numerofacce;
    }

    public int getUltimo_lancio() {
        return ultimo_lancio;
    }

}
