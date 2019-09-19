public class AppleTV extends TV {

    private String brand;

    public AppleTV(String brand) {
        super();
        this.brand = brand;
    }

    @Override
    public void isOn() {
        System.out.println(brand + " is ON");
        beep();
    }

    @Override
    public void isOff() {
        System.out.println(brand + " is Off");;
    }

    @Override
    public void beep() {
        System.out.println("I`m best of the best of the best TV");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Brand: " + brand);
    }

}
