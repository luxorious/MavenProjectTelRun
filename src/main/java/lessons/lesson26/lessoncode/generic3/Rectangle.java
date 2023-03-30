package lessons.lesson26.lessoncode.generic3;

public class Rectangle<T extends Number> implements Figure<T> {

    private T x1, y1, x2, y2;

    public Rectangle(T x1, T y1, T x2, T y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public double area() {
        return Math.abs((x1.doubleValue()- x2.doubleValue())*(y1.doubleValue())- y2.doubleValue());
    }
}
