package homeworks.SkillDesksHomeWork.homeWork9.students;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

@Getter
@Setter
public class DataBase {

    private List<Student> studentsDB = new CopyOnWriteArrayList<>();

    public void add(Student student) {
        studentsDB.add(student);
    }

//    Написать метод, который удаляет студентов со средним баллом <3.
    public List<Student> expel() {
        List<Student> expelledStudents = new ArrayList<>();
        if (studentsDB.get(0).getEvaluation().isEmpty()){
//            return expelledStudents;
        }
        for (Student student : studentsDB) {
            if (averageScore(student)) {
                studentsDB.remove(student);
                expelledStudents.add(student);
            }
        }
        return expelledStudents;
    }

    //заполнить оценки только для удобства чтоб не вводить все вручную, думаю для дз сойдет.
    public void fillTheGrades(){
        for(Student student : getStudentsDB()){
            List<Integer> evaluation1 = new ArrayList<>(10);
            for (int i = 0; i < 10; i++) {
                int random = new Random().nextInt(2,6);
                evaluation1.add(i, random);
            }
            student.setEvaluation(evaluation1);
            System.out.println("student " + student.getName() + " " + student.getEvaluation());
        }
    }

    //переводит на следующий курс, если оценки позволяют
    public void transferToNextCourse() {
        if (studentsDB.get(0).getEvaluation().isEmpty()){
            return;
        }
        for (Student student : studentsDB) {
            if (!averageScore(student)) {
                int course = (student.getCourse() + 1);
                student.setCourse(course);
                //убираем все оценки так как для перехода на следующий курс
                // надо снова заполнить оценками(сдать сессию).
                // то есть надо визвать метод fillTheGrades().
                student.setEvaluation(new ArrayList<>());
            }
        }
    }

//    проверка на средний балл если студент подлежит отчислению, возвращаем true
    private boolean averageScore(Student student) {
        int grade = 0;
        if (student.getEvaluation().size() == 0){
            //вызываем исключение так как нельзя перевести студента
            // на следующий курс без сдачи сессии.
            System.out.println("нельзя без сдачи сессии отчислить или перевести студента на следующий курс");
            throw new ArithmeticException();
        }
        for (int evaluation : student.getEvaluation()) {
            grade += evaluation;
        }
        return (grade / student.getEvaluation().size()) < 3;
    }

//    Напишите метод printStudents(List<Student> students, int course),
//    который получает список студентов и номер курса.
//    А также печатает на консоль имена тех студентов из списка,
//    которые обучаются на данном курсе.
    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("student name - " + student.getName() +
                        " studies in the " + course + " year.");
            }
        }
    }
}
