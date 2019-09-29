//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.

import java.io.*;

public class Runner
{
    public static void main(String[] args) throws IOException {
        File file = new File("binaryNumbers.dat");
        DataOutputStream dos;
        DataInputStream dis;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("binaryNumbers.dat")));
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) ((Math.random()) * 100));
            }
            dos.close();
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream("binaryNumbers.dat")));
            int num = dis.readInt();
            while (true){
                System.out.print(num + " ");
                try {
                    num = dis.readInt();
                } catch (EOFException e){
                    break;
                }
            }
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
