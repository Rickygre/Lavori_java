package it.tss.es_articolo;

/**
 *
 * @author tss
 */
public class Mobile implements Articolo {

    private final String nome;
    private final int prezzo;
    private final int larghezza;
    private final int altezza;
    private final int profondità;

    public Mobile(String nome, int prezzo, int larghezza, int altezza, int profondità) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondità = profondità;
    }

    @Override
    public String getNome() {

        return null;

    }

    @Override
    public double getPrezzo() {

        return 0;

    }

    @Override
    public String toString() {
        return "nome del mobile: " + nome + " ; " +  "prezzo del mobile: " + prezzo + " ; " + "il mobile è largo: " + larghezza + " ; " + "il mobile è alto: " + altezza + " ; " + "profondità " + profondità + "\n";
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getProfondità() {
        return profondità;
    }

}
