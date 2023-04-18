package lessons.lesson31.synchronize;

public class Ex1 {

    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public synchronized void run() {
                counter = 0;
                for (int i = 0; i < 5; i++) {
                    counter += 1;
                    System.out.println(Thread.currentThread().getName() + " : " + counter);

                }
            }
        };



        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
