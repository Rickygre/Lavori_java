package gioco;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riccardo
 */
public class Goccia extends Thread {

    private int x;
    private int y;
    private int larghezza;
    private int altezza;
    private int velocità;
    BufferedImage img_goccia;
    private boolean attivo;
    private Gioco main;

    public Goccia(BufferedImage img_goccia,int larghezza, int altezza,int x, int y, int velocità, Gioco main) {
        this.x = x;
        this.y = y;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.velocità = velocità;
        this.img_goccia = img_goccia;
        this.main = main;
        this.start();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void run() {
        attivo = true;
        while (attivo) {
            aggiorna();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Goccia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void aggiorna() {
        y += velocità;
    }

    public void disegna(Graphics g) {
        g.drawImage(img_goccia, x, y, larghezza, altezza, main);
    }

    
    
     public Rectangle getBordi() {
        return new Rectangle(x, y, larghezza, altezza);
        
    }
    
    
    
    
    
}
