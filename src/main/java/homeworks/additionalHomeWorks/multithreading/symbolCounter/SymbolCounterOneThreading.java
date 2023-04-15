package homeworks.additionalHomeWorks.multithreading.symbolCounter;

public class SymbolCounterOneThreading<T, K> {
    private T[] t;
    private K k;

    public SymbolCounterOneThreading(T[] t, K k) {
        this.t = t;
        this.k = k;
    }

    public void runOneThreading() {
        int counter = 0;
        for (T value : t) {
            if (value.equals(k)) {
                counter++;
            }
        }
        System.out.println("One threading process finished count all elems " + k + " in array - " + counter);
    }
}
