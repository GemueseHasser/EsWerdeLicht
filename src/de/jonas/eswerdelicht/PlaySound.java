package de.jonas.eswerdelicht;

import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class PlaySound {

    Timer timer;
    InputStream is = getClass().getResourceAsStream("/de/jonas/res/Goatubbies.mp3");
    Player player = new Player(is);

    public PlaySound() throws JavaLayerException {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 207600);
    }

}
