package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task6Goods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
//    Напишіть програму, яка зберігає у файлі список товарів, їх цін та кількість,
//    а потім дозволяє користувачу додавати нові товари та редагувати наявні.
    private Scanner scanner = new Scanner(System.in);
    public Goods inputGood(){
        int price, quantity;
        System.out.println("enter name of goods:");
        String nameOfGoods = scanner.nextLine();

        while (true) {
            try {
                System.out.println("Enter price");
                price = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter quantity");
                quantity = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
        return new Goods(nameOfGoods, price, quantity);
    }
}
