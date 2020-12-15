package de.jonas.eswerdelicht;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (!Variablen.game) {
            return;
        }

        Variablen.clicks++;

        for (int i = 0; i < GUI.button.length; i++) {
            if (actionEvent.getSource() == GUI.button[i]) {
                Variablen.bool[i] = !Variablen.bool[i];

                if (i == 4) {
                    Variablen.bool[i - 1] = !Variablen.bool[i - 1];
                    Variablen.bool[i + 5] = !Variablen.bool[i + 5];
                    return;
                }

                if (i == 5 || i == 10 || i == 15 || i == 20) {
                    Variablen.bool[i - 5] = !Variablen.bool[i - 5];
                    Variablen.bool[i + 1] = !Variablen.bool[i + 1];
                    if ((i + 5) <= 24) {
                        Variablen.bool[i + 5] = !Variablen.bool[i + 5];
                    }
                    return;
                }

                if (i == 9 || i == 14 || i == 19) {
                    Variablen.bool[i - 5] = !Variablen.bool[i - 5];
                    Variablen.bool[i - 1] = !Variablen.bool[i - 1];
                    Variablen.bool[i + 5] = !Variablen.bool[i + 5];
                    return;
                }

                if ((i - 1) >= 0) {
                    Variablen.bool[i - 1] = !Variablen.bool[i - 1];
                }

                if ((i - 5) >= 0) {
                    Variablen.bool[i - 5] = !Variablen.bool[i - 5];
                }

                if ((i + 1) <= 24) {
                    Variablen.bool[i + 1] = !Variablen.bool[i + 1];
                }

                if ((i + 5) <= 24) {
                    Variablen.bool[i + 5] = !Variablen.bool[i + 5];
                }
            }
        }
    }
}
