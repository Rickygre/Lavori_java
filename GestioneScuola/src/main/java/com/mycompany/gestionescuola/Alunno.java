package com.mycompany.gestionescuola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alunno {

    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private LocalDate datainserimento = LocalDate.now();
    private Esame[] libretto = new Esame[50];  //dichiaro una proprietà libretto 
    //con un oggeto di tipo array

    public Alunno() {

    }

    public Alunno(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;

    }

    public Alunno(String nome, String cognome, String email, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public boolean setCognome(String cognome) {
        cognome = cognome.trim();
        if (cognome.length() >= 2) {
            this.cognome = cognome;
            return true;
        } else {
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getDatainserimento() {
        return datainserimento;
    }

    public void setLibretto(Esame esame) { //metodo setter con (Esame esame) come paramatri.
        for (int i = 0; i < libretto.length; i++) {
            //uso ciclo for per leggere e scorrere tutto l array 
            //partendo da indice 0 e lo metto nella prima posizione disponibile,poi gli dico di fermarsi con break oppure return.
            if (libretto[i] == null) {
                libretto[i] = esame;
                break;
            }

        }
    }

    void stampaAlunno() {
        System.out.println("---------Scheda Alunno-----");
        System.out.println("Nome dell 'Alunno: " + nome);
        System.out.println("Cognome dell' Alunno: " + cognome);
        System.out.println("indirizzo email: " + email);
        System.out.println("numero di telefono: " + telefono);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatterDate = datainserimento.format(myFormatObj);

        System.out.println("data iscrizione: " + formatterDate);
        System.out.println("---------------------------\n\n");

    }

}
