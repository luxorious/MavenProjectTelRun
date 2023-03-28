package homeworks.additionalHomeWorks.morse;

import java.util.Map;

public class Encode {
    InitialMorseTable morseTable = new InitialMorseTable();

    public StringBuilder encode(String textToEncode){
        textToEncode = textToEncode.toUpperCase();
        StringBuilder encoded = new StringBuilder();
        String[] splittedText = textToEncode.split(" ");

        for (String str : splittedText){
            String[] symbol = str.split("");
            for (String ch : symbol){
                if (morseTable.MORSE.containsKey(ch)){
                    encoded.append(morseTable.MORSE.get(ch));
                    encoded.append(" ");
                }
            }
            encoded.append("   ");
        }
        return encoded;
    }
}
