package lessons.lesson28.lessonCode;

public class MultiExample2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("User thread 1 is running");
        });
        Thread thread2 = new Thread(()->{
            System.out.println("User thread 2 is running");
        });

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}

