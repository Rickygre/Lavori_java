package com.mycompany.gestionescuola;

public class GestioneScuola {

    public static void main(String[] args) {
        Tool genio = new Tool();

        String nome = "tss java";  //all'attributo nomecorso assegno come valore un testo;
        int durata = 1000;//all'attributo durataore assegno valore 1000;
        Corso c1 = new Corso(nome, durata); //creo oggetto (c1) della classe corso;
        c1.stampaInfo();//richiamo metodo stampa
        Corso c2 = new Corso(nome, durata, 2022, 3, 20);
        c2.stampaInfo();

        Alunno a1 = new Alunno("mario", "rossi", "mario87@libero.it", "3398767120");
        a1.stampaAlunno();

        String oktel = genio.checkTel("0125-768765", "+44");

        Alunno a2 = new Alunno("Riccardo", "Greggio", "gigi-rivi@gmail.com ", oktel);
        a2.stampaAlunno();

        c1.insertAlunno(a2, 0);
        c1.insertAlunno(a1);
        c1.stampaRegistro();

        boolean ok;
        c1.setDatainizio("2022-02-02");
        ok = c1.setDatainizio("2022-02-02");
        ok = c1.setDatainizio("2022/30/02");
        
        Esame es = new Esame("Guerrini",100,"Java");
        Alunno esaminando= c1.getRegistro()[0];
        esaminando.setLibretto(es);

    }

}
