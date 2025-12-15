package de.dennis.javaref.uni.ea.ea5.a2;

public class EggTimerModel {

    private final int totalTimeInSeconds;
    private int elapsedTimeInSeconds;

    public EggTimerModel(int totalTimeInSeconds) {
        this.totalTimeInSeconds = totalTimeInSeconds;
        this.elapsedTimeInSeconds = 0;
    }

    public double getElapsedPart() {
        return (double) elapsedTimeInSeconds / totalTimeInSeconds;
    }

    public void increaseElapsedTime() {
        elapsedTimeInSeconds++;
    }
}