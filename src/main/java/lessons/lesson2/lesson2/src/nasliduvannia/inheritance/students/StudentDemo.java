package lessons.lesson2.lesson2.src.nasliduvannia.inheritance.students;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.lern();

        System.out.println("======JUNIOR=======");
        JuniorDeveloper jun = new JuniorDeveloper();
        jun.lern();
        jun.code();

        System.out.println("======MIDDLE=======");
        MiddleDeveloper mid = new MiddleDeveloper();
        mid.code();
        mid.lern();
        mid.debug();

        System.out.println("======SENIOR=======");
        SeniorDeveloper senior = new SeniorDeveloper();
        senior.code();
        senior.debug();
        senior.lern();
        senior.mentoring();
        senior.solveProblem();

    }
}
