package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        text();

    }
//    Напишіть програму, яка зчитує текстовий файл і виводить його вміст на екран.
    public static void text() throws IOException {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input path to file");
            String path = scanner.nextLine();
            try {
                openFile(path);
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Sorry, but file not found");
            }
        }
    }

    private static void openFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String text = reader.readLine();
        while (text != null) {
            System.out.println(text);
            text = reader.readLine();
        }
    }
}
