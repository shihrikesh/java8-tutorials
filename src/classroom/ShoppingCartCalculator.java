package classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCartCalculator {

    public static void main(String[] args) {
        /*Ex.
        Almond - Category: Food, Price: 1000
        Shirt- Category: Fashion, Price: 500
        Jeans- Category: Fashion, Price: 500
        Chair- Category: Furniture, Price: 1000

        Food has 10%, Fashion has 20% and Furniture has 50%
        */

        List<ShoppingCartItem> shoppingCartItemList = new ArrayList<>();
        shoppingCartItemList.add(new ShoppingCartItem("Almond", "Food", 1000d));
        shoppingCartItemList.add(new ShoppingCartItem("Shirt", "Fashion", 500d));
        shoppingCartItemList.add(new ShoppingCartItem("Jeans", "Fashion", 500d));
        shoppingCartItemList.add(new ShoppingCartItem("Chair", "Furniture", 1000d));

        List<ShoppingCartItem> shoppingCartItems = shoppingCartItemList.stream()
                .map(shoppingCartItem -> {
                            switch (shoppingCartItem.getCategory()) {
                                case "Food":
                                    shoppingCartItem.setDiscount(shoppingCartItem.getPrice() * 0.1);
                                    break;
                                case "Fashion":
                                    shoppingCartItem.setDiscount(shoppingCartItem.getPrice() * 0.2);
                                    break;
                                case "Furniture":
                                    shoppingCartItem.setDiscount(shoppingCartItem.getPrice() * 0.5);
                                    break;
                                default:
                                    shoppingCartItem.setDiscount(0.0);
                                    break;
                            }
                            return shoppingCartItem;
                        }
                ).collect(Collectors.toList());

        shoppingCartItemList.forEach(System.out::println);

        Double totalPrice = shoppingCartItems.stream().mapToDouble(ShoppingCartItem::getPrice).sum();
        Double totalDiscount = shoppingCartItems.stream().mapToDouble(ShoppingCartItem::getDiscount).sum();
        Double totalPay = totalPrice - totalDiscount;

        System.out.println("Total Price" + totalPrice +
                " Total Discount " + totalDiscount +
                " Total Payment" + totalPay);
    }
}
