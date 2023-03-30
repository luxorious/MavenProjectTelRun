package homeworks.additionalHomeWorks.OOP.inheritance.task6;

class Porsche911 extends Car {

    private int topSpeed;
    //конструктор родительского класса создается при помощи ключевого слова super
    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;

    }
}
