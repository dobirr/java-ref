package de.dennis.javaref.uni.ea.ea5.a3;

public class EggTimerController implements TickListener {

    private final EggTimerModel model;
    private final EventBasedTimer timer;

    public EggTimerController(EggTimerModel model) {
        this.model = model;

        this.timer = new EventBasedTimer();
        this.timer.addTickListener(this);
        this.timer.start(); // laut Aufgabe: startet direkt nach Initialisierung
    }

    @Override
    public void tickPerformed() {
        model.increaseElapsedTime();

        double part = model.getElapsedPart();
        System.out.println(part);

        if (part >= 1.0) {
            timer.stop();
        }
    }
}