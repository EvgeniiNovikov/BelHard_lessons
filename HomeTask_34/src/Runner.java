//Задание 34
//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) throws IOException {
        Pattern pattern;
        Matcher matcher;
        List<Integer> list = new ArrayList<>();
        String text = new String(Files.readAllBytes(Paths.get("numbersTextTest.txt")));

        pattern = Pattern.compile("\\d+");
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group()));
        }
        System.out.print("Найденные числа: ");
        print(list);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        int i = 0;
        Collections.sort(list);
        while (i < list.size() - 1) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(list.get(i));
            } else {
                i++;
            }
        }
        System.out.println("Сумма найденых чисел из файла: " + sum);
        System.out.print("Числа после удаления повторяшек: ");
        print(list);
    }

    public static <T> void print(List<T> list) {
        for (T t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
    }


}
