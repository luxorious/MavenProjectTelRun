package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.List;

public interface SearchCriteria {

    final int NUMBERS_OF_BOOKS = 2;
    boolean match(Book book);

    List<Book> paging(int page, List<Book> library);

    default List<Book> sort(int choiceOfSearch, List<Book> library){
        return Sort.sorting(choiceOfSearch, library);
    }
}
