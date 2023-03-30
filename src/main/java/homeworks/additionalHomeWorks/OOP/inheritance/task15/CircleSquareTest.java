package homeworks.additionalHomeWorks.OOP.inheritance.task15;
//Создание иерархии класса Shape (геометрическая фигура).
//
//        Создайте наследника класс Shape - класс Circle.
//        Реализуйте в нём абстрактные методы из класса
//        Shape: calculateArea() и calculatePerimeter().
//        Напишите тесты для класса Circle.
//
//        PS: подсказка - необходимые значения для
//        расчёта площади и периметра подавайте к
//        класс через конструктор.

class CircleSquareTest {
    public static void main(String[] args) {
        System.out.println("Circle");
        Circle circle = new Circle(10);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println("Square");
        Shape square = new Square(10);

        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("Triangle");
        Triangle triangle = new Triangle(10);

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        System.out.println("random Circle");
        ShapeUtil util = new ShapeUtil();
        Circle newCircle = util.createRandomCircle();

        System.out.println(newCircle.calculatePerimeter());
        System.out.println(newCircle.calculateArea());

        System.out.println("random square");
        Square newSquare = util.createRandomSquare();

        System.out.println(newSquare.getA());
        System.out.println(newSquare.calculateArea());
        System.out.println(newSquare.calculatePerimeter());

        System.out.println("random rectangle");
        Rectangle newRectangle = util.createRandomRectangle();

        System.out.println(newRectangle.calculateArea());
        System.out.println(newRectangle.calculatePerimeter());

        System.out.println("random triangle");
        Triangle newTriangle = util.createRandomTriangle();

        System.out.println(newTriangle.calculateArea());
        System.out.println(newTriangle.calculatePerimeter());

        Shape rndShape = util.createRandomShape();
        System.out.println(rndShape.calculatePerimeter());

        Shape[] arrayOfShapes = {circle, triangle, rectangle, square,
                newCircle, newSquare, newRectangle, newTriangle, rndShape};

        System.out.println(util.calculateArea(arrayOfShapes) + " sum of areas");
        System.out.println(util.calculatePerimeter(arrayOfShapes) + " sum of perimeters");
    }
}