//Задание 21
//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.




public class StringConcat
{
    public static void main(String[] args) {
        String test = "test";
        String test1 = "test1";
        String test2 = "test2";
        int start, end, result;


        start = (int) System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
             test += "test";
        }
        System.out.println(test);
        end = (int) System.currentTimeMillis();
        result = end - start;
        System.out.println("Цикл + завершен: " + result);

        int start1, end1;

        start1 = (int) System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder = builder.append(test1);
        }
        System.out.println(builder.toString());
        end1 = (int) System.currentTimeMillis();
        result = end1 - start1;
        System.out.println("Цикл builder завершен: " + result);

        int start2, end2;

        start2 = (int) System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
           stringBuffer = stringBuffer.append(test2);
        }
        System.out.println(stringBuffer.toString());
        end2 = (int) System.currentTimeMillis();
        result = end2 - start2;
        System.out.println("Цикл buffer завершен: " + result);

        // Вывод у меня такой: если много раз складывать в цикле строки, то лучше пользовать StringBuilder
        // или StringBuffer, так получается намного быстрее. Если нужно сложить пару строк, то можно обойтись
        // + или concat
    }
}
