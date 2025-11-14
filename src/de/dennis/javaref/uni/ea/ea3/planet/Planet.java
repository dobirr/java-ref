package de.dennis.javaref.uni.ea.ea3.planet;

public enum Planet {
        Merkur(0, 1),
        VENUS(0, 2),
        ERDE(1, 3),
        JUPITER(79, 5),
        SATURN(82, 6),
        URANUS(27, 7),
        NEPTUN(14, 8),
        MARS(2, 4);

    private final int countPlanetMoons;
    private final int positionPlanetIndexFromSun;

    Planet(int countPlanetMoons, int positionPlanetIndexFromSun) {
        this.countPlanetMoons = countPlanetMoons;
        this.positionPlanetIndexFromSun = positionPlanetIndexFromSun;
    }

    int getNumberOfMoons() {
        return countPlanetMoons;
    }

    int getPositionPlanetIndexFromSun() {
        return positionPlanetIndexFromSun;
    }

    boolean isCloserToSunThan(Planet other) {
        return this.ordinal() < other.ordinal();
    }
}