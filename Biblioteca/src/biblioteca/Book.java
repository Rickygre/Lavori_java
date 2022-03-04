package biblioteca;

import java.time.LocalDateTime;
import java.util.Objects;


public class Book {

   private final String titolo;
   private boolean loanBook;
   private LocalDateTime data;

    public Book(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public boolean isLoanBook() {
        return loanBook;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setLoanBook(boolean loanBook) {
        this.loanBook = loanBook;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.titolo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return Objects.equals(this.titolo, other.titolo);
    }

    @Override
    public String toString() {
        return "Book{" + "titolo=" + titolo + ", loan=" + loanBook + ", data=" + data + '}';
    }

  

   
    
   
   
   
   
  
   
   
   
   
   

}
