package homeworks.additionalHomeWorks.HWLection1.task2;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculator calc = new PowerCalculator();

        System.out.println(calc.degreeEasy(35,35));
        System.out.println(calc.degree(35,35));
        System.out.println("______________________");

        System.out.println(calc.degree(2,3));
        System.out.println(calc.degreeEasy(2,3));
        System.out.println("______________________");

        System.out.println(calc.degree(12,44));
        System.out.println(calc.degreeEasy(12,44));
        System.out.println("______________________");

        System.out.println(calc.degree(5,5));
        System.out.println(calc.degreeEasy(5,5));
        System.out.println("______________________");

    }
}
