package homeworks.additionalHomeWorks.chatGPTTasks.todolist.Interactionwithuser;

import homeworks.additionalHomeWorks.chatGPTTasks.todolist.workingclasses.ToDoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Map<Integer, ToDoList> actionWithToDoList = new HashMap<>();
    private ToDoList toDoList = new ToDoList();
    private UserInput userInput = new UserInput();
    public void menu(int userChoice){
        switch (userChoice) {
            case 1 -> toDoList.add(userInput.inputTask());
            case 2 -> {
                System.out.println("input name of case for deleting");
                toDoList.delete(userInput.input());
            }
            case 3 -> {
                System.out.println("input name of case for update");
                toDoList.update(userInput.input());
            }
            case 4 -> toDoList.showAll();
            case 5 -> {
                System.out.println("input name of case for show by name");
                toDoList.showByName(userInput.input());
            }
//            default -> System.out.println("Thank you! Good by!");
        }

    }
    public void menu(){
        System.out.println("""
                1 - Додати нову справу,
                2 - Видалити справу,
                3 - Оновити статус виконання справи,
                4 - Переглянути список усіх справ,
                5 - Переглянути справу за імʼям,
                будь яка кнопка - Вийти з програми.
                """);
    }

    public void run() throws NumberFormatException{
        while (true){
            menu();
            int numberOfMenu;
            try {
                numberOfMenu = Integer.parseInt(scanner.nextLine());
                if (numberOfMenu <= 0 || numberOfMenu > 5){
                    System.out.println("Thank you! Good by!");
                    break;
                }
                menu(numberOfMenu);
            } catch (NumberFormatException e){
                System.out.println("Thank you! Good by!");
                break;
            }
        }
    }
}
