package lessons.lesson18.inputOutput;

public class ArrayExamplePrint {
    public static void main(String[] args) {
        int[][] arr = {{11,22,33},{111,222,333},{1111,22222,33333}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
