package esercizio_prodotto;

public class Prodotto {

    private String nomeProdotto;
    private float prezzo;
    private int scadenza;

    public Prodotto(String nome, float prezzo, int scadenza) {
        this.nomeProdotto = nome;
        this.prezzo = prezzo;
        this.scadenza = scadenza;
    }

    Prodotto(String nm, String pr, String sc) {

    }

    public String getNome() {
        return nomeProdotto;
    }

    public void setNome(String nome) {
        this.nomeProdotto = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public int getScadenza() {
        return scadenza;
    }

    public void setScadenza(int scadenza) {
        this.scadenza = scadenza;
    }

    void setPrezzo(String pr) {

    }

    void setScadenza(String sc) {
        
    }

    
    

    

}
