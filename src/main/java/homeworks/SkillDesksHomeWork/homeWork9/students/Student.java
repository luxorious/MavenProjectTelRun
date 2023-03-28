package homeworks.SkillDesksHomeWork.homeWork9.students;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Student {
//    Создать класс Student, содержащий следующие характеристики –
//    имя, группа, курс, оценки по предметам.
//    Создать коллекцию, содержащую объекты класса Student.
//    Написать метод, который удаляет студентов со средним баллом <3.
//    Если средний балл>=3, студент переводится на следующий курс.
//    Напишите метод printStudents(List<Student> students, int course),
//    который получает список студентов и номер курса.
//    А также печатает на консоль имена тех студентов из списка,
//    которые обучаются на данном курсе.

    private String name;
    private int group;
    private int course;
    private List<Integer> evaluation;

    @Override
    public String toString() {
        return "name='" + name +
                ", group=" + group +
                ", course=" + course +
                ", evaluation=" + evaluation;
    }

    public void setEvaluation(List<Integer> evaluation) {
        this.evaluation = evaluation;
    }
}
