package homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.util;

import homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.service.PhoneBook;
import homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.userInput.UserInput;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContactsUtil {
    PhoneBook phoneBook;
    private List<PhoneBook> listOfContacts = new LinkedList<>();
    //зберігаємо тут повідомлення, які будуть показуватись коли користувач
    // захоче додати новий контакт у телефонну книгу...
    private final List<String> messages = new ArrayList<>(List.of("Enter name", "Enter surname", "Enter phone number",
            "Enter eMail", "Enter date Of Birth", "Enter company"));

//    Користувач повинен мати можливість додавати нові контакти,
//    вводячи інформацію про них (ім'я, прізвище, електронна адреса, телефонний номер).
//
//            Користувач повинен мати можливість переглядати список всіх контактів.
//
//            Користувач повинен мати можливість редагувати існуючі контакти.
//
//            Користувач повинен мати можливість видаляти контакти зі списку.

    public void createContact() {
        String[] constructor = new String[6];
        for (int i = 0; i < messages.size(); i++) {
            if (i == 1 || i > 2) {
                System.out.println("*This field is optional*");
                System.out.println("If you don't want to add a field, just input \"n\"");
                String input = UserInput.input(messages.get(i));
                constructor[i] = input;
//                if (input.equalsIgnoreCase("n")) {
//                    constructor[i] = "";
//                } else {
//                    constructor[i] = input;
//                }
                continue;
            }
            constructor[i] = UserInput.input(messages.get(i));
        }
        save(constructor);
    }

    public void delete(String field, String value) {
        PhoneBook book = findBy(field, value);
        if (book == null) {
            System.out.println("nothing found!");
        } else {
            listOfContacts.remove(book);
            System.out.println("contact " + book.getName() + " " + book.getSurname() +
                    " successfully deleted!");
        }
    }

    public void find(String field, String value) {
        PhoneBook book = findBy(field, value);
        if (book == null) {
            System.out.println("nothing found!");
        } else {
            System.out.println(book);
        }
    }

    public void editBy(String field, String value) {
        PhoneBook book = findBy(field, value);
        if (book == null) {
            System.out.println("Nothing found");
        } else {
            String newValue = UserInput.input("Input new " + field);
            switch (field) {
                case "phoneNumber":
                    try {
                        book.setPhoneNumber(Long.parseLong(newValue));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "name":
                    book.setName(newValue);
                    break;
                case "surname":
                    book.setSurname(newValue);
                    break;
                case "eMail":
                    book.setEMail(newValue);
                    break;
                case "dateOfBirth":
                    book.setDateOfBirth(newValue);
                    break;
                default:
                    book.setCompany(newValue);
                    break;
            }
        }
    }

    public void showAll() {
        if (listOfContacts.isEmpty()) {
            System.out.println("contacts not found");
        }
        for (PhoneBook book : listOfContacts) {
            System.out.println(book);
        }
    }

    public void export() {
        if (listOfContacts.isEmpty()) {
            System.out.println("Nothing found for export");
            return;
        }
        String fileName = "src/main/java/homeworks/additionalHomeWorks/chatGPTTasks/PhoneBook/resources/"
                + UserInput.input("enter file name") + ".csv";
        try (FileWriter file = new FileWriter(fileName)) {
            StringBuilder str = new StringBuilder();
            String data = "";
            for (PhoneBook contact : listOfContacts) {
                data += contact.getName() + " " + (contact.getName().equals("") ? contact.getName() : "null") + " " +
                        contact.getPhoneNumber() + " " + (contact.getEMail().equals("") ? contact.getEMail() : "null") + " " +
                        (contact.getDateOfBirth().equals("") ? contact.getDateOfBirth() : "null") + " " +
                        (contact.getCompany().equals("") ? contact.getCompany() : "null") + "\n";
//                data += contact.getName() + " " + contact.getSurname() + " " +
//                        contact.getPhoneNumber() + " " + contact.getEMail() + " " +
//                        contact.getDateOfBirth() + " " + contact.getCompany() + "\n";
            }
            if (data.equals("")) {
                System.out.println("Your phone book is empty");
                return;
            }
            file.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void importContacts() {
//        String path = "src/main/java/homeworks/additionalHomeWorks/chatGPTTasks/PhoneBook/resources/"
//                + UserInput.input("enter file name") + ".csv";
        String path = UserInput.input("enter file path");
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                addContact(importService(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Wrong file name, please check folder " +
                    "\"src/main/java/homeworks/additionalHomeWorks/chatGPTTasks/PhoneBook/resources/\"");
        }
    }

    //тут може виникнути помилка, перевірити на нули!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private PhoneBook importService(String line) {
        String[] contact = line.split(" ");
        return new PhoneBook(contact[0], contact[1], Long.parseLong(contact[2]), contact[3], contact[4], contact[5]);
    }

    private void addContact(PhoneBook phoneBook) {
        if (!checkBeforeAdd(phoneBook.getPhoneNumber())) {
            listOfContacts.add(phoneBook);
        } else {
            System.out.println("This phone number already exists in contact + " +
                    phoneBook.getName() + " " +
                    phoneBook.getSurname());
        }
    }

    private PhoneBook findBy(String field, String value) {
//        if not found book in data base - return null!
//        result of work this method must checked if return null!!!
        for (PhoneBook book : listOfContacts) {
            switch (field) {
                case "name":
                    if (book.getName().equals(value)) {
                        return book;
                    }
                    break;
                case "surname":
                    if (book.getSurname().equals(value)) {
                        return book;
                    }
                    break;
                case "eMail":
                    if (book.getEMail().equals(value)) {
                        return book;
                    }
                    break;
                case "dateOfBirth":
                    if (book.getDateOfBirth().equals(value)) {
                        return book;
                    }
                    break;
                case "company":
                    if (book.getCompany().equals(value)) {
                        return book;
                    }
                    break;
                case "phoneNumber":
                    if (book.getPhoneNumber() == Integer.parseInt(value))
                        return book;
                    break;
                default:
                    System.out.println("unexpected token");
            }
        }
        return null;
    }

    private void save(String[] data) {
        long phoneNumber = Long.parseLong(data[2]);
        PhoneBook book = new PhoneBook(data[0], data[1], phoneNumber, data[3], data[4], data[5]);
        addContact(book);
    }

    private boolean checkBeforeAdd(long phoneNumber) {
        for (PhoneBook book : listOfContacts) {
            if (book.getPhoneNumber() == phoneNumber) {
                System.out.println("This phone number already exists in contact + " +
                        book.getName() + " " +
                        book.getSurname());
                return true;
            }
        }
        return false;
    }
}
