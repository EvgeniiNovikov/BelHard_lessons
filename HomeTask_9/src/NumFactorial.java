/*Даны произвольные числа, нужно расчитать произведение
  этих чисел, т. е. факториал числа.*/




public class NumFactorial {
    public static void main(String[] args) {
     long factorNum = 1L;
     int x = (int) (Math.random() * 20);
     System.out.println("Начальное число: " + x);

     while (x!=0) {
         factorNum *= x;
         x = (int) (Math.random() * 20);
         System.out.println("Factorial :  " + factorNum);
     }
    }
}
