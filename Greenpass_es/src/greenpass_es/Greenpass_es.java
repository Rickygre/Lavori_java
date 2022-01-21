package greenpass_es;

public class Greenpass_es {

    public static void main(String[] args) {

        //data oggi
        int oggi = 749;
        //dati validità ministero
        int durata_v1 = 30;
        int durata_v2 = 120;
        int durata_v3 = 120;
        int durata_tampone = 2;
        int durata_covid = 180;

        //inizializzo dati persona (assegnando valore zero)
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int covid = 0;
        int tampone = 0;

        v1 = 500; //creo finta data
        int diffv1 = oggi - v1;
        //dichiaro var booleana
        boolean okv1 = diffv1 < durata_v1;

        v2 = 550; //creo finta data
        int diffv2 = oggi - v2;
        //dichiaro var booleana
        boolean okv2 = diffv2 < durata_v2;

        v3 = 650; //creo finta data
        int diffv3 = oggi - v3;
        //dichiaro var booleana
        boolean okv3 = diffv3 < durata_v3;

        covid = 0; //creo finta data
        int diffcovid = oggi - covid;
        //dichiaro var booleana
        boolean okcovid = diffcovid < durata_covid;

        tampone = 0; //creo finta data
        int difftampone = oggi - tampone;
        //dichiaro var booleana
        boolean oktampone = difftampone < durata_tampone;

        boolean greenpass = okcovid || oktampone || okv1 || okv2 || okv3;

        if (greenpass) {
            System.out.println("OK! GREEN PASS VALIDO.");
        } else {
            System.out.println("ATTENZIONE!! GREEN PASS NON VALIDO!!");
        }

    }

}
