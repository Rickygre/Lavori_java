
import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author riccardo
 */
public class Main {

    public static void main(String[] args) {

      Room r= new Room();
      
      r.reserve("riccardo", LocalDate.of(2022, Month.MARCH, 14), LocalDate.of(2022, Month.MARCH, 30));
      r.reserve("rita", LocalDate.of(2022, Month.MAY, 14), LocalDate.of(2022, Month.MAY, 30));
      r.reserve("raul", LocalDate.of(2022, Month.FEBRUARY, 14), LocalDate.of(2022, Month.MARCH, 13));
      
     
      //r.reserve("raulo", LocalDate.of(2022, Month.FEBRUARY, 13), LocalDate.of(2022, Month.MARCH, 20));
      
      
      r.reservations().forEach(v -> System.out.println(v));
      
      
   
        
        
        
        
        

    }

}
