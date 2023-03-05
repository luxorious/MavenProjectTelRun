package homeworks.additionalHomeWorks.HWLection2.task2;

import java.util.Random;

public class ArrayCopyTest {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (random.nextInt(100));
        }

        System.out.println(arrayCopy.copyArr(arr, 59,88));
    }
}
