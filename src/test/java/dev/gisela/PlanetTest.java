package dev.gisela;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanetTest {

    @Test
    void testCalculateDensity() {
        Planet planet = new Planet("Test", 0, 5.0, 2.0, 0, 0, Planet.TypePlanet.TERRESTRE, false);
        double expectedDensity = 2.5;
        assertEquals(expectedDensity, planet.calculateDensity(), 0.0001);
    }

    @Test
    void testIsOuterPlanet() {
        Planet innerPlanet = new Planet("Inner", 0, 0, 0, 0, 100, Planet.TypePlanet.TERRESTRE, false);
        Planet outerPlanet = new Planet("Outer", 0, 0, 0, 0, 600, Planet.TypePlanet.GASEOSO, false);
        assertFalse(innerPlanet.isOuterPlanet());
        assertTrue(outerPlanet.isOuterPlanet());
    }

    @Test
    void testGetAttributes() {
        Planet planet = new Planet("Test", 0, 5.0, 2.0, 0, 0, Planet.TypePlanet.TERRESTRE, false);
        String expectedAttributes = "Planet name = Test" +
                                    "Number of satellites = 0" +
                                    "Planet mass = 5.0" +
                                    "Planet volume = 2.0" +
                                    "Planet diameter = 0" +
                                    "Distance to the sun = 0" +
                                    "Planet type = TERRESTRE" +
                                    "Is observable = false";
        assertEquals(expectedAttributes, planet.getAttributes());
    }
}
