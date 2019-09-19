public class TV extends Technics
{
    public TV() {
        super("TV");
    }

    @Override
    public void isOn() {
        System.out.println("TV is ON");
        beep();
    }

    @Override
    public void isOff() {
        System.out.println("TV is Off");
    }

    @Override
    public void beep() {
        System.out.println("Hello. Lets watch TV show!");
    }

    @Override
    public void showInfo() {
        System.out.println("Category: " + category);
    }
}
