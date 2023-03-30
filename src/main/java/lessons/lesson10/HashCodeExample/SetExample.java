package lessons.lesson10.HashCodeExample;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> alphabet = new HashSet<>();

        alphabet.add("A");
        alphabet.add("A");
        alphabet.add("D");
        alphabet.add("D");
        alphabet.add("C");
        alphabet.add("C");
        alphabet.add("B");
        alphabet.add("B");

        System.out.println(alphabet.contains("A"));
        System.out.println(alphabet.contains("E"));

        for (String str: alphabet){
            System.out.println(str);
        }
    }
}
