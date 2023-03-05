package lessons.lesson12.lesson12Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayListRepository database = new ArrayListRepository();

        System.out.println("Enter number of elems: ");
        int userInputElements = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < userInputElements; i++) {
            System.out.println("Enter " + i + " dataBase elem.");
            String userInput = scanner.nextLine();
            database.save(userInput);
        }

        System.out.println(database);

    }
}
