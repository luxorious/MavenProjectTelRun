package lessons.lesson1.src.Task2;

public class Task {

    public static void main(String[] args) {
        Employer ivan = new Employer("Ivan", 25, "Engineer", 3000);
        Employer petro = new Employer("Petro", 20,"Worker", 1800);
        Employer andrii = new Employer("Andrii", 40, "foreman", 5000);

        petro.showSalary();
        andrii.increaseSalary();
        ivan.increaseSalary();
        ivan.increaseSalary();
    }

}
