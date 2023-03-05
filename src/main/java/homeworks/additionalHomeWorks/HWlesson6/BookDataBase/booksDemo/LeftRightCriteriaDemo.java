package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.booksDemo;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabaseImpl;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.*;

import java.util.List;

public class LeftRightCriteriaDemo {
    static BookDatabaseImpl b = new BookDatabaseImpl();
    static Book book1 = new Book("l1", "f1", "2022");
    static Book book2 = new Book("l2", "f2", "2022");
    static Book book3 = new Book("l3", "f3", "2021");
    static Book book4 = new Book("l4", "f4", "2020");
    static Book book5 = new Book("l1", "f5", "2020");
    static Book book6 = new Book("l1", "f5", "2021");
    static Book book7 = new Book("l1", "f2", "2020");
    static Book book8 = new Book("l1", "f2", "2020");
    static Book book9 = new Book("l1", "f2", "2021");


    public static void main(String[] args) {
        b.save(book1);
        b.save(book2);
        b.save(book3);
        b.save(book4);
        b.save(book5);
        b.save(book6);
        b.save(book7);
        b.save(book8);
        b.save(book9);


        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("l1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("f2");

        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria sc = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        //search by year
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("2021");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);

        System.out.println(searchCriteria.match(book1));
        System.out.println(sc.match(book1));

        System.out.println("___________________________________");
        System.out.println(b.getLibrary());
        System.out.println(authorSearchCriteria.paging(1, b.getLibrary()));
        System.out.println(authorSearchCriteria.paging(2, b.getLibrary()));
        System.out.println("___________________________________");

        System.out.println("___________________________________");
        System.out.println("Or condition");
        System.out.println(sc.paging(1, b.getLibrary()));
        System.out.println(sc.paging(2, b.getLibrary()));
        System.out.println("___________________________________");
        System.out.println("And condition");
        System.out.println(searchCriteria.paging(1, b.getLibrary()));
        System.out.println(searchCriteria.paging(2, b.getLibrary()));
        System.out.println(searchCriteria.paging(3, b.getLibrary()));
        System.out.println(searchCriteria.match(book1));
        System.out.println("___________________________________");

        System.out.println("""
                for sort by the author - put 1 in method sort;
                for sort by the title- put 2 in method sort;
                for sort by the year- put 3 in method sort;
                """);
        System.out.println(yearSearchCriteria.sort(1, yearSearchCriteria.paging(1, b.getLibrary())));
        System.out.println(yearSearchCriteria.sort(2, b.getLibrary()));
        System.out.println("___________________________________");


        List<Book> titleList = titleSearchCriteria.paging(1, b.getLibrary());
        System.out.println(yearSearchCriteria.sort(3, titleList));
        System.out.println("author");
        System.out.println(Sort.sorting(1, b.getLibrary()));
        System.out.println("title");
        System.out.println(Sort.sorting(2, b.getLibrary()));
        System.out.println("year");
        System.out.println(Sort.sorting(3, b.getLibrary()));
        System.out.println("without sort");
        System.out.println(Sort.sorting(1, b.getLibrary()));

        System.out.println("------------------------------------");
    }
}
