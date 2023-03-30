package lessons.lesson20;

import java.util.Arrays;

public class RegExEx1 {
    public static void main(String[] args) {
        String text = "Java, the best program language in the World!";

//        String[] words = text.split(" ");
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");

        System.out.println(Arrays.toString(words));
    }
}
