package homeworks.additionalHomeWorks.HWLection2.task3;

import java.util.*;

public class UserEntity2 extends UserEntity{
    private HashMap<Integer, List<String>> users = new HashMap<>();

    public HashMap<Integer, List<String>> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, List<String>> users) {
        this.users = users;
    }

    public UserEntity2() {
    }

    public HashMap<Integer, List<String>> addUser(int identification, String name,
                                                  String surname, String password) {

        for (int i : this.users.keySet()) {
            if (i == identification || name.equals(this.users.get(i).get(2))) {
                System.out.println("id or personal code already added");
                System.out.println(i);
                System.out.println("Personal Code - " + this.users.get(i).get(2));
                return this.users;
            }
        }
        this.users.putIfAbsent(identification, Arrays.asList(name, surname, password));
        return this.users;
    }

    public void showAllUsers(){
        for (int i : this.users.keySet()) {
            showData(i);
        }
    }

    public void showUserById(int id){
        for (int i : this.users.keySet()) {
            if (i == id){
                System.out.println("Found user by id:");
                showData(i);
            }
        }
    }

    public void showUserByName(String name){
        this.users.forEach((key, value) -> {
            if (name.equals(value.get(0))){
                System.out.println("Found by Name");
                System.out.println("id: " + key);
                System.out.println("First name - " + value.get(0));
                System.out.println("Last Name - " + value.get(1));
                System.out.println();
            }
        });
    }
    public HashMap<Integer, List<String>> editUser(int identification, String name,
                                                   String surname, String password) {
        for (int i : this.users.keySet()) {
            if (i == identification && password.equals(this.users.get(i).get(2))) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new password");
                String newPassword = scanner.nextLine();
                this.users.put(identification, Arrays.asList(name, surname, newPassword));
                System.out.println("data changed");
                showUserById(i);
                return this.users;
            }
        }
        return this.users;
    }

    public HashMap<Integer, List<String>> deleteUser(int identification, String password) {
        for (int i : this.users.keySet()) {
            if (i == identification && password.equals(this.users.get(i).get(2))) {
                this.users.remove(identification, Arrays.asList(this.users.get(i).get(0),
                        this.users.get(i).get(1), password));
                System.out.println("user deleted");
                showUserById(i);
                return this.users;
            }
        }
        return this.users;
    }
    private void showData(int i){
        System.out.println("id: " + i);
        System.out.println("First name - " + this.users.get(i).get(0));
        System.out.println("Last Name - " + this.users.get(i).get(1));
//            System.out.println("Password - " + this.users.get(i).get(2));
        System.out.println();
    }
}
