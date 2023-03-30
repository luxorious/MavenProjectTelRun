package homeworks.SkillDesksHomeWork.homeWork2.src.task1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberPlayers = 0;
        while (true) {
            try {
                System.out.println("Enter number of players (max players - 7): ");
                numberPlayers = scanner.nextInt();

                if (numberPlayers == 1) {
                    System.out.println("You can not play alone");
                } else  if (numberPlayers > 0 && numberPlayers < 8) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Not A Number!!!!\nTry again");
                scanner.next();
                continue;
            }
        }

        CardsDistribution cards = new CardsDistribution(numberPlayers);
        ArrayList <Player> arr= cards.distributing();

        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).output();
            System.out.println(arr.get(i).getPlayerNumber());
        }
        System.out.println("\nCards left in the deck - " + cards.getMixed().size());
    }
}