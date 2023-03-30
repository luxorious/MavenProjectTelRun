package additionalLessons.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = generationRandomListOfIntegers(10, 10);
//        List<Integer> list1 = new ArrayList<>(List.of(2,3,5,1,6,5));

        System.out.println(list);
        System.out.println(task3(list));
    }

//    public static Integer task3(List<Integer> list) {
////        Знайти найбільший спільний дільник для списку цілих чисел,
////        використовуючи Stream API.
////        дільник не може бути більшим ніж мінімальне число
////        дільник не може бути більшим ніж максимальне число
////        непарне число може ділитись на 1 і на саме себе
//
////  1 - пройтись циклом по усіх числах і ділити кожне на кожне,
//        // 2,5,2,7,4,8,4,6,5,8
//        // 7,7,7,7,7,7,7,7,7,7
//        // 4,6,8,10
//        Integer general = list.stream()
//                .flatMap(e -> list.stream()
//                        .filter(l -> e % l == 0))
//                .min(Integer::compare).get();
//
//        return general;
//    }

    static Integer task3(List<Integer> list) {
        int general = 1;
        Integer minNumberFromList = list.stream()
                .min(Integer::compare).get();

        int counter = 0;
        int i = 2;
        while (i <= minNumberFromList) {
            for (int elem : list) {
                if (elem % i == 0) {
                    counter++;
                }
            }
//            System.out.println("counter - " + counter + " : " + list.size());
            if (counter == list.size()){
                general = i;
            }
            counter = 0;
            i++;
        }
        return general;
    }

    public static List<Integer> generationRandomListOfIntegers(final int counter, final int bound) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            randomList.add(new Random().nextInt(1, bound + 1));
        }
        return randomList;
    }
}
