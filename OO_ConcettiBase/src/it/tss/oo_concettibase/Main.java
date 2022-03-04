
package it.tss.oo_concettibase;


public class Main {

   
    public static void main(String[] args) {
        A a= new A();
        a.m1();
       
        B b= new B();
        
        
        A aa= new B(); //B estende A, b figlio di a, 
        //la variabile aa eredita e contiene i metodi di A,
        //ma non vede i metodi di B.
        
        //((B)aa).m3(); // dico alla variabile aa di vedere le proprietà di B
        // questa operazione è definita: CAST (conversione)
        
        if (a instanceof B){
            System.out.println("contiene un oggetto di tipo B");
        }else {
            System.out.println("non contiene un oggetto di tipo B");
        }
        
        aa.m2();
        
        C c=new C();
        
        
         aa= new C();
         aa.m2();
         
        
         
        
        
        
        
    }
    
}
