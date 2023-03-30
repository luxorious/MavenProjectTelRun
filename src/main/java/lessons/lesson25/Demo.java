package lessons.lesson25;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo {
    static List setList() {
        List<String> list = new ArrayList<>();
        list.add("lol");
        return list;
    }

    public static void main(String[] args) {
        System.out.println(setList());
    }
}
