package homeworks.SkillDesksHomeWork.homeWork4.task1;

import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
//1) В классе IntegerListDemo создайте список целых чисел.
        ArrayList<Integer> intArr = new ArrayList<>();

        for (int i = 5; i < 10; i++) {
            intArr.add(i);
        }
//добавить в список элемент (в начало и в конец)
        intArr.add(0, 3);//add by index.
        intArr.add(-1); // add in end of list.

//узнать длину списка
        System.out.println("length of Array list - " + intArr.size());

//удалить элемент из списка (по индексу и без)
        intArr.remove(2); // remove by index.
        System.out.println(intArr.remove(new Integer(9))); //remove by value. return true if element deleted.

//узнать пустой список или нет
        System.out.println(intArr.isEmpty());//check if arr empty, return true if empty.

//обойти список и вывести на консоль каждый элемент.
        for(int num:intArr){
            System.out.println(num);
        }
    }
}
