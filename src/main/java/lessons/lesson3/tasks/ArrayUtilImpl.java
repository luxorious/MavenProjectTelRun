package lessons.lesson3.tasks;

import java.util.ArrayList;

public class ArrayUtilImpl implements ArrayUtil{

    @Override
    public ArrayList<Integer> createArray(int data) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for (int i = 0; i < data; i++) {
            arrlist.add(i);
        }
        return arrlist;
    }
}
