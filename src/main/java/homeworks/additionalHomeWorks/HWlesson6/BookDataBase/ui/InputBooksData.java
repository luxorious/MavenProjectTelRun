package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui;

import homeworks.additionalHomeWorks.HWlesson6.BookDataBase.Book;

import java.util.Scanner;

public class InputBooksData {

    public static Book input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input author");
        String author = scanner.nextLine();
        System.out.println("Input title");
        String title = scanner.nextLine();
        System.out.println("Input year Of Issue");
        String yearOfIssue = scanner.nextLine();

        return new Book(author, title, yearOfIssue);
    }
}
