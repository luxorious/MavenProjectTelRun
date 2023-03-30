package lessons.lesson28.multithreading;

public class Example2 {
    public static void main(String[] args) {

        int count = 0;

        long timeStart = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println("total numbers of prime - " + count);
        System.out.println(System.currentTimeMillis() - timeStart);
    }
}
