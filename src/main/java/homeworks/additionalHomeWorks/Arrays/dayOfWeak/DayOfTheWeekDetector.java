package homeworks.additionalHomeWorks.Arrays.dayOfWeak;

import java.util.Scanner;

public class DayOfTheWeekDetector {//как делать автоматический тест для классов со сканером?
    public int getDayNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }
}
