package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.ArrayList;
import java.util.List;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);

        // допишите реализацию метода
        // return true - если книга удовлетворяет и левому и правому условию
        // иначе return false
    }

    @Override
    public List<Book> paging(int page, List<Book> library) {
        List<Book> andOr = new ArrayList<>();
        int start = (page - 1) * NUMBERS_OF_BOOKS;
        int end = (page) * NUMBERS_OF_BOOKS;

        for (Book b : library){
            if (leftCondition.match(b) && rightCondition.match(b)){
                andOr.add(b);
            }
        }

        if (andOr.isEmpty()){
            System.out.println("library is empty");
            return andOr;
        }

        if (start > andOr.size()){
            start = andOr.size();
        }
        if (end > andOr.size()){
            end = andOr.size();
        }
        return andOr.subList(start, end);
    }
}