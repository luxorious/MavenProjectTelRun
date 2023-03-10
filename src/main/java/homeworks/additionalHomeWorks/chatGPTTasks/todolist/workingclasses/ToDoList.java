package homeworks.additionalHomeWorks.chatGPTTasks.todolist.workingclasses;

import homeworks.additionalHomeWorks.chatGPTTasks.todolist.Interactionwithuser.UserInput;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<List<String>> toDo = new ArrayList<>();

    public void add(Task task){
        toDo.add(initialList(task));
    }

    public void delete(String nameOfCase){
        System.out.println("input");
        int index = find(nameOfCase);
        if (index != -1){
            toDo.remove(index);
            System.out.println("Thing " + nameOfCase + " deleted");
        } else {
            System.out.println("there is no " + nameOfCase + " case on your to-do list");
        }
    }

    public void update(String nameOfCase){
        UserInput ui = new UserInput();
        int index = find(nameOfCase);
        if (index != -1){
            List<String> edit = toDo.get(index);
            System.out.println("Enter new status:");
            edit.set(2, ui.input());
            toDo.set(index, edit);
            System.out.println("status updated!");
        } else {
            System.out.println("not found case " +nameOfCase);
        }
    }

    public void showAll(){
        if (toDo.size() == 0){
            System.out.println("your list is empty");
        } else {
            System.out.println("the entire list of your tasks is displayed here");
            System.out.println(toDo);
        }
    }

    public void showByName(String nameOfCase){
        int index = find(nameOfCase);
        if (index != -1){
            System.out.println(toDo.get(index));
        } else {
            System.out.println("Case " + nameOfCase + " not found");
        }
    }

    private int find(String nameOfCase){
        for (int i = 0; i < toDo.size(); i++) {
            if (toDo.get(i).get(0).equals(nameOfCase)){
                return i;
            }
        }
        return -1;
    }

    private List<String> initialList(Task task){
        //initial list of to do.
        return List.of(task.getNameOfTask(),
                task.getDescribe(),
                task.getStatus());
    }
}
