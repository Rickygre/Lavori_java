package oo_bank;

public class Contocorrente {

    //dichiaro la struttura dati , è di tipo statica xkè deve mantenere 
    //uno stato.
    //dichiaro uno stato di questa classe
    private String intestatario;
    private int saldo;

    public Contocorrente(String intestatario) {
        if (intestatario == null || intestatario.isBlank()) {
            throw new IllegalArgumentException("intestatario vuoto");
        }

        this.intestatario = intestatario;
    }

    public void deposito(int somma) {
        if (somma <= 0) {
            throw new IllegalArgumentException("somma uguale o minore di 0");
        }

        this.saldo += somma;

    }

    public void prelievo(int somma) {
        if (somma <= 0) {
            throw new IllegalArgumentException("somma uguale o minore di 0");
        }
        if (somma > this.saldo) {
            throw new IllegalArgumentException("somma non disponibile");
        }

        this.saldo -= somma;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public int getSaldo() { //modificabile tramite i metodi deposita e prelievo
        return saldo;
    }

    

}
