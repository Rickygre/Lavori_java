package gioco;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riccardo
 */
public class Coccinella extends Thread {

    private int x;
    private int y;
    private int larghezza;
    private int altezza;
    private boolean attivo;
    BufferedImage img_coccinella;
    private int velocità = 1;  //velocità di partenza
    private final int max_velocità=5;  //velocità coccinella
    private Gioco main;
    public  int vita;
    
    

    public Coccinella(BufferedImage image, int x, int y, int larghezza, int altezza,Gioco main) {
        this.x = x;
        this.y = y;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.attivo = attivo;
        this.img_coccinella = image;
        attivo = true;
        this.main = main;
        vita=100;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public BufferedImage getImg_coccinella() {
        return img_coccinella;
    }

    public void setImg_coccinella(BufferedImage img_coccinella) {
        this.img_coccinella = img_coccinella;
    }
    
    
    
    public Rectangle getBordi(){
        return new Rectangle(x, y, larghezza, altezza);
    }
    

    @Override
    public void run() {
        attivo = true;
        while (attivo) {
            aggiorna();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Coccinella.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void aggiorna() {
        Random rnd = new Random();
        //gestione delle collisioni con i bordi della finestra
        if(this.x <= 0){ //rende positivo quando si avvicina al bordo
            velocità = rnd.nextInt(max_velocità)+1;  //evito che ritorni zero da un num random
            
        }
        if (this.x >= main.getLarghezza()-this.larghezza){
            velocità = rnd.nextInt(max_velocità)+1;
            velocità *= -1;
        }
        x+= velocità;
    }

    public void disegna(Graphics g) {
        g.drawImage(img_coccinella, x, y, larghezza, altezza, main);

    }

}
