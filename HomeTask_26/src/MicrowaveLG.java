public class MicrowaveLG extends Microwave
{

    private String brand;

    public MicrowaveLG(String brand) {
        super();
        this.brand = brand;
    }

    @Override
    public void beep() {
        System.out.println("Beep beep! like LG");
    }

    @Override
    public void isOff() {
        System.out.println("Microwave" + brand + " is Off");
    }

    @Override
    public void isOn() {
        System.out.println("Microwave " + brand + " is ON");
        beep();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Brand: " + brand);
    }
}
