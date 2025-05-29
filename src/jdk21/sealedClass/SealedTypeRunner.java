package jdk21.sealedClass;

public class SealedTypeRunner {

    public static void main(String[] args) {

        System.out.println(communicate(new Dog()));
        System.out.println(communicate(new Cat()));
        System.out.println(communicate(new Bird()));

    }

    public static String communicate(Animal animal){

        return switch (animal){
            case Cat cat-> cat.meow();
            case Dog dog -> dog.bark();
            case Bird bird->  bird.chirp();
        };

    }
}
