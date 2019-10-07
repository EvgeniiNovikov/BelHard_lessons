//Задание 30
//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }

        System.out.println(list);

        Collections.sort(list);
        int i = 0;
        while (i < list.size() - 1) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(list.get(i));
            } else {
                i++;
            }
        }

        System.out.println(list);
    }
}
