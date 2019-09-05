
/*
    Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.
 */


import java.util.Random;

public class SumElemOfArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(10) +4];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println();

        int maxMark = array[0];
        int maxIndex = 0;
        int minMark = array[0];
        int minIndex = 0;
        int sumMinMaxElem = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxMark){
                maxMark = array[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minMark){
                minMark = array[i];
                minIndex = i;
            }
        }

        System.out.println("Max numb: " + maxMark + " - marks.index[" + maxIndex + "]");
        System.out.println("Min numb: " + minMark + " - marks.index[" + minIndex + "]");

        if (minIndex > maxIndex){
            int tmp = minIndex;
            minIndex = maxIndex;
            maxIndex = tmp;
        }

        for (int i = minIndex; i <= maxIndex; i++) {
                sumMinMaxElem += array[i];
        }

        System.out.println("Сумма элементов между min и max: " + sumMinMaxElem);
    }
}
