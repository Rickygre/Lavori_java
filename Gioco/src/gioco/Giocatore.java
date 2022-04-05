package gioco;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author riccardo
 */
public class Giocatore {

    private int x;
    private int y;
    private int larghezza;
    private int altezza;
    private final int velocità = 15;
    private final int velocità2 = 15;
    Gioco main;

    BufferedImage img_loto;

    public Giocatore() {
    }

    public Giocatore(int x, int y, int larghezza, int altezza, BufferedImage img_loto, Gioco main) {
        this.x = x;
        y = 400;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.img_loto = img_loto;
        this.main = main;
    }

    public void disegna(Graphics g) {
        g.drawImage(img_loto, x, y, larghezza, altezza, null);

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

    public int getAltezza() {
        return altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setMain(Gioco main) {
        this.main = main;
    }

    public BufferedImage getImg_loto() {
        return img_loto;
    }

    public void setImg_loto(BufferedImage img_loto) {
        this.img_loto = img_loto;
    }

    public void spostaDX() {
        if((x+larghezza )< main.getLarghezza()){
            x += velocità;
        }
        

    }

    public void spostaSX() {
        if (x > 0) {
            x -= velocità;
        }

    }

    public void spostaSù() {
        y += velocità2;
    }

    public void spostaGiù() {
        y -= velocità2;
    }

    public Rectangle getBordi() {
        return new Rectangle(x, y, larghezza, altezza);
        
    }

}
