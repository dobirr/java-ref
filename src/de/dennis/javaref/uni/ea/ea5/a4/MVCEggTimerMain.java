package de.dennis.javaref.uni.ea.ea5.a4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MVCEggTimerMain {

    public static void main(String[] args) {
        EggTimerModel model = new EggTimerModel(60);
        EggTimerCanvas view = new EggTimerCanvas(model);
        EggTimerController controller = new EggTimerController(model, view);

        Frame frame = new Frame("Kurzzeitwecker");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(view, BorderLayout.CENTER);

        Button startButton = new Button("Start");
        startButton.addActionListener(controller);
        frame.add(startButton, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}