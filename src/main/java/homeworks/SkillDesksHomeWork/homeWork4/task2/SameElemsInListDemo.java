package homeworks.SkillDesksHomeWork.homeWork4.task2;

import homeworks.SkillDesksHomeWork.homeWork4.task1.IntegerListDemo;

import java.util.ArrayList;
import java.util.List;

//        Могут ли реализации интерфейса java.util.List хранить одинаковые
//        элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.
public class SameElemsInListDemo {
    public static void main(String[] args) {
        IntegerListDemo i = new IntegerListDemo();

        ArrayList<IntegerListDemo> li = new ArrayList<>();
        li.add(i);
        li.add(i);
        System.out.println(li);

        List<Integer> example = new ArrayList<>();
        int a = 10;
        example.add(a);
        example.add(a);

        System.out.println(example);
    }
}
