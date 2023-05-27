package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTesting {

    public static void main(String[] args) {

        Car car = new Car("ABN1234", "Jerry");
        Bike bike = new Bike("IKL4566", "Jacob");

        GenericPrinter<Car> genericPrinter = new GenericPrinter<>(car);
        GenericPrinter<Bike> genericPrinter1 = new GenericPrinter<>(bike);
        genericPrinter.print();
        genericPrinter1.print();

        // Wild Cards

        List<Integer> carList = new ArrayList<>();
        carList.add(1);
        printList(carList);

    }

    public static void printList(List<?> list){
        // this is wild card where List<?> can be of any type
        System.out.println(list);
    }
}
