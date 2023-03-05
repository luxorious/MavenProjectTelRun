package homeworks.additionalHomeWorks.OOP.interfaces.task8;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
