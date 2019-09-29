public class Runner {
    public static void main(String[] args) {
        Object[] types = new Object[5];
        types[0] = 1;
        types[1] = "Hi";
        types[2] = 234L;
        types[3] = 12.34;
        types[4] = 'a';
        Array a = new Array(types);
        for (int i = 0; i < types.length; i++) {
            System.out.println(a.get(i));
        }


    }
}
