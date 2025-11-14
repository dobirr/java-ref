package de.dennis.javaref.uni.ea.ea3.planet;

public class PlanetMain {
    public static void main(String[] args) {

        Planet p = Planet.SATURN;
        Planet p2 = Planet.URANUS;
        boolean testPosition = p.isCloserToSunThan(p2);

        /*if(testPosition) {
            System.out.println("Ist closer to sun");
        } else {
            System.out.println("Ist not closer to sun");
        }*/


    }
}
