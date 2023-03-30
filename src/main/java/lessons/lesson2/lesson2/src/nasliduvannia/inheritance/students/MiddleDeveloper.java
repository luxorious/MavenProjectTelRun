package lessons.lesson2.lesson2.src.nasliduvannia.inheritance.students;

public class MiddleDeveloper extends JuniorDeveloper {

    void debug(){
        System.out.println("Debuging");
    }

    @Override
    void code() {
        System.out.println("Codding like a middle developer");
    }
}
