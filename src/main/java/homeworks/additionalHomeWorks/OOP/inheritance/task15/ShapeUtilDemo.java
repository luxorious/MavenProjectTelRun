package homeworks.additionalHomeWorks.OOP.inheritance.task15;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(circleArea + " area and perimeter - " + circlePerimeter);

        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = shapeUtil.createRandomShape();
            double shapeArea = shapeUtil.calculateArea(shapes[i]);
            double shapePerimeter = shapeUtil.calculatePerimeter(shapes[i]);
            System.out.println(shapeArea + " area and perimeter - " + shapePerimeter);

        }

    }
}
