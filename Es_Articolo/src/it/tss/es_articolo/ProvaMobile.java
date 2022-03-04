
package it.tss.es_articolo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class ProvaMobile {
    
    
    
    
    public static List<Mobile> scegliMobile (List <Mobile> m, int prezzo, int altezza,int larghezza, int profondità){
        
       Predicate<Mobile>byaltezza = v -> v.getAltezza()<altezza;
       Predicate<Mobile>byprezzo = v -> v.getPrezzo()<prezzo;
       Predicate<Mobile>bylarghezza = v -> v.getLarghezza()<larghezza;
       Predicate<Mobile>byprofondità = v -> v.getProfondità()<profondità;
       
       return m.stream().filter(byprezzo.and(byaltezza).and(bylarghezza).and(byprofondità)).collect(Collectors.toList());
        
    }
    
    
    
    
}
