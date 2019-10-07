//Задание 33
//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        String s = "";
        String[] a;
        try {
            fileReader = new FileReader("test.txt");
            int res = fileReader.read();
            int count = 0;
            while (res != -1) {
                s += (char) res;
                if ((char) res == ',' || (char) res == '.' || (char) res == ':' || (char) res == '!' || (char) res == ';' || (char) res == '?') {
                    count++;
                }
                res = fileReader.read();
            }
            a = s.trim().split("[[,;:.!?\\]\\s]]+");
            System.out.println("Punct counter: " + count);
            System.out.println("Количество слов: " + a.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader == null) {
                System.out.println("Reader not initialized");
            } else {
                fileReader.close();
            }
        }
    }
}
