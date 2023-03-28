package lessons.lesson23.junit;

import java.util.ArrayList;
import java.util.List;

public class TaxDemo {
    public static void main(String[] args) {
        TaxCalculatorImpl calc = new TaxCalculatorImpl();
        System.out.println("Income " + 4000 + " tax " + calc.calculatorTax(4000.0));
        System.out.println("Income " + 10000 + " tax " + calc.calculatorTax(10000.0));
        System.out.println("Income " + 20000 + " tax " + calc.calculatorTax(20000.0));
        System.out.println("Income " + 25000 + " tax " + calc.calculatorTax(25000.0));


//        Дано послідовність:
//
//        11, 12, 13, 11, 15, 16, 17, 18, 19, 20, 14, 15
//
//        Використання Stream API:
//        завдання 1) вивести на консоль перші 5 елементів. завдання2) вивести на консоль парні елементи.
//                завдання 3) вивести на консоль кількість елементів (приклад: 11 -> 2, 12 -> 1, ....)
//
//        Вставте свій код у поле запитання.
        List<Integer> arr = List.of(11, 12, 13, 11, 15, 16, 17, 18, 19, 20, 14, 15);

        //task1
        arr.stream()
                .filter(num -> arr.indexOf(num) < 5)
                .forEach(System.out::println);

        //task2
        arr.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("----------");
//        task3
//        arr.stream()
//                .flatMap(num-> arr.stream()
//                        .filter(el -> el == num)
//                        .map());

    }
}
