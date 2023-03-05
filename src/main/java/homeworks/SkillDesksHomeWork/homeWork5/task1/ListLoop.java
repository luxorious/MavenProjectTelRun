package homeworks.SkillDesksHomeWork.homeWork5.task1;

import java.util.*;

public class ListLoop {
    private Random rnd = new Random();
    public List<Integer> fillList(List<Integer> array){
        long startTime = System.currentTimeMillis();
        int tmp = 0;
        for (int i = 0; i < 10_000_000; i++) {
            tmp = i;
            array.add(rnd.nextInt(10_000_000));
//            array.add(tmp);
        }
        System.out.println("Added " + (tmp + 1) + " numbers in ArrayList - "
                + (System.currentTimeMillis() - startTime) + " millis.");
        return array;
    }

    public String forEachLoop(List<Integer> array){
        long startTime = System.currentTimeMillis();
        for (int number: array) {
            int tmp = number;
        }
        return ("for each loop in ArrayList - "
                + (System.currentTimeMillis() - startTime) + " millis.");
    }

    public String classicLoop(List<Integer> array){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++) {
            array.size();
        }
        return ("classic loop in ArrayList - "
                + (System.currentTimeMillis() - startTime) + " millis.");
    }
    public String classicLoop2(List<Integer> array){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++) {
            int tmp = array.size();
        }
        return ("classic loop2 in ArrayList - "
                + (System.currentTimeMillis() - startTime) + " millis.");
    }

    public String classicLoop3(List<Integer> array){
        long startTime = System.currentTimeMillis();
        for (int i = array.size(); i >= 0; i--) {
            int tmp = array.size();
        }
        return ("classic loop3 in ArrayList - "
                + (System.currentTimeMillis() - startTime) + " millis.");
    }

    public String iterator(List<Integer> array){
        long startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = array.iterator();

        while (iterator.hasNext()){
            int tmp = iterator.next();
        }
        return ("iterator in ArrayList - "
                + (System.currentTimeMillis() - startTime) + " millis.");
    }

    public String listIterator(List<Integer> array){
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = array.listIterator();

        while (iterator.hasNext()){
            int tmp = iterator.next();
        }
        return ("iterator in ArrayList - "
                + (System.currentTimeMillis() - startTime) + " millis.");
    }
}
