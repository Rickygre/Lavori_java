package it.tss.es_articolo;

import java.util.List;

/**
 *
 * @author tss
 */
public class Main {
    
    public static void main(String[] args) {
        
        Catalogo ct = new Catalogo<>();
        Mobile m1 = new Mobile("vetrina", 120, 20, 30, 15);
        Mobile m2 = new Mobile("mobilecamera", 1300, 60, 30, 25);
        Mobile m3 = new Mobile("vetrina", 1200, 100, 80, 55);
        
        ct.addArticolo(m1);
        ct.addArticolo(m2);
        ct.addArticolo(m3);
        
        System.out.println(ct.toString());
        System.out.println("----------------------------------------");
        List<Mobile> lstmob = ProvaMobile.scegliMobile(ct.lista_catalogo, 150, 24, 60, 18);
        lstmob.forEach(mb -> System.out.println(mb));
        
    }
    
}
