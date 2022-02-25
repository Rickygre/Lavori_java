package newpackage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Agenda {

    private final List<Appuntamento> listaappuntamenti = new ArrayList();

    public Appuntamento aggiungi(String nomePersona, String Luogo, LocalDate data, LocalTime oraInizio, LocalTime oraFine) throws AgendaException {
        Objects.requireNonNull(data);
        oraInizio = Objects.requireNonNullElse(oraInizio, LocalTime.MIN);
        oraFine = Objects.requireNonNullElse(oraFine, LocalTime.MAX);
        if (data.isBefore(LocalDate.now())) {
            throw new AgendaException("data appuntamento non valida!!!");
        }
        //creo oggetto appuntamento
        Appuntamento appuntamenti = new Appuntamento(nomePersona, Luogo, data, oraInizio, oraFine);
        boolean isInvalid = listaappuntamenti.stream().anyMatch(v -> v.invalid(appuntamenti));
        //aggiungo appuntamento all'elenco
        listaappuntamenti.add(appuntamenti);
        if (isInvalid) {
            throw new AgendaException("appuntamento non valido!!");
        }

        //ritorn come risultato app(la variabile dell oggetto appuntamento)
        return appuntamenti;
    }

    public void cancella(Appuntamento a) {
        listaappuntamenti.remove(a);

    }

    public void cancella(LocalDate data) {
        listaappuntamenti.removeIf(v -> v.getData().equals(data));

    }

    public List<Appuntamento> cerca(String nomePersona, String Luogo, LocalDate data) {
        //con metodo stream vengono gestiti un insieme di + elementi, venendo in seguito filtrati e al termine inseriti in una lista tramite 
        //la classe collectors , come opearzione finale.
        Predicate<Appuntamento> byDate = v -> data == null || v.getData().equals(data);
        Predicate<Appuntamento> byLuogo = v -> Luogo == null || Luogo.isBlank() || v.getLuogo().equalsIgnoreCase(Luogo);  //isblank controlla che non ci 
        Predicate<Appuntamento> byPersona = v -> nomePersona == null || nomePersona.isBlank() || v.getNomePersona().equals(nomePersona);

        //.trim =ritorna una copia della stringa di partenza eliminando tutti gli spazi bianchi all’inizio e alla fine della stringa
        //.isblank= ritorna vero se la stringa è vuota o contiene solo spazi bianchi.
        return listaappuntamenti.stream().filter(byDate.and(byLuogo).and(byPersona)).collect(Collectors.toList());

    }

    public void stampa() {
        System.out.println("----------- AGENDA ----------");
        //listaappuntamenti.forEach(v -> System.out.println(v)); //1 modo: stampo con metodo lamba expression
        //listaappuntamenti.forEach(System.out::println);  //2 modo: stampo implementando metodo reference
        listaappuntamenti.forEach(this::stampaAppuntamento); //3 modo per stampare, this richiama la classe

    }

    public void stampaAppuntamento(Appuntamento a) {
        String frase = String.format("%s dalle ore %s alle ore %s a %s con %s ",
                a.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                a.getOraInizio(), a.getOraFine(),
                a.getLuogo(), a.getNomePersona());

        System.out.println(frase);

    }

}
