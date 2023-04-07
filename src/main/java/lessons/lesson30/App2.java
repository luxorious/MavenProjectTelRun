package lessons.lesson30;

public class App2 {
    public static void main(String[] args) {
        var worker = new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            var threadName = Thread.currentThread().getName();
            System.out.println("Thread is finishing its executing with name " + threadName);
        }, "worker");

        var daemon = new Thread(()->{
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                var threadName = Thread.currentThread().getName();
                    System.out.println("Thread is executing with name" + threadName);
            }
        }, "demon");

        daemon.setDaemon(true);
        worker.start();
        daemon.start();

        var threadName = Thread.currentThread().getName();
        System.out.println("Thread is finishing its executing with name" + threadName);

    }
}
