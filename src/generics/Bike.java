package generics;

public class Bike implements Vehicle {

    String registrationNum;
    String owner;

    @Override
    public String toString() {
        return "Bike{" +
                "registrationNum='" + registrationNum + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Bike(String registrationNum, String owner){
        move();
        this.registrationNum = registrationNum;
        this.owner = owner;
    }

    @Override
    public void move() {
        System.out.println("This Bike Moves");
    }
}
