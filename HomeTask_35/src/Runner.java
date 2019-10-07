//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        File file = new File("binaryNumbers.dat");
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("binaryNumbers.dat")))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) ((Math.random()) * 100));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("binaryNumbers.dat")))) {
            int num = dis.readInt();
            int a = 0;
            while (true) {
                System.out.print(num + " ");
                a += num;
                try {
                    num = dis.readInt();
                } catch (EOFException e) {
                    break;
                }
            }
            System.out.println();
            System.out.println("Среднее арифметическое: " + a / 20);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
