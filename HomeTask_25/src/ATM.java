//Задание 25
//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр.



public class ATM
{
    private int banknote_20;
    private int banknote_50;
    private int banknote_100;
    private int atmSum;

    static {
        System.out.println("Банкомат выдает купюры номиналом: 20, 50, 100");
    }

    public ATM(int banknote_20, int banknote_50, int banknote_100) {
        if (banknote_20 >= 0 && banknote_50 >= 0 && banknote_100 >= 0){
            this.banknote_20 = banknote_20;
            this.banknote_50 = banknote_50;
            this.banknote_100 = banknote_100;
        } else
            System.out.println("Введите цифры от 0 и выше");
    }

    public int getAtmSum() {
        return atmSum;
    }


    public int getBanknote_20() {
        return banknote_20;
    }

    public void setBanknote_20(int banknote_20) {
        this.banknote_20 = banknote_20;
    }

    public int getBanknote_50() {
        return banknote_50;
    }

    public void setBanknote_50(int banknote_50) {
        this.banknote_50 = banknote_50;
    }

    public int getBanknote_100() {
        return banknote_100;
    }

    public void setBanknote_100(int banknote_100) {
        this.banknote_100 = banknote_100;
    }

    public void addBanknote_20(int banknote){
        if (banknote >= 0){
            banknote_20 = banknote;
            atmSum += banknote_20 * 20;
        } else {
            System.out.println("Нужно ввести от 0 и выше");
        }

    }

    public void addBanknote_50(int banknote) {
        if (banknote >= 0) {
            banknote_50 = banknote;
            atmSum += banknote_50 * 50;
        } else {
            System.out.println("Нужно ввести от 0 и выше");
        }
    }

    public void addBanknote_100(int banknote) {
        if (banknote >= 0) {
            banknote_100 = banknote;
            atmSum += banknote_100 * 100;
        } else {
            System.out.println("Нужно ввести от 0 и выше");
        }
    }

    public boolean giveMeTheMoney(int sum) {
        boolean atmHaveMoney = true;
        if (sum < atmSum){
            System.out.println("Выдаю банкноты на сумму: " + sum);
            int b = sum/100;
            System.out.println("Выдано банкнот по 100: " + b);
            atmSum -= b * 100;
            int c = (sum - (b * 100)) / 50;
            System.out.println("Выдано банкнот по 50: " + c);
            atmSum -=  c * 50;
            int d = (sum - (b * 100) - (c * 50)) / 20;
            System.out.println("Выдано банкнот по 20: " + d);
            atmSum -= d * 20;
        } else {
            atmHaveMoney = false;
            System.out.println("В ATM закончились средства!");
        }
        return atmHaveMoney;
    }

}




//    int banknoteCounter = 0;
//    int needCash = atmSum - sum;
//
//            while (banknoteCounter < banknote_100 && atmSum != needCash){
//        atmSum -= banknote_100 * 10;
//        banknoteCounter++;
//        }
//        System.out.println("Выдано банкнот по 100: " + banknoteCounter);
//
//        banknoteCounter = 0;
//        while (banknoteCounter < banknote_50 && atmSum != needCash){
//        atmSum -= banknote_50 * 5;
//        banknoteCounter++;
//        }
//        System.out.println("Выдано банкнот по 50: " + banknoteCounter);
//
//        banknoteCounter = 0;
//        while (banknoteCounter < banknote_20 && atmSum != needCash){
//        atmSum -= banknote_20 * 2;
//        banknoteCounter++;
//        }
//        System.out.println("Выдано банкнот по 20: " + banknoteCounter);



//sum -= banknote_100;
//        atmSum -= banknote_100;
//        System.out.println("Выдано банкнот по 100: " + banknote_100/100);
//        if (sum > 0) {
//        sum -= banknote_50;
//        atmSum -= banknote_50;
//        System.out.println("Выдано банкнот по 50: " + banknote_50 / 50);
//        }
//        if (sum > 0) {
//        sum -= banknote_20;
//        atmSum -= banknote_20;
//        System.out.println("Выдано банкнот по 20: " + banknote_20 / 20);
//        }

//for (int i = 0; i < sum ; i+=20) {
//        sum -= banknote_20;
//        atmSum -= banknote_20;
//        banknote_20 -= banknote_20;
//
//        sum -= banknote_50;
//        atmSum -= banknote_50;
//        banknote_50 -= banknote_50;
//
//        if (sum > 0) {
//        sum -= banknote_100;
//        atmSum -= banknote_100;
//        banknote_100 -= banknote_100;
//
//        }
//        }
//        System.out.println("Выдано банкнот по 20: " + banknote_20/20);
//        System.out.println("Выдано банкнот по 50: " + banknote_50/50);
//        System.out.println("Выдано банкнот по 100: " + banknote_100/100);