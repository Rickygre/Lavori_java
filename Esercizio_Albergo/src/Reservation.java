
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Reservation {

    private final String nomeCliente;
    private final LocalDate datainizio;
    private final LocalDate datafine;

    public Reservation(String nomeCliente, LocalDate datainizio, LocalDate datafine) {
        this.nomeCliente = nomeCliente;
        this.datainizio = datainizio;
        this.datafine = datafine;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LocalDate getDatainizio() {
        return datainizio;
    }

    public LocalDate getDatafine() {
        return datafine;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nomeCliente);
        hash = 89 * hash + Objects.hashCode(this.datainizio);
        hash = 89 * hash + Objects.hashCode(this.datafine);
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
        final Reservation other = (Reservation) obj;
        if (!Objects.equals(this.nomeCliente, other.nomeCliente)) {
            return false;
        }
        if (!Objects.equals(this.datainizio, other.datainizio)) {
            return false;
        }
        return Objects.equals(this.datafine, other.datafine);
    }

    @Override
    public String toString() {
        return "Reservation{" + "nomeCliente=" + nomeCliente + ", datainizio=" + datainizio + ", datafine=" + datafine + '}';
    }

    
    
    
    
    
}
