package lessons.lesson27.multithreading;

public class UserRunnable {
    public static void main(String[] args) {
        Runnable r = () -> {
            try{
                Thread.sleep(2000);
                System.out.println("Hello world");
                System.out.println("Finish Thread1");
            } catch (InterruptedException err){
                throw new RuntimeException (err);
            }
        };
        System.out.println("Start Program");
        System.out.println("Pause 3sec");

        Thread thread = new Thread(r);
        thread.start();


        System.out.println("finish Program");
        int count = 0;
        for (int i = 0; i < 5000; i++) {
            count++;
        }
        System.out.println(count);

    }
}
