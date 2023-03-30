package lessons.lesson4.example3;

public class AccessModifiersExample {

    String name; // default (package private)

    private String personalCode; // visible in this Class

    public String companyName; // visible in all project

    protected String weaponType; // можна унаслідувати, і в класі викликати super.weaponType через конструктор
}
