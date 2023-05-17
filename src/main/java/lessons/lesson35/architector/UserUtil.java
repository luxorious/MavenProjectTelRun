package lessons.lesson35.architector;

import java.util.List;
import java.util.Scanner;

public class UserUtil {
    private final List<User> userList;

    public UserUtil(List<User> userList) {
        this.userList = userList;
    }

    public User createUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String name = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        scanner.close();
        return new User(name, password);
    }

    public void addUser(){
        User newUser = createUser();
        boolean isNotExist = true;
        for (User user : userList){
            if (user.getName().equals(newUser.getName())){
                isNotExist = false;
            }
        }
        if (isNotExist){
            userList.add(newUser);
        }
    }

    public void printUserList(){
        System.out.println(userList);
    }
}
