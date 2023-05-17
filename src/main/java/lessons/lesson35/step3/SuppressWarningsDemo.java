package lessons.lesson35.step3;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"raw types", "unchecked"})
public class SuppressWarningsDemo {
    public static void main(String[] args) {
        SuppressWarningsDemo swDemo = new SuppressWarningsDemo();
    }

    public void testSuppressWarnings(){
        Map testMap = new HashMap<>();
        testMap.put(1,"Item1");
        testMap.put(2,"Item2");
        testMap.put(3,"Item3");
    }
}