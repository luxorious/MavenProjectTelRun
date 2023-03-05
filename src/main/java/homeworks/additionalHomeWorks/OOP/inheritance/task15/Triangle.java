package homeworks.additionalHomeWorks.OOP.inheritance.task15;

public class Triangle extends Shape{
    private int a;

    public Triangle(int a) {
        this.a = a;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) / 4) * (a * a) ;
    }

    @Override
    int calculatePerimeter() {
        return 3 * a;
    }
}
