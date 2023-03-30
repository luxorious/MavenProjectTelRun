package lessons.lesson28.multithreading;

public class TouristsCompany {
    public static void main(String[] args) {
        People queue1 = new People(1, "John", "Mark", "Olha", "Victor", "Nikol");
        People queue2 = new People(2,"Ruslan", "Borys", "Ivan", "Nelly", "Alice");

        System.out.println("Start program");

        queue1.start();
        queue2.start();

        System.out.println(queue1.result);
        System.out.println(queue2.result);
    }
}
