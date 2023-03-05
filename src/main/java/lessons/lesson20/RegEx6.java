package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {
    public static void main(String[] args) {
        System.out.println(checkTest("google.com"));
        System.out.println(checkTest("google.ua"));
        System.out.println(checkTest("google.lv"));
        System.out.println(checkTest("google.org"));

    }

    public static boolean checkTest(String testString){
        Pattern pattern = Pattern.compile(".+\\.(com|ua|lv)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
