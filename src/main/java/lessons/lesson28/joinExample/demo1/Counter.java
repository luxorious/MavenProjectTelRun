package lessons.lesson28.joinExample.demo1;

public class Counter {
    private int count = 0;
    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount() {
        return count;
    }


}
