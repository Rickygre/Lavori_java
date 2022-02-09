package oo_bj;

import java.util.ArrayList;

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

    public Carta(Seme seme, int valore, Nome nome) {
        this(seme, valore, nome, new ArrayList());
    }

    public Carta(Seme seme, int valore, Nome nome, ArrayList<Integer> valori) {
        this.seme = seme;
        this.valore = valore;
        this.nome = nome;
        this.valoriPossibili = new ArrayList<>(valori);
        if (this.valoriPossibili.isEmpty()) {
            this.valoriPossibili.add(valore);
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

    @Override
    public String toString() {
        return this.nome.name() + "di" + this.seme.name() + " " + this.valore;
    }

}
