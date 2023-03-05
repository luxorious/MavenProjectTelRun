package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx9 {
    public static void main(String[] args) {
        String telNumber1 = "1231234";
        String telNumber2 = "123 1234";
        String telNumber3 = "123-1234";
        String telNumber4 = "123@1234";

        String regex = "\\d\\d\\d(\s|-)?\\d\\d\\d\\d";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telNumber1);

        System.out.println(telNumber1 + " is correct? - " + matcher.matches());
        matcher = pattern.matcher(telNumber2);

        System.out.println(telNumber2 + " is correct? - " + matcher.matches());
        matcher = pattern.matcher(telNumber3);

        System.out.println(telNumber3 + " is correct? - " + matcher.matches());
        matcher = pattern.matcher(telNumber4);

        System.out.println(telNumber4 + " is correct? - " + matcher.matches());
    }
}
