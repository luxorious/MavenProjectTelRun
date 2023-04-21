package homeworks.additionalHomeWorks.multithreading.harbor;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class UserInterface {
    private List<Ship> ships = new CopyOnWriteArrayList<>();
    private Harbor harbor;
    private Control control;
    private CountDownLatch countDownLatch;
    private Semaphore semaphore;

    public UserInterface(Harbor harbor, Control control) {
        this.harbor = harbor;
        this.control = control;
    }

    public void running() throws InterruptedException {
        boolean start = true;
        while (start) {
            System.out.println(menu());
            int switchChoice = UserInput.inputInt("make a choice");

            switch (switchChoice) {
                case 1 -> showAllShips();
                case 2 -> showFreeBerths();
                case 3 -> sendToLoading(choiceShip());
                case 4 -> sendToUnload(choiceShip());
                case 5 -> addToShipList();
                case 6 -> {
                    fewShipsUnloading(choiceShips());
                    countDownLatch.await();
                }
                case 7 -> {
                    fewShipsLoading(choiceShips());
                    countDownLatch.await();
                }
                case 8 -> loadUnload(choiceShip());
                case 9 -> unloadLoad(choiceShip());
                case 10 -> showContainersInHarbor();
                case 11 -> start = false;
                default -> System.out.println("Wrong choice");
            }
        }
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
                9 - Send ship to loading and unloading.
                10 - show containers in harbor.
                11 - exit.
                """;
    }

    private void showContainersInHarbor() {
        System.out.println(harbor.getActualCapacity() + " containers in harbor.");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private Ship[] choiceShips() {
        Set<Ship> selectedShips = new HashSet<>();
        while (true) {
            int index = UserInput.inputInt("Choice number of ship") - 1;
            if (index < ships.size()) {
                selectedShips.add(ships.get(index));
            }
            String quit = UserInput.input("For exit press 'n', or choice more ships press any key");
            if (quit.equalsIgnoreCase("n") || selectedShips.size() == ships.size()) {
                Ship[] arrayOfShips = new Ship[selectedShips.size()];
                return selectedShips.toArray(arrayOfShips);
            }
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void fewShipsUnloading(Ship... ships) {
        countDownLatch = new CountDownLatch(ships.length);
        semaphore = new Semaphore(ships.length, true);
        boolean[] freeBerths = new boolean[ships.length];
        for (Ship ship : ships) {
            Thread thread = new Thread(() -> {
                harbor.setFreeBerths(harbor.getFreeBerths() - 1);//////////////////////////////////if not use semaphore
                control.canUnload(ship, harbor);
                countDownLatch.countDown();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                harbor.setFreeBerths(harbor.getFreeBerths() + 1);//////////////////////////////////if not use semaphore
            });
            thread.start();
        }
    }

    public void fewShipsLoading(Ship... ships) {
        countDownLatch = new CountDownLatch(ships.length);
        for (Ship ship : ships) {
            Thread thread = new Thread(() -> {
                control.canLoading(ship, harbor);
                countDownLatch.countDown();
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

    public void unloadLoad(Ship ship) {
        Thread thread = new Thread(() -> {
            control.canLoading(ship, harbor);
            control.canUnload(ship, harbor);
        });
        thread.start();
    }

    public void fewShipsLoadUnload(Ship... ships) {
        countDownLatch = new CountDownLatch(ships.length);
        for (Ship ship : ships) {
            loadUnload(ship);
        }
    }

    private void showFreeBerths() {
        System.out.println(harbor.getFreeBerths());
    }

    private Ship createShips() {
        return new Ship(UserInput.inputInt("Enter max capacity of the ship"), UserInput.input("Input name of ship"));
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

    private void sendToLoading(Ship ship) {
        control.canLoading(ship, harbor);
    }

    private void sendToUnload(Ship ship) {
        control.canUnload(ship, harbor);
    }

    private void showAllShips() {
        for (Ship ship : ships) {
            System.out.println(ship);
        }
    }

    private Ship choiceShip() {
        while (true) {
            int numberOfShip = UserInput.inputInt("Enter number of ship which one you want send to loading you has " + ships.size() + " ships.") - 1;
            if (numberOfShip <= ships.size()) {
//////////////////////////////////////////////////////////////////////////////////////////////////
                return ships.get(numberOfShip);
            } else {
                System.out.println("Wrong input");
            }
        }
    }
}
