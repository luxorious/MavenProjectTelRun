package lessons.lesson5.src.printArr;

import java.util.Random;

public class CreateArray {
    Random random = new Random();

    private int lengthArr = random.nextInt(50);
    private int[] arr = new int[3];

    public CreateArray() {
        this.arr = arr;
    }

    public int[] create(){
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = random.nextInt(10);
        }
        return this.arr;
    }

    public void add(){
        for (int i = 0; i < this.arr.length; i++) {
            System.out.println(this.arr[i] += 2);
        }
    }
}
