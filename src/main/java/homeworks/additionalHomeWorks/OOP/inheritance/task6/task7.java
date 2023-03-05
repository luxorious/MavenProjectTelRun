package homeworks.additionalHomeWorks.OOP.inheritance.task6;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }
}