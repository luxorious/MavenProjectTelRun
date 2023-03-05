package lessons.lesson17.streamExample2;

import java.util.Arrays;
import java.util.List;

public class PersonMaxAge {
    public static void main(String[] args) {
        Person person1 = new Person("Petro", 28);
        Person person2 = new Person("Ruslan", 32);
        Person person3 = new Person("Viktor", 29);
        Person person4 = new Person("Mike", 48);
        Person person5 = new Person("Vadym", 8);


        List<Person> users = Arrays.asList(person1, person2, person3, person4, person5);

        System.out.println(users);

        Person userWithMaxAge = users.stream()
                .reduce(Person :: maxAge)
                .get();

        System.out.println("User with max age - " + userWithMaxAge);

        userWithMaxAge = null;
        userWithMaxAge = users.get(0);

        for (Person p : users){
            userWithMaxAge = Person.maxAge(userWithMaxAge, p);
        }
        System.out.println("User with max age - " + userWithMaxAge);

    }
}
