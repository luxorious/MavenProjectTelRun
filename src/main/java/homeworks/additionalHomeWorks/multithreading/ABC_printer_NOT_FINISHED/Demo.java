package homeworks.additionalHomeWorks.multithreading.ABC_printer_NOT_FINISHED;

public class Demo {
    public static void main(String[] args) {
//        2. Создать три потока, каждый из которых выводит определенную букву(A, B и C) 5 раз,
//                порядок должен быть именно ABСABСABС. Используйте wait/notify/notifyAll.

        var printA = new Thread(new LetterPrinter("A"));
        var printB = new Thread(new LetterPrinter("B"));
        var printC = new Thread(new LetterPrinter("C"));

        printA.start();
        printB.start();
        printC.start();
        System.out.println("END");
    }
}
