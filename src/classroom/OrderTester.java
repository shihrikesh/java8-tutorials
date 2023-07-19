package classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderTester {

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order("jerry", 2000, "New Jersey" ));
        orderList.add(new Order("jerry", 90000, "New Jersey" ));
        orderList.stream()
                .filter(order -> order.getValue()>1000 && "New Jersey".equals(order.getLocation()))
                .map(p-> p.getName().toUpperCase())
                .collect(Collectors.toSet())
                .forEach(System.out::println);


    }
}
