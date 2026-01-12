package de.dennis.javaref.uni.ea.ea5.a4;

import java.awt.Component;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EggTimerController implements TickListener, ActionListener {

    private final EggTimerModel model;
    private final EggTimerCanvas view;
    private final EventBasedTimer timer;

    public EggTimerController(EggTimerModel model, EggTimerCanvas view) {
        this.model = model;
        this.view = view;

        this.timer = new EventBasedTimer();
        this.timer.addTickListener(this);
    }

    @Override
    public void tickPerformed() {
        model.increaseElapsedTime();
        view.repaint();

        if (model.getElapsedPart() >= 1.0) {
            timer.stop();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        ((Component) e.getSource()).setEnabled(false);
    }
}