package homeworks.additionalHomeWorks.Arrays.FindElementInArray;

import java.util.Random;
import java.util.Scanner;

public class CreateArray {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public int[] arr(){
        int lengthArr = random.nextInt(50);//scanner.nextInt();
        int[] array1 = new int[lengthArr];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(11);
        }
        return array1;
    }

    public int[] reversedArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int elemFromArr = arr[j];
                arr[j] = arr[i];
                arr[i] = elemFromArr;
            }
        }
        return arr;
    }

    public int[] sortArrMin(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int elem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = elem;
                }
            }

        }
        return arr;
    }

}
