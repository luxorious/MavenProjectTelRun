package homeworks.additionalHomeWorks.first.Task1;
//Дополнительные задания.
//        1.
//        Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//        (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//        Вещественные числа можно запрашивать с консоли используя обьект Scanner
//        следующим образом:
//
//        Scanner scanner = new Scanner(System.in);
//        double firstDoubleNumber = scanner.nextDouble();

import java.util.Scanner;

public class ConsoleProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.printf("%.2f + %.2f = %.2f\n",
                firstDoubleNumber, secondDoubleNumber, add(firstDoubleNumber, secondDoubleNumber));

        System.out.printf("%.2f - %.2f = %.2f\n",
                firstDoubleNumber, secondDoubleNumber, difference(firstDoubleNumber, secondDoubleNumber));

        System.out.printf("%.2f * %.2f = %.2f\n",
                firstDoubleNumber, secondDoubleNumber, multiply(firstDoubleNumber, secondDoubleNumber));

        System.out.printf("%.2f / %.2f = %.2f\n",
                firstDoubleNumber, secondDoubleNumber, divide(firstDoubleNumber, secondDoubleNumber));

    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
