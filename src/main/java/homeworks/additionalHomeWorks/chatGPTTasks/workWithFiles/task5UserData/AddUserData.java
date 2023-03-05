package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData;

import java.io.FileWriter;
import java.io.IOException;

public class AddUserData {
    public void saveToFile(String login, String password) throws IOException {
        //зберігаємо логін і пароль у файл
        String path = "src/homeworks/additionalHomeWorks/chatGPTTasks/workWithFiles/sources/db.txt";
        try (FileWriter appendData = new FileWriter(path, true)){
            appendData.write(login + " " + password + "\n");
            System.out.println("data successfully saved");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
