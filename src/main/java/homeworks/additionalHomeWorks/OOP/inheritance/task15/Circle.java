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

class Circle extends Shape {
    private double radius;

    Circle() {
    }


    public double getRadius() {
        return radius;
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return null;
    }


    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    int calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }

}

