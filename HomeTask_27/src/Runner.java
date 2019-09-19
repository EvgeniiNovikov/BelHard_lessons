public class Runner
{
    public static void main(String[] args) {
        MasterCard masterCard = new MasterCard(10000);
        VisaCard visaCard = new VisaCard(50000);

        visaCard.showInfo();
        masterCard.showInfo();
        visaCard.addMoney(4000);
        visaCard.sendMoney(40000);
        visaCard.showInfo();
    }
}
