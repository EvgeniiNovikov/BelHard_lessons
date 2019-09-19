public class Runner
{
    public static void main(String[] args) {
        MicrowaveLG lg = new MicrowaveLG("LG");
        Microwave m = new Microwave();
        Technics t  = new Microwave();
        Technics tv = new TV();
        TV aTV = new AppleTV("Apple");
        lg.isOn();
        lg.isOff();
        System.out.println("********");
        m.isOn();
        m.isOff();
        System.out.println("********");
        tv.isOn();
        tv.isOff();
        System.out.println("********");
        t.isOn();
        t.isOff();
        System.out.println("********");
        aTV.isOn();
        aTV.isOff();
        System.out.println("********");


        lg.showInfo();
        System.out.println("***********");
        aTV.showInfo();


    }
}
