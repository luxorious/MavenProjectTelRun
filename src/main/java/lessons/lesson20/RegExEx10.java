package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEx10 {
    public static void main(String[] args) {
        String input = "Hello Java! Hello JavaScript! JavaSE 8.";

        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(input);

        String newString = matcher.replaceAll("HTML");
        System.out.println(newString);


    }
}
