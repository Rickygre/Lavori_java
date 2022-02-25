package newpackage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Appuntamento {

    private final String nomePersona;
    private final String Luogo;
    private final LocalDate data;
    private final LocalTime oraInizio;
    private final LocalTime oraFine;

    public Appuntamento(String nomePersona, String Luogo, LocalDate data, LocalTime oraInizio, LocalTime oraFine) {

        this.nomePersona = nomePersona;
        this.Luogo = Luogo;
        this.data = data;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
    }

    public String getNomePersona() {
        return nomePersona;
    }

    public String getLuogo() {
        return Luogo;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getOraInizio() {
        return oraInizio;
    }

    public LocalTime getOraFine() {
        return oraFine;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nomePersona);
        hash = 43 * hash + Objects.hashCode(this.Luogo);
        hash = 43 * hash + Objects.hashCode(this.data);
        hash = 43 * hash + Objects.hashCode(this.oraInizio);
        hash = 43 * hash + Objects.hashCode(this.oraFine);
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
        final Appuntamento other = (Appuntamento) obj;
        if (!Objects.equals(this.nomePersona, other.nomePersona)) {
            return false;
        }
        if (!Objects.equals(this.Luogo, other.Luogo)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.oraInizio, other.oraInizio)) {
            return false;
        }
        return Objects.equals(this.oraFine, other.oraFine);
    }

    @Override
    public String toString() {
        return "Appuntamento " + "nomePersona=" + nomePersona + ", Luogo=" + Luogo + ", data=" + data + ", oraInizio=" + oraInizio + ", oraFine=" + oraFine + ";";
    }

    public boolean intersect(Appuntamento nuovo) {
        if (!this.data.equals(nuovo.getData())) {
            return false;
        }
        if (this.isAllday() || nuovo.isAllday()) {
            return true;
        }
        if (this.oraInizio.isBefore(nuovo.getOraInizio())
                && this.oraFine.isAfter(nuovo.getOraFine())) {
            return true;
        }

        return this.oraInizio.isBefore(nuovo.oraFine) 
                || this.oraFine.isAfter(nuovo.oraFine);
    }

    public boolean overlap(Appuntamento nuovo) {
        return nuovo.oraInizio.isBefore(this.oraInizio) && nuovo.oraFine.isAfter(this.oraFine);
    }

    public boolean invalid(Appuntamento a) {
        return intersect(a) || overlap(a);

    }

    public boolean isAllday() {

        return oraInizio == LocalTime.MIN && oraFine == LocalTime.MAX;

    }

}
