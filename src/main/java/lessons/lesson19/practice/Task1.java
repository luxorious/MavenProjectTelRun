package lessons.lesson19.practice;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr;
        try {
            for (int i = 0; i < 10; i++) {
                arr = tryExcept(i);
                System.out.println(Arrays.toString(arr));
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index doesn't exist");
        } catch (ArithmeticException e){
            System.out.println("Can't divide by 0");
        } catch (Exception e){
            System.out.println("Something Went Wrong!");
        }
    }

    static int[] tryExcept(int n){
        int x = 10 / n;
        int y[] = new int[n];
        y[x] = 10;
        return y;
    }
}
