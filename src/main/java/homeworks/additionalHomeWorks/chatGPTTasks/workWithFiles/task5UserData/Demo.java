package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        AddUserData addUserData = new AddUserData();
        CheckUserData checkUserData = new CheckUserData();
        UserInput userInput = new UserInput();

        while (true) {
            String choice = userInput.choice();
            if (choice.equals("1")) {
                UserData user = userInput.input();
                addUserData.saveToFile(user.getLogin(), user.getPassword());
            } else if (choice.equals("2")) {
                UserData user = userInput.input();
                System.out.println(checkUserData.findData(user.getLogin(), user.getPassword()));
            } else {
                System.out.println("good buy");
                break;
            }
        }
    }
}
