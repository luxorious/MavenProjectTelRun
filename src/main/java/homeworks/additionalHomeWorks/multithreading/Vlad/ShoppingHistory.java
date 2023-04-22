package homeworks.additionalHomeWorks.multithreading.Vlad;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingHistory {
    private Map<LocalDate, List<Product>> history;

    public ShoppingHistory() {
        this.history = new HashMap<>();
    }

    public void addToHistory(List<Product> products) {
        history.put(products.get(0).getPurchaseDate(), products);
    }

    public void showLastPurchases(LocalDate fromDate, int interval) {
        LocalDate toDate = fromDate.plusDays(interval);
        List<String> nameOfGoods = new ArrayList<>();
        history.keySet().stream()
                .filter(date -> date.isAfter(fromDate) && date.isBefore(toDate))
                .map(productList -> history.get(productList))
                .flatMap(List::stream)
                .map(Product::getProductName)
                .sorted()
                .distinct()
                .forEachOrdered(System.out::println);
//        System.out.println(str);
    }

    public List<String> showLastPurchases1(LocalDate fromDate, int interval) {
        LocalDate toDate = fromDate.plusDays(interval);
        return history.keySet().stream()
                .filter(date -> date.isAfter(fromDate) && date.isBefore(toDate))
                .map(productList -> history.get(productList))
                .flatMap(List::stream)
                .map(Product::getProductName)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    public void showAllShoppingDays() {
        System.out.println(history.keySet());
    }

    public void showAllPurchases() {
        System.out.println(history.values());
    }
}