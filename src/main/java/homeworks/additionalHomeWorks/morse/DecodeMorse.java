package homeworks.additionalHomeWorks.morse;

import java.util.Map;

public class DecodeMorse {
    InitialMorseTable morseTable = new InitialMorseTable();
    public StringBuilder decodingMorse(String textToDecode){
        StringBuilder decodedText = new StringBuilder();
        String[] splittedText = textToDecode.split("   ");

        for (String str : splittedText){
            String[] symbol = str.split(" ");
            for (String ch : symbol){
                for (Map.Entry<String, String> entry : morseTable.MORSE.entrySet()){
                    if (entry.getValue().equals(ch)){
                        String key = entry.getKey();
                        decodedText.append(key);
                    }
                }
            }
            decodedText.append(" ");
        }
        System.out.println(decodedText);
        return decodedText;
    }
}
