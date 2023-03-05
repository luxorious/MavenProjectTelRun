package homeworks.additionalHomeWorks.Arrays.Array2D;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        CountSumTwoDimensionalArray count = new CountSumTwoDimensionalArray();
        PrintArrayInConsole printArray = new PrintArrayInConsole();

        int[][] arr = count.create();

        printArray.printTwoDimensionalArray(arr);
        System.out.println(count.sumAllElementsInArray(arr));
    }
}
