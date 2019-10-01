//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) {
        File filePath = new File("G:\\BelHard\\Java Swat\\");
        List<String> files = new ArrayList<>();
        List<String> directory = new ArrayList<>();
        if (filePath.isDirectory()) {
            for (File file : Objects.requireNonNull(filePath.listFiles())) { //идея подсказала сделать так Objects.requireNonNull
                if (file.isFile()) {
                    files.add(file.getName());
                } else {
                    directory.add(file.getName());
                }
            }
        }
        System.out.println("Files: ");
        print(files);
        System.out.println("Directory: ");
        print(directory);
    }

    public static <T> void print(List<T> list) {
        for (T t : list) {
            System.out.println("-" + t);
        }
    }
}
