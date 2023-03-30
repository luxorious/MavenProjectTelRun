package homeworks.additionalHomeWorks.HWlesson6.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int a = 2;

        list.add(1);
        list.add(1);

        list.add(a);
        list.add(a);

        System.out.println(list);

        //List - может хранить одинаковые данные, и отображает по порядку вставки элемента в массив.
    }
}
