package de.dennis.javaref.uni.ea.ea5.a3;

public class EggTimerControllerTest {
    public static void main(String[] args) {
        EggTimerModel model = new EggTimerModel(10);
        new EggTimerController(model);
    }
}