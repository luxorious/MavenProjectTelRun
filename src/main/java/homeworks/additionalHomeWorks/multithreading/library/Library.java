package homeworks.additionalHomeWorks.multithreading.library;

import lombok.Getter;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

@Getter
public class Library {
//    Написать программу, моделирующую работу библиотеки. В библиотеке доступны к
//    чтению несколько книг. Некоторые из них можно выдавать на руки некоторые только
//    в читальный зал. Посетители могут брать одновременно по несколько книг на руки
//    и в читальный зал. Использовать можно все знания из Java, включая многопоточность.
    private int tables;

    private Semaphore semaphore;
    private CountDownLatch countDownLatch;
    private List<Book> books;

    public Library(int tables, List<Book> books){
        this.tables = tables;
        this.books = books;
        this.semaphore = new Semaphore(tables);
        this.countDownLatch = new CountDownLatch(tables);
    }
}
