package homeworks.SkillDesksHomeWork.homework1.task1;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John Corner", 25);

        person1.setFullName("Piter Parker");
        System.out.println(person1.move());
        person1.talk();

        System.out.println(person2.move());
        person2.talk();
    }
}
