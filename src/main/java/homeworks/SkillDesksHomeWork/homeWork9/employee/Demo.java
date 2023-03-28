package homeworks.SkillDesksHomeWork.homeWork9.employee;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Report report = new Report();
        Employee empl = new Employee("Vasya", 2000.0);
        Set<Employee> employe = new HashSet<>();
        employe.add(empl);
        report.setEmployees(employe);
        report.generateReport();
    }
}
