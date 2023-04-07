package lessons.lesson28.multiRunnable;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        thread.start();
    }
}
