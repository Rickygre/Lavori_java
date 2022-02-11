package oo_bj;

import java.util.ArrayList;
import java.util.Objects;

public class Carta {

    public static enum Seme { //definire un insieme di valori ristretto (enumerazione "enum")
        CUORI, QUADRI, FIORI, PICCHE //costanti

    }

    public static enum Nome {
        ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO, NOVE, DIECI, FANTE, REGINA, RE
    }
    private final Seme seme;
    private final ArrayList<Integer> valoriPossibili;
    private int valore;
    private final Nome nome;
    private boolean coperta = true;

    public Carta(Seme seme, int valore, Nome nome) {
        this(seme, valore, nome, new ArrayList());
    }

    public Carta(Seme seme, int valore, Nome nome, ArrayList<Integer> valori) {

        Objects.requireNonNull(seme, "seme non può essere null");
        Objects.requireNonNull(nome, "nome non può essere null");

        checkValore(valore);
        this.seme = seme;
        this.valore = valore;
        this.nome = nome;
        this.valoriPossibili = new ArrayList<>(valori);
        if (this.valoriPossibili.isEmpty()) {
            this.valoriPossibili.add(valore);
        }

    }

    private void checkValore(int valore) {
        if (valore <= 0 || valore > 13) {
            throw new IllegalArgumentException("Valore non compreso tra 1 e 13");
        }
    }

    public Seme getSeme() {
        return seme;
    }

    public int getValore() {
        return valore;
    }

    public Nome getNome() {
        return nome;
    }

    public void setValore(int valore) {
        if (!valoriPossibili.contains(valore)) {
            throw new IllegalArgumentException("Valore non previsto!");
        }
        this.valore = valore;

    }

    public boolean isCoperta() {
        return this.coperta;
    }

    public void setCoperta(boolean coperta) {
        this.coperta = coperta;
    }

    @Override
    public String toString() {
        if (this.coperta) {
            return "????????";
        } else {
            return this.nome.name() + " di " + this.seme.name() + " " + this.valore;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.seme);
        hash = 59 * hash + this.valore;
        hash = 59 * hash + Objects.hashCode(this.nome);
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
        final Carta other = (Carta) obj;
        if (this.valore != other.valore) {
            return false;
        }
        if (this.seme != other.seme) {
            return false;
        }
        return this.nome == other.nome;
    }

}
