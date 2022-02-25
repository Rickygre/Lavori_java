package newpackage;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        //Appuntamento ap1 = agenda.aggiungi("Riccardo", "Milano", LocalDate.now(), LocalTime.of(12, 30), LocalTime.of(14, 30));
        //System.out.println(ap1);
        //Appuntamento ap2 = agenda.aggiungi("Rita", "Torino", LocalDate.now(), LocalTime.of(16, 30), LocalTime.of(19, 30));
        //agenda.stampa();
        //agenda.cancella(LocalDate.now());
        //agenda.stampa();
        creaAppuntamento(agenda, LocalDate.now(), LocalTime.of(10, 30), LocalTime.of(12, 30), "milano", "paolo");
        creaAppuntamento(agenda, LocalDate.now(), LocalTime.of(9, 30), LocalTime.of(12, 30), "ivrea", "giovanni");
        creaAppuntamento(agenda, LocalDate.now(), LocalTime.of(10, 30), LocalTime.of(16, 30), "milano", "luca");

        //System.out.println("appuntamenti Ivrea");
        //agenda.cerca(null, "Ivrea", null).forEach(System.out::println);
        //System.out.println("appuntamenti Ivrea oggi");
        //agenda.cerca(null, "Ivrea", LocalDate.now()).forEach(agenda::stampaAppuntamento);
        //agenda.cerca(null, null, LocalDate.now()).forEach(agenda::stampaAppuntamento);
        //scelgo di stampare il mio appuntamento filtrando per luogo
        agenda.cerca(null, "miLano", null).forEach(agenda::stampaAppuntamento);

    }

    private static Appuntamento creaAppuntamento(Agenda a, LocalDate data, LocalTime inizio, LocalTime fine, String luogo, String persona) {
        try {
            return a.aggiungi(persona, luogo, data, inizio, fine);
        } catch (AgendaException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

}
