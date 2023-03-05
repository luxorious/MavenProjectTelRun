package homeworks.additionalHomeWorks.first.Task1.task4;

import java.util.Scanner;

public class RoundCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input radius");
        int r = scanner.nextInt();

        double p = 2 * Math.PI * r;
        double s = Math.PI * (r * r);//Math.sqrt(r);

        System.out.printf("Perimeter is - %.2f\n", p);
        System.out.printf("Area is - %.2f", s);
    }
}
