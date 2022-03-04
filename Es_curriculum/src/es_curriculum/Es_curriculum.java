
package es_curriculum;

/**
 *
 * @author tss
 */
public class Es_curriculum {

    
    public static void main(String[] args) {
     
        
        Curriculum cv = new Curriculum("Renato_Bianchi");
        Curriculum.Job j1 = cv.addjob("Prete satanico",666);
        Curriculum.Job j2 = cv.addjob("Cosplay ebreo",1940);
        Curriculum.Job j3 = cv.addjob("Pilota di aerei per Alkaida",2001);
        Curriculum.Job j4 = cv.addjob("cuoco",2010);
        
        
        System.out.println(j1.next());
        System.out.println(j2.next());
        System.out.println(j3.next());
        System.out.println(j4.next());
        System.out.println(j1.getLavoro());
        System.out.println(j2.getAnno());
        
        System.out.println(cv);
        
        
        
        
    }
    
}
