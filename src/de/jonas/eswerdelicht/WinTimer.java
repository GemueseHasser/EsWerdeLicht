package de.jonas.eswerdelicht;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class WinTimer {

    Timer timer;

    public WinTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (!allFilled()) {
                    return;
                }
                if (Variablen.game) {
                    win();
                }
                Variablen.game = false;
            }
        }, 0, 100);
    }

    private boolean allFilled() {
        for (boolean bool : Variablen.bool) {
            if (!bool) return false;
        }
        return true;
    }

    private void win() {
        JFrame frame = new JFrame("Du hast gewonnen!");
        frame.setBounds(0, 0, 350, 150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel label = new JLabel("Du hast gewonnen, mit " + Variablen.clicks + " Klicks!", JLabel.CENTER);
        label.setBounds(0, 20, frame.getWidth(), 50);

        JButton button = new JButton("Neues Spiel");
        button.setBounds(100, 80, 150, 25);
        button.addActionListener(actionEvent -> {
            frame.dispose();
            ButtonPlacement.reset();
        });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }

}
