package optional;

import java.util.Optional;

public class HelloOptional {

    public static void main(String[] args) {
        Optional<String> hi = Optional.of("Hi");
        Optional<String> helloOptional = Optional.ofNullable("Hello Optional");
        Optional<String> empty = Optional.empty();

        System.out.println(hi);
        System.out.println(helloOptional);
        System.out.println(empty);


        System.out.println(helloOptional.isPresent());
        System.out.println(helloOptional.isEmpty());

        helloOptional.ifPresent(str -> System.out.println("print this with extra logic" + str));

        Optional<String> nullOptional = Optional.ofNullable(null);


        // Orelse block will call everytime , even if object is null or not
        helloOptional.orElse("Else block");
        // OrELseGet block is run only when optional is null, if not block code will not run
        String anotherCode = nullOptional.orElseGet(() -> {
            return "Another code";
        });

        System.out.println(anotherCode);

        nullOptional.map(String::toUpperCase).orElseThrow(NoSuchFieldError::new);

        // java 9 onward
        // nullOptional.isPresent(str->{
        // System.out.Println(str)
        // }, () ->{
        // System.out.println("Print this");
        // }
        // );

        // Boolean check for empty or not
        //nullOptional.isEmpty();


    }
}
