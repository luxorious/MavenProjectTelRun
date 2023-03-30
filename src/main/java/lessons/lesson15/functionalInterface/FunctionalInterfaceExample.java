package lessons.lesson15.functionalInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> biFunction = new ToIntBiFunction<Integer, Integer>() {
            @Override
            public int applyAsInt(Integer a, Integer b) {
                System.out.println(a*b);
                return a * b;
            }
        };

        operationsWithTwoNumbers(1,2, biFunction);
    }

    public int sum(int a, int b){
        return a + b;
    }

    public static int mult(int a, int b) {return a*b;}

    public static void operationsWithTwoNumbers(int a, int b, ToIntBiFunction<Integer, Integer> function){
        function.applyAsInt(a,b);
    }
}
