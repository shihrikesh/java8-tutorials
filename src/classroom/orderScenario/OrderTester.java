package classroom.orderScenario;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class OrderTester {


    /**
     * 1️⃣ Generate Category-wise Sales Report
     * You are tasked with generating a category-wise product sales report for the last 24 hours, with multiple filtering rules:
     * Consider only orders with a total value  ₹500.
     * Exclude any products marked as "out of stock".
     * Group the filtered products by category.
     * Calculate the total quantity sold per category.
     * Return a result sorted by quantity in descending order.
     *
     * ✅ Solution:
     * Using a combination of filter, flatMap, groupingBy, and sorting via streams, the code provides a concise way to compute the required report using LinkedHashMap to maintain sorted order.
     *
     * 2️⃣ Detect Orders with Stock Issues
     * While processing orders, you must identify which orders exceed the available stock for any product:
     *
     * You have a Map String, Integer  representing the available stock per product.
     * @param args
     */
    public static void main(String[] args) {


        Order order1 = new Order(1,
                List.of(new Product(1,"Shirt", "Clothing",2,true,400),
                        new Product(1,"iphone", "Electronics",1,true,800)),
                1200,
                LocalDateTime.now().minusHours(10));
        Order order2 = new Order(2,
                List.of(new Product(1,"Shirt", "Clothing",1,true,200),
                        new Product(1,"iphone", "Electronics",1,true,800)),
                1000,
                LocalDateTime.now().minusHours(11));

        Order order3 = new Order(3,
                List.of(new Product(1,"Shirt", "Clothing",2,true,400),
                        new Product(1,"iphone", "Electronics",1,true,800),
                        new Product(1,"lip gloss", "Cosmetic",1,true,50)),
                1250,
                LocalDateTime.now().minusHours(10));

        Order order4 = new Order(4,
                List.of(new Product(1,"Shirt", "Clothing",2,true,400),
                        new Product(1,"lip gloss", "Cosmetic",1,false,50)),
                1200,
                LocalDateTime.now().minusHours(10));

        Order order5 = new Order(5,
                List.of(new Product(1,"Protein Bar", "Food",2,true,400)),
                1200,
                LocalDateTime.now().minusDays(2));

        List<Order> orderList = List.of(order1,order2,order3,order4,order5);

        Map<String, Integer> map =
        orderList.stream()
                .filter(order -> order.orderTime().isAfter(LocalDateTime.now().minusHours(24)))
                .filter(order -> order.totalValue()>=500)
                .flatMap(order -> order.products().stream())
                .filter(Product::inStock)
                .collect(Collectors.groupingBy(Product::category,
                        Collectors.summingInt(Product::quantity)))
                //.forEach((k,v)-> System.out.println("key:"+k+" value: "+v));
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)-> oldValue ,LinkedHashMap::new));

        System.out.println(map);


    }
}
