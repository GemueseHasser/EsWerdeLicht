package de.jonas.eswerdelicht;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class RoundButton extends JButton {

    private Shape shape;
    private final int arc;
    private final boolean isQuadratic;

    public RoundButton(String text, final int arc, final boolean isQuadratic) {
        super(text);
        this.arc = arc;
        this.isQuadratic= isQuadratic;

        initComponent();
    }

    private void initComponent() {
        if(isQuadratic) {
            final Dimension size = getPreferredSize();
            size.width = size.height = Math.max(size.width, size.height);
            setPreferredSize(size);
        }
        setContentAreaFilled(false);
        setFocusable(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);


        g2d.setColor(getModel().isArmed() ? Color.orange: getBackground());
        g2d.fill(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-1, arc, arc));
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setColor(getBackground().darker());
        g2d.draw(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-1, arc, arc));
    }

    @Override
    public boolean contains( int x, int y ) {
        if(shape == null || !shape.getBounds().equals(getBounds())) {
            this.shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), arc, arc);
        }
        return shape.contains(x, y);
    }
}

