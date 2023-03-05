package homeworks.additionalHomeWorks.chatGPTTasks.regexCreditCards;

import java.util.Calendar;
import java.util.Random;

public class GenerationNumbers {
    private final Random random = new Random();

    public String generateCardData(int yearOfCreating){
        StringBuilder generatedCard = new StringBuilder();
        int monthYear = -1;
        for (int i = 1; i <= 22; i++) {
            if (i == 17){
                //generate month first number (0 or 1)
                monthYear = random.nextInt(2);
                generatedCard.append(monthYear);
            } else if (i == 18) {
                //generate month first number (1 or 2)
                if (monthYear == 1){
                    generatedCard.append(random.nextInt(2) + 1);
                    monthYear = -1;
                } else {
                    generatedCard.append(random.nextInt(9) + 1);
                }
            } else if (i == 19) {
                //generate year - not random;
                generatedCard.append(yearOfCreating + 5);
            } else {
                generatedCard.append(random.nextInt(10));
            }
        }
        return generatedCard.toString();
    }
}
