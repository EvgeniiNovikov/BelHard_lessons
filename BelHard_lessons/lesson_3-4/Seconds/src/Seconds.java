


//Задание 3
//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//А) минут + секунд,
//В) часов + минут + секунд,
//С) дней + часов + минут + секунд,
//D) недель + дней + часов + минут + секунд.
//по аналогии с примером выше.


public class Seconds {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec)/60;
        int min = m % 60;
        int h = (m - min)/60;
        int hours = h % 24;
        int d  = (h - hours)/24;
        int days = d % 7;
        int w = (d - days)/7;
        /*A*/ System.out.println(min + " минут " + sec + " секунд");
        /*B*/ System.out.println(hours + " часов " + min + " минут " + sec + " секунд");
        /*C*/ System.out.println(days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
        /*D*/ System.out.println(w + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");

        System.out.println("******************************************");

        //Задание 4
        //Определить число, полученное выписыванием в обратном порядке цифр
        //любого 4-х значного натурального числа n.

        int number = 5912;
        String sNum = String.valueOf(number);
        StringBuffer buffer = new StringBuffer(sNum);
        buffer.reverse();
        System.out.println("Number after reverse: " + buffer);


    }

}
