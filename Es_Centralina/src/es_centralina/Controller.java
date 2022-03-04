package es_centralina;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Controller {

    public class Function {

        private String nomefunzione;
        private boolean stato;
        public ArrayList<String> elencoIncompatibilita = new ArrayList<>();

        public Function(String nomefunzione) {
            this.nomefunzione = nomefunzione;

        }

        public String getNomefunzione() {
            return nomefunzione;
        }

        public void setNomefunzione(String nomefunzione) {
            this.nomefunzione = nomefunzione;
        }

        public boolean isStato() {
            return stato;
        }

        public void setStato(boolean stato) {
            this.stato = stato;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 43 * hash + Objects.hashCode(this.nomefunzione);
            hash = 43 * hash + (this.stato ? 1 : 0);
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
            final Function other = (Function) obj;
            if (this.stato != other.stato) {
                return false;
            }
            return Objects.equals(this.nomefunzione, other.nomefunzione);
        }

        public void turnOn() {
            stato = true;

        }

        public void turnOff() {
            stato = false;

        }

        public void setIncompatible(Function x) {
            this.elencoIncompatibilita.add(x.getNomefunzione());
            x.elencoIncompatibilita.add(this.getNomefunzione());

        }

        @Override
        public String toString() {
            return nomefunzione;
        }
        
        

    }

    private String nome;

    public ArrayList<Function> elencofunzionalità = new ArrayList<>();

    public Controller(String nome) {
        this.nome = nome;
    }

    Controller() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
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
        final Controller other = (Controller) obj;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Controller{" + "" + nome;
    }
    
    
    
    

    public Function addfunction(String nomefunzione) {
        Function f = new Function(nomefunzione);
        elencofunzionalità.add(f);
        return f;

    }

    public void printOn() {
        //scorro elenco e verifico se lo stato è true(attivo)
        for (Function function : elencofunzionalità) {
            if (function.isStato()) {
                System.out.println(function);
            }

        }

    }

}
