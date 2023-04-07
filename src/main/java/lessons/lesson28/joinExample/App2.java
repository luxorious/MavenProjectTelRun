package lessons.lesson28.joinExample;

import java.util.concurrent.TimeUnit;

public class App2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        System.out.println("Finished");
    }
}
