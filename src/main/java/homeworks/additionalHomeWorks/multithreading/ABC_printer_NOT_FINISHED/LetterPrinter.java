package homeworks.additionalHomeWorks.multithreading.ABC_printer_NOT_FINISHED;

public class LetterPrinter implements Runnable {
    private String message;
    private boolean flag = true;

    public LetterPrinter(String message) {
        this.message = message;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            while (!flag) {
                System.out.print(message);
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            flag = false;
            notifyAll();
        }
    }


}
