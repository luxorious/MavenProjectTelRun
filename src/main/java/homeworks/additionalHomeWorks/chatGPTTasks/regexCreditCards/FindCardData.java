package homeworks.additionalHomeWorks.chatGPTTasks.regexCreditCards;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCardData {

    public String extractingData(String text){
        String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";
        StringBuilder data = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            data.append("CARD NUMBER: ").append(matcher.group(1))
                    .append(" ").append(matcher.group(2))
                    .append(" ").append(matcher.group(3))
                    .append(" ").append(matcher.group(4))
                    .append("\nEXP DATE: ").append(matcher.group(5))
                    .append("/").append(matcher.group(6))
                    .append("\nCVV: ").append(matcher.group(7)).append("\n");
        }
        return data.toString();
    }
}
