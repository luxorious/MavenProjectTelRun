package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.booksTest;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.AuthorSearchCriteria;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.SearchCriteria;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.YearOfIssueSearchCriteria;

import java.util.ArrayList;
import java.util.List;

public class SearchCriteriaTest {
    static SearchCriteria authorCriteria = new AuthorSearchCriteria("l1");
    static YearOfIssueSearchCriteria yearCriteria = new YearOfIssueSearchCriteria("2022");
    static Book book1 = new Book("l1", "f1", "2020");
    static Book book2 = new Book("l2", "f2", "2020");
    static Book book3 = new Book("l3", "f3", "2021");
    static Book book4 = new Book("l4", "f4", "2022");
    static Book book5 = new Book("l1", "fds1", "2025");
    static Book book6 = new Book("l12", "fds12", "20252");

    static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        matchTest(book1);

        pagingTest();


    }


    public static void matchTest(Book book) {
        boolean result = authorCriteria.match(book);
        if (result){
            System.out.println("Method match is Working");
        } else {
            System.out.println("Method match is not working" +
                    "expect true, but result - false");
        }

    }


    //для успішного тесту потрібно встановити константу в
    // іетерфейсі - SearchCriteria  -NUMBERS_OF_BOOKS = 2;
    public static void pagingTest() {
        List<Book> listPagingBook = new ArrayList<>();
        listPagingBook.add(book1);
        listPagingBook.add(book5);

        if (authorCriteria.paging(1, books).equals(listPagingBook)) {
            System.out.println("Method 'paging' - is working");
        } else {
            System.out.println("Method 'paging' - not working - expected result - " + listPagingBook +
                    " but real result - " + authorCriteria.paging(1, books));
        }
    }
}