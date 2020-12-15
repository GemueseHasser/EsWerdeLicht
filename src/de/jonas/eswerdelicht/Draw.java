package de.jonas.eswerdelicht;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.drawImage(ImageLoader.imgDisco, 0, 0, this.getWidth(), this.getHeight(), null);

        g.setColor(Color.BLACK);
        g.fillRect(200, 20, 300, 40);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Es werde Licht", 240, 50);

        for (int i = 0; i < GUI.button.length; i++) {
            if (Variablen.bool[i]) {
                GUI.button[i].setFocusPainted(true);
                GUI.button[i].setContentAreaFilled(true);
                GUI.button[i].setBackground(Color.YELLOW);
            } else {
                GUI.button[i].setFocusPainted(true);
                GUI.button[i].setContentAreaFilled(true);
                GUI.button[i].setBackground(Color.WHITE);
            }
        }

        repaint();

    }


}
