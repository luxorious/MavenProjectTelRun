package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.SearchCriteria;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BookDatabase {
    Long save(Book book);//+

    boolean delete(Long bookId);//+

    boolean delete(Book book);//+

    Optional<Book> findById(Long bookId);//+

    List<Book> findByAuthor(String author);//+

    List<Book> findByTitle(String title);//+

    int countAllBooks();//+

    void deleteByAuthor(String author);//+

    void deleteByTitle(String title);//+

    List<Book> find(SearchCriteria searchCriteria);//----------------------------

    boolean contains(Book book);//+

    Map<String, List<Book>> getAuthorToBooksMap();


}
