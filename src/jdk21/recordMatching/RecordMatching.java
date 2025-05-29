package jdk21.recordMatching;

public class RecordMatching {

    public static void main(String[] args) {

        System.out.println(respond(new UserCreateEvent("rishi")));
        System.out.println(respond(new UserDeleteEvent(new User("rishi", "1"))));

    }

    public static String respond(Object o){
        return switch (o){
            case UserCreateEvent(var name)-> "User created with "+ name +"  has been created";
            case UserDeleteEvent(var user)-> "User " + user.name() +" has been deleted";
            default -> null;
        };
    }
}
