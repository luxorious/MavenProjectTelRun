package homeworks.additionalHomeWorks.Arrays.ArrayServicePackage;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean result = service.ifContains(arr, 10);
        boolean expectedResult = true;

        if (result == expectedResult){
            System.out.println("All ok");
        } else {
            System.out.println("actual result - " + result +
                    " expected result " + expectedResult);
        }
    }
}
