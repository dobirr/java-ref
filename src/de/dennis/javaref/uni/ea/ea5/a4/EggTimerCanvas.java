package de.dennis.javaref.uni.ea.ea5.a4;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public class EggTimerCanvas extends Canvas {

    private final EggTimerModel model;

    public EggTimerCanvas(EggTimerModel model) {
        this.model = model;
        setPreferredSize(new Dimension(320, 320));
    }

    @Override
    public void paint(Graphics g) {
        int diameter = 300;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        double part = model.getElapsedPart();
        int angle = (int) Math.round(part * 360);

        g.fillArc(x, y, diameter, diameter, 90, -angle);
        g.drawOval(x, y, diameter, diameter);
    }
}