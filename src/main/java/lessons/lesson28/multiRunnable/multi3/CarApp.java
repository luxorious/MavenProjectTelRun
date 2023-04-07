package lessons.lesson28.multiRunnable.multi3;

public class CarApp {
    public static void main(String[] args) {
        var ferrari = new Car("ferrari");
        var bmw = new Car("bmw");

        var ferrariThread = new Thread(ferrari, "my name");
        var bmwThread = new Thread(bmw, "BMW");

        ferrariThread.run();
        bmwThread.run();

        System.out.println("Method continues execution ... main method is execute by thread " +
                Thread.currentThread().getName());
    }
}
