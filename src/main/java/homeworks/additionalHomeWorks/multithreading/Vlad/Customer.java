package homeworks.additionalHomeWorks.multithreading.Vlad;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Customer {
    private ShoppingHistory history;

    public Customer() {
        history = new ShoppingHistory();
    }

    public void generateShoppingHistory() {
        LinkedList<Product> products;
        final int shoppingTimes = 10;
        for(int counter = 0; counter < shoppingTimes; counter++) {
            products = ProductGenerator.generateMultiplePurchase(
                    ProductGenerator.generatePurchaseDate(), 10);
            history.addToHistory(products);
        }
    }

    public void showLastPurchases(LocalDate fromDate, int interval) {
        history.showLastPurchases(fromDate, interval);
    }

    public ShoppingHistory getHistory() {
        return history;
    }
}