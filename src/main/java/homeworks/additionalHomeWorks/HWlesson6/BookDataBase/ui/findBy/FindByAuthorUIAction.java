package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.findBy;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input books Author");
        String author = scanner.nextLine();
        Optional<List<Book>> bookOpt = Optional.ofNullable(bookDatabase.findByAuthor(author));

        System.out.println(bookOpt);
        // запросите id книги с консоли у пользолвателя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // вывелите на консоль результаты поиска
    }

}
