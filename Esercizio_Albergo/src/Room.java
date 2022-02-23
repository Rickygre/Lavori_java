
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author riccardo
 */
public class Room {

    private List<Reservation> list = new ArrayList(); //creo un elenco di prenotazioni

    //il metodo reserve ritorna come tipo di una classe ossia Reservations
    public Reservation reserve(String nome, LocalDate inizio, LocalDate fine) {
        //creo un oggetto di tipo reservations
        Reservation r = new Reservation(nome, inizio, fine);
        if (isOccupata(r)) {
            throw new IllegalArgumentException("periodo occupata");
        }
        list.add(r);
        return r;

    }

    public List<Reservation> reservations() {
        Comparator<Reservation> comp = (r1, r2) -> r1.getDatainizio().compareTo(r2.getDatainizio());

        return list.stream().sorted(comp).collect(Collectors.toList());

    }

    //creo un metodo per vedere se è occupata e gli passo come parametro un tipo reservation
    private boolean isOccupata(Reservation nuova) {
        //scorro la lista delle prenotazioni per identificare se è libero il periodo
        Predicate<Reservation> inizioNonvalido = (r)
                -> !nuova.getDatainizio().isBefore(r.getDatainizio()) && !nuova.getDatainizio().isAfter(r.getDatafine());
        Predicate<Reservation> fineNonvalido = (r)
                -> !nuova.getDatafine().isBefore(r.getDatainizio()) && !nuova.getDatafine().isAfter(r.getDatafine());
        Predicate<Reservation> tuttoNonvalido = (r)
                -> nuova.getDatainizio().isBefore(r.getDatainizio()) && nuova.getDatafine().isAfter(r.getDatafine());

        return list.stream().anyMatch(inizioNonvalido.or(fineNonvalido).or(tuttoNonvalido));

    }

}
