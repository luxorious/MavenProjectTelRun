package lessons.lesson1.src;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello");

        int a;
        int b;
        a = 5;
        b = 10;
        System.out.println(a + b);

        Person newPerson = new Person("Vasyl", 22, 76);

        Person newPers2 = new Person("Ivanko", 18);
        Person newPe3 = new Person();
//        Person newPer2 = new Person();

        newPerson.age = 22;
        System.out.println(newPerson.name);
        newPerson.name = "Ivan";
        System.out.println(newPerson.name);

        System.out.println(newPerson);
        System.out.println(newPers2);
        System.out.println(newPe3);

        newPerson.say("Hello");
        newPers2.say("Hello " + newPerson.name);

        Dog dog1 = new Dog("Barsik", 3, "red");
        dog1.woof();
    }
}
