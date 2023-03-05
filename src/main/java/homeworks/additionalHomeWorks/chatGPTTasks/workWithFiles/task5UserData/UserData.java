package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData;

public class UserData {
    private String login;
    private String password;

    public UserData(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return login + " " + password + "\n";
    }
}
