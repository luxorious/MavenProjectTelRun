package lessons.lesson19.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("JAVA?");
        list.add(1);

        for (Object str: list){
            System.out.println((String) str);
        }
    }
}
