package homeworks.additionalHomeWorks.HWLection2.task2;

import java.util.ArrayList;

public class ArrayCopy {

    public ArrayList<Integer> copyArr(int[] arr, int start, int finish){
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= start && arr[i] <= finish){
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }
}