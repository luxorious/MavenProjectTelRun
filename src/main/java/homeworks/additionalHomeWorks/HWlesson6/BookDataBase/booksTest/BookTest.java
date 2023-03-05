package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.booksTest;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabaseImpl;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.AuthorSearchCriteria;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.SearchCriteria;

import java.util.*;

public class BookTest {
    static BookDatabaseImpl b = new BookDatabaseImpl();
    static SearchCriteria sc = new AuthorSearchCriteria("l3");
    static Book book1 = new Book("l1", "f1", "2022");
    static Book book2 = new Book("l2", "f2", "2022");
    static Book book3 = new Book("l3", "f3", "2021");
    static Book book4 = new Book("l4", "f4", "2020");

    public static void main(String[] args) {
        b.save(book1);
        b.save(book2);
        b.save(book3);
        b.save(book4);

        findByIdTest(2L);

        System.out.println("------------------------------");
        findByAuthorTest("l1");
        System.out.println("------------------------------");
        findByTitleTest("f1");
        System.out.println("------------------------------");
        countAllBooksTest(4);
        System.out.println("------------------------------");
        deleteByAuthorTest("l1");
        System.out.println("------------------------------");
        deleteByTitleTest("f2");
        System.out.println("------------------------------");
        findTest(sc);
        System.out.println("------------------------------");
        System.out.println("sdfghgfdsadfv");
        getAuthorToBooksMapTest();
        System.out.println("------------------------------");



    }

    public static void getAuthorToBooksMapTest(){
        Map<String, List<Book>> expected = new HashMap<>();
        String author = book3.getAuthor();
//        expected.put(book1.getAuthor(), new ArrayList<>());
//        expected.put(book2.getAuthor(), new ArrayList<>());
        expected.put(book3.getAuthor(), new ArrayList<>());
        expected.put(book4.getAuthor(), new ArrayList<>());

        expected.get(author).add(book3);
        expected.get(book4.getAuthor()).add(book4);
//        expected.get(book1.getAuthor()).add(book1);
//        expected.get(book2.getAuthor()).add(book2);
        if (b.getAuthorToBooksMap().equals(expected)){
            System.out.println("oll ok");
        }else {
            System.out.println("Something went wrong!\nexpected result - " +
            expected + "\nbut result - " + b.getAuthorToBooksMap());
        }
    }
    public static void findTest(SearchCriteria searchCriteria){
        List<Book> foundedBooks = new ArrayList<>();
        foundedBooks.add(book3);
        if (b.find(searchCriteria).equals(foundedBooks)){
            System.out.println("method find is working");
        } else {
            System.out.println("Something went wrong!\nexpected result - " +
                    foundedBooks + "\nbut result - " + b.find(searchCriteria));
        }
    }


    public static void deleteByTitleTest(String title){
        b.deleteByTitle(title);
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book4);
        if (b.getLibrary().equals(expected)){
            System.out.println("method deleteByTitle is working");
        } else {
            System.out.println("Something went wrong!\nexpected result - " +
                    expected + "\nbut result - " + b.getLibrary());
        }
    }
    public static void deleteByAuthorTest(String author){
        b.deleteByAuthor(author);
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book3);
        expected.add(book4);
        if (b.getLibrary().equals(expected)){
            System.out.println("method deleteByAuthor is working");
        } else {
            System.out.println("Something went wrong in method deleteByAuthor!\nexpected result - " +
                    expected + "\nbut result - " + b.getLibrary());
        }
    }

    public static void findByIdTest(long id){
        Optional<Book> resultFindById = b.findById(id);//work
        Optional<Book> expectedFindById = Optional.of(book2);

        if (resultFindById.equals(expectedFindById)) {
            System.out.println("method findById is working");
        } else {
            System.out.println("Something went wrong!\nexpected result - " +
                    expectedFindById + "\nbut result - " + resultFindById);
        }
    }

    public static void findByAuthorTest(String author){
        List<Book> resultFindAuthor = b.findByAuthor(author);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);

        if(resultFindAuthor.equals(expectedResult)){
            System.out.println("method findByAuthor is working");
        } else {
            System.out.println("Something went wrong!\nexpected result - " +
                    expectedResult + "\nbut result - " + resultFindAuthor);
        }
    }

    public static void findByTitleTest(String title){
        List<Book> resultFindTitle = b.findByTitle(title);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);

        if(resultFindTitle.equals(expectedResult)){
            System.out.println("method findByTitle is working");
        } else {
            System.out.println("Something went wrong!\nexpected result - " +
                    expectedResult + "\nbut result - " + resultFindTitle);
        }
    }

    public static void countAllBooksTest(int numberOfAllBooks){
        if (numberOfAllBooks == b.countAllBooks()){
            System.out.println("method countAllBooks is working");
        } else {
            System.out.println("Something went wrong!\nexpected result - " +
                    numberOfAllBooks + "\nbut result - " + b.countAllBooks());

        }
    }

}
