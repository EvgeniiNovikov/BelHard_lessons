//Имеется прямоугольное отверстие размерами а и b, определить,
//можно ли его полностью закрыть круглой картонкой радиусом r.



public class Square {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        double r = 4.5;
        double PI = 3.14;
        if (a*b > PI*r*r){
            System.out.println("Отверстие нельзя закрыть");
        } else {
            System.out.println("Отверстие закрыто");
        }
    }
}
