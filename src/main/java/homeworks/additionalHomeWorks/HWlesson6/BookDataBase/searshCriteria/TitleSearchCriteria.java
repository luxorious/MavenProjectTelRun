package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.ArrayList;
import java.util.List;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }

    @Override
    public List<Book> paging(int page, List<Book> library) {
        List<Book> showByTitle = new ArrayList<>();
        int startPosition = (page - 1) * NUMBERS_OF_BOOKS;
        int endPosition = page  * NUMBERS_OF_BOOKS;

        for (Book b : library){
            if (b.getTitle().equals(titleToSearch)){
                showByTitle.add(b);
            }
        }
        if (showByTitle.isEmpty()){
            System.out.println("library is empty");
            return showByTitle;
        }
        if (startPosition > showByTitle.size()){
            startPosition = showByTitle.size();
        }
        if (endPosition > showByTitle.size()){
            endPosition = showByTitle.size();
        }
        return showByTitle.subList(startPosition, endPosition);
    }




//    @Override
//    public int compareTo(Book o) {
//        return o.getTitle().compareTo(titleToSearch);
//    }
}

