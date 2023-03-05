package homeworks.additionalHomeWorks.OOP.interfaces.task3;

public interface MyList {
    //найти елемент по индексу и заменить на другой
    public void changeByIndex(int index, int element);

    //изменить размер массива
    public void changeSize(int size);

    //добавляет много елементов у список
    public void addAll(int... elems);

    //print Array to console
    public void print(int[] array);

    public void insertByIndex(int index, int... elems);
}
