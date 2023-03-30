package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input title for delete");
        String title = scanner.nextLine();

        bookDatabase.deleteByTitle(title);
    }
}
