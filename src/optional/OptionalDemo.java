package optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Cat cat = new Cat("stella", 2);
        Cat catSub = new Cat("noName", 0);
        Optional<Cat> optionalCat = getCat(cat);
        System.out.println(optionalCat.isPresent());
        System.out.println(optionalCat.orElse(catSub));
       // System.out.println(optionalCat.orElseThrow("Not Found"));

    }

    public static Optional<Cat> getCat(Cat cat){
        Optional<Cat> optionalCat = Optional.ofNullable(cat);
        return optionalCat;
    }
}
