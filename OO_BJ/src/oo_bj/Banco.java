package oo_bj;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Banco {

    int soldi;
    private final ArrayList<Carta> mano = new ArrayList<>();

    public void addCarta(Carta c) {
        if (mano.size() == 2) {
            mano.get(1).setCoperta(false);
        }
        mano.add(c);

    }

    public boolean isContinuamano() {
        return valoreMano() < 17;
    }

    public int valoreMano() {
        int result = 0;
        for (Carta carta : mano) {
            result += carta.getValore();
        }
        return result;
    }

    public boolean isOut() {
        return valoreMano() > 21;
    }

    
    
     @Override
    public String toString() {
        String result = "-------- Banco ------------- \n";
        for (Carta carta : mano) {
            result += carta.toString() + "\n";
        }
        result += "valore: " + valoreMano();
        return result;
    }

    void iniziaMano() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean isContinuaMano() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void incrementaSoldi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    

}
