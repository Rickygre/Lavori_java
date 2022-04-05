package gioco;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author riccardo
 */
public class Caricatore_immagini {

    BufferedImage image;

    public BufferedImage caricaImmagine(String posizione) {
        try {
            image = ImageIO.read(getClass().getResource(posizione));
         
            
        }catch (IOException ex) {
            System.out.println("immagine alla posizione: " + posizione + "caricata correttamente");
            Logger.getLogger(Caricatore_immagini.class.getName()).log(java.util.logging.Level.SEVERE, posizione, ex);

        }
        return image;
    }

}
