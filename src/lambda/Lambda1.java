package lambda;


@FunctionalInterface
interface MyInterface {
    double getSquare(int num);
}

public class Lambda1 {

    public static void main(String[] args) {

        MyInterface mf = Math::sqrt;

        System.out.println(mf.getSquare(25));
    }

}
