package homeworks.additionalHomeWorks.multithreading.library;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    synchronized static String input(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    static int inputInt(String message){
        while (true) {
            try {
                int number =  Integer.parseInt(input(message));
                if (number > 0){
                    return number;
                } else {
                    System.out.println("number must be > 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a number try again");
            }
        }
    }
}
