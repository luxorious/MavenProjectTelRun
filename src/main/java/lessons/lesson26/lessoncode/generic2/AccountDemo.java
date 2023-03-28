package lessons.lesson26.lessoncode.generic2;

public class AccountDemo {
    public static void main(String[] args) {
        int id = 1;
        int sum = 5;

        Account account = new Account(id, sum);
        System.out.println(account);

        double idDouble = 10.0;
        double sumDouble = 100.55;
        AccountGeneric<Double> accountGeneric = new AccountGeneric<>(id, sumDouble);
        System.out.println(account);
    }
}
