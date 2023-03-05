package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEx3 {
    public static void main(String[] args) {
        String text = " Антон Саша Алла Андрійко";

        Pattern pattern = Pattern.compile("А.+а");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
