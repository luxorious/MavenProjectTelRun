package homeworks.additionalHomeWorks.HWlesson6;

import java.util.ArrayList;

public class IntegerListDemo {
//    В классе IntegerListDemo создайте список целых чисел.
//    Продемонстрируйте как:
//            - добавить в список элемент (в начало и в конец)
//            - узнать длину списка
//            - удалить элемент из списка (по интексу и без)
//            - узнать пустой список или нет
//            - обойти список и вывести на консоль каждый элемент.
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();

        intArr.add(2);
        intArr.add(2);
        intArr.add(2);
        intArr.add(2);
        intArr.add(0, 1); // insert as first elem
        intArr.add(intArr.size(), 1); // insert as last elem

        intArr.remove(0); //remove first elem (by index 0);

        //which one example is better for remove value?
        intArr.remove((Integer) 2); // remove elem by value
        intArr.remove(Integer.valueOf(1)); //remove elem by value

        System.out.println(intArr);
        System.out.println(intArr.size()); // size() = it's length of array. if (size == 0) - arr is empty

        System.out.println("All Elements in ArrayList");
        for (int elem:intArr) {
            System.out.println(elem);
        }
    }
}
