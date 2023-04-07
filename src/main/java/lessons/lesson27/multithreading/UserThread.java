package lessons.lesson27.multithreading;

public class UserThread {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("Hello World");
                    System.out.println("Finish thread");
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        };

        System.out.println("Start Program");
        System.out.println("Pause 3sec");
        thread.start();
        System.out.println("finish Program");
        int count = 0;
        for (int i = 0; i < 5000; i++) {
            count++;
        }
        System.out.println(count);

    }


}
