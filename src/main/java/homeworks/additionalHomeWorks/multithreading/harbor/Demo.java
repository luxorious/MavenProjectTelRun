package homeworks.additionalHomeWorks.multithreading.harbor;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Harbor harbor = new Harbor(100, 2);
        harbor.setActualCapacity(100);
        Control control = new Control(harbor);
        UserInterface ui = new UserInterface(harbor, control);

        ui.running();

//        Ship ship = new Ship(4, "s1");
//
//        control.canLoading(ship, harbor);
//        System.out.println(ship);
    }
}
