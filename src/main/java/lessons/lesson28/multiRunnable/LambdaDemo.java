package lessons.lesson28.multiRunnable;

public class LambdaDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("Thread running"));
        thread.start();
    }
}
