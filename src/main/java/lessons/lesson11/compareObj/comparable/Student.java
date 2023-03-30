package lessons.lesson11.compareObj.comparable;

import java.util.Objects;

public class Student {
    int id;
    String studentName;
    int age;
    String group;

    public Student(int id, String studentName, int age, String group) {
        this.id = id;
        this.studentName = studentName;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", age=" + age + '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(studentName, age);
    }
}
