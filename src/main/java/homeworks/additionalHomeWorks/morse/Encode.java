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
                for (Map.Entry<String, String> entry : morseTable.MORSE.entrySet()){
                    if (entry.getKey().equals(ch)){
                        encoded.append(entry.getValue());
                        encoded.append(" ");
                    }
                }
            }
            encoded.append("   ");
        }
        return encoded;
    }
}
