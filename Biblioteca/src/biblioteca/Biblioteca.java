package biblioteca;

/**
 *
 * @author tss
 */
public class Biblioteca {

    public static void main(String[] args) {
        // TODO code application logic here

        Book a = new Book("a");
        Book b = new Book("b");
        Book c = new Book("c");
        Book d = new Book("d");
        
        Library biblio= new Library();
        System.out.println(biblio.addBook(a));
        System.out.println(biblio.addBook(b));
        System.out.println(biblio.addBook(c));
        
        
        biblio.loanBook(b);
        biblio.printLoans();
        biblio.returnBook(b);
        biblio.printLoans();
        
       
                
        

    }

}
