package homeworks.SkillDesksHomeWork.homeWork5.task1;


import java.util.ArrayList;
import java.util.List;

public class ListLoopDemo {
    public static void main(String[] args) {
        ListLoop listLoop = new ListLoop();

        List<Integer> list = new ArrayList<>();
        listLoop.fillList(list);
        System.out.println("______________________________________");

        System.out.println(listLoop.forEachLoop(list));
        System.out.println("______________________________________");

        System.out.println(listLoop.classicLoop(list));
        System.out.println("______________________________________");

        System.out.println(listLoop.classicLoop2(list));
        System.out.println("______________________________________");

        System.out.println(listLoop.classicLoop3(list));
        System.out.println("______________________________________");

        System.out.println(listLoop.iterator(list));
        System.out.println("______________________________________");

        System.out.println(listLoop.listIterator(list));
        System.out.println("______________________________________");


    }
}
