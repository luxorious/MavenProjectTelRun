package lessons.lesson10.MapExample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("A", 1);
        stringIntegerMap.put("B", 2);
        stringIntegerMap.put("C", 3);
        stringIntegerMap.put("D", 1);
        stringIntegerMap.put("D", 1);
        stringIntegerMap.put("E", 1);
        stringIntegerMap.put("L", null);

        System.out.println(stringIntegerMap);

        Integer i1 = stringIntegerMap.get("L");

        System.out.println(i1);

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
    }
}
