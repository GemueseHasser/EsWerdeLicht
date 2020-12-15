package de.jonas.eswerdelicht;

import java.util.Timer;
import java.util.TimerTask;

public class CalculateBackground {

    Timer timer;

    boolean flipped = false;

    final int width = GUI.FRAME.getWidth();
    final int minusWidth = GUI.FRAME.getWidth() - (2 * GUI.FRAME.getWidth());

    public CalculateBackground() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (flipped) {
                    if (Variablen.backgroundX2 == minusWidth) {
                        Variablen.backgroundX1 = 0;
                        Variablen.backgroundX2 = width;
                        flipped = false;
                    }
                } else {
                    if (Variablen.backgroundX1 == minusWidth) {
                        Variablen.backgroundX2 = 0;
                        Variablen.backgroundX1 = width;
                        flipped = true;
                    }
                }
                Variablen.backgroundX1--;
                Variablen.backgroundX2--;
            }
        }, 0, 30);
    }

}
