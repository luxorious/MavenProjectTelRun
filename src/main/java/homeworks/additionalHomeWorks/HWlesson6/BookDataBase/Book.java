package homeworks.additionalHomeWorks.HWlesson6.BookDataBase;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private Long id;
    private String title;
    private String author;

    private String yearOfIssue;

    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return this.author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year= " + yearOfIssue +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return o.getYearOfIssue().compareTo(this.yearOfIssue);
    }
}