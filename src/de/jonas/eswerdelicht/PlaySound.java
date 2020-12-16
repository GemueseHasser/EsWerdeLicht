package de.jonas.eswerdelicht;

import java.util.Timer;
import java.util.TimerTask;

public class PlaySound {

    static Timer timer;
    static CustomPlayer player;

    public PlaySound() {
        player = new CustomPlayer();
        player.setPath(getClass().getResource("/de/jonas/res/Goatubbies.mp3").getPath());
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (!Variablen.playMusic) {
                    return;
                }
                if (player.isRunning()) {
                    player.stop();
                    System.out.println("Stop running Custom-Player");
                }
                player.play(-1);
                System.out.println("Start new Custom-Player");
            }
        }, 0, 207600);
    }

}
