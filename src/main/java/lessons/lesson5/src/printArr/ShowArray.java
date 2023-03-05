package lessons.lesson5.src.printArr;

public class ShowArray {

    public static void main(String[] args) {
        CreateArray createArray = new CreateArray();

        for (int i = 0; i < createArray.create().length; i++) {
            System.out.println(createArray.create()[i]);
        }
        System.out.println();
        createArray.add();

    }

}
