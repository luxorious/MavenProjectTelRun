package lessons.lesson13.tree;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeDemo {
    public static void main(String[] args) {
        TreeMap<Student, Integer> map = new TreeMap<>();

        map.put(new Student(33, "Alex"), 33);
        map.put(new Student(19, "Tom"), 19);
        map.put(new Student(22, "Max"), 22);
        map.put(new Student(32, "Rob"), 32);

        System.out.println(map);
    }
}
