package oo_dado;

public class Giocatore {
    //dichiaro le caratteristiche della classe giocatore : metodi, variabili ecc..

    private int soldi; //dichiaro private xkè sarànno
    //accessibili solo da questa classe eventuali modifiche.
    private final int maxSoldi; //final=valore rimane fisso
    private final int minSoldi;

    public Giocatore(int Soldi, int maxSoldi, int minSoldi) {
        this.soldi = Soldi;
        this.maxSoldi = maxSoldi;
        this.minSoldi = minSoldi;
    }

    public void incrementaSoldi() { //dichiaro metodo
        soldi++;
        System.out.println("HAI VINTO!!");

    }

    public void decrementaSoldi() {
        soldi--;
        System.out.println("IL BANCO VINCE!!");

    }

    public int getSoldi() {
        return soldi;
    }

    public boolean isContinua() {
        return soldi > minSoldi && soldi < maxSoldi;
    }

}
