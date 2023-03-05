package lessons.lesson21.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String[] text = {"abc 123 def", "456 ghi", "jkl789mno"};
        Pattern pattern = Pattern.compile("(\\d+)(\\w+)");

        for (int i = 0; i < text.length; i++) {
            String currentString = text[i];
            Matcher matcher = pattern.matcher(currentString);
            while (matcher.find()){
                System.out.println("for \"" + currentString + " \" match is " + matcher.group(2));
            }
        }
    }
}
