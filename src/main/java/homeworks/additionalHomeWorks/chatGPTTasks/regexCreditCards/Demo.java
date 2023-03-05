package homeworks.additionalHomeWorks.chatGPTTasks.regexCreditCards;

public class Demo {
    public static void main(String[] args) {
//    ДЗ по regex
//    Написать класс который генерирует набор из 23 цифр СТРИНГОЙ
//    первые 16 это номер карты вторые 4 это срок действия последние 3 это CVV так вот \
//    Написать метод который проходит регуляркой и делаеттакой вид
//    CARD NUMBER: 1234 5678 9874 6523  EXP DATE: 12/12  CVV: 658
//    Так же должен быть метод который проверяте на валидность срок действия карты,
//    что бы не было 99 месяца, или 00 года 99/00
//    срок действия карты 5 лет с текущей даты

        GenerationNumbers gc = new GenerationNumbers();
        SavingCard savingCard = new SavingCard();
        FindCardData findCardData = new FindCardData();

        String txt = gc.generateCardData();
        System.out.println(findCardData.extractingData(txt));

        //add just number cards
        for (int i = 0; i < 10; i++) {
            savingCard.saveCard(gc.generateCardData());
        }

        //show all data cards which saved in set
        for (String card : savingCard.getCardsAllData()){
            System.out.println(findCardData.extractingData(card));
        }

    }
}
