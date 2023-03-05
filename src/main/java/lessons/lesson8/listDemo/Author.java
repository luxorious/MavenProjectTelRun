package lessons.lesson8.listDemo;

public class Author {

    int id;
    String name;

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
