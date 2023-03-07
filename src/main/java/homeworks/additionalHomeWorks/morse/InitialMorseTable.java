package homeworks.additionalHomeWorks.morse;

import java.util.HashMap;
import java.util.Map;

public class InitialMorseTable {

    Map<String, String> MORSE = new HashMap<>();

    public InitialMorseTable() {
        fillMorse();
    }

    private void fillMorse() {
        MORSE.put("А", ".−");
        MORSE.put("Б", "−...");
        MORSE.put("В", ".−−");
        MORSE.put("Г", "−−.");
//        MORSE.put("Ґ", "−−.");
        MORSE.put("Д", "−..");
        MORSE.put("Е", ".");
        MORSE.put("Є", "..−..");
        MORSE.put("Ж", "...−");
        MORSE.put("З", "−−..");
        MORSE.put("И", "−.−−");
        MORSE.put("І", "..");
        MORSE.put("Ї", ".−−−.");
        MORSE.put("Й", ".−−−");
        MORSE.put("К", "−.−");
        MORSE.put("Л", ".−..");
        MORSE.put("М", "−−");
        MORSE.put("Н", "−.");
        MORSE.put("О", "−−−");
        MORSE.put("П", ".−−.");
        MORSE.put("Р", ".−.");
        MORSE.put("С", "...");
        MORSE.put("Т", "−");
        MORSE.put("У", "..−");
        MORSE.put("Ф", "..−.");
        MORSE.put("Х", "....");
        MORSE.put("Ц", "−.−.");
        MORSE.put("Ч", "−−−.");
        MORSE.put("Ш", "−−−−");
        MORSE.put("Щ", "−−.−");
        MORSE.put("ь", "−..−");
        MORSE.put("Ю", "..−−");
        MORSE.put("Я", ".−.−");
        MORSE.put("0", "-----");
        MORSE.put("1", ".----");
        MORSE.put("2", "..---");
        MORSE.put("3", "...--");
        MORSE.put("4", "....-");
        MORSE.put("5", ".....");
        MORSE.put("6", "-....");
        MORSE.put("7", "--...");
        MORSE.put("8", "---..");
        MORSE.put("9", "----.");
        MORSE.put(".", ".-.-.-");
        MORSE.put(",", "--..--");
        MORSE.put("?", "..--..");
        MORSE.put("\'", ".----.");
        MORSE.put("!", "-.-.--");
        MORSE.put("/", "-..-.");
        MORSE.put("(", "-.--.");
        MORSE.put(")", "-.--.-");
        MORSE.put("&", ".-...");
        MORSE.put(":", "---...");
        MORSE.put(";", "-.-.-.");
        MORSE.put("=", "-...-");
        MORSE.put("+", ".-.-.");
        MORSE.put("-", "-....-");
        MORSE.put("_", "..--.-");
        MORSE.put("\"", ".-..-.");
        MORSE.put("$", "...-..-");
        MORSE.put("@", ".--.-.");
        MORSE.put("¿", "..-.-");
        MORSE.put("¡", "--...-");
    }
}
