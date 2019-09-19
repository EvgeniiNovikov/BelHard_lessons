



public class Runner
{
    public static void main(String[] args) {
        Date d1 = new Date(7200);
        Date d2 = new Date(2, 35, 5);

        System.out.println(d1.getOverageSeconds());
        System.out.println(d2.getOverageSeconds());

        Date.compareDate(d1, d2);
    }


}
