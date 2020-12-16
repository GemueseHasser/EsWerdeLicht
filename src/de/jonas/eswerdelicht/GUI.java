package de.jonas.eswerdelicht;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class GUI {

    static JButton[] button = new JButton[25];

    static JFrame FRAME;

    public GUI() {
        JFrame frame = new JFrame("Es werde Licht - by Jonas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 720, 750);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        Draw draw = new Draw();
        draw.setVisible(true);
        draw.setBounds(0, 0, frame.getWidth(), frame.getHeight());

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton();
            button[i].setOpaque(true);
            button[i].setVisible(true);
            button[i].addActionListener(new ActionHandler());
            button[i].setFocusPainted(false);
            button[i].setContentAreaFilled(false);
            frame.add(button[i]);
        }

        ButtonPlacement.place();

        JButton reset = new JButton("neues Spiel");
        reset.setBounds(275, 650, 150, 40);
        reset.setOpaque(true);
        reset.setBackground(Color.LIGHT_GRAY);
        reset.addActionListener(actionEvent -> {
            Variablen.game = false;
            newGame();
        });

        ImageIcon icon = new ImageIcon(ImageLoader.speakerOn);

        JButton mute = new RoundButton("", 75, false);
        mute.setIcon(icon);
        mute.setBounds(15, 15, 50, 50);
        mute.setFont(new Font("Arial", Font.BOLD, 19));
        mute.addActionListener(actionEvent -> {
            if (Variablen.playMusic) {
                Variablen.playMusic = false;
                PlaySound.player.pause();
                icon.setImage(ImageLoader.speakerOff);
            } else {
                Variablen.playMusic = true;
                icon.setImage(ImageLoader.speakerOn);
                PlaySound.player.restart();
            }
        });

        frame.add(mute);
        frame.add(reset);
        frame.add(draw);

        frame.setVisible(true);
        FRAME = frame;
    }

    private void newGame() {
        JFrame frame = new JFrame("neues Spiel!");
        frame.setBounds(0, 0, 350, 150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel label = new JLabel("Du hattest in diesem Spiel " + Variablen.clicks + " Klicks!", JLabel.CENTER);
        label.setBounds(0, 20, frame.getWidth(), 50);

        JButton button = new JButton("neues Spiel");
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
