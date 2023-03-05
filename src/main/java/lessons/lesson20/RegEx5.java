package lessons.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
    public static void main(String[] args) {
        //file1.doc, file2.txt, file3.img, file4.doc
        //[a-zA-z]+\\.[a-z]{3}

        // petrenko@gmail.com
        //regEx for mail
        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";

        String s = "email addresses : petrenko@gmail.com, sydorenko@gmail.com, kovalenko@mail.ua";

        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println("Email " + matcher.group());
        }
    }
}
