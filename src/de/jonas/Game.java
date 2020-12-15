package de.jonas;

import de.jonas.eswerdelicht.GUI;
import de.jonas.eswerdelicht.ImageLoader;
import de.jonas.eswerdelicht.PlaySound;
import de.jonas.eswerdelicht.WinTimer;
import javazoom.jl.decoder.JavaLayerException;

public class Game {

    public static void main(String[] args) throws JavaLayerException {
        new ImageLoader();
        new GUI();
        new PlaySound();
        new WinTimer();
    }

}
