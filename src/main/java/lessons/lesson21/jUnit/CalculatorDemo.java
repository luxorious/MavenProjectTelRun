package lessons.lesson21.jUnit;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 10;

        System.out.println(calculator.sum(a,b));
    }
}
