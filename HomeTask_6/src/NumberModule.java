//Создайте число. Опеделите, является ли число трехзначным.
//Опеделите, является ли его последняя цифра семеркой.
//Опеделите, является ли число четным.



public class NumberModule {
    public static void main(String[] args) {
        int number = 417;
        if ((number / 100 < 10 && number / 100 >= 1) || (number / 100 > -10 && number / 100 <= -1)){
            System.out.println("Число трехзначное");
            if (number % 10 == 7) {
                System.out.println("Последнее число 7");
            } else {
                System.out.println("Последнее цифра не равна 7");
            } if (number % 2 == 0){
                System.out.println("Число четное");
            } else {
                System.out.println("Число не четное");
            }
        } else {
            System.out.println("Число не трехзначное");
        }
    }
}

