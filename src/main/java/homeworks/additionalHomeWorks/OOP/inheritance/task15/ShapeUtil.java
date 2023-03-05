package homeworks.additionalHomeWorks.OOP.inheritance.task15;

import java.util.Random;
//    Создайте класс ShapeUtil.
//        В класе ShapeUtil реализуйте метод:
//
//        Circle createRandomCircle();
//
//        Этот метод создаёт круг со случайным радиусом.
public class ShapeUtil{
    Random random = new Random();

    public Circle createRandomCircle(){
        return new Circle(random.nextDouble(100));
    }

    public Square createRandomSquare(){
        return new Square(random.nextInt(100));
    }

    public Rectangle createRandomRectangle(){
        return new Rectangle(random.nextInt(100), random.nextInt(100));
    }

    public Triangle createRandomTriangle(){
        return new Triangle(random.nextInt(100));
    }

    //    Этот метод создаёт случайную геометрическую фигуру.
    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            System.out.println("circle");
            return createRandomCircle();
        } else if (randomNumber == 1) {
            System.out.println("square");
            return createRandomSquare();
        } else if (randomNumber == 2) {
            System.out.println("Rectangle");
            return createRandomRectangle();
        } else {
            System.out.println("triangle");
            return createRandomTriangle();
        }
    }

//    В класе ShapeUtil реализуйте метод:
//
//    Этот метод расчитывает объщую площадь
//    геометрических фигур из массива.

    double calculateArea(Shape[] shapes){
        double area = 0.0;
        for (Shape shape:shapes){
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes){
        double perimeter = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            perimeter = shapes[i].calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }




}