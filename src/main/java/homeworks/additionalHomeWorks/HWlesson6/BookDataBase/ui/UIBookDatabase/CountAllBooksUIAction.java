package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIBookDatabase;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

public class CountAllBooksUIAction implements UIAction {

    BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println();
        int booksQuantity = bookDatabase.countAllBooks();

        System.out.println("The number of books in library - " + booksQuantity);
    }
}
