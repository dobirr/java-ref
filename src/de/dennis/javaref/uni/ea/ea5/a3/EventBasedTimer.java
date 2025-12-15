package de.dennis.javaref.uni.ea.ea5.a3;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventBasedTimer {

    private final List<TickListener> listeners = new CopyOnWriteArrayList<>();
    private Timer timer;

    public void addTickListener(TickListener listener) {
        listeners.add(listener);
    }

    public void start() {
        if (timer != null) return; // schon gestartet

        timer = new Timer(); // non-daemon -> Programm läuft, bis stop() kommt
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (TickListener l : listeners) {
                    l.tickPerformed();
                }
            }
        }, 1000, 1000); // nach 1s starten, dann jede 1s
    }

    public void stop() {
        if (timer == null) return;
        timer.cancel();
        timer = null;
    }
}