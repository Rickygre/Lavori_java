package oo_bank;

import java.util.ArrayList;

public class ContocorrenteConEstrattoConto extends Contocorrente {

    private ArrayList<Integer> movimenti = new ArrayList<>();

    public ContocorrenteConEstrattoConto(String intestatario) {
        super(intestatario);
    }

    public ArrayList<Integer> getMovimenti() { //dichiaro un array per avere una lista movimenti
        return new ArrayList(this.movimenti);

    }

    @Override
    public void deposito(int somma) {
        super.deposito(somma);
        movimenti.add(somma);

    }

    @Override
    public void prelievo(int somma) {
        super.prelievo(somma);
        movimenti.add(-somma);

    }

}
