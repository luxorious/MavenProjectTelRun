package lessons.lesson28.lessonCode;

public class MultiExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(8);
        Thread thread = new Thread(){
            @Override
            public void run(){
                Thread.currentThread().setName("My name");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        };
        thread.start();
    }
}
