package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.strategyPatern;

//Разработка UI (User Interface) для интерфейса BookDatabase.

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabase;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabaseImpl;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.SaveBookUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIBookDatabase.ContainsUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIBookDatabase.CountAllBooksUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.UIBookDatabase.GetAuthorToBooksMapUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy.DeleteByAuthorUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy.DeleteByBookUiAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy.DeleteByIdUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.deleteBy.DeleteByTitleUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.findBy.FindByAuthorUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.findBy.FindByIdUIAction;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui.findBy.FindByTitleUIAction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByBookUiAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new GetAuthorToBooksMapUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

    //пункти меню
    private void menu(){
        String menu = """
                1 - Save Book UIAction

                2 - Find By Id UIAction
                3 - Find By Author UIAction
                4 - Find By Title UIAction

                5 - Delete By IdU IAction
                6 - Delete By Book UiAction
                7 - Delete By Author UIAction
                8 - Delete By Title UIAction

                9 - Count All Books UIAction
                10 - Contains UIAction
                11 - Get Author To Books Map UIAction""";
        System.out.println(menu);
    }

}

//    В классе BookLibrary с помощью структуры данных мап реализован
//        дизайн паттерн Strategy (стратегия).
