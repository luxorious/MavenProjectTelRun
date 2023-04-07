package lessons.lesson28.multiThread.multi2;

public class MySecondThread extends Thread{
    @Override
    public void run(){
        long sum = 0;
        int counter = (int)(Math.random()*1000);
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println("Thread name is " + getName() + " counter = " + counter +
                " sum = " + sum);
    }
}
