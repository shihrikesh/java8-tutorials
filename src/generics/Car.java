package generics;

import reflections.Cat;

public class Car implements Vehicle {

    String vin;

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Car(String vin, String owner){
        move();
        this.vin = vin;
        this.owner = owner;
    }

    @Override
    public void move() {
        System.out.println("This Car moves");
    }
}
