package homeworks.additionalHomeWorks.multithreading.harbor;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
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
        boolean start = true;
        while (start) {
            System.out.println(menu());
            int switchChoice = UserInput.inputInt("make a choice");

            switch (switchChoice) {
                case 1 -> showAllShips();
                case 2 -> showFreeBerths();
                case 3 -> sendToLoading();
                case 4 -> sendToUnload();
                case 5 -> addToShipList();
//                case 6 -> fewShipsLoading(choiceShips());
//                6 - Send few ships to unloading.
//                7 - Send few ships to loading.
//                8 - Send ship to unloading and loading.
                case 9 -> start = false;
                default -> System.out.println("Wrong choice");
            }
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    private Ship[] choiceShips() {
//        List<Ship> selectedShips = new ArrayList<>();
//        while (true) {
//            int index = UserInput.inputInt("Choice number of ship");
//            selectedShips.add(ships.get(index));
//            String quit = UserInput.input("For exit press 'n'");
//            if (quit.equalsIgnoreCase("n") ||
//                    selectedShips.size() == ships.size()) {
//                return selectedShips.toArray(new Ship[]);
//            }
//        }
//    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void fewShipsUnloading(Ship... ships) {
        for (Ship ship : ships) {
            Thread thread = new Thread(() -> {
                control.canUnload(ship, harbor);
            });
            thread.start();
        }
    }

    public void fewShipsLoading(Ship... ships) {
        for (Ship ship : ships) {
            Thread thread = new Thread(() -> {
                control.canLoading(ship, harbor);
            });
            thread.start();
        }
    }

    public void loadUnload(Ship ship) {
        Thread thread = new Thread(() -> {
            control.canUnload(ship, harbor);
            control.canLoading(ship, harbor);
        });
        thread.start();
    }

    public void fewShipsLoadUnload(Ship... ships) {
        for (Ship ship : ships) {
            loadUnload(ship);
        }
//        for (Ship ship: ships) {
//            Thread thread = new Thread(() -> {
//                control.canUnload(ship, harbor);
//                control.canLoading(ship, harbor);
//            });
//            thread.start();
//        }
    }

    private String menu() {
        return """
                1 - Show all ships.
                2 - Show free berths.
                3 - Send to loading.
                4 - Send to unloading.
                5 - Add new ship.
                6 - Send few ships to unloading.
                7 - Send few ships to loading.
                8 - Send ship to unloading and loading.
                9 - exit.
                """;
    }

    private void showFreeBerths() {
        System.out.println(harbor.getFreeBerths());
    }

    private Ship createShips() {
        return new Ship(UserInput.inputInt("Enter max capacity of the ship"),
                UserInput.input("Input name of ship"));
    }

    private void addToShipList() {
        while (true) {
            Ship ship = createShips();
////////////            ////////////            ////////////            ////////////            ////////////
            ships.add(ship);
            String addMore = UserInput.input("would you like to add more ships? \n'n' for exit");
            if (addMore.equalsIgnoreCase("n")) {
                break;
            }
        }
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
