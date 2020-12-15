package de.jonas.eswerdelicht;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.io.IOException;

public class ImageLoader {

    static Image imgDisco;

    public ImageLoader() {
        try {
            imgDisco = ImageIO.read(getClass().getResource("/de/jonas/res/disco.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
