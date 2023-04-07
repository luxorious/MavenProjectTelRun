package lessons.lesson28.joinExample;

public class App1 {
    public static void main(String[] args) throws InterruptedException {
        var threadTwo = new Thread(() -> {
            try {
               Thread.sleep(2000);
               int counter = 0;
                for (int i = 0; i < 1000; i++) {
                    counter++;
                }
                var thread = Thread.currentThread().getName();
                System.out.println(thread + " has finished, counter = " + counter);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }, "counter thread");

        threadTwo.start();
        threadTwo.join();
        System.out.println("main method executing");
    }
}
