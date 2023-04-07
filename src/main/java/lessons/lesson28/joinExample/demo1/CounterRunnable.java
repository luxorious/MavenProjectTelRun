package lessons.lesson28.joinExample.demo1;

public class CounterRunnable implements Runnable{
    private final Counter counter;

    public CounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
