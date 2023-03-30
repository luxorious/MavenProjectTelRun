package homeworks.additionalHomeWorks.OOP.inheritance.defaultConstructor;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 v3 = new DefaultConstructorV3();

        System.out.println("name " + v3.getFullName());
        System.out.println("age " + v3.getAge());
        System.out.println("Male " + v3.isMale());
        System.out.println("female " + v3.getFemale());
    }
}
