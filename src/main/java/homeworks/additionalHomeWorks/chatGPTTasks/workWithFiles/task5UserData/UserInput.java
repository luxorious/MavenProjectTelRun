package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public UserData input(){
        //введення логіну та пароля для подальшого зберігання у файл, або пошуку у файлі
        System.out.println("Input login");
        String login = scanner.nextLine();
        System.out.println("Input password");
        String password = scanner.nextLine();

        return new UserData(login, password);
    }
    public String choice(){
        //вибір пункту 1 для реєстрації 2 для пошуку у файлі
        System.out.println("registration - 1 \nlog in - 2\nexit - any key");
        return scanner.nextLine();
    }
}
