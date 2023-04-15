package homeworks.additionalHomeWorks.multithreading.symbolCounter;

public class SymbolCounterRunnable<T, K> implements Runnable {
    //    1. Дан массив n-элементов. Вычислить колличество заданного символа K.
//    Выполнить обработку массива двумя способами: без потоков и с потоками.
    private T[] t;
    private K k;
    public String message;

    public SymbolCounterRunnable(T[] t, K k, String message) {
        this.t = t;
        this.k = k;
        this.message = message;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        int counter = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i].equals(k) || t[i] == k) {
                counter++;
            }
        }
        System.out.println("Multi threading process finished count all elems " + k + " in array - " + counter);
        System.out.println(message);
    }
}
