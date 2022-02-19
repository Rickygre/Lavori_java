package oo_bj;

import java.util.ArrayList;

public class Giocatore {

    private int soldi;
    private final int maxSoldi;
    private final int minSoldi;
    private final ArrayList<Carta> mano = new ArrayList<>();
    int valoreMano;

    public Giocatore() {
        this(10, 15, 5);
    }

    public Giocatore(int soldi) {
        this(soldi, soldi + 2, soldi - 2);
    }

    public Giocatore(int soldi, int maxSoldi, int minSoldi) {
        this.soldi = soldi;
        this.maxSoldi = maxSoldi;
        this.minSoldi = minSoldi;
    }

    public void incrementaSoldi() {
        soldi++;
    }

    public void decrementaSoldi() {
        soldi--;
    }

    public int getSoldi() {
        return soldi;
    }

    public boolean isContinuaPartita() {
        boolean continua = soldi > minSoldi && soldi < maxSoldi;
        if (continua) {
            mano.clear();
        }
        return continua;
    }

    public void addCarta(Carta c) {
        mano.add(c);
    }

    public boolean isContinuaMano() {

        return valoreMano() <= 15;
    }

    public int valoreMano() {
        int result = 0;
        for (Carta carta : mano) {
            result += carta.getValore();
        }
        return result;
    }

    public boolean isOut(){
        return valoreMano() > 21;
    }
    
    @Override
    public String toString() {
        
        String result="----------MANO GIOCATORE--------\n";
        for (Carta carta: mano) {
            result +=carta.toString() + "\n";
        }
        result+= "valore: " + valoreMano();
        return result;
    }

    void iniziaMano() {
        mano.clear();
    }
    
    
    
    
    
}
