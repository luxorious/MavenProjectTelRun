package homeworks.additionalHomeWorks.chatGPTTasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExOpenAi{
    public static void main(String[] args) {
//        findWordsWhichBeginsWithUpperLetter();
//        checkDigits();
//        findPhoneNumber();
//        searchMail();
//        findWordsLatin();
//        findWordsCyrillic();
//        replaceLetter();
//        checkDigitsAnd();
        findWordsByLength();
    }
    public static void findWordsByLength(){
//        Знайдіть у тексті всі слова, які складаються з 5 літер.
        String text = "somes texts different languages ddesw";
        String regex = "^[a-zA-Z]{5}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }

//        pattern(regex, text);

    }

    public static void findWordsLatin() {
    //    Перевірте, чи містить рядок тільки літери латинського алфавіту (без пробілів та знаків пунктуації).
        String text = "some текст different мовами";
        String text2 = "someTextWithoutSpaces";
        String regex = "^[a-zA-Z]+$";

        pattern(regex, text);
        pattern(regex,text2);
    }
    public static void checkDigitsAnd(){
//        Перевірте, чи містить рядок лише цифри та літери латинського алфавіту (без пробілів та знаків пунктуації).
        String text = "world1dsdfsa3sadsa2";
        String regex = "^[a-zA-Z0-9]+$";

        pattern(regex, text);
    }

    public static void replaceLetter(){
//        Замініть у тексті всі літери "о" на літеру "а".
        String text = "world without wood is not good idea";

        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher(text);

        String newText = matcher.replaceAll("a");

        System.out.println(newText);
    }
    public static void findWordsCyrillic() {
    //    Перевірте, чи містить рядок тільки літери латинського алфавіту (без пробілів та знаків пунктуації).
        String text = "some текст different мовами";
        String text2 = "якийсьТекст";
        String regex = "^[а-яА-Я]+$";

        pattern(regex, text);
        pattern(regex,text2);
    }

    public static void searchMail(){
//    Знайдіть у тексті всі email-адреси.
        String emails = "exam_ple@gmail.com, dsfs john.doe@yahoo.com, dsfsadfscdv, anna-smith@hotmail.com, info@company.com, " +
                "mail@gmail.com, email@yahoo.com, contact@ukr.net, support@outlook.com";
        String regex = "\\b[\\w._-]+@[\\w]+\\.[\\w]{2,}\\b";
        pattern(regex,emails);
    }

    public static void findPhoneNumber(){
//        Знайдіть у тексті всі номери телефонів, записані у форматі +38(0XX)XXX-XX-XX.
        String numbers = "+38(096)743-68-23,dsfc +38(096)743-68-24,vds +38(096)433-68-25, +38(096)426-68-26, " +
                "+38(066)743-54-27, +38(096)340-68-28, +38(066)035-68-29, +38(088)567-68-30";
        String regex = "\\+38\\(0\\d{2}\\)\\d{3}-\\d{2}-\\d{2}";
        pattern(regex, numbers);

    }

    public static void checkDigits(){
//        Перевірте, чи містить рядок тільки цифри.
        String text = "121234324";
        String regex = "([\\d]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches());
        pattern(regex, text);
    }

    public static void findWordsWhichBeginsWithUpperLetter(){
//        Знайдіть у тексті всі слова, які починаються з великої літери.
        String text = "For looking in the window - You need two thinks: Eye and Window";
        String regex = "([A-Z][a-z]*)";
        pattern(regex, text);
    }

    public static void pattern(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
        System.out.println(matcher.find());
        System.out.println();
    }
}
