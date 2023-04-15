package homeworks.additionalHomeWorks.multithreading.printerScaner;

public class MFU {
    //    3. Написать класс МФУ на котором возможны одновременная печать и сканирование документов,
//    при этом нельзя одновременно печатать два документа или сканировать (при печати
//в консоль выводится сообщения "отпечатано 1, 2, 3,... страницы", при сканировании
//то же самое только "отсканировано...", вывод в консоль с периодом в 50 мс.)
    private int pages;

    public MFU(int pages) {
        this.pages = pages;
    }

    public synchronized void printing() {
        service("printed ");
    }

    public synchronized void scanning(){
        service("scanned ");
    }

    private void service(String message){
        System.out.print(message);
        for (int i = 1; i <= pages; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            if (i != pages){
                System.out.print(i + ", ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(" pages");
        System.out.println(Thread.currentThread().getName());
    }

}


