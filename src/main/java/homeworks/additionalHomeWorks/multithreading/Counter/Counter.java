package homeworks.additionalHomeWorks.multithreading.Counter;

public class Counter {
//    Написать класс Counter, в котором есть одно целочисленное поле count (инициализировано нулем).
//    В классе реализовать два метода add и sub. Первый метод увеличивает значение count на 1,
//    второй - уменьшает на 1. Запустить два потока: в первом в цикле (можно 100 раз) вызвать
//    метод add, во втором потоке столько же раз вызвать метод sub. В цикле, после каждой итерации,
//    лучше поставить Thread.sleap, чтобы лучше смоделировать ситуацию. Добиться синхронизацией потоков,
//    чтобы значение count после всех операций было равно 0. Пример, одного потока:

    private int count = 0;

    public synchronized void add(){
        count++;
    }

    public synchronized void sub(){
        count--;
    }

    public int getCount() {
        return count;
    }
}



