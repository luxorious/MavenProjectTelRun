package homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.userInterface;

import homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.util.ContactsUtil;
import homeworks.additionalHomeWorks.chatGPTTasks.PhoneBook.userInput.UserInput;

public class UserInterface {

    ContactsUtil util = new ContactsUtil();

    private void initialMenu(int numberOfChoice) {
        String messageForUser = "Enter one field name, surname, phoneNumber,eMail,dateOfBirth,company";
        String messageForUser2 = "Enter the value you want to find and replace";
        String field = "";
        String value = "";

        switch (numberOfChoice) {
            case 1:
                util.showAll();
                break;
            case 2:
                field = UserInput.input(messageForUser);
                value = UserInput.input(messageForUser2);
                util.find(field, value);
                break;
            case 3:
                util.createContact();
                break;
            case 4:
                field = UserInput.input(messageForUser);
                value = UserInput.input(messageForUser2);
                util.editBy(field, value);
                break;
            case 5:
                field = UserInput.input(messageForUser);
                value = UserInput.input(messageForUser2);
                util.delete(field, value);
                break;
            case 6:
                util.importContacts();
                break;
            case 7:
                util.export();
                break;
            default:
                System.out.println("Wrong Input");
        }
    }

    public void run() {
        String menu = """
                Input number of Menu:
                1 - show
                2 - find
                3 - create contact
                4 - edit
                5 - delete
                6 - import contacts
                7 - export contacts
                """;
        boolean flag = true;
        while (flag) {
            initialMenu(UserInput.inputNumber(menu).intValue());
            String exit = UserInput.input("to exit press \"n\" \nto continue - press any key\n");
            if (exit.equalsIgnoreCase("n")) {
                flag = false;
            }
        }
    }
}
