/*
    Имеется целое число, определить является ли это число простым, т.е. делится
    без остатка только на 1 и на себя.
 */

//намудрил тут блин))

public class SimpleNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        System.out.println(number);
        if (number == 2 || number == 3 || number == 5 || number == 7){
            System.out.println("Число " + number + " является простым");
        } else if (number == 1){
            System.out.println("У числа " + number + " только один делитель");
        } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0){
            System.out.println("Число " + number + " является составным");
        } else {
            System.out.println("Число " + number + " является простым");
        }
    }
}
