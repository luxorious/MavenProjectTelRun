package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIBookDatabase;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.InputBooksData;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

public class ContainsUIAction implements UIAction {

    BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Book book = InputBooksData.input();

        bookDatabase.contains(book);
        if (bookDatabase.contains(book)){
            System.out.println("Book \"" + book.getTitle() + "\" in library.");
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" not in library");
        }
    }
}
