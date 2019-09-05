import java.util.Random;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
//UP Вроде исправил вывод для чисел заканчивающихся на 11, 12, 13, 14

public class RandomRUB {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10000);
        int x1 = x % 100 / 10;

        if (x1 == 1) {
            System.out.println(x + " Рублей");
        } else {
            int num = x % 10;
            switch (num) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: {
                    System.out.println(x + " Рублей");
                    break;
                }
                case 1: {
                    System.out.println(x + " Рубль");
                    break;
                }
                case 2:
                case 3:
                case 4: {
                    System.out.println(x + " Рубля");
                    break;
                }
            }
        }
    }
}

