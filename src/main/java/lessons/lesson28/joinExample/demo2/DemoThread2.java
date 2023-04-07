package lessons.lesson28.joinExample.demo2;

public class DemoThread2 extends Thread {
    private int result;

    @Override
    public void run() {
        result = 0;
        for (int i = 0; i <= 10; i++) {
            result += i;
        }
    }

    public int getResult() {
        return result;
    }
}
