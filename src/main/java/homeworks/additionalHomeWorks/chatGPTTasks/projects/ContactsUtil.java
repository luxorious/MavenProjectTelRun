package homeworks.additionalHomeWorks.chatGPTTasks.projects;

import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.List;

public class ContactsUtil {
    PhoneBook phoneBook;
    public static List<PhoneBook> listOfContacts = new LinkedList<>();
    PhoneBook[][] phB = new PhoneBook[0][6];

//    Користувач повинен мати можливість додавати нові контакти,
//    вводячи інформацію про них (ім'я, прізвище, електронна адреса, телефонний номер).
//
//            Користувач повинен мати можливість переглядати список всіх контактів.
//
//            Користувач повинен мати можливість редагувати існуючі контакти.
//
//            Користувач повинен мати можливість видаляти контакти зі списку.

    public void addContact(PhoneBook phoneBook){
        if (!checkBeforeAdd(phoneBook.getPhoneNumber())) {
            listOfContacts.add(phoneBook);
        }
        //created for test example
//        else {
//            System.out.println("This phone number already exists in contact + " +
//                    book.getName() + " " +
//                    book.getSurname());
//        }
    }

    private boolean checkBeforeAdd(long phoneNumber){
        for (PhoneBook book:listOfContacts){
            if (book.getPhoneNumber() == phoneNumber){
                System.out.println("This phone number already exists in contact + " +
                        book.getName() + " " +
                        book.getSurname());
                return true;
            }
        }
        return false;
    }

    public void editBy(String field, String value){
        for (PhoneBook book : listOfContacts){
            switch (field){
                case "name" :
                    if (book.getName().equals(value))
                        System.out.println(book);
                    break;
                case "surname" :
                    if (book.getSurname().equals(value))
                        System.out.println(book);
                    break;
                case "eMail" :
                    if (book.getEMail().equals(value))
                        System.out.println(book);
                    break;
                case "dateOfBirth" :
                    if (book.getDateOfBirth().equals(value))
                        System.out.println(book);
                    break;
                case "company" :
                    if (book.getCompany().equals(value))
                        System.out.println(book);
                    break;
                case "phoneNumber" :
                    if (book.getPhoneNumber() == Integer.parseInt(value))
                        System.out.println(book);
                    break;
                default:
                    System.out.println("unexpected token");
            }
        }
    }

    public void findBy(String field, String value){
        for (PhoneBook book : listOfContacts){
            switch (field){
                case "name" :
                    if (book.getName().equals(value))
                        System.out.println(book);
                    break;
                case "surname" :
                    if (book.getSurname().equals(value))
                        System.out.println(book);
                    break;
                case "eMail" :
                    if (book.getEMail().equals(value))
                        System.out.println(book);
                    break;
                case "dateOfBirth" :
                    if (book.getDateOfBirth().equals(value))
                        System.out.println(book);
                    break;
                case "company" :
                    if (book.getCompany().equals(value))
                        System.out.println(book);
                    break;
                case "phoneNumber" :
                    if (book.getPhoneNumber() == Integer.parseInt(value))
                        System.out.println(book);
                    break;
                default:
                    System.out.println("unexpected token");
            }
        }
    }

}
