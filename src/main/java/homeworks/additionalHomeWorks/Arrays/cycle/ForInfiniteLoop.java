package homeworks.additionalHomeWorks.Arrays.cycle;

public class ForInfiniteLoop {
    public static void main(String[] args) {
        int l = 0;
        for (int i = 0; i < 1; i--) {
            // for stop need press "fn + command + f2"
            System.out.println("Am moving to minus infinity " + i);
            if (i <= -10) {
                System.out.println("oops");
                break;
            }
        }
    }
}