package homeworks.additionalHomeWorks.multithreading.harbor;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String input(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

//    private int inputInt(String message){
//        System.out.println(message);
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        return number;
//    }
}
