package lessons.lesson28.multiRunnable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }
}

