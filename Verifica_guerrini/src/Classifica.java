
import java.util.Objects;

public class Classifica implements Comparable<Classifica> {

    private Squadra squadra;
    private int punti;
    private int goalfatti;
    private int goalsubiti;

    public Classifica(Squadra squadra) {
        this(squadra, 0, 0, 0);
    }

    public Classifica(Squadra squadra, int punti, int goalfatti, int goalsubiti) {
        this.squadra = squadra;
        this.punti = punti;
        this.goalfatti = goalfatti;
        this.goalsubiti = goalsubiti;
    }

    public Squadra getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadra squadra) {
        this.squadra = squadra;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public int getGoalfatti() {
        return goalfatti;
    }

    public void setGoalfatti(int goalfatti) {
        this.goalfatti = goalfatti;
    }

    public int getGoalsubiti() {
        return goalsubiti;
    }

    public void setGoalsubiti(int goalsubiti) {
        this.goalsubiti = goalsubiti;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.squadra);
        hash = 47 * hash + this.punti;
        hash = 47 * hash + this.goalfatti;
        hash = 47 * hash + this.goalsubiti;
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
        final Classifica other = (Classifica) obj;
        if (this.punti != other.punti) {
            return false;
        }
        if (this.goalfatti != other.goalfatti) {
            return false;
        }
        if (this.goalsubiti != other.goalsubiti) {
            return false;
        }
        return Objects.equals(this.squadra, other.squadra);
    }

    @Override
    public int compareTo(Classifica c2) {
        int p1 = punti;
        return c2.punti - p1;
    }

}
