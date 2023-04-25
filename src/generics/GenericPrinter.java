package generics;

public class GenericPrinter <T extends Vehicle>{

    T printThis;

    GenericPrinter(T thingToPrint){
        this.printThis = thingToPrint;
    }

    void print(){
        System.out.println(printThis);
    }
}
