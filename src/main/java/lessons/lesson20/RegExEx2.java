package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEx2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[x-z]+");

        Matcher matcher = pattern.matcher("x y z 1 2 3 4 5");
        System.out.println(matcher.find());

        Matcher matcher2 = pattern.matcher("x y Z 1 2 3 4 5");
        System.out.println(matcher2.find());

    }
}
