package lessons.lesson18.inputOutput;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter data");
        System.out.println(scanner.nextInt());
        scanner.nextLine();

        System.out.println("enter text data");
        System.out.println(scanner.nextLine());

    }
}
