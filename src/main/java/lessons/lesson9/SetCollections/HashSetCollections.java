package lessons.lesson9.SetCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollections {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();


        stringHashSet.add("January");
        stringHashSet.add("February");
        stringHashSet.add("March");
        stringHashSet.add("April");
        stringHashSet.add("May");
        stringHashSet.add("June");
        stringHashSet.add("January");

        System.out.println(stringHashSet);


        System.out.println("__________________________________________________");
        HashSet<ArrayList> ourExample = new HashSet<>();
        Student student = new Student(2, "Ivan");
        Student student2 = new Student(222, "Petro");

        ArrayList<Integer> integerArrList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        students.add(student);
        students.add(student2);

        integerArrList.add(1);
        integerArrList.add(2);
        integerArrList.add(3);
        integerArrList.add(4);
        integerArrList.add(5);


        stringArrayList.add("January");
        stringArrayList.add("February");
        stringArrayList.add("March");
        stringArrayList.add("April");
        stringArrayList.add("May");
        stringArrayList.add("June");
        stringArrayList.add("January");

        ourExample.add(integerArrList);
        ourExample.add(stringArrayList);
        ourExample.add(students);

        System.out.println(ourExample.size());
        System.out.println(ourExample);

        System.out.println("__________________________________________________");
    }
}
