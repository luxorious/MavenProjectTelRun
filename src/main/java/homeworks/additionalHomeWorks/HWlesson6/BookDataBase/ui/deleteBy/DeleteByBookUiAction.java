package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.InputBooksData;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

import java.util.Optional;

public class DeleteByBookUiAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByBookUiAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Book book = InputBooksData.input();

        Optional<Boolean> bookOpt = Optional.of(bookDatabase.delete(book));
        if (bookOpt.get()){
            System.out.println("Book " + book + " successfully deleted!");
        } else {
            System.out.println("Book " + book + " not found in library");
        }
        System.out.println(bookOpt);
    }
}
