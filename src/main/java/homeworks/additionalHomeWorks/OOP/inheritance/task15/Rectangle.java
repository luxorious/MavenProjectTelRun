package homeworks.additionalHomeWorks.OOP.inheritance.task15;

public class Rectangle extends Shape{

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    @Override
    int calculatePerimeter() {
        return 2 * (a + b);
    }
}
