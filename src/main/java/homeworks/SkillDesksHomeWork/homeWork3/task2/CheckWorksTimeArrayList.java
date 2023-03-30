package homeworks.SkillDesksHomeWork.homeWork3.task2;

import java.util.ArrayList;

public class CheckWorksTimeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < 10001; i++) {
            intArr.add(i);
        }
        long timeFirstsLoop = System.currentTimeMillis();

        for (int i = 1; i < 10001; i++) {
            intArr.remove(0);
        }
        long timeSecondsLoop = System.currentTimeMillis();
        System.out.println(intArr);

        System.out.println("added 10 000 elems in ArrayList was - " +
                (timeFirstsLoop - startTime) + " millisecond");
        System.out.println("removed 10 000 elems from ArrayList was - " +
                (timeSecondsLoop - timeFirstsLoop) + " millisecond");
    }
//    Создать список ArrayList. Провести 10 тысяч вставок, удалений новых
//    элементов и измерить сколько времени в миллисекундах занимает 10 тысяч
//    вставок для каждого списка, и  сколько времени занимает 10 тысяч удалений
//    для каждого списка
}
