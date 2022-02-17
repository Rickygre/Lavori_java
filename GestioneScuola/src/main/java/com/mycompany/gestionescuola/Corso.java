package com.mycompany.gestionescuola;

import java.time.LocalDate;
import java.util.ArrayList;

public class Corso { //creo una classe , che conterrà attributi e metodi.

    //dichiaro attributi (variabili) o proprietà della classe corso (attributi si evidenziano in verde)
    private String nomecorso;
    private String descrizione;
    private int durataore;
    private LocalDate datainizio;
    private String link = "www.ciacformazione.it";
    //creo array (registro) che conterrà 30 alunni;
    private ArrayList<Anagrafica> registro = new ArrayList<>();
    //elenco alunni

    //costruttori
    public Corso() {
        nomecorso = "Cybersecurity";
        durataore = 550;
        descrizione = "-----";
        datainizio = LocalDate.now();
    }

    public Corso(String nomecorso, int durataore) {
        this.nomecorso = nomecorso; //di questo oggetto assegno un nome... (this);
        this.durataore = durataore;
        this.descrizione = "...NN...";
        datainizio = LocalDate.now(); //genera oggetto di tipo data e crea una data
    }

    public Corso(String nomecorso, int durataore, int y, int m, int d) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = "...NN...";
        setDatainizio(y, m, d);
    }

    public Corso(String nomecorso, int durataore, String descrizione) {
        this.nomecorso = nomecorso; //di questo oggetto assegno un nome... (this);
        this.durataore = durataore;
        this.descrizione = descrizione;
        datainizio = LocalDate.now(); //genera oggetto di tipo data e crea una data
    }

    public String getNomecorso() {
        return nomecorso;
    }

    public void setNomecorso(String nomecorso) {
        //dichiaro una condizione settando il setter
        if (nomecorso.length() > 0 && nomecorso.length() < 120);
        this.nomecorso = nomecorso;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getDurataore() {
        return durataore;
    }

    public void setDurataore(int durataore) {
        if (durataore > 0 && durataore < 1800);
        this.durataore = durataore;
    }

    /**
     *
     * @return
     */
    public LocalDate getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(LocalDate datainizio) {

        this.datainizio = datainizio;
    }

    /**
     * imposta data in data testo
     *
     * @param datainizio formato YYYY-MM-DD 2022-02-03
     * @return
     */
    public boolean setDatainizio(String datainizio) {
        try {
            int y, m, d;
            String parts[] = datainizio.split("-");
            y = Integer.parseInt(parts[0]);
            m = Integer.parseInt(parts[1]);
            d = Integer.parseInt(parts[2]);

            LocalDate data = LocalDate.of(y, m, d); //creo oggetto di tipo data

            this.datainizio = data;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * imposta data in data testo
     *
     * @param y
     * @param m
     * @param d
     */
    public void setDatainizio(int y, int m, int d) {

        LocalDate data = LocalDate.of(y, m, d); //creo oggetto di tipo data

        this.datainizio = data;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Anagrafica> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Anagrafica> registro) {
        this.registro = registro;
    }

    //area di metodi o capacità,abilità
    void stampaInfo() {
        System.out.println("\n------Scheda corso-----");  //  \n\n va a capo
        System.out.println("Nome del corso : " + nomecorso);
        System.out.println("Durata del corso : " + durataore);
        System.out.println("Descrizione del corso : " + descrizione);
        System.out.println("Data del corso : " + datainizio.toString());
        System.out.println("Link del corso : " + link);
        System.out.println("---------------\n\n");

    }

    void updateAlunno(Anagrafica alunno, int pos) {

        registro.set(pos, alunno);
    }

    boolean insertAlunno(Anagrafica alunno) {
        int ida = alunno.getId_anagrafica();

        for (Anagrafica al : registro) {
            if (al.getId_anagrafica() == ida) {

                return false;
            }
        }

        registro.add(alunno);
        return true;
    }

    /*void stampaRegistro() {

        for (Anagrafica al: registro) {
            al.stampaAlunno();
            
        }

    }*/
    String getInfo() {
        String ris = "";
        ris += ("------Scheda corso-----");
        ris += ("\nNome del corso : " + nomecorso);
        ris += ("\nDurata del corso : " + durataore);
        ris += ("\nDescrizione del corso : " + descrizione);
        ris += ("\nData del corso : " + datainizio.toString());
        ris += ("\nLink del corso : " + link + "\n\n");
        return ris;

    }

    /**
     * ritorna un csv con i corsi testata testo
     *
     * testata nomecorso;durataore;descrizione;datainizio;link elenco dati
     * separati da ; e fine linea
     *
     * @return String csv
     */
    String getCSV() {
        String ris = "";
        //ris += (" nomecorso;durataore;descrizione;datainizio;link \n");
        String lr = "";
        for (Anagrafica al : registro) {
            lr += al.getId_anagrafica() + ",";
        }
        if (lr.length() > 0) {
            lr = lr.substring(0, lr.length() - 1);
        }

        ris += nomecorso + ";" + durataore + ";" + descrizione + ";" + datainizio.toString() + ";" + link + ";" + lr + "\n";

        return ris;

    }

    public boolean isAlunno(int id) {
        for (Anagrafica a : registro) {
            if (a.getId_anagrafica() == id) {
                return true;
            }
        }
        return false;
    }

}
