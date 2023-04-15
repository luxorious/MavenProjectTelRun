package homeworks.additionalHomeWorks.multithreading.printerScaner;

public class MFUDemo {
    public static void main(String[] args) {
        MFU pr = new MFU(11);

        var print = new Thread(pr::printing, "printing 1");
        var print1 = new Thread(pr::printing, "printing 2");
        var scan = new Thread(pr::scanning, "scan 1");

        print.start();
        scan.start();
        print1.start();

    }
}
