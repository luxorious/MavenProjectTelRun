package homeworks.additionalHomeWorks.Arrays.Array2D;

import java.util.Random;

public class CreateArray {
    public Random random = new Random();
    protected int row = random.nextInt(10);
    protected int column = random.nextInt(10);
    protected int[][] arr = new int[row][column];
    public int[][] create(){
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        return arr;
    }
}
