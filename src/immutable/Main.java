package immutable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a new immutable Person object
        Person person = new Person("John", 30, Arrays.asList("Manga","Anime","Design"));

        // Access the state of the object using getter methods
        System.out.println(person.getName()); // John
        System.out.println(person.getAge());  // 30
        
        // Trying to change the state would result in a compile-time error
        // person.setName("Mike"); // Error: Cannot find symbol
        
        // To change the name or age, you need to create a new object
        Person updatedPerson = new Person("Mike", 31, Arrays.asList("Music","Movies"));
        System.out.println(updatedPerson.getName()); // Mike
        System.out.println(updatedPerson.getAge());
        //System.out.println(updatedPerson.getHobbies().add("New Hobby"));// 31
    }
}