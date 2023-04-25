package classroom;

public class Grasshopper {

    public Grasshopper(String s){
        name = s;
    }

    public static void main(String[] args) {
        Grasshopper g1 = new Grasshopper("hello");
        Grasshopper g2 = new Grasshopper("hello");
        g1 = g2;
        g2 = null;
        g1 = null;
    }

    private String name;
}
