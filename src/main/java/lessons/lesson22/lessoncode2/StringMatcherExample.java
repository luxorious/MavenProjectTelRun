package lessons.lesson22.lessoncode2;

import java.util.Scanner;

public class StringMatcherExample {
    public static void main(String[] args) {
        boolean flag = true;

        while (flag){
            Scanner sc = new Scanner(System.in);

            String text = sc.nextLine();
            boolean matches = text.matches("[a-zA-Z].*");
            if (!matches){
                System.out.println("Wrong input");
            } else {
                System.out.println("....");
                break;
            }
        }
    }
}
