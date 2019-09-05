/*
    Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */



public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int numb = 10;
        int count = 1;
        do {
            fact *= count;
            count++;
        }
        while (count <= numb);
        System.out.println(fact);
    }
}
