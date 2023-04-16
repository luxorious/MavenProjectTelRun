package homeworks.additionalHomeWorks.multithreading.harbor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserInterface {
    private List<Ship> ships = new CopyOnWriteArrayList<>();
    private Harbor harbor;
    private Control control;

    public UserInterface(Harbor harbor, Control control) {
        this.harbor = harbor;
        this.control = control;
    }

    public void running() {
        System.out.println(menu());
        int switchChoice = UserInput.inputInt("make a choice");
        switch (switchChoice) {
            case 1 -> showAllShips();
            case 2 -> showFreeBerths();
            case 3 -> sendToLoading();
            case 4 -> sendToUnload();
            case 5 -> createShips();
        }
    }

    private String menu() {
        return """
                1 - Show all ships.
                2 - Show free berths.
                3 - Send to loading.
                4 - Send to unloading.
                5 - Add new ship.
                """;
    }

    private void showFreeBerths() {
        System.out.println(harbor.getFreeBerths());
    }

    private void createShips() {
        while (true) {
            Ship ship = new Ship(UserInput.inputInt("Enter max capacity of the ship"),
                    UserInput.input("Input name of ship"));
////////////            ////////////            ////////////            ////////////            ////////////
            addToShipList(ship);
            String addMore = UserInput.input("would you like to add more ships? \n'n' for exit");
            if (addMore.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private void addToShipList(Ship ship) {
        ships.add(ship);
    }

    private void sendToLoading() {
        int numberOfShip = choiceShip();
        control.canLoading(ships.get(numberOfShip), harbor);
    }

    private void sendToUnload() {
        int numberOfShip = choiceShip();
        control.canUnload(ships.get(numberOfShip), harbor);
    }

    private void showAllShips() {
        for (Ship ship : ships) {
            System.out.println(ship);
        }
    }

    private int choiceShip() {
        while (true) {
            int numberOfShip = UserInput.inputInt("Enter number of ship which one you want send to loading you has " +
                    ships.size() + " ships.") - 1;
            if (numberOfShip <= ships.size()) {
//////////////////////////////////////////////////////////////////////////////////////////////////
                return numberOfShip;
            } else {
                System.out.println("Wrong input");
            }
        }
    }

}
