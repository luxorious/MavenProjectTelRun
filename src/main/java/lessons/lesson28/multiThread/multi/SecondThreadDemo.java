package lessons.lesson28.multiThread.multi;

public class SecondThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }
    }
}
