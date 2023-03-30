package homeworks.additionalHomeWorks.morse;

import java.util.Map;

public class DecodeMorse {
    InitialMorseTable morseTable = new InitialMorseTable();
    public StringBuilder decodingMorse(String textToDecode){
        StringBuilder decodedText = new StringBuilder();
        String[] splittedText = textToDecode.split("   ");

        long startTime = System.currentTimeMillis();
        for (String str : splittedText){
            String[] symbol = str.split(" ");
            for (String ch : symbol){
                for (Map.Entry<String, String> entry : morseTable.MORSE.entrySet()){
                    if (entry.getValue().equals(ch)){
                        decodedText.append(entry.getKey());
                    }
                }
            }
            decodedText.append(" ");
        }

        System.out.println("time = " + (System.currentTimeMillis()-startTime));
        
        System.out.println(decodedText);
        return decodedText;
    }
}
