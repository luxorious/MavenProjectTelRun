package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckUserData {
    public boolean findData(String login, String password){
        //пошук логіна і пароля у файлі, якщо логін і пароль знайдено, повертає true
        String path = "src/homeworks/additionalHomeWorks/chatGPTTasks/workWithFiles/sources/db.txt";

        try (FileReader fr = new FileReader(path);
        BufferedReader reader = new BufferedReader(fr)){
            String line = reader.readLine();
            String match = login + " " + password;
            while (line != null){
                if (line.equals(match)){
                    return true;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
