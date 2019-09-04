import java.util.Random;

public class RandomRUB {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10000); //ограничил 10000
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

//есть косяк, когда число кончается на 11 - 14, в голову не приходит как решить
