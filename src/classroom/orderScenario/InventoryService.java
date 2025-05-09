package classroom.orderScenario;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {

    /**
     * 2️⃣ Detect Orders with Stock Issues
     * While processing orders, you must identify which orders exceed the available stock for any product:
     *
     * You have a Map String, Integer  representing the available stock per product.
     *
     * Each order contains a list of Product objects with productId and quantity.
     * @param args
     */

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("OOO1",100);
        inventory.put("OOO2",90);
        inventory.put("OOO3",150);

        List<OrderPlacement> productPlacements = List.of(
                new OrderPlacement(1, Arrays.asList(new ProductPlacement("0001",20),
                        new ProductPlacement("0002",40))),

                new OrderPlacement(2, Arrays.asList(new ProductPlacement("0002",20),
                        new ProductPlacement("0003",40))),

                new OrderPlacement(3, Arrays.asList(new ProductPlacement("0001",10),
                        new ProductPlacement("0002",30),
                        new ProductPlacement("0003",10)))
        );

        // todo. chcek question and wor on logic
        //  https://www.youtube.com/watch?v=lm3rgUM1tDk

        List<Integer> rejectedOrder =
        productPlacements.stream()
                .filter(pp-> pp.productPlacementList().stream()
                        .anyMatch(product-> {
                            Integer availableStock = inventory.getOrDefault(product.productId(), 0);
                            return availableStock < product.quantity();
                        })
                ).map(OrderPlacement::orderId)
                .toList();

        System.out.println(rejectedOrder);


    }
}
