package homeworks.additionalHomeWorks.OOP.inheritance.task15;

public class Square extends Shape{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    double calculateArea() {
        return a * a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    int calculatePerimeter() {
        return a * 4;
    }
}
