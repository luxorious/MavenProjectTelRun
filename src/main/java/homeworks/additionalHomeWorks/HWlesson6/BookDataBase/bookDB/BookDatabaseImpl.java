package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.bookDB;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase{
    private List<Book> library = new ArrayList<>();

    @Override
    public Long save(Book book) {
        book.setId((library.size()+1L));
        library.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        if (bookId < Integer.MAX_VALUE){
            try {
                library.remove(bookId.intValue() - 1);
            } catch (IndexOutOfBoundsException e){
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return library.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book b : library){
            if (b.getId() == bookId.intValue()){
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> authors = new ArrayList<>();
        for (Book b : library){
            if (b.getAuthor().equals(author)){
                authors.add(b);
            }
        }
        return authors;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titles = new ArrayList<>();
        for (Book b : library){
            if (b.getTitle().equals(title)){
                titles.add(b);
            }
        }
        return titles;
    }

    @Override
    public int countAllBooks() {
        return library.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        library.removeIf(b -> b.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        library.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> books = new ArrayList<>();
        for (Book book : library){
            if (searchCriteria.match(book)){
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public boolean contains(Book book) {
        return library.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> allBooksOfAuthor = new HashMap<>();
        for (Book book : library){
            String author = book.getAuthor();
            if (!allBooksOfAuthor.containsKey(book.getAuthor())){
                allBooksOfAuthor.put(author, new ArrayList<>());
            }
            allBooksOfAuthor.get(author).add(book);
        }
        return allBooksOfAuthor;
    }


    public List<Book> getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        StringBuilder allDataFromBook = new StringBuilder();
        for (Book book : library) {
            allDataFromBook.append("Book's id - " + book.getId() +
                    "\nTitle - " + book.getTitle() +
                    "\nAuthor - " + book.getAuthor() + "\n\n");

        }
        return allDataFromBook.toString();
    }
}
