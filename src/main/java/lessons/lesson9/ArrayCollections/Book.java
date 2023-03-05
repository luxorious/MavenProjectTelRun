package lessons.lesson9.ArrayCollections;

public class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name=" + name ;
    }
}
