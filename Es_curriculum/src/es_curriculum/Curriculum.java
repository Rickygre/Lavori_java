package es_curriculum;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Curriculum {
    
    //implemento classe job dentro classe curriculum

    public class Job {

        private String lavoro;
        private int anno;

        public Job(String lavoro, int anno) {
            this.lavoro = lavoro;
            this.anno = anno;
        }

        public String getLavoro() {
            return lavoro;
        }

        public void setLavoro(String lavoro) {
            this.lavoro = lavoro;
        }

        public int getAnno() {
            return anno;
        }

        public void setAnno(int anno) {
            this.anno = anno;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 71 * hash + Objects.hashCode(this.lavoro);
            hash = 71 * hash + this.anno;
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
            final Job other = (Job) obj;
            if (this.anno != other.anno) {
                return false;
            }
            return Objects.equals(this.lavoro, other.lavoro);
        }

        @Override
        public String toString() {
            return "Ho lavorato come " + lavoro + " nel anno " + anno;
        }
        
        
        
        public Job next() {
           if (elencolavori.isEmpty()) return null;
           int index = elencolavori.indexOf(this); //dammi indice del lavoro
           if (elencolavori.size()-1== index) return null; //verifico se è l ultimo oggetto
           //dell elenco
           return elencolavori.get(index + 1); //ritorna il successivo
    }

    }

    
    private String nomePersona;

    public ArrayList<Job> elencolavori = new ArrayList<>();

    public Curriculum(String nomePersona) {
        this.nomePersona = nomePersona;
    }

    public Job addjob(String lavoro, int anno) {
        Job l = new Job(lavoro, anno);
        elencolavori.add(l);
        return l;
    
    }



}
