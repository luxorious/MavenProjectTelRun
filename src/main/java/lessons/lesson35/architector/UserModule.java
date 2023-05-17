package lessons.lesson35.architector;

import java.util.ArrayList;
import java.util.List;

public class UserModule {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        UserUtil uu = new UserUtil(userList);

        uu.addUser();
        uu.printUserList();
    }
}
