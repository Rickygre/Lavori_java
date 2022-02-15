package com.mycompany.gestionescuola;

/**
 *
 * @author tss
 */
public class Anagrafica {

    private final int id_anagrafica;
    private String cognome;
    private String nome;
    private String mail;

    public Anagrafica(int id_anagrafica, String cognome, String nome, String mail) {
        this.id_anagrafica = id_anagrafica;
        this.cognome = cognome;
        this.nome = nome;
        this.mail = mail;
    }

    public int getId_anagrafica() {
        return id_anagrafica;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    String getCSV() {
        return id_anagrafica + ";" + cognome + ";" + nome + ";" + mail + "\n";
    }

}
