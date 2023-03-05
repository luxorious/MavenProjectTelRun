package lessons.lesson21.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatcherDemo {
    public static void main(String[] args) {
        String regex = "(a*b)(foo)";
        String input = "aabfooaabfooabfooaabfoob";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("group count - " + matcher);
        }
    }
}
