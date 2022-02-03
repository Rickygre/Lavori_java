package com.mycompany.gestionescuola;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Esame {

    private String Docente;
    private LocalDate data;
    private int Voto;
    private String Materia;
    private String Note;

    public Esame(String Docente, int Voto, String Materia) {

        this.Docente = Docente;
        this.Voto = Voto;
        this.Materia = Materia;
        
        data = LocalDate.now();  //dichiaro registrazione data
    }

   

    public String getDocente() {
        return Docente;
    }

    public LocalDate getData() {
        return data;
    }

    public int getVoto() {
        return Voto;
    }

    public String getMateria() {
        return Materia;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

}
