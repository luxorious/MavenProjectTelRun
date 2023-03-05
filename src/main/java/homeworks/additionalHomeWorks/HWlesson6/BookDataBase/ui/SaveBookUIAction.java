package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input book data for save in dataBase");
        System.out.println("Input Book Author");
        String author = scanner.nextLine();
        System.out.println("Input Book Title");
        String title = scanner.nextLine();
        System.out.println("Input Book Year Of Issue");
        String yearOfIssue = scanner.nextLine();

        Book book = new Book(author, title, yearOfIssue);
        bookDatabase.save(book);
        // запросите все данные о книге с консоли у пользолвателя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
    }

}
