package homeworks.additionalHomeWorks.OOP.interfaces.task8;

public class Demo {
    public static void main(String[] args) {
        InMemoryDatabase db = new InMemoryDatabase();

        Product mivivna = new Product("Mivina");
        Product rolton = new Product("Rolton");
        Product rolstick = new Product("Rolstick");

        db.save(mivivna);
        db.save(rolton);
        db.save(rolstick);

        System.out.println(db.findByTitle("Mivina"));
        System.out.println(db.findByTitle("Rolton"));
        System.out.println(db.findByTitle("Rolstick"));

        System.out.println(db.findByTitle("Barila"));


    }
}
