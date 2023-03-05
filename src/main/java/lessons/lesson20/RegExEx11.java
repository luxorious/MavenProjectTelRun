package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEx11 {
    public static void main(String[] args) {
        String regex = "a*d";
        String input = "aadJava!aaaaadProCourseaaaaaadJavaProd";

        String replace = " - ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuffer sb = new StringBuffer();

        while (matcher.find()){
            matcher.appendReplacement(sb, replace);
        }

        matcher.appendTail(sb);
        System.out.println(sb);
    }
}
