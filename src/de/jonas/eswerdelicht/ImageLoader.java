package de.jonas.eswerdelicht;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.io.IOException;

public class ImageLoader {

    static Image imgDisco, imgDiscoFlipped;

    public ImageLoader() {
        try {
            imgDisco = ImageIO.read(getClass().getResource("/de/jonas/res/disco.png"));
            imgDiscoFlipped = ImageIO.read(getClass().getResource("/de/jonas/res/discoFlipped.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
