package de.dennis.javaref.uni.ea.ea5.a2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EggTimerCanvasTest {
    public static void main(String[] args) {
        EggTimerModel model = new EggTimerModel(60);
        EggTimerCanvas canvas = new EggTimerCanvas(model);

        Frame frame = new Frame("Kurzzeitwecker");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(canvas, BorderLayout.CENTER);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.increaseElapsedTime();
            canvas.repaint();
        }
    }
}
