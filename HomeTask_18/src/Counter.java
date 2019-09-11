//Задание 18
//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.







public class Counter
{
    public static void main(String[] args) {
        String s = "Eсли проблему можно решить, то не стоит о ней беспокоиться, если её решить нельзя, то беспокоиться о ней бесполезно.";

        int count = 0;
        char symbol;
        for (int i = 0; i < s.length(); i++) {
            symbol = s.charAt(i);
            if (symbol == '.' || symbol == ',' || symbol == '-' || symbol == ':' || symbol == ';') {
                count++;
            }
        }
        System.out.println("У нас есть " + count + " знаков препинания.");
    }

}
