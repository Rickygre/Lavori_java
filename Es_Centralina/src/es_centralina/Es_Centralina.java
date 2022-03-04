
package es_centralina;

/**
 *
 * @author tss
 */
public class Es_Centralina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c= new Controller();
        Controller.Function ac= c.addfunction("aria_condizionata");
        Controller.Function risc= c.addfunction("riscaldamento");
        Controller.Function sedile= c.addfunction("sedile_riscaldato");
        
        ac.setIncompatible(risc);
        ac.setIncompatible(sedile);
        
        ac.turnOn();
        c.printOn();
        System.out.println("-----");
        
        risc.turnOn();
        sedile.turnOn();
        c.printOn();
        
    }
    
}
