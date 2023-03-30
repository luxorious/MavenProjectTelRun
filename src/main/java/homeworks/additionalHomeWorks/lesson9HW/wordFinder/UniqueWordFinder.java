package homeworks.additionalHomeWorks.lesson9HW.wordFinder;


//Найти в тексте все уникальные слова использую для этого java.util.Set.
//
//        Создайте класс UniqueWordFinder и метод:
//
//        Set<String> find(String text);
//
//        Реализуйте и протестируйте данный метод.


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordFinder {

    public Set<String> find(String text){
        Set<String> uniqueWords = new TreeSet<>();

        String[] tmpArray = text.split(" ");
        System.out.println(Arrays.toString(tmpArray));

        for (int i = 0; i < tmpArray.length; i++) {
            uniqueWords.add(tmpArray[i]);
        }
        return uniqueWords;
    }
}
