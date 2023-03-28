package lessons.lesson26.lessoncode.generic3;

public class Circle<T extends Number> implements Figure<T> {

    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }


}
