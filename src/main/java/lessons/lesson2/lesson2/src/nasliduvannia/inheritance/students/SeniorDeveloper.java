package lessons.lesson2.lesson2.src.nasliduvannia.inheritance.students;

public class SeniorDeveloper extends MiddleDeveloper{
    void mentoring(){
        System.out.println("Mentoring");
    }

    void solveProblem(){
        System.out.println("Problem solver");
    }

    @Override
    void code() {
        System.out.println("Simple codding");
    }

    @Override
    void lern() {
        System.out.println("Fast learning");
    }
}
