public class Runner {
    public static void main(String[] args) {
        Array<String> arr = new Array<>();
        arr.setArr(new String[]{"1111", "2222"});
        Array<Integer> arr1 = new Array<>();
        arr1.setArr(new Integer[]{1, 2, 3, 4});
        Array<Long> arr2 = new Array<>();
        arr2.setArr(new Long[]{1L, 2L, 3L, 4L});
        System.out.println(arr.get(1));

    }
}

