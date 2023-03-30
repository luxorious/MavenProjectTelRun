package lessons.lesson1.src;

public class Person {
    String name;

    int age;

    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {

    }

    public void say(String text){
        System.out.println("Person " + this.name + " say " + text);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

}