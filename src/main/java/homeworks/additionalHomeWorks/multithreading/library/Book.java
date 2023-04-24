package homeworks.additionalHomeWorks.multithreading.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Book {
    private String title;
    private String author;
    private int year;
    private boolean stayInLibrary;

    @Override
    public String toString() {
        String can = "Title - " + title +
                "Author - " + author +
                "Year - " + year +
                "You can't take this book to home";

        String canNot = "Title - " + title +
                "Author - " + author +
                "Year - " + year +
                "You can take this book to home";
        return stayInLibrary? can : canNot;
    }
}
