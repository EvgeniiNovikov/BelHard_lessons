/*
    Найдите сумму первых n целых чисел, которые делятся на 3
 */




public class NumbSum {
    public static void main(String[] args) {

        int n = 5;
        int sum = 0;
        for (int i = 3; i <= n * 3; i+= 3) {
                sum += i;
        }
        System.out.println("Сумма чисел кратных трем: " + sum);


        /*
        int n = 15;
        int count = 0;
        int sum = 0;
        System.out.println("Наше число: " + n);
            for (int i = 0; count <= n; i++) {
                if (i % 3 == 0){
                    count++;
                    sum += i;
                }
            }
        System.out.println("Сумма чисел кратных трем: " + sum);*/
    }
}
