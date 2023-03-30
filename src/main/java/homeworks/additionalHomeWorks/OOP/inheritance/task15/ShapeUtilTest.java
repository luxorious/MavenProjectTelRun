package homeworks.additionalHomeWorks.OOP.inheritance.task15;

public class ShapeUtilTest {
//    Создайте класс ShapeUtilTest
//    и напишите тесты для методов:
//
//    double calculateArea(Shape[] shapes);
//    double calculatePerimeter(Shape[] shapes);
//
//    PS: пример создания и заполнения массива
//    геометрических фигур:
//

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
    }
}
