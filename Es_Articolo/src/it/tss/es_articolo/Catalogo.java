package it.tss.es_articolo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 * @param <E>
 */
public class Catalogo<E extends Articolo> implements Iterable {

    List<E> lista_catalogo = new ArrayList();

    public void addArticolo(E art) {

        lista_catalogo.add(art);

    }

    public List<E> getArticoliSottoPrezzo(double prezzo) {

        Predicate<E> byprezzo = pr -> pr.getPrezzo() < prezzo;
        return lista_catalogo.stream().filter(byprezzo).collect(Collectors.toList());
    }

    @Override
    public String toString() {

        return lista_catalogo.stream().map(Articolo::toString).collect(Collectors.joining("\n"));

    }

    @Override
    public Iterator iterator() {

        return lista_catalogo.iterator();

    }

}
