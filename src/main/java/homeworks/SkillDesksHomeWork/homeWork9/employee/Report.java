package homeworks.SkillDesksHomeWork.homeWork9.employee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Report {
//    оздать класс Employee, у которого есть переменные класса - fullname, salary.
//    Создать коллекцию, содержащую несколько объектов этого типа.
//    Создать класс Report с методом generateReport, в котором
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
    private Set<Employee> employees = new HashSet<>();

    public void generateReport(){
        for (Employee employee : employees){
            System.out.printf("Full Name %s, salary %100.2f", employee.getFullName(), employee.getSalary());
        }
    }
}
