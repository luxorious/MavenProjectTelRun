package homeworks.SkillDesksHomeWork.homeWork2.src.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//        Найти сумму нечетных чисел в массиве

public class Arr {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("enter lengths of array");
        int numb = scanner.nextInt();
        int [] ArrayOfNumbers = new int[numb];

        for (int i = 0; i < numb; i++) {
            ArrayOfNumbers[i] = random.nextInt(100);
        }

        long sum = 0;
        for (int number:ArrayOfNumbers) {
            if (number%2 != 0){
                sum+=number;
            }
        }
        System.out.println("Array:\n" + Arrays.toString(ArrayOfNumbers));
        System.out.printf("Sum all odd numbers in Array = %d", sum);
    }
}
