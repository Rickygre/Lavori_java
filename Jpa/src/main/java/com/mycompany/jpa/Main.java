package com.mycompany.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbscuola");
        EntityManager em = emf.createEntityManager();
        
        em.createQuery("select e from Corso e", Corso.class)
                .getResultList()
                .forEach(System.out::println);
        
        em.createQuery("select  e from Iscrizione e order by e.dataiscrizione",Iscrizione.class)
                .getResultList()
                .forEach(System.out::println);
        
    }
    
}
