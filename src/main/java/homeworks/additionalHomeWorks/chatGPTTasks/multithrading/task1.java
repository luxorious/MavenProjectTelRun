package homeworks.additionalHomeWorks.chatGPTTasks.multithrading;

import java.util.ArrayList;
import java.util.List;

public class task1 {
//    Створіть програму, що виконує підрахунок суми елементів у масиві в багатьох потоках.
//    Потоки повинні обробляти різні ділянки масиву. Результати обчислень повинні бути
//    зібрані в одну суму і виведені на екран.

    public static void main(String[] args) {
        long sum2 = 0;
        long sum3 = 0;
        long sum4 = 0;
        long sum5 = 0;
        long sum6 = 0;
        long sum7 = 0;
        long sum8 = 0;
        long sum9 = 0;
        long sum10 = 0;
        List<Integer> list = new ArrayList<>();
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(numThreads + " numberrrrrrrr");

        int startIndex = 0;
        int endIndex = 1000000;
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
//                    long sum = sumElemsFromList( list,startIndex, endIndex);
//                    System.out.println(sum);
                }
            };
            thread.start();
            startIndex = endIndex;
            endIndex += 1000000;
        }

    }

    public static Long sumElemsFromList(List<Integer> listForCount, int startIndex, int endIndex){
        long sum = 0;
        if (startIndex < 0 || endIndex > listForCount.size()){
            System.out.println("wrong index!!!");
        }
        for (int i = startIndex; i < endIndex; i++) {
            sum+=i;
        }
        return 0L;
    }
}
