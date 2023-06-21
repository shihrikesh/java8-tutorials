package classroom;

import java.util.Objects;

public class ShoppingCartItem {

    /*
    Create shopping cart application with java main program.
    Java program should have cart which contains list of items. Items belong to different category like below.
            List<ShoppingCartItem> cart = new ArrayList<>();
    Every item is associated with one category and every category has some discount.
    Calculate total price, total discount and total payable amount.

    */

    private String name;
    private String category;
    private Double price;
    private Double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public ShoppingCartItem(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartItem shoppingCartItem = (ShoppingCartItem) o;
        return Objects.equals(name, shoppingCartItem.name) && Objects.equals(category, shoppingCartItem.category) && Objects.equals(price, shoppingCartItem.price) && Objects.equals(discount, shoppingCartItem.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price, discount);
    }

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
