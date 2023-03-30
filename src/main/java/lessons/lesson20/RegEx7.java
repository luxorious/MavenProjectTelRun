package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx7 {
    public static void main(String[] args) {
        //"this is text"
        //"this\sis\stext"

        //"5", "1.5", "2.21"
        //"^\d+(\.\d+)?"

        //(dog)

        //((A)(B(C)))

        String input = "cat cat cat cattie cat";
        String refEx = "\\bcat\\b";

        Pattern pattern = Pattern.compile(refEx);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Match number " + count);
            System.out.println("start - " + matcher.start());
            System.out.println("end - " + matcher.end());
        }
    }
}
