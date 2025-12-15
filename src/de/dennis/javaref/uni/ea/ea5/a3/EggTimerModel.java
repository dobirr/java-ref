package de.dennis.javaref.uni.ea.ea5.a3;

public class EggTimerModel {

    private final int totalTimeInSeconds;
    private int elapsedTimeInSeconds;

    public EggTimerModel(int totalTimeInSeconds) {
        this.totalTimeInSeconds = totalTimeInSeconds;
    }

    public double getElapsedPart() {
        return (double) elapsedTimeInSeconds / totalTimeInSeconds;
    }

    public void increaseElapsedTime() {
        elapsedTimeInSeconds++;
    }
}