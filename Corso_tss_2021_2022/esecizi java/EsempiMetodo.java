
import java.util.Scanner; // Import the Scanner class

public class EsempioMetodo {
    // creo array di nomi e voti dimensione secondo esigenza
    static String[] nomi;
    static int[] voti;
    static float[] versati;

    public static void main(String[] args) {
        int maxn;
        System.out.print("dimmi numero max alunni");
        maxn = lettorei.nextInt();
        nomi = new String[maxn];
        voti = new int[maxn];
        versati = new float[maxn];
        caricaDatiEsami();
        stampaElencoAlunni();
        float totvers = calcoloTotVersati();
        System.out.println("tot versato: " + totvers);
       
        
        /*
         * for (int i = 0; i < voti.length; i++) { voti[i] = voti[i]*10; }
         */
        // creo una variabile che posssa contenere l'ìinformazione
        // la chiamo totvers e gli assegno subito 0 perche' all'inizio nessuno mi ha
        // ancora dato dei soldi
        /*
         * float totvers = 0; for (int i = 0; i < versati.length; i++) { // guardo il
         * versato dell'i-esimo almeno dell'array float valore = versati[i]; // carico
         * in valore il versato de...... // aggiungo totvers = totvers + valore; //
         * totvers = totvers + versati[i]; }
         */
         // chiedo la media sommare tutti i voti e poi dividerli per il numero di voti
        // letti
        float totvoti = 0;
        for (int i = 0; i < versati.length; i++) {
            totvoti = totvoti + voti[i]; // totvers = totvers + versati[i];
        }
        System.out.println("media: " + (totvoti / maxn));

    }

    static void stampaElencoAlunni() {

        System.out.println("\n-----------elenco alunni voti--------------");
        for (int i = 0; i < voti.length; i++) {
            System.out.println("nominativo: " + nomi[i]);
            System.out.println("voto: " + voti[i]);
            System.out.println("tassa versata: " + versati[i]);
            System.out.println("-------------------------");
        }

    }

    static float calcoloTotVersati() {
        float totvers = 0;
        for (int i = 0; i < versati.length; i++) {
            // guardo il versato dell'i-esimo almeno dell'array
            float valore = versati[i]; // carico in valore il versato de......
            // aggiungo
            totvers = totvers + valore; // totvers = totvers + versati[i];
        }
        return totvers;

    }

static void caricaDatiEsami(){
    Scanner lettores = new Scanner(System.in);
    Scanner lettorei = new Scanner(System.in);
    Scanner lettoref = new Scanner(System.in);

    // caricare i dati in un array
        // inserire dati esaminandi votio nomi e tasse
        for (int i = 0; i < nomi.length; i++) {
            // chiedere il nome dell'alunno
            System.out.println("dimmi il nome dell'alunno");
            nomi[i] = lettores.nextLine();
            System.out.println("dimmi il voto dell'alunno in decimi (es. 8)");
            voti[i] = lettorei.nextInt();
            System.out.println("dimmi il versamento tassa  dell'alunno");
            versati[i] = lettoref.nextFloat();

        }
        static void alteraVoti(int valore){
            //scorrere tutti i voti
            for (int i=0;i<voti.length;i++){
voti[i]=voti[i] + valore;  
if




            }




        }

}


}



