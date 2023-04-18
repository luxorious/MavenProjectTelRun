package lessons.lesson31.object;

public class TestCrossbow extends Thread {
    public static void main(String[] args) {
        Crossbow crossbow = new Crossbow();

        new Thread(crossbow::fire).start();
        new Thread(crossbow::reload).start();

    }
}
