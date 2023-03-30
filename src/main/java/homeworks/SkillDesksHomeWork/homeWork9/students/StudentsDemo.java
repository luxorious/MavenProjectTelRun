package homeworks.SkillDesksHomeWork.homeWork9.students;

import java.util.ArrayList;
import java.util.List;

public class StudentsDemo {
    public static void main(String[] args) {
        DataBase db = new DataBase();

        List<Integer> evaluation = new ArrayList<>();
        Student ivan = new Student("Ivan", 6, 1, evaluation);
        Student petro = new Student("Petro", 6, 1, evaluation);
        Student leon = new Student("Leon", 6, 1, evaluation);
        Student alex = new Student("Alex", 6, 1, evaluation);
        Student lili = new Student("Lili", 6, 1, evaluation);
        Student olena = new Student("Olena", 6, 1, evaluation);
        Student lilia = new Student("Lilia", 6, 1, evaluation);

        db.add(ivan);
        db.add(petro);
        db.add(leon);
        db.add(alex);
        db.add(lili);
        db.add(olena);
        db.add(lilia);

        db.printStudents(db.getStudentsDB(),1);

        System.out.println("----------");
        db.fillTheGrades();//заполняем оценками и выводим на консоль имя студента и его оценки.
        db.transferToNextCourse();
        db.fillTheGrades();//заполняем оценками и выводим на консоль имя студента и его оценки.
        List<Student> expelledStudents = db.expel();

        if (expelledStudents.isEmpty()){
            System.out.println("all students passed session good, and no one not expelled");
        } else {
            System.out.println("Expelled students - " + expelledStudents);
        }
    }
}
