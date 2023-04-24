package homeworks.additionalHomeWorks.multithreading.ABC_printer_NOT_FINISHED;

import java.util.concurrent.CountDownLatch;

public class LetterPrinter implements Runnable {
    private String message;
    private boolean flag = true;
    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public LetterPrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            countDownLatch.countDown();
            System.out.print(message);
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
