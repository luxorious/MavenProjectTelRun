package lessons.lesson28.multithreading;

public class OneThreading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        b *= a;

        //do something (a);
        //do something (b);
        System.out.println(a);
        System.out.println(b);
    }
}
