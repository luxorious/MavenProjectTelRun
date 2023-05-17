package homeworks.additionalHomeWorks.chatGPTTasks.recursion;

public class Fibonacci {
    public static void printAllSum(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.print(summa(i) + " ");
        }
    }

    public static int summa(int n) {
        if (n < 2) {
            return n;
        } else {
            return summa(n - 1) + summa(n - 2);
        }
    }


    public static class FibDemo {
        public static void main(String[] args) {
            Fibonacci.printAllSum(10);
        }
    }
}

