package SolarSystem;

import java.util.List;

public class Planet extends Star {
    private String namePlanet;
    private int placeFromStar;

    public Planet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public Planet(String namePlanet, int placeFromStar) { //тут может появится мое исключение при вводе цифр < 0;
        this.namePlanet = namePlanet;
        try {
            if (placeFromStar < 0) {
                throw new MyException("Бадабумс! Нужно вводить от 0 и выше!");
            } else {
                this.placeFromStar = placeFromStar;
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public Planet(String namePlanet, int placeFromStar, Moon sputnik) {
        this.namePlanet = namePlanet;
        this.placeFromStar = placeFromStar;
    }

    public int getPlaceFromStar() {
        return placeFromStar;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Planet m = (Planet) obj;
        return (this.getPlaceFromStar() == (m.getPlaceFromStar()));
    }

    @Override
    public int hashCode() {
        final int prime = 8;
        int result = 1;
        result = prime * result + ((this.getNamePlanet() == null) ? 0 : this.getNamePlanet().hashCode());
        result = prime * result + this.getPlaceFromStar();
        return result;
    }

    @Override
    public String toString() {
        return "Planet: " + getNamePlanet() + ", place in Solar system: " + getPlaceFromStar();
    }

    public static void addPlanet(Planet planet, List<Planet> list) {
        list.add(planet);
    }
}
