package lessons.lesson8.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysCloneExample {
    public static void main(String[] args) {
        String[] strArr = new String[5];

        strArr[0] = "1";
        strArr[1] = "2";
        strArr[2] = "3";
        strArr[3] = "4";
        strArr[4] = "5";

        System.out.println(Arrays.toString(strArr));

        String[] arr2 = strArr.clone();

        arr2[3] = "12";

        System.out.println(Arrays.toString(strArr));

        Dog[] ourKannel = new Dog[5];

        System.out.println(ourKannel);

        ourKannel[0] = new Dog("dog1");
        ourKannel[1] = new Dog("dog2");
        ourKannel[2] = ourKannel[1];// так робити не бажано бо це той самй обʼкт що і з індексом 0.
        ourKannel[3] = new Dog("dog4");
        ourKannel[4] = new Dog("dog5");

        System.out.println(Arrays.toString(arr2));

        clearArr(arr2);

        System.out.println(Arrays.toString(strArr));

        //для виводу двомірного масиву на екран - Arrays.deepToString(arr)
        // для копіювання двомірних масивів теж -
    }

    public static void clearArr(String[] strArr){ // в жодному разі не можна модифікувати оригінальний масив!!!!!
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "";
        }
    }
}
