
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author riccardo
 */
public class Room {

    private String nomeCliente;
    private int dataArrivo;
    private int dataPartenza;
    
    
    
    int [] giornoanno= new int [365];
    
    
    List<Room> list = new ArrayList<>();
    
    
    
    public Room(String nomeCliente, int dataArrivo, int dataPartenza) {
        this.nomeCliente = nomeCliente;
        this.dataArrivo = dataArrivo;
        this.dataPartenza = dataPartenza;
    }

    Room() {

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(int dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public int getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(int dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

   
    
    
    public boolean checkDisponibile(Room r){
        boolean camera_libera= true;
        list.add(r);
        r.getNomeCliente();
        r.getDataArrivo();
        r.getDataPartenza();
        
        
        
        if(dataArrivo >= 20 && dataPartenza <= 34){
            System.out.println("camera occupata!");
            
        }
        return camera_libera;
    }
    
    
    

}



