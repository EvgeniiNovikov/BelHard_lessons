
/*
    Создать массив оценок произвольной длины,
    вывести максимальную и минимальную оценку, её(их) номера.
 */


import java.util.Random;

public class MarksArray {
    public static void main(String[] args) {
        Random rand  = new Random();
        int[] marks = new int[rand.nextInt(10) + 5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(9)+1;
        }
        
        int maxMark = marks[0];
        int maxIndex = 0;
        int minMark = marks[0];
        int minIndex = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > maxMark){
                maxMark = marks[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < marks.length ; i++) {
            if (marks[i] < minMark){
                minMark = marks[i];
                minIndex = i;
            }
        }

        for (int i = 0; i < marks.length ; i++) {
            System.out.print(marks[i] + "  ");
        }

        System.out.println("\n");

        System.out.println("Max mark: " + maxMark + " - marks.index[" + maxIndex + "]");
        System.out.println("Min mark: " + minMark + " - marks.index[" + minIndex + "]");
    }

}
