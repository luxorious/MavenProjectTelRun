package homeworks.SkillDesksHomeWork.homeWork9.employee;

import lombok.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Employee {
//    оздать класс Employee, у которого есть переменные класса - fullname, salary.
//    Создать коллекцию, содержащую несколько объектов этого типа.
//    Создать класс Report  с  методом generateReport, в котором
//    выводится информация о зарплате всех сотрудников.
//    Используйте форматирование строк. Пусть salary будет выровнено
//    по правому краю, десятичное значение имеет 2 знака после запятой и
//    можете добавить что-нибудь свое.
//    Добавить переменную LocalDate salaryDate в класс Employee.
//    Создать класс FullReport, который выводит ту же информацию, что и
//    Report и добавляет дату выдачи зарплаты.
//
//    Добавить метод в класс Employee, который будет записывать отчет в файл.
//    Используем класс PrintWriter.

    private String fullName;
    private double salary;
    private LocalDate salaryDate;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = LocalDate.now();
    }

    public void saveReport(String report) {
        File file = new File("src/main/resources/report.txt");
        try (PrintWriter writer = new PrintWriter(file)){
            writer.println(report);
            System.out.println("data saved!");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
