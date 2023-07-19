package classroom;

import java.util.Objects;

public class Order {

    private String name;
    private int value;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return value == order.value && Objects.equals(name, order.name) && Objects.equals(location, order.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, location);
    }

    public Order(String name, int value, String location) {
        this.name = name;
        this.value = value;
        this.location = location;
    }
}
