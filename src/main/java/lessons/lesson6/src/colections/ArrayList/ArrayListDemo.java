package lessons.lesson6.src.colections.ArrayList;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> stringArrayList = new ArrayList<>();


        stringArrayList.add("a");
        System.out.println(stringArrayList.size());

        String firstelement = stringArrayList.get(0);

        System.out.println(firstelement);

        addData(stringArrayList);

        System.out.println(stringArrayList);

        stringArrayList.trimToSize();//

        for (String str:stringArrayList) {
            System.out.println(str);
        }

        Collections.sort(stringArrayList);

        System.out.println(stringArrayList);

        Object[] strArr = (Object[]) stringArrayList.toArray();

        System.out.println(Arrays.toString(strArr));

        int a = 10;

        int b = 5;
        double c = b/(double)a;
    }


    public static void addData(List<String> workingCollection){
        workingCollection.add("B");
        workingCollection.add("c");
        workingCollection.add("d");
        workingCollection.add("e");
    }
}
