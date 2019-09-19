public class Microwave extends Technics
{

    public Microwave() {
        super("Microwave");

    }

    @Override
    public void beep() {
        System.out.println("Beep!");
    }

    @Override
    public void isOff() {
        System.out.println("Microwave is Off");
    }

    @Override
    public void isOn() {
        System.out.println("Microwave is ON"); //Влючена в розетку
        beep();
    }

    @Override
    public void showInfo() {
        System.out.println("Category: " + category);
    }
}
