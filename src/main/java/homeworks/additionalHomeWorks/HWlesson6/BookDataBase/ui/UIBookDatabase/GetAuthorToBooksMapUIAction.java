package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIBookDatabase;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

import java.util.Scanner;

public class GetAuthorToBooksMapUIAction implements UIAction {

    BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(bookDatabase.getAuthorToBooksMap());
    }
}
