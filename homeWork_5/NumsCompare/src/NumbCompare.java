//Дано любое натуральное число 4-х значное. Верно ли, что все цифры числа различны?



public class NumbCompare {
    public static void main(String[] args) {
        boolean numbCompare;
        int naturalNumber = 3521;
        int n1 = naturalNumber % 10; // 1
        int n2 = (naturalNumber / 10) % 10; // 2
        int n3 = (naturalNumber / 100) % 10; // 5
        int n4 = naturalNumber / 1000; // 3
        numbCompare = n1 != n2 & n1 != n3 & n1 != n4 & n2 != n3 & n2 != n4 & n3 != n4;
        System.out.println(numbCompare); // true(подчеркивает желтым, мол всегда true)
    }
}
