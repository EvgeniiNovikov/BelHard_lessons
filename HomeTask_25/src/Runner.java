public class Runner
{
    public static void main(String[] args) {
        ATM atm = new ATM(0, 0, 0);
        atm.addBanknote_20(100);
        atm.addBanknote_50(100);
        atm.addBanknote_100(100);
        atm.giveMeTheMoney(8770);

    }
}
