package lessons.lesson17.streamExample2;

public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "name='" + name +
                ", age=" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person maxAge(Person p1, Person p2){
        return p1.getAge() > p1.getAge() ? p1 : p2;
    }
}
