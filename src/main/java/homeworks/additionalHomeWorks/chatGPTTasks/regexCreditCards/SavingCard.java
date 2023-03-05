package homeworks.additionalHomeWorks.chatGPTTasks.regexCreditCards;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SavingCard {
    private final Set<String> cardsNumbers = new HashSet<>();
    private final Set<String> cardsAllData = new HashSet<>();

    public void saveCard (String cardData){
        String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardData);

        while (matcher.find()){
            cardsNumbers.add(matcher.group(1) + matcher.group(2) + matcher.group(3) + matcher.group(4));
            cardsAllData.add(cardData);
        }
    }

    public Set<String> getCardsNumbers() {
        return cardsNumbers;
    }

    public Set<String> getCardsAllData() {
        return cardsAllData;
    }
}
