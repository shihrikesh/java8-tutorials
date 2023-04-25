package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTesting {

    public static void main(String[] args) {

        Car car = new Car("ABN1234", "Jerry");
        Bike bike = new Bike("IKL4566", "Jacob");

        GenericPrinter<Car> genericPrinter = new GenericPrinter<>(car);
        GenericPrinter<Bike> genericPrinter1 = new GenericPrinter<>(bike);
        genericPrinter.print();
        genericPrinter1.print();


    }
}
