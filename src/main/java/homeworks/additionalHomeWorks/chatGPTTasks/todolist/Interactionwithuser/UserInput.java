package homeworks.additionalHomeWorks.chatGPTTasks.todolist.Interactionwithuser;

import homeworks.additionalHomeWorks.chatGPTTasks.todolist.workingclasses.Task;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public Task inputTask(){
        System.out.println("Input name of case");
        String nameOfCase = scanner.nextLine();
        System.out.println("Input describe");
        String describe = scanner.nextLine();
        return new Task(nameOfCase, describe);
    }

    public String input(){
        return scanner.nextLine();
    }
}
