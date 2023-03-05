package lessons.lesson6.src.person;

import java.util.Objects;

public class Person {

    String name;

    int age;

    long personalCode;

    public void say(){
        System.out.println("Hello");
    }

    public Person(String name, int age, long personalCode) {
        this.name = name;
        this.age = age;
        this.personalCode = personalCode;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPersonalCode(long personalCode) {
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPersonalCode() {
        return personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && personalCode == person.personalCode && Objects.equals(name, person.name);
    }


}
