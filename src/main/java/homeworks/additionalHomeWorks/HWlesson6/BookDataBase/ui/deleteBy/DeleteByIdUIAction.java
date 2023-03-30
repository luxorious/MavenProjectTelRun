package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;

import java.util.Optional;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input books to delete");
        long id = scanner.nextInt();

        Optional<Boolean> bookOpt = Optional.of(bookDatabase.delete(id));

        System.out.println(bookOpt);
        // запросите id книги с консоли у пользолвателя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // вывелите на консоль результаты поиска
    }
}
