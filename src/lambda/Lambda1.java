package lambda;


@FunctionalInterface
interface MyInterface {
    Student getStudent(String name);
}

public class Lambda1 {

    public static void main(String[] args) {

        MyInterface mf = Student::new;
        System.out.println(mf.getStudent("helina").getName());
    }

}
