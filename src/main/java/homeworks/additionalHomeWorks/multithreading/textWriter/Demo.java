package homeworks.additionalHomeWorks.multithreading.textWriter;


public class Demo {
    public static void main(String[] args) {
        TextWriter writer = new TextWriter();

        var thread1 = new Thread(writer::write, "thread1");
        var thread2 = new Thread(writer::write, "thread2");
        var thread3 = new Thread(writer::write, "thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
