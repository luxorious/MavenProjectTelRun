package homeworks.SkillDesksHomeWork.homeWork9.employee;

import java.util.Set;

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

    public String generateReport(Set<Employee> employees){
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees){
           sb.append(String.format("Full Name %s, salary %100.2f\n", employee.getFullName(), employee.getSalary()));
        }
        return sb.toString();
    }
}
