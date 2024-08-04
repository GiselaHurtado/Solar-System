package dev.gisela;

public class App {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 5.9736E24, 1.08321E12, 12742, 150, Planet.TypePlanet.TERRESTRE, true);
        Planet jupiter = new Planet("Jupiter", 79, 1.899E27, 1.4313E15, 139820, 750, Planet.TypePlanet.GASEOSO, true);

        System.out.println(earth.getAttributes());
        System.out.println("Density of the Planet = " + earth.calculateDensity());
        System.out.println("It is Outer Planet = " + earth.isOuterPlanet());
        System.out.println();

        System.out.println(jupiter.getAttributes());
        System.out.println("Density of the Planet = " + jupiter.calculateDensity());
        System.out.println("It is Outer Planet = " + jupiter.isOuterPlanet());
    }
}
