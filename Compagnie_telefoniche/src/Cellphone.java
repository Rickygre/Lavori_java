
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class Cellphone {

    
    private  String gestore;
    private  String num_telefono;
    private static final List tariffe = new ArrayList();
    
    
    
    
    public Cellphone(String gestore, String num_telefono) {
        this.gestore = gestore;
        this.num_telefono = num_telefono;
    }

    public Cellphone() {
        
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getGestore() {
        return gestore;
    }

    public void setGestore(String gestore) {
        this.gestore = gestore;
    }

    public static void setCost(String from, String to, double cost) {
        
    }

    public double getCost(Cellphone to, int durataMinuti) {
       

       

        return 0;
       

       

    }

}
