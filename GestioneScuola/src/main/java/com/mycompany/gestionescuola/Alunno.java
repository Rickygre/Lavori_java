package com.mycompany.gestionescuola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alunno {

    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private LocalDate datainserimento = LocalDate.now();

    public LocalDate getDatainserimento() {
        return datainserimento;
    }

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
