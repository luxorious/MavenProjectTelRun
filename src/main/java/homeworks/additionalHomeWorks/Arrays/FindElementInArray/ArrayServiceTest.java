package homeworks.additionalHomeWorks.Arrays.FindElementInArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayServiceTest {
    private static  FindSameNumbers findSame =  new FindSameNumbers();
    private static int expectedFirstIndex = 2;
    private static int expectedLastIndex = 3;
    private static final int[] expectedReversedArray = new int[]{43, 22, 11, 82, 5, 3, 3, 2, 1};
    static int numberForChange = 5;
    private static final int[] expectedMinArr = new int[] {1, 2, 3, 3, 5, 11, 22, 43, 82};

    public static void main(String[] args) {
        findSame.returnedArray = new int[] {1, 2, 3, 3, 5, 82, 11, 22, 43};
        findSame.number = 3;
        firstElemTest();
        lastElemTest();
        allElemsTest();

//        these 2 lines are commented out because they interfere with the functionality of the code.
//        changeFirstElemTest();
//        changeAllElemTest();


        reverseArrayTest();
        sortArrMin();

    }

    public static void firstElemTest(){
        if ( findSame.FindFirstElementFromArray() == expectedFirstIndex){
            System.out.println("first elem - working " + expectedFirstIndex);
        } else {
            System.out.println("not working: I waited index - " + findSame.returnedArray[expectedFirstIndex] +
                    " but received " + findSame.FindFirstElementFromArray());
        }
    }

    public static void lastElemTest(){
        if (findSame.FindLastElementFromArray() == expectedLastIndex){
            System.out.println("Last elem - working " + expectedLastIndex);
        } else {
            System.out.println("not working: I waited index - " + findSame.returnedArray[expectedLastIndex] +
                    " but received " + findSame.FindLastElementFromArray());
        }
    }

    public static void allElemsTest(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> testedArr = findSame.findAllIndexOfElems();
        if (testedArr.equals(arr)){
            System.out.println("Array " + arr + " = Array " + testedArr);
        } else{
            System.out.println("Bad test! Array " + arr + " != Array " + testedArr);
        }
    }

    public static void changeFirstElemTest(){
        if (findSame.FindFirstElementFromArray(numberForChange)){
            System.out.println("Change elem - working");
        } else {
            System.out.println("Not working");
        }
    }

    public static void changeAllElemTest(){
        if (findSame.changeAllElems(5)){
            System.out.println("Change All - is working");
        } else {
            System.out.println("Change All - are not working");
        }
    }

    public static void reverseArrayTest(){
        int[] result = findSame.reversedArray(findSame.returnedArray);
        if (Arrays.equals(result, expectedReversedArray)){
            System.out.println("Reversed Array is work");
        } else {
            System.out.println("reversed Array is NOT working - expected result: " +
                    Arrays.toString(expectedReversedArray) + " but received - " +
                    Arrays.toString(result));
        }
    }

    public static void sortArrMin(){
        if (Arrays.equals(findSame.sortArrMin(findSame.returnedArray), expectedMinArr)){
            System.out.println("Min Array is work");
        } else {
            System.out.println("Min Array is NOT working - expected result: " +
                    Arrays.toString(expectedMinArr) + " but received - " +
                    Arrays.toString(findSame.sortArrMin(findSame.returnedArray)));
        }
    }
}

