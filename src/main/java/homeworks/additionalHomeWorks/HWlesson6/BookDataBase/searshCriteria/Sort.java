package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static List<Book> sorting(int choiceOfSearch, List<Book> library){
        if (choiceOfSearch == 1){
//            sorted by author;
            Collections.sort(library, Comparator.comparing(Book::getAuthor));
            return library;
        } else if (choiceOfSearch == 2){
            //sorted by title
            Collections.sort(library, Comparator.comparing(Book::getTitle));
            return library;
        } else if (choiceOfSearch == 3){
            //sorted by year
            Collections.sort(library, Comparator.comparing(Book::getYearOfIssue));
            return library;
        } else {
            return library;
        }
    }
}
