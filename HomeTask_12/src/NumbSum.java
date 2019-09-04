/*
    Найдите сумму первых n целых чисел, которые делятся на 3.
 */


import java.util.Random;

public class NumbSum {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100);
        System.out.println("Случайное число: " + n);
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0){
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("Сумма чисел кратных трем: " + sum);
    }
}
