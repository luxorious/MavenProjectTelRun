package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }


    @Override
    public List<Book> paging(int page, List<Book> library) {
        int startIndex = (page - 1) * NUMBERS_OF_BOOKS;
        int endIndex = page * NUMBERS_OF_BOOKS;
        List<Book> showByAuthor = new ArrayList<>();

        for (Book book : library){
            if (book.getAuthor().equals(authorToSearch)){
                showByAuthor.add(book);
            }
        }
        if (showByAuthor.isEmpty()){
            System.out.println("library is empty");
            return showByAuthor;
        }

        if (startIndex > showByAuthor.size()){
            startIndex = showByAuthor.size();
        }
        if (endIndex > showByAuthor.size()){
            endIndex = showByAuthor.size();
        }
        return showByAuthor.subList(startIndex, endIndex);
    }
}
