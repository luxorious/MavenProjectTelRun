package homeworks.additionalHomeWorks.HWLection1.task3;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(1234_5678_9012_3456L, 1234);
        card.setCreditLimit(1000.0);
        card.deposit(100.0);
        card.withdraw(1001.0);
        card.withdraw(100.0);
    }
}
