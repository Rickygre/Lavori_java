package oo_bank;

public class Main_Bank {

    public static void main(String[] args) {
        Contocorrente cc = new Contocorrente("Riccardo Rossi");
        cc.deposito(100);
        cc.prelievo(40);

        System.out.println("Intestatario del conto corrente: " + cc.getIntestatario());
        System.out.println("il tuo saldo è: " + cc.getSaldo());

    }

}
