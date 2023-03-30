package homeworks.SkillDesksHomeWork.homeWork9.employee;

import java.util.Set;

public class FullReport extends Report{
    @Override
    public String generateReport(Set<Employee> employees) {
        StringBuilder sb = new StringBuilder();

        for (Employee employee : employees){
            sb.append(String.format("Full Name %s, salary %10.2f, next salary date %s\n",
                    employee.getFullName(), employee.getSalary(),
                    employee.getSalaryDate().plusMonths(1))); //показывает дату видачи зарплати через месяц после создания объекта
        }
        return sb.toString();
    }
}
