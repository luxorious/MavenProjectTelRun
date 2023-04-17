package homeworks.additionalHomeWorks.multithreading.harbor;

public class Control {
    private Harbor harbor;
    private Ship ship;
    public Control(Harbor harbor) {
        this.harbor = harbor;
//        this.ship = ship;
    }

    public void canUnload(Ship ship, Harbor harbor) {
        int containers = quantityContainers ("enter the number of containers to unload the entire ship enter 'a'");
        if (containers == -1){
            harbor.unload(ship);
        } else {
            harbor.unload(ship, containers);
        }
    }

    public void canLoading(Ship ship, Harbor harbor) {
        int containers = quantityContainers("enter the number of containers to loading the entire ship enter 'a'");
        if (containers == -1) {
            harbor.loading(ship);
        } else {
            harbor.loading(ship, containers);
        }
    }

    private boolean isFreeBerths() {
        return this.harbor.getFreeBerths() > 0;
    }

    private int quantityContainers(String message) {
        while (true) {
            try {
                String input = UserInput.input(message);
                if (isFreeBerths() && input.equalsIgnoreCase("a")) {
                    return -1;
                } else if (isFreeBerths()) {
                    return Integer.parseInt(input);
                }
            } catch (NumberFormatException e) {
                System.out.println("wrong input");
            }
        }
    }

}
