package homeworks.SkillDesksHomeWork.homeWork9.employee;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Report report = new Report();
        Employee vasya = new Employee("Vasya", 2000.0);
        Employee vasya1 = new Employee("Vasya1", 2001.0);
        Set<Employee> employees = new HashSet<>();
        employees.add(vasya);
        employees.add(vasya1);
        report.generateReport(employees);
        FullReport fullReport = new FullReport();

        for (Employee e : employees) {
            e.saveReport(fullReport.generateReport(employees));
        }
    }
}
