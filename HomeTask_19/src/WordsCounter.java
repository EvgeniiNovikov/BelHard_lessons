//Задание 19
//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
//Задание 20
//Имеется строка с текстом. Вывести текст, составленный из последних букв





public class WordsCounter
{
    public static void main(String[] args) {
        String words = " Спрашивать, когда знаешь ответ, вежливо. Спрашивать, когда не знаешь, обязательно!  ";
        String[] arrWords = words.trim().split("[[,;:.!?\\]\\s]]+");
        for (int i = 0; i < arrWords.length; i++) {
            System.out.print(arrWords[i] + "|");
        }
        System.out.println();
        System.out.println("Количество слов равно: " + arrWords.length);
        //20. Берем последние буква слов и складываем их.
        String test = "";
        for (int i = 0; i < arrWords.length; i++) {
            test += arrWords[i].substring(arrWords[i].length()-1);
        }
        System.out.println("Последние буквы всех слов: " + test);
        }
    }

