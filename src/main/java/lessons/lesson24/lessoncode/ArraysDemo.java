package lessons.lesson24.lessoncode;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] newArray = {1,2,3};

        Queue<String> queue = new PriorityQueue<>(List.of("B", "A", "C", "B", "A", "C"));
        System.out.println(queue);

    }
}
