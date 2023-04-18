package homeworks.additionalHomeWorks.multithreading.harbor;

public class Demo {
    public static void main(String[] args) {
        Harbor harbor = new Harbor(100, 3);
        harbor.setActualCapacity(100);
        Control control = new Control(harbor);
        UserInterface ui = new UserInterface(harbor, control);

        ui.running();
    }
}
