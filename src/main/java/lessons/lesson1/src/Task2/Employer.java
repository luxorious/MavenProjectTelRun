package lessons.lesson1.src.Task2;

public class Employer {
    private String name;
    private  int age;
    private String designation;
    private int salary;

    public Employer(String name, int age, String designation, int salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void increaseSalary(){
        System.out.println("employer " + this.name + " received a salary increase - " + this.salary * 2);
    }
    public void showSalary(){
        System.out.println("Employer "  + this.name + " has salary - " + this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
