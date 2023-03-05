package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input author for delete");
        String author = sc.nextLine();
        bookDatabase.deleteByAuthor(author);
    }
}
