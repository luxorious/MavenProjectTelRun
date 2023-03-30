package homeworks.additionalHomeWorks.lesson9HW.wordFinder;

public class UniqueWordFinderDemo {

    public static void main(String[] args) {
        UniqueWordFinder uf = new UniqueWordFinder();

        String text = "some text, some unique words";
        text = text.replaceAll("[^A-Za-z0-9 ]", "");

        System.out.println(text);
        System.out.println(uf.find(text));
    }
}
