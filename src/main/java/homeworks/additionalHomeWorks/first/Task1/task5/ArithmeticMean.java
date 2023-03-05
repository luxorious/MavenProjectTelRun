package homeworks.additionalHomeWorks.first.Task1.task5;

import java.util.Scanner;

public class ArithmeticMean {
//    Напишите программу, которая запрашивает у пользователя
//    три целых числа и выводит их среднее арифметическое
//            (складывает все числа и делит на их количество).
//
//    Примечение: обратите внимание, что результат может быть дробным числом.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input num1");
        int num1 = scanner.nextInt();
        System.out.println("Input num2");
        int num2 = scanner.nextInt();
        System.out.println("Input num3");
        int num3 = scanner.nextInt();

        double ArithmeticM = (num1 + num2 + num3) / 3;

        System.out.println(ArithmeticM);


    }
}
