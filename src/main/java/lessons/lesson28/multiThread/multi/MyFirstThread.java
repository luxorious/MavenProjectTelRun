package lessons.lesson28.multiThread.multi;

public class MyFirstThread extends Thread{
    @Override
    public void run(){
        System.out.println("I am Thread! My name is " + getName());
    }
}
