package lessons.lesson32;

import java.util.concurrent.Phaser;

public class ForceTerminationDemo {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(1);
        for (int i = 0; i < 5; i++) {
            Thread th = new Thread(new Task(phaser));
            th.start();
        }
        Thread.sleep(5000);
//        phaser.forceTermination();
        System.out.println("Main : phaser is ended");
    }
}

class Task implements Runnable {
    private Phaser phaser;

    public Task(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " Phase 1");
        phaser.arriveAndAwaitAdvance();

        System.out.println("Thread " + Thread.currentThread().getName() + " Phase 2");
        phaser.arriveAndAwaitAdvance();

        System.out.println("Thread " + Thread.currentThread().getName() + " Phase 3");
        phaser.arriveAndAwaitAdvance();

        System.out.println("Thread " + Thread.currentThread().getName() + " Phase 4");
        phaser.arriveAndAwaitAdvance();
    }
}
