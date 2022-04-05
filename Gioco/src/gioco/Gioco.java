package gioco;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author riccardo
 */
public class Gioco extends Canvas implements Runnable, KeyListener {

    private static final int larghezza = 1280;
    private static final int altezza = 720;
    private static final String nome_gioco = "---------------Proteggi la Coccinella!--------------------";

    BufferedImage goccia = null;
    BufferedImage loto = null;
    BufferedImage coccinella = null;
    BufferedImage prato = null;

    private boolean giocoAttivo = false;
    private Giocatore giocatore; //variabile per richiamare nel metodo disegna
    private Coccinella cocci; //variabile per richiamare nel metodo disegna
    private Pioggia pioggia;

    public static int getLarghezza() {
        return larghezza;
    }

    public static int getAltezza() {
        return altezza;
    }

    public Gioco() {
        caricaRisorse();
        iniziailgioco();

    }

    public static void main(String[] args) {

        Gioco gioco = new Gioco();

        JFrame finestra_gioco = new JFrame(nome_gioco);

        Dimension dimensione_finestra = new Dimension(larghezza, altezza);
        finestra_gioco.setPreferredSize(dimensione_finestra);
        finestra_gioco.setMaximumSize(dimensione_finestra);
        finestra_gioco.setResizable(false);
        finestra_gioco.setDefaultCloseOperation(EXIT_ON_CLOSE);

        finestra_gioco.add(gioco);
        finestra_gioco.addKeyListener(gioco);
        //gioco.addMouseMotionListener(gioco); se voglio usare il mouse per giocare 
        //implemento ascoltatore mousemotionlistener

        finestra_gioco.pack();
        finestra_gioco.setVisible(true);

        Thread thread_gioco = new Thread(gioco);
        thread_gioco.start();

    }

    public void iniziailgioco() {
        giocatore = new Giocatore(100, 400, 250, 250, loto, this);
        cocci = new Coccinella(coccinella, 50, 600, 100, 100, this);
        cocci.start();
        pioggia = new Pioggia(goccia, 15, 500, this);
        pioggia.start();

    }

    public void caricaRisorse() {
        Caricatore_immagini loader = new Caricatore_immagini();
        prato = loader.caricaImmagine("immagini/Prato1.png");
        coccinella = loader.caricaImmagine("immagini/coccinella.png");
        loto = loader.caricaImmagine("immagini/loto.png");
        goccia = loader.caricaImmagine("immagini/gocciaAAA.png");
        System.out.println("Risorse caricate!");

    }

    public void disegna() {

        BufferStrategy buffer = this.getBufferStrategy();
        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        Graphics g = buffer.getDrawGraphics();

        g.drawImage(prato, 0, 0, larghezza, altezza, this);

        /*Graphics c = buffer.getDrawGraphics();
        c.drawImage(coccinella,100,600, 100, 100, this);*/
        //c.dispose();
        cocci.disegna(g);
        giocatore.disegna(g);
        pioggia.disegna(g);

        g.drawString("vita: " + cocci.vita, 25, 25);

        /*if(!giocoAttivo){
            g.setColor(Color.red);
            g.clearRect(0, 0, larghezza, altezza);
            g.drawString("HAI PERSO!!", 360, 640);
            
        }*/
        g.dispose();

        buffer.show();

    }

    //metodo dove controlliamo e verifichiamo le collisioni
    private void aggiorna() {
        ArrayList<Goccia> gocce = pioggia.getGocce();
        for (Goccia goccia : gocce) {
            if (GestoreCollisioni.ControllaCollisione(giocatore, goccia)) {
                gocce.remove(goccia);
                break;
            }
            if (GestoreCollisioni.ControllaCollisioneCoccinella(cocci, goccia)) {
                gocce.remove(goccia);
                this.cocci.vita -= 5;
                break;
            }
            if (controllaSconfitta()) {
                this.giocoAttivo = false; //finisce il gioco
                disegna();
                JOptionPane.showMessageDialog(this, "HAI PERSO!! RITENTA!!");
                aggiorna();
                
            }
        }
    }

    @Override
    public void run() {
        giocoAttivo = true;
        while (giocoAttivo) {
            aggiorna();
            disegna();
        }
    }

    private boolean controllaSconfitta() {
        if (cocci.vita <= 0) {
            return true;
        }
        return false;
    }

    //SE VOGLIO GIOCARE CON IL MOUSE SCOMMENTA
    /*@Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override  //se voglio giocare con il mouse
    public void mouseMoved(MouseEvent e) {
        int posizione = e.getPoint().x-(giocatore.getLarghezza()/2);
        //assegno al giocatore la posizione iniziale del mouse
        if(posizione >= 0 && pisizione + giocatore.getLarghezza())<=larghezza){
    
            giocatore.setX(posizione);
         }
        System.out.println("il mouse si muove");
    }*/
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override  //al metodo keypressed dell ascoltatore keylistener 
    //implemento le frecce dx e sx della tastiera collegandola come evento
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        switch (keycode) {
            case KeyEvent.VK_LEFT:
                giocatore.spostaSX();
                break;
            case KeyEvent.VK_RIGHT:
                giocatore.spostaDX();
                break;
            case KeyEvent.VK_DOWN:
                giocatore.spostaSù();
                break;
            case KeyEvent.VK_UP:
                giocatore.spostaGiù();
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
