package biblioteca;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> libri;

    public Library() {
        libri = new ArrayList<>();

    }

    public boolean addBook(Book b) {  //aggiungi libro
        if (libri.contains(b)) {
            return false;

        } else {
            libri.add(b);
            return true;
        }
    }

    public boolean loanBook(Book b) { //prestito libro

        if (!libri.contains(b)) {
            throw new IllegalArgumentException("il libro non è stato inserito nella biblioteca");
        }

        int indice = libri.indexOf(b);
        Book daPrestare = libri.get(indice);
        if (daPrestare.isLoanBook()) {
            return false;
        } else {
            daPrestare.setLoanBook(true);
            daPrestare.setData(LocalDateTime.now());
            return true;

        }

    }

    public void returnBook(Book b) {  //restituire libro

        if (!libri.contains(b)) {
            throw new IllegalArgumentException("Il libro non esiste in biblio");
        }

        int indice = libri.indexOf(b);
        Book daRestituire = libri.get(indice);

        if (!daRestituire.isLoanBook()) {
            throw new IllegalArgumentException("Il libro restituito non era prestato");
        }

        daRestituire.setLoanBook(false);
        daRestituire.setData(null);

    }

    public void printLoans() {
        for (Book book : libri) {
            if(book.isLoanBook()){
                System.out.println(book);
            }
        }

    }

}
