/*
    Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */



public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int count = 10;
        do {
            fact *= count;
            count++;
        }
        while (count<=15);
        System.out.println(fact);
         /*for (int i = 10; i <= 15 ; i++) {
            fact *= i;
        }
        System.out.println(fact);*/
    }
}
