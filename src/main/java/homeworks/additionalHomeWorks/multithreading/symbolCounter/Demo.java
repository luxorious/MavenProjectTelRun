package homeworks.additionalHomeWorks.multithreading.symbolCounter;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }
        Integer numberForSearch = 4;
        SymbolCounterRunnable<Integer, Integer> counterMulti = new SymbolCounterRunnable<>(numbers, numberForSearch, "1");
        SymbolCounterOneThreading<Integer, Integer> counterOneTh = new SymbolCounterOneThreading<>(numbers, numberForSearch);
        SymbolCounterRunnable<Integer, Integer> multi2 = new SymbolCounterRunnable<>(numbers,numberForSearch, "2");

        var thread1 = new Thread(counterMulti);
        var thread2 = new Thread(multi2);

        thread1.start();
        thread2.start();
        counterOneTh.runOneThreading();
        System.out.println("main finished");
    }
}
