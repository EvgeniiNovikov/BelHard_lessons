/*
    Имеется целое число, определить является ли это число простым, т.е. делится
    без остатка только на 1 и на себя.
 */


public class SimpleNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 150);
        System.out.println("Наше число: " + number);

        boolean isSimple = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                isSimple = false;
                break;
            }
        }
        if (isSimple){
            System.out.println("Это простое число");
        } else {
            System.out.println("Это составное число");
        }
    }
}
