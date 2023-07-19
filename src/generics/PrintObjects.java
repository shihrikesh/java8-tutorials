package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintObjects {

    public static void main(String[] args) {
        Integer[] myInteger = {3, 7, 1, 9, 2};
        Double[] myDouble = {1.1D, 2.2D, 3.3D};
        Character[] myCharacter = {'E', 'P', 'A', 'M'};

        printTheArray(myInteger);
        printTheArray(myDouble);
        printTheArray(myCharacter);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        printList(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("b");

        printList(stringList);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("1", "Wendy"));
        printListVehicle(carList);

        List<Bike> bikeList = new ArrayList<>();
        bikeList.add(new Bike("2", "Nikki"));
        printListVehicle(bikeList);
    }

    public static <T> void printTheArray(T[] arr) {
        Arrays.stream(arr).forEach(System.out::println);

    }

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    public static <T extends Vehicle> void printListVehicle(List<T> list) {
        list.forEach(System.out::println);
    }
}
