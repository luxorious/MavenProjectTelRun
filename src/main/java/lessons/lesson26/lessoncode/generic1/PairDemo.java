package lessons.lesson26.lessoncode.generic1;

public class PairDemo {
    public static void main(String[] args) {
        PairInteger firstPair = new PairInteger(25,25);
        PairDouble secondPair = new PairDouble(20.5, 100.75);

        PairUniversal<String, Integer> universalPair1 = new PairUniversal<>("Ruslan", 25);
        PairUniversal<Integer, User> universalPair2 = new PairUniversal<>(1, new User("Ruslan", 25));


    }
}
