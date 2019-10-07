package SolarSystem;

import java.util.List;

public class StarSystem {

    public StarSystem() {
    }

    public static void starSystemView(List<Planet> list) {
        for (Planet p : list) {
            System.out.println("[" + p + "]");
        }
    }

    public static void planetCounter(List<Planet> list) {
        System.out.println("Star system have " + list.size() + " planets");
    }
}
