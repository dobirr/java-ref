package de.dennis.javaref.uni.ea.ea1.fallunterscheidung;

public class FallunterscheidungTest {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Bitte geben Sie ein Tier an.");
            return;
        }
        String s = args[0].toLowerCase();

        if(s.equals("spinne")) {
            System.out.println("8 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: eventuell");
        } else if(s.equals("maus")) {
            System.out.println("4 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: nein");
        } else if(s.equals("schlange")) {
            System.out.println("0 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: eventuell");
        } else if(s.equals("ameise")) {
            System.out.println("6 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: nein");
        } else if(s.equals("leguan")) {
            System.out.println("4 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: nein");
        } else if(s.equals("amsel")) {
            System.out.println("2 Beine\nflugfähig: ja\nhat Federn: ja\ngefährlich für Menschen: nein");
        } else if(s.equals("biene")) {
            System.out.println("6 Beine\nflugfähig: ja\nhat Federn: nein\ngefährlich für Menschen: eventuell");
        } else if(s.equals("jaguar")) {
            System.out.println("4 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: ja");
        } else if(s.equals("löwe")) {
            System.out.println("4 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: ja");
        } else if(s.equals("hai")) {
            System.out.println("0 Beine\nflugfähig: nein\nhat Federn: nein\ngefährlich für Menschen: ja");
        } else {
            System.out.println("Es wurde kein passendes Tier gefunden!");
        }
    }
}
