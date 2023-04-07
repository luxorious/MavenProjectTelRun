package lessons.lesson28.multiThread.multi3;

public class CarApp {
    public static void main(String[] args) {
        var ferrari = new Car("ferrari");
        var bmw = new Car("bmw");
        ferrari.start();
        bmw.start();

        System.out.println("Method continues execution ... main method is execute by thread " +
                Thread.currentThread().getName());
    }
}
