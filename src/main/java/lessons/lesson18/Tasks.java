package lessons.lesson18;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        arr = Arrays.stream(arr)
                .map(x->x+10)
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
