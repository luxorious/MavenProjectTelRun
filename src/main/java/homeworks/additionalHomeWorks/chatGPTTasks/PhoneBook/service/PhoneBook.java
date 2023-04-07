package homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@AllArgsConstructor
@Getter
@Setter
public class PhoneBook {
    private String name;
    private String surname;
    private long phoneNumber;
    private String eMail; // contacts e-mail
    private String dateOfBirth;
    private String company; //company where contact works

    public PhoneBook(String name, String surname, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBook(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBook(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        String info = "";
        if (name != null) {
            info += "name - " + name + "\n";
        }
        if (surname != null) {
            info += "surname - " + surname + "\n";
        }
        info += "phoneNumber=" + phoneNumber + "\n";
        if (eMail != null) {
            info += "eMail='" + eMail + "\n";
        }
        if (dateOfBirth != null) {
            info += ", dateOfBirth='" + dateOfBirth + "\n";
        }
        if (company != null) {
            info += "company - " + company + "\n";
        }
        return info;
    }
}
