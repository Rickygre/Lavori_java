
import java.util.Objects;



/**
 *
 * @author tss
 */
public class Tariffe {
    private String gestoreDA;
    private String gestoreA;
    private double costo_telefonata;

    
    public Tariffe(String gestoreDA, String gestoreA, double costo_telefonata) {
        this.gestoreDA = gestoreDA;
        this.gestoreA = gestoreA;
        this.costo_telefonata = costo_telefonata;
    }

    public String getGestoreDA() {
        return gestoreDA;
    }

    public String getGestoreA() {
        return gestoreA;
    }

    public double getCosto_telefonata() {
        return costo_telefonata;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.gestoreDA);
        hash = 97 * hash + Objects.hashCode(this.gestoreA);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tariffe other = (Tariffe) obj;
        if (!Objects.equals(this.gestoreDA, other.gestoreDA)) {
            return false;
        }
        return Objects.equals(this.gestoreA, other.gestoreA);
    }
    
    
    
    
    
    
}
