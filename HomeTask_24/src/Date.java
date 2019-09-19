//Задание 24
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.

public class Date {
    private int hours;
    private int minutes;
    private int seconds;

    Date(int seconds){
        this.seconds = seconds;
    }

    Date(int hours, int minutes, int seconds) {
        if ((hours >= 0 && hours <= 24) && (minutes >= 0 && minutes <= 60) && (seconds >= 0  && seconds <= 60)){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Некорректно введены данные. Нужно ввести: часы от 0 - 24, минуты и секунды от 0 до 60");
        }
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Date[" + "hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + ']';
    }

    int getOverageSeconds () {
        return ((hours*60*60) + (minutes*60) + seconds);
    }

    static void compareDate(Date d1, Date d2) {
        if (d1.getOverageSeconds() > d2.getOverageSeconds()){
            System.out.println(d1 + " больше, чем " + d2);
        } else {
            System.out.println(d2 + " больше, чем " + d1);
        }
    }
}
