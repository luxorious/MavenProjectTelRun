package homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.userInput;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String input(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public static Long inputNumber(String message){
        System.out.println(message);
        Long number = scanner.nextLong();
        scanner.nextLine();
        return number;
    }

}
