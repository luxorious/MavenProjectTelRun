package homeworks.additionalHomeWorks.multithreading.fixedForVlad;

import java.time.LocalDate;
import java.util.*;

public class ShoppingDemo {
    public static void main(String[] args) {
        List<Customer> clients = new LinkedList<>();
        Set<String> uniqueGoods = new HashSet<>();
        Customer client;
        //2 next lines for params method showLastPurchases1
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        int interval = 30;
        // Generate customers with some shoppingHistory
        final int clientsQuantity = 10;
        for (int quantity = 0; quantity < clientsQuantity; quantity++) {
            client = new Customer();
            client.generateShoppingHistory();
            clients.add(client);
        }
        // Get shopping history for last 30 days of each customer

        for (Customer customer : clients) {
//            customer.showLastPurchases1(localDate, interval).stream()
//                    .forEach(uniqueGoods::add);
//            хотів додати ці значення за допомогою стрімів, але ідея - каже що краще так, як нижче,
//            але хто я такий щоб спорити з ідеєю...
            uniqueGoods.addAll(customer.getHistory().showLastPurchases1(localDate, interval));

        }
        //можна вивести гарно через forEach
        System.out.println(uniqueGoods);
    }
}