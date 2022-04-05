package gioco;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riccardo
 */
public class Pioggia extends Thread {

    private int numero_gocce;
    private int attesa; //tempo per aggiungere nuova goccia
    BufferedImage img_goccia;
    Gioco main;
    private boolean piove;
    private ArrayList<Goccia> gocce;
    Random rand;
    private final int max_vel = 15;

    public Pioggia(BufferedImage img_goccia,int numero_gocce, int attesa, Gioco main) {
        this.numero_gocce = numero_gocce;
        this.attesa = attesa;
        this.img_goccia = img_goccia;
        this.main = main;
        gocce = new ArrayList();
        rand = new Random();
    }

    @Override
    public void run() {
        piove = true;
        while (piove) {  //mentre piove
            for (int i = 0; i < numero_gocce; i++) {
                gocce.add(new Goccia(img_goccia, 30, 50, rand.nextInt(main.getLarghezza()), 50, rand.nextInt(max_vel)+2, main));
            }
            try {
                Thread.sleep(attesa);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pioggia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void disegna(Graphics g) {
        for (int i = 0; i < gocce.size(); i++) {
            Goccia temp = gocce.get(i);
            temp.disegna(g);
        }
    }
    
    
    public ArrayList getGocce(){
        return gocce;
    }

}
