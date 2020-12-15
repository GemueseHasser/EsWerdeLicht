package de.jonas.eswerdelicht;

public class ButtonPlacement {

    public static void place() {
        // reihe 1
        GUI.button[0].setBounds(100, 100, 100, 100);
        GUI.button[1].setBounds(200, 100, 100, 100);
        GUI.button[2].setBounds(300, 100, 100, 100);
        GUI.button[3].setBounds(400, 100, 100, 100);
        GUI.button[4].setBounds(500, 100, 100, 100);
        // reihe 2
        GUI.button[5].setBounds(100, 200, 100, 100);
        GUI.button[6].setBounds(200, 200, 100, 100);
        GUI.button[7].setBounds(300, 200, 100, 100);
        GUI.button[8].setBounds(400, 200, 100, 100);
        GUI.button[9].setBounds(500, 200, 100, 100);
        // reihe 3
        GUI.button[10].setBounds(100, 300, 100, 100);
        GUI.button[11].setBounds(200, 300, 100, 100);
        GUI.button[12].setBounds(300, 300, 100, 100);
        GUI.button[13].setBounds(400, 300, 100, 100);
        GUI.button[14].setBounds(500, 300, 100, 100);
        // reihe 4
        GUI.button[15].setBounds(100, 400, 100, 100);
        GUI.button[16].setBounds(200, 400, 100, 100);
        GUI.button[17].setBounds(300, 400, 100, 100);
        GUI.button[18].setBounds(400, 400, 100, 100);
        GUI.button[19].setBounds(500, 400, 100, 100);
        // reihe 5
        GUI.button[20].setBounds(100, 500, 100, 100);
        GUI.button[21].setBounds(200, 500, 100, 100);
        GUI.button[22].setBounds(300, 500, 100, 100);
        GUI.button[23].setBounds(400, 500, 100, 100);
        GUI.button[24].setBounds(500, 500, 100, 100);
    }

    public static void reset() {
        for (int i = 0; i < GUI.button.length; i++) {
            Variablen.bool[i] = false;
        }
        Variablen.game = true;
        Variablen.clicks = 0;
    }

}
