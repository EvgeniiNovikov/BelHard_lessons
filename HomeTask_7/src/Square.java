//Имеется прямоугольное отверстие размерами а и b, определить,
//можно ли его полностью закрыть круглой картонкой радиусом r.



public class Square {
    public static void main(String[] args) {
        double sideA = 1;
        double sideB = 100;
        double sideC = (sideA * sideA) + (sideB * sideB);
        double r = 10;
        if (Math.sqrt(sideC) >= r){
            System.out.println("Отверстие нельзя закрыть");
        } else {
            System.out.println("Отверстие закрыто");
        }
    }
}
