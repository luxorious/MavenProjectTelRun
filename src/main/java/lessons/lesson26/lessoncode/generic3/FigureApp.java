package lessons.lesson26.lessoncode.generic3;

public class FigureApp {
    public static void main(String[] args) {
        Circle<Float> cFloat = new Circle<>(3.5f);
        double areaCircle = cFloat.area();
        System.out.println(areaCircle);

        Rectangle<Integer> recInteger = new Rectangle<>(1, 2, 3, 5);
        double areaRecInt = recInteger.area();
        System.out.println(areaRecInt);
    }
}
