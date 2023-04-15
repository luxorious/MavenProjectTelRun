package homeworks.additionalHomeWorks.multithreading.harbor;

public class Demo {
    public static void main(String[] args) {
        int actualCapacity = 3;
        int quantityNeedsToLoad = 2;

        if ((actualCapacity - quantityNeedsToLoad) >= 0) {
//            ship.setActualCapacity(quantityNeedsToLoad);
            actualCapacity -= quantityNeedsToLoad;
            System.out.println(actualCapacity);
        }
    }
}
