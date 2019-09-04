/*
    Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */


import java.util.Random;

public class ArrayNumbs {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[rand.nextInt(10) + 2];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        int maxNumb = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumb){
                maxNumb = numbers[i];
            }
        }
        System.out.print("Сам массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Наибольшее: " + maxNumb);

    }
}
