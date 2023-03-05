package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.ArrayList;
import java.util.List;

public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;


    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }

    @Override
    public List<Book> paging(int page, List<Book> library) {
        List<Book> orCriteria = new ArrayList<>();
        int start = (page - 1) * NUMBERS_OF_BOOKS;
        int end = page * NUMBERS_OF_BOOKS;

        for (Book book : library){
            if (leftCondition.match(book) || rightCondition.match(book)){
                orCriteria.add(book);
            }
        }

        if (orCriteria.isEmpty()){
            System.out.println("not found book, by your criteria");
            return orCriteria;
        }

        if (start > orCriteria.size()){
            start = orCriteria.size();
        }
        if (end > orCriteria.size()){
            end = orCriteria.size();
        }
        return orCriteria.subList(start, end);
    }
}
