//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.

public class Array<T> {
    private T[] arr;

    public Array() {
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public T get(int index) {
        return this.arr[index];
    }

}