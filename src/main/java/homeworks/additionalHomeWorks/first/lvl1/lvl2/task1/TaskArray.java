package homeworks.additionalHomeWorks.first.lvl1.lvl2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskArray{
    static int lengthArr = 3;
    static int [] arr = new int[lengthArr];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("task1");
        task1();
        System.out.println("task2");
        task2();
        System.out.println("task3");
        task3();
        System.out.println("task4");
        task4();
        System.out.println("task5");
        task5();
        System.out.println("task6");
        task6();
        System.out.println("task7 And Task8");
        task7AndTask8();
        System.out.println("task9 And ask10");
        task9AndTask10();


    }

    public static void task1(){
//    1
//    Напишите программу, в которой:
//            - создайте массив целых чисел длиной 3,
//            - заполните каждую ячейку массива числом, запрошенным у пользователя,
//            - выведите значение каждой ячейки на консоль.
        lengthArr = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Input %d integer value: ", i+1);
            int value = scanner.nextInt();
            arr[i] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void task2(){
//        2
//        Написашите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//                - заполните каждую ячейку массива случайным числом,
//                - посчитайте сумму всех ячеек и распечатайте ее на консоль.
        lengthArr = 3;
        int sumOfIndex = 0;
        int sumOfValue = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            sumOfIndex += i;
            sumOfValue += arr[i];
        }
        System.out.printf("sum of index = %d\n", sumOfIndex);
        System.out.printf("sum of value = %d\n", sumOfValue);
    }

    public static void task3(){
//        3
//        Напишите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//                - заполните каждую ячейку массива случайным числом,
//                - посчитайте среднее значение и выведите его на консоль.
        lengthArr = 3;
        double mitte = 0.0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            mitte = mitte + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        mitte = mitte / arr.length;
        System.out.println(mitte);
    }

    public static void task4(){
//        4
//        Напишите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//                - заполните каждую ячейку массива случайным числом,
//                - выведите значение каждой ячейки на консоль,
//                - увеличьте значение каждой ячейки на 2,
//                - выведите значение каждой ячейки на консоль.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);
            arr[i] += 2;
            System.out.println(arr[i]);
        }
    }

    public static void task5(){
//        5
//        Напишите программу, в которой:
//        - запросите у пользователя с консоли длину массива
//        - создайте массив указанной пользователем длины
//        - заполните массив числами полученными от пользователя
//                - распечатайте на консоль все элементы массива.
        System.out.println("Enter arr length");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("enter number");
            arr[i] = scanner.nextInt();
            System.out.println("number added");
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task6(){
//        6
//        Напишите программу, в которой:
//        - запросите у пользователя с консоли длину массива
//        - создайте массив указанной пользователем длины
//        - заполните массив случайными числами
//                - распечатайте на консоль все элементы массива.
        System.out.println("enter len of arr");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task7AndTask8(){
//        7
//        Напишите программу, в которой:
//        - создайте массив произвольной длины
//                - заполните массив случайными числами
//                - распечатайте на консоль все элементы массива
//                - найдите наибольшее число в массиве и выведети его на консоль.

        int l = random.nextInt(9999999);
        int[] arr = new int[l];
        int max = -1;
        int quantity = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                quantity++;
            }
        }

        int min = max;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Max number in array - " + max);
        System.out.printf("quantity max numbers - %d\n", quantity);
        System.out.println(arr.length + " Number of elements in array");
        System.out.println("min number in array - " + min);
    }

    public static void task9AndTask10(){
//        9
//        Напишите программу, в которой:
//        - создайте массив произвольной длины
//                - заполните массив случайными числами
//                - распечатайте на консоль все элементы массива
//                - найдите все чётные числа в массиве и выведети их на консоль.
//        10
//        Напишите программу, в которой:
//        - создайте массив произвольной длины
//                - заполните массив случайными числами
//                - распечатайте на консоль все элементы массива
//                - найдите все нечётные числа в массиве и выведети их на консоль.

        int l = random.nextInt(9999999);
        int[] arr = new int[l];
        ArrayList<Integer> even  = new ArrayList<>();
        ArrayList<Integer> odd  = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            if (arr[i]%2 == 0){
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(even);
        System.out.println(odd);
    }
}
