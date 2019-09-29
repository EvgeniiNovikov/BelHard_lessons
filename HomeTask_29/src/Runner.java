//Задание 29
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.List;

public class Runner
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (1 + (Math.random()) * 10));
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

        int i = 0;
        while (i < list.size()) {
            if (list.get(i) < 4){
                list.remove(list.get(i));
            } else {
              i++;
            }
        }

        System.out.println();

        for (Integer x : list) {
            System.out.print(x + " ");
        }

    }
}
