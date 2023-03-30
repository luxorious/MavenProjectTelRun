package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.ArrayList;
import java.util.List;

public class YearOfIssueSearchCriteria implements SearchCriteria{

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);

    }

    @Override
    public List<Book> paging(int page, List<Book> library) {
        List<Book> sortByYear = new ArrayList<>();
        int start = (page - 1) * NUMBERS_OF_BOOKS;
        int end = page * NUMBERS_OF_BOOKS;
        for (Book b : library){
            if (b.getYearOfIssue().equals(yearOfIssueToSearch)){
                sortByYear.add(b);
            }
        }

        if (sortByYear.isEmpty()){
            return sortByYear;
        }

        if (start > sortByYear.size()){
            start = sortByYear.size();
        }

        if (end > sortByYear.size()){
            end = sortByYear.size();
        }

        return sortByYear.subList(start, end);
    }

    @Override
    public List<Book> sort(int choiceOfSearch, List<Book> library) {
        return Sort.sorting(choiceOfSearch, library);
    }

//    @Override
//    public int compareTo(Book o) {
//        return o.getYearOfIssue().compareTo(yearOfIssueToSearch);
//    }
}