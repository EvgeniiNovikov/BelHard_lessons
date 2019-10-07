package SolarSystem;

public class Star extends StarSystem {
    private String nameStar;

    public Star(String nameStar) {
        this.nameStar = nameStar;
    }

    public Star() {
    }

    public String getNameStar() {
        return nameStar;
    }

    @Override
    public String toString() {
        return "Star Name: [" + getNameStar() + ']';
    }
}
