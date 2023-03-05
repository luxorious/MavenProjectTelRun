package homeworks.additionalHomeWorks.HWLection2.task3;

public class UsersDemo {
    public static void main(String[] args) {

        UserEntity2 users = new UserEntity2();

        users.addUser(1234,"Ivan", "Bolik", "Password");
        users.addUser(1232, "lolo", "bolo", "pass");
        users.addUser(324, "kilo", "bilo", "pasews");
        users.addUser(12324,"Ivan", "Bolifdk", "Passwodfdrd");
        users.addUser(12341,"Petro", "aaaaBolifdk", "Passwodfdrd");

        System.out.println("--------------------------------------------");
        users.showUserById(1234);
        users.showUserByName("Ivan");

        users.editUser(12341,"Ivan", "ivanenko", "Passwodfdrd");
        System.out.println("--------------------------------------------");
        users.deleteUser(12341,"Passwodfdrd");
        System.out.println("--------------------------------------------");
        users.showAllUsers();
    }
}
