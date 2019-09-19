abstract public class Technics implements Actions
{
    String category;

    public Technics(String category) {
        this.category = category;
    }

    public abstract void isOn();
    public abstract void isOff();


}
