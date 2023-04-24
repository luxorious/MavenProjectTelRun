package homeworks.additionalHomeWorks.multithreading.library;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Customer {

    private String name;
    private final int id;

    public void takeToHome(Book book){
        sleep();
    }

    public void readInLibrary(Book book){
        sleep();
    }

    private void sleep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
