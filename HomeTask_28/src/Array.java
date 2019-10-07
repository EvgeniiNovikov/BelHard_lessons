//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.

public class Array {
    private <T>[] array;

    public Array(<T>[] array) {
        this.array = array;
    }

    public Object get(int index) {
        return this.array[index];
    }

}
