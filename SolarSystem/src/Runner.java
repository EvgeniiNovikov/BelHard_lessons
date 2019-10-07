import SolarSystem.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Planet> solarSystemPlanets = new ArrayList<>();
        StarSystem solarSystem = new StarSystem();
        Star sun = new Star("Sun");
        System.out.println(sun);
        Planet mercury = new Planet("Mercury", 1);
        Planet venus = new Planet("Venus", 2);
        Planet earth = new Planet("Earth", 3, new Moon("Moon"));
        Planet mars = new Planet("Mars", 4);
        Planet jupiter = new Planet("Jupiter", 5);
        Planet saturn = new Planet("Saturn", 6);
        Planet uranus = new Planet("Uranus", 7);
        Planet neptune = new Planet("Neptune", 8);
        Planet.addPlanet(mercury, solarSystemPlanets);
        Planet.addPlanet(venus, solarSystemPlanets);
        Planet.addPlanet(earth, solarSystemPlanets);
        Planet.addPlanet(mars, solarSystemPlanets);
        Planet.addPlanet(jupiter, solarSystemPlanets);
        Planet.addPlanet(saturn, solarSystemPlanets);
        Planet.addPlanet(uranus, solarSystemPlanets);
        Planet.addPlanet(neptune, solarSystemPlanets);

        StarSystem.starSystemView(solarSystemPlanets);
        StarSystem.planetCounter(solarSystemPlanets);
    }
}
