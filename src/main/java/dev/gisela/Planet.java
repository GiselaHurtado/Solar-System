package dev.gisela;

public class Planet {
    String name = null;
    int numberOfSatellites = 0;
    double massKilograms = 0;
    double volumeCubicKilometres = 0;
    int diameterKilometres = 0;
    int averageDistanceToSun = 0;

    enum TypePlanet {
        GASEOSO, TERRESTRE, ENANO
    }

    TypePlanet type;
    boolean nakedEye = false;

    public Planet(String name, int numberOfSatellites, double massKilograms, double volumeCubicKilometres,
                  int diameterKilometres, int averageDistanceToSun, TypePlanet type, boolean nakedEye) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.massKilograms = massKilograms;
        this.volumeCubicKilometres = volumeCubicKilometres;
        this.diameterKilometres = diameterKilometres;
        this.averageDistanceToSun = averageDistanceToSun;
        this.type = type;
        this.nakedEye = nakedEye;
    }

    public String getAttributes() {
        return "Planet name = " + name +
               "Number of satellites = " + numberOfSatellites +
               "Planet mass = " + massKilograms + 
               "Planet volume = " + volumeCubicKilometres + 
               "Planet diameter = " + diameterKilometres + 
               "Distance to the sun = " + averageDistanceToSun + 
               "Planet type = " + type + 
               "Is observable = " + nakedEye;
    }

    public double calculateDensity() {
        return massKilograms / volumeCubicKilometres;
    }

    public boolean isOuterPlanet() {
        double limit = 149597870 * 3.4;
        return averageDistanceToSun * 1_000_000 > limit;
    }
}
