
package gioco;

/**
 *
 * @author riccardo
 */
public class GestoreCollisioni {
    
    
    //metodo che controlla la collisione del loto con la pioggia
    public static boolean ControllaCollisione(Giocatore loto, Goccia goccia){
        return loto.getBordi().intersects(goccia.getBordi());
        
    }
    
    
    //metodo che controlla la collisione della coccinella con la pioggia
    public static boolean ControllaCollisioneCoccinella(Coccinella coccinella,Goccia goccia ){
        return coccinella.getBordi().intersects(goccia.getBordi());
    }
    
}
