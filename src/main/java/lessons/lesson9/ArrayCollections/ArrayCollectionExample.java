package lessons.lesson9.ArrayCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollectionExample {
    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<>();

        System.out.println(listBook);

        listBook.add(new Book(1, "law"));
        listBook.add(new Book(2, "Tax"));
        listBook.add(new Book(3, "Civil"));
        System.out.println(listBook);

        listBook.clear();
        System.out.println(listBook.size());
    }
}
