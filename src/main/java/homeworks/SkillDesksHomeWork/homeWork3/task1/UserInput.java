package homeworks.SkillDesksHomeWork.homeWork3.task1;

import java.util.Scanner;

public class UserInput{
    Scanner sc = new Scanner(System.in);

    private String textFromUser;

    public String input(){
        System.out.println("Input text: ");
        return textFromUser = sc.nextLine();
    }

    public String getTextFromUser() {
        return textFromUser;
    }
}