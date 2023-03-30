package lessons.lesson21.junitExample;

public class UserApp {
    public static void main(String[] args) {
        UserUtils uu = new UserUtils();
        User user1 = new User(1,"petro", 25, Sex.MAN);
        User user2 = new User(2,"Ivan", 20, Sex.MAN);
        User user3 = new User(3,"Inna", 24, Sex.WOMAN);
        User user4 = new User(4,"John", 22, Sex.MAN);
        User user5 = new User(5,"Joanna", 22, Sex.WOMAN);

        uu.allUsers.put(1, user1);
        uu.allUsers.put(2, user2);
        uu.allUsers.put(3, user3);
        uu.allUsers.put(4, user4);
        uu.allUsers.put(5, user5);

        System.out.println(uu.getAllUsers());

        System.out.println(uu.getHowManyUsers());
        System.out.println(uu.getHowManyUsers(Sex.MAN));
        System.out.println(uu.getHowManyUsers(Sex.WOMAN));
        System.out.println(uu.getAllAgeUser());
        System.out.println(uu.getAllAgeUser(Sex.MAN));
        System.out.println(uu.getAllAgeUser(Sex.WOMAN));

    }
}
