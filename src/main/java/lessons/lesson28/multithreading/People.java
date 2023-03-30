package lessons.lesson28.multithreading;

public class People extends Thread {

    private String[] names;
    private int numberThread;

    public int result;

    People(int numberThread, String... names) {
        this.names = names;
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        System.out.println("start thread = " + numberThread);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Путівка видана клієнту " + names[i]);
            try {
                sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.println("finish thread - " + numberThread);

        result *= numberThread;
    }
}
