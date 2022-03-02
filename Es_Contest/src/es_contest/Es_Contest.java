package es_contest;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author riccardo
 */
public class Es_Contest {

    public static void main(String[] args) {

        Contest c = new Contest();
        String r = "red", b = "black", g = "green";
        c.add(r);
        c.vote(r);
        c.add(b);
        c.add(g);
        c.vote(r);
        c.vote(b);
        System.out.println(c.winner());

    }

    public static class Contest {

        private String nome_voto;
        private ArrayList<Contest> elencooggetti = new ArrayList<>();

        public Contest(String nome_voto, String r, String b, String g) {
            this.nome_voto = nome_voto;

        }

        private Contest() {

        }

        public String getNome_voto() {
            return nome_voto;
        }

        public void setNome_voto(String nome_voto) {
            this.nome_voto = nome_voto;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 71 * hash + Objects.hashCode(this.nome_voto);
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
            final Contest other = (Contest) obj;
            return Objects.equals(this.nome_voto, other.nome_voto);
        }

        @Override
        public String toString() {
            return "Contest: " + "il vincitore è: " + nome_voto;
        }

        public String add(String S) {
            Contest c = new Contest();

            if (elencooggetti.isEmpty()) {
                elencooggetti.add(c);
            }
            return S;
        }

        public String vote(String s) {
            if (elencooggetti.contains(nome_voto)) {
                elencooggetti.add(this);
            }

            return s;
        }

     

        private boolean winner() {
            boolean vincitore= false;
            return false;
            
        }

    }

}
