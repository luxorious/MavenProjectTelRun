package lessons.lesson4.ArrObj;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i * 5;
        }
        System.out.println(Arrays.toString(intArr));

        Cat [] catArr = new Cat[3];

        Cat cat1 = new Cat("cat1", "black");
        Cat cat2 = new Cat("cat2", "grey");
        Cat cat3 = new Cat("cat3", "violet");

        catArr[0] = cat1;
        catArr[1] = cat2;
        catArr[2] = cat3;

        System.out.println(cat2.color);

        for (int i = 0; i < catArr.length; i++) {
            System.out.println(catArr[i].toString());

        }
        catArr[1].meow();
    }
}
