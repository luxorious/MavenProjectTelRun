package homeworks.additionalHomeWorks.multithreading.library;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Librarian {

    private String name;

    public boolean giveBook(Book book){
        //if true user can read in library
        return book.isStayInLibrary();
    }
}
