package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx8 {
    public static void main(String[] args) {
        String regex = "dog";

        String replaceText = "cat";

        String input = "the dog says meow" + " All dogs say meow";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        input = matcher.replaceAll(replaceText);

        System.out.println(input);
    }
}
