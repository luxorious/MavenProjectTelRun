package lessons.lesson19.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("I like ");
        String text = list.get(0) + "";//String.valueOf(obj)

        System.out.println(text);
    }
}
