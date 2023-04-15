package homeworks.additionalHomeWorks.multithreading.Counter;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter count = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                count.add();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                count.sub();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count.getCount() + " result after all operations");
    }
}
