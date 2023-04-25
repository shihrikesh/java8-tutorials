package strings;

public class PassByValue {

    public static void main(String[] args) {

        Cheese cheese = new Cheese();
        cheese.setStinkingNess(10);

        increaseStinkingNess(cheese);
        System.out.println(cheese.getStinkingNess());

    }

    // created new object ,creats reference to new object as well, so it does not affect actual value
    public static void increaseStinkingNess(Cheese cheese){
        cheese = new Cheese();
        cheese.setStinkingNess(456);
    }
}
